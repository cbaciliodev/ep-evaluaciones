package pe.mil.ejercito.ms.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import pe.mil.ejercito.ms.exception.MsException;

import static pe.mil.ejercito.ms.commons.Constant.*;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = { "pe.mil.ejercito.ms.*" })
public class AppDaoConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() throws MsException {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(sigesDS());
		sessionFactory.setPackagesToScan(new String[] { "pe.mil.ejercito.ms.model", "pe.mil.ejercito.ms.dao.impl" });
		sessionFactory.setHibernateProperties(additionalProperties());

		return sessionFactory;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {

		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);

		return txManager;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {

		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setJpaVendorAdapter(vendorAdaptor());

		try {
			entityManagerFactoryBean.setDataSource(sigesDS());
			entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
			entityManagerFactoryBean.setPackagesToScan("pe.mil.ejercito.ms.*");
			entityManagerFactoryBean.setJpaProperties(additionalProperties());
		} catch (MsException e) {
			e.printStackTrace();
		}

		return entityManagerFactoryBean;
	}

	private HibernateJpaVendorAdapter vendorAdaptor() {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setShowSql(true);
		return vendorAdapter;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean
	DataSource sigesDS() throws MsException {

		DataSource dataSource = null;
		JndiTemplate jndi = new JndiTemplate();
		try {
			dataSource = jndi.lookup( env.getProperty( PROP_JDBC_DATASOURCE ) , DataSource.class);
			return dataSource;
		} catch (Exception e) {
			throw new MsException(1, e);
		}
	}

	Properties additionalProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.connection.datasource", env.getProperty( PROP_JDBC_DATASOURCE ));
		properties.setProperty("hibernate.dialect", env.getProperty( PROP_JDBC_HIBERNATE_DIALECT ) );
		properties.setProperty("show_sql", env.getProperty( PROP_JDBC_HIBERNATE_SHOWSQL ) );
		return properties;
	}
}

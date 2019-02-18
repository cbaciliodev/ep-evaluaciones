package pe.mil.ejercito.ms.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pe.mil.ejercito.ms.dao.BaseDAO;

@Transactional
public class BaseDAOImpl<T> implements BaseDAO<T>{

	@Autowired
	private SessionFactory em;
	
	private Class<?> clazz;
	
	public BaseDAOImpl( Class<?> clazz ) {
		this.clazz = clazz;
	}
	
	public void rodas(String nombre) {
		
	}
	
	@SuppressWarnings("unchecked")
	
	@Override	
	public List<T> listarTodos() {		
		// Listando todos los registros de una tabla
		
		System.out.println("Con el getName"+clazz.getName());
		System.out.println("Con el getSimpleName"+clazz.getSimpleName());
		
		String consulta = " select o from " + clazz.getSimpleName() + " o";
		Query q = em.getCurrentSession().createQuery(consulta);
		return q.list();
		
	}

}

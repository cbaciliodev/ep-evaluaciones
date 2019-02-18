package pe.mil.ejercito.ms.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "pe.mil.ejercito.ms.services.impl" })
@PropertySource("file:/data/ep/ep.properties") 
public class AppConfig {

}

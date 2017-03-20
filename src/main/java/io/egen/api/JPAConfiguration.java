package io.egen.api;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.expression.EnvironmentAccessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

@Configuration // step 1
public class JPAConfiguration {

	@Bean // step 2 
	//you can specify what database source , location, username, password.
	public LocalContainerEntityManagerFactoryBean bean() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//1. tell which persistance provider you are using = hibernate
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		//step 4. put datasouce 
		bean.setDataSource(getDatasource());
		//step5. in spring we can scan pacakge for entity,
		bean.setPackagesToScan("io.egen");
		//step 6. enter jpa properties
		bean.setJpaProperties(jpaProperties());
		return bean;
	}
	
	//step 3.Bean for datasource
	@Bean
	public DataSource getDatasource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3036/example-db");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
		
	}
	
	private Properties jpaProperties()
	{
		Properties props = new Properties();
//		Environment env =  new EnvironmentAccessor();
//		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//		props.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl"));
//		props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show.sql"));
//		props.setProperty("hibernate.format_sql", env.getProperty("hibernate.format.sql"));
//		return props;
		return props;
		
	}
}

package com.xmkg.config;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef="entityManagerFactoryPrimary",
transactionManagerRef="transactionManagerPrimary",basePackages= {"com.xmkg.dao.one"})
public class RepositoryPrimaryConfig {
	@Autowired
	private JpaProperties jpaProperties;
	
	@Autowired
	@Qualifier("primaryDS")
	private DataSource primaryDS;
	
	@Bean(name = "entityManagerPrimary")
	@Primary
	public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
		return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
     }
	
	@Bean(name = "entityManagerFactoryPrimary")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary (EntityManagerFactoryBuilder builder){
		 return builder.dataSource(primaryDS)
				 .properties(getVendorProperties(primaryDS))
				 .packages("com.xmkg.entity.one") //设置实体类所在位置
				 .persistenceUnit("primaryPersistenceUnit")
				 .build();
	}
	
	//2.0以后Springboot中该写法有变化 ，注意
	private Map<String, Object> getVendorProperties(DataSource dataSource) {
		    //HibernateSettings aaa = new HibernateSettings();
			return jpaProperties.getHibernateProperties(new HibernateSettings());
	}
	
	 @Bean(name = "transactionManagerPrimary")
	 @Primary
	 PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
		 	return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
	 }
	
}

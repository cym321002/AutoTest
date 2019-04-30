package com.xmkg.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

	    @Bean(name = "myDataSource")
	    //@Qualifier("myDataSource")真实多数据源时用的到
	    @ConfigurationProperties(prefix="spring.datasource.master")
	    public DataSource getMyDataSource(){
	        return DataSourceBuilder.create().build();
	    }

}

package com.xmkg.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {
	
	
	
	/**
	 * 第一个数据源
	 * @return
	 */
	@Bean(name = "primaryDS")// 声明其为Bean实例
	//@Qualifier("primaryDS")
    @Primary // 在同样的DataSource中，首先使用被标注的DataSource
    @ConfigurationProperties(prefix="master.datasource")
    public DataSource dataMasterSource() {
        return DataSourceBuilder.create().build();
    }
	
	/**
	 * 第二个数据源
	 * @return
	 */
	@Bean(name = "secondaryDS")
	//@Qualifier("secondaryDS")
    @ConfigurationProperties(prefix="cluster.datasource")
    public DataSource dataClusterSource(){
    	return DataSourceBuilder.create().build();
    }

//	    @Bean(name = "myDataSource")
//	    //@Qualifier("myDataSource")真实多数据源时用的到
//	    @ConfigurationProperties(prefix="spring.datasource.master")
//	    public DataSource getMyDataSource(){
//	        return DataSourceBuilder.create().build();
//	    }
//	    
//	    
//		@Bean(name = "secondaryDS")
//		@Qualifier("secondaryDS")
//	    @ConfigurationProperties(prefix="cluster.datasource")
//	    public DataSource dataClusterSource(){
//	    	return DataSourceBuilder.create().build();
//	    }

}

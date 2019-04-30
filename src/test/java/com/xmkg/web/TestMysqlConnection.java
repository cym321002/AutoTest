package com.xmkg.web;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import com.alibaba.fastjson.JSON;
import com.xmkg.dao.UsersDao;
import com.xmkg.entity.Users;



@SpringBootTest()
public class TestMysqlConnection extends AbstractTestNGSpringContextTests{

	
	   //@Autowired
	   //DataSourceProperties dataSourceProperties;
//	   @Autowired
//	   ApplicationContext applicationContext;
//	   @Resource(name = "myDataSource")
//	   private DataSource myDataSource;
	   @Autowired
	   private UsersDao mapMasterDao;
       
	   @Test
	   public void contextLoads() {
		   
		
//		   Users user = new Users();
//		   user.setUserName("cym");
//		   user.setCompany("席媒控股");
//		   user.setUserPwd("12345");
//		   mapMasterDao.save(user);
		  List<Users> users = mapMasterDao.findAll();
		  Users u = users .get(0);
		  System.out.print(u.getUserName());
		  
	      // 获取配置的数据源
//	      DataSource dataSource = applicationContext.getBean(DataSource.class);
//	      // 查看配置数据源信息
//	      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + dataSource);
//	      System.out.println(dataSource.getClass().getName());
//	      //System.out.println(dataSourceProperties);
//	      //执行SQL,输出查到的数据
	  //    JdbcTemplate jdbcTemplate = new JdbcTemplate(myDataSource);
	    //  List<?> resultList = jdbcTemplate.queryForList("select * from tcontrolelement");
	    //  System.out.println("===@@@@@@@@@@@@@@@@>>>>>>>>>>>" + JSON.toJSONString(resultList));
	   }
	
}

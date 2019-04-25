package com.xmkg.web;

import org.testng.Assert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import com.xmkg.entity.LoginPage;
import org.testng.annotations.*;

/**
 * 用例编号：
 * 作者：cym
 * 日期：2019年4月3日
 * 描述：完成了登陆模块测试
 */

@SpringBootTest()
public class TestLoginPage extends AbstractTestNGSpringContextTests{
    
	@Autowired
	LoginPage loginPage;
	
    
	@DataProvider(name = "testData") // 在DataProvider注解中为dataprovider命名
	public Object[][] dataProvider() {
		return new Object[][] {{"admin","123456"}, {"admin","123"}, {"cym","123"}};
	}

	@BeforeMethod
	public void open() {
		loginPage.openBrowser("chrome");
	}

	@AfterMethod
	public void close() {
		loginPage.driver.quit();
	}

	@Test(enabled = true,dataProvider="testData")
	public void test(String userName,String passWord) {
		Assert.assertEquals(loginPage.login(userName,passWord).toString(), "pass");
	}
}

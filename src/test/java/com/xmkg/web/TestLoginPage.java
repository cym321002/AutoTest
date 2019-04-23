package com.xmkg.web;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.xmkg.entity.LoginPage;

//extends AbstractTestNGSpringContextTests
public class TestLoginPage {

	LoginPage loginPage = new LoginPage();

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
		assertEquals(loginPage.login().toString(), "pass");

	}
}

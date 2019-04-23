package com.xmkg.web;
import org.testng.annotations.Test;

import com.xmkg.entity.LoginPage;

//extends AbstractTestNGSpringContextTests
public class TestLoginPage {
   LoginPage loginPage = new LoginPage();
   
   @Test(enabled=true)
   public void test () {
	   loginPage.login();
   }
}

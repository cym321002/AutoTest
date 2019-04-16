package com.xmkg.web;
import org.testng.annotations.Test;

import com.xmkg.entity.LoginPage;

public class TestLoginPage {
   LoginPage loginPage = new LoginPage();
   
   @Test
   public void test () {
	   loginPage.login();
   }
}

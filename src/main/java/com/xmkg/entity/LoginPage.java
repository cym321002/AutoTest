package com.xmkg.entity;
import org.openqa.selenium.JavascriptExecutor;

import com.xmkg.util.ActionWeb;

public class LoginPage extends ActionWeb{
	
	//封装关键字实现登录
	public void login() {
		openBrowser("chrome");
		visitWeb("http://www.baidu.com");
		visitWeb("http://www.taobao.com");
		click("//a[@class='red']");
		input("//input[@id='username']", "2798145476@qq.com");
		input("//input[@id='password']", "qinghong");
		input("//input[@placeholder='验证码']", "1");
		click("//a[@name='sbtbutton']");
		//关闭浏览器，关闭driver
		
		driver.quit();
	}
}

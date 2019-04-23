package com.xmkg.entity;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xmkg.util.ActionWeb;

public class LoginPage extends ActionWeb{
	
	public String url = "http://www.taobao.com";
	//@FindBy(xpath = "")
	//public WebElement user;
	
	
	//构造函数初始化成员对象
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void load() {
	  visitWeb(url);
	}
	
	//封装关键字实现登录
	public void login() {
		
		logger.debug("开始打开浏览器。。。。。。。。。");
		openBrowser("chrome");
		load();
		this.halt("3");
		
//		user.click();
//		click("//a[@class='red']");
//		input("//input[@id='username']", "2798145476@qq.com");
//		input("//input[@id='password']", "qinghong");
//		input("//input[@placeholder='验证码']", "1");
//		click("//a[@name='sbtbutton']");
		//关闭浏览器，关闭driver
		driver.quit();
		System.out.print(logger.getClass());
		logger.debug("开始关闭浏览器。。。。。。。。。。");
	}
}

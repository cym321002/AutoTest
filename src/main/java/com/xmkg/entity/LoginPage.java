package com.xmkg.entity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.xmkg.util.ActionWeb;

public class LoginPage extends ActionWeb {

	// 判斷方法被調用了幾次
	public static int count = 1;

	public String url = "http://192.168.90.3:8073/index.html#/login";
	@FindBy(xpath = "//*[@id='main']/div/div[1]/div/div[2]/div[1]/div[1]/form/div[1]/div/div/input")
	public WebElement userName;

	@FindBy(xpath = "//*[@id='main']/div/div[1]/div/div[2]/div[1]/div[1]/form/div[2]/div/div/input")
	public WebElement passWord;

	@FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div/div[2]/div[1]/div[1]/form/div[4]/div/button")
	public WebElement LandingButton;

	public void load() {
		visitWeb(url);
	}

	// 封装关键字实现登录
	public String login() {
		load();
		halt("3");
		PageFactory.initElements(driver, this);
		input(userName, "admin");
		input(passWord, "123456");
		click(LandingButton);
		return assertPageContains("系统首页");
	}

	@Override
	public String assertPageContains(String target) {

		String pageContent = driver.getPageSource();
		switch (count) {
		case 1:
			
			logger.debug("开始执行第一组测试数据。。。。。。。。。。");
			count++;
			return super.assertTitleContains("无纸化会议后台管理系统");
            
		case 2:
			logger.debug("开始执行第二组测试数据。。。。。。。。。。");
			count++;
			String xpathA = "//*[@id=\"main\"]/div/div[1]/div/div[2]/div[1]/div[1]/form/div[1]/div/p";
			return super.assertContentIs(xpathA, "用户名或密码错误");

		case 3:
			logger.debug("开始执行第三组测试数据。。。。。。。。。。");
			count++;
			String xpathB = "//*[@id=\"main\"]/div/div[1]/div/div[2]/div[1]/div[1]/form/div[1]/div/p";
			return super.assertContentIs(xpathB, "账号不存在");

		default:
			logger.debug("请检查测试数据项的个数，是否和case条件数目是否匹配");
			return "fail";

		}

		// return "Pass";

	}

}

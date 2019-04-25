package com.xmkg.entity;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.xmkg.util.ActionWeb;





@Component
public class LoginPage extends ActionWeb {


	// 判斷方法被調用了幾次
	public static int count = 1;
	@Value("${irs.ol}")
	public String url;

	//public String url = "http://192.168.90.3:8073/index.html#/login";
	@FindBy(xpath = "//*[@id='main']/div/div[1]/div/div[2]/div[1]/div[1]/form/div[1]/div/div/input")
	WebElement userName;

	@FindBy(xpath = "//*[@id='main']/div/div[1]/div/div[2]/div[1]/div[1]/form/div[2]/div/div/input")
	WebElement passWord;

	@FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div/div[2]/div[1]/div[1]/form/div[4]/div/button")
	WebElement LandingButton;

	public void load() {
		visitWeb(url);
	}
    

	// 封装关键字实现登录
	public String login(String un,String pw) {
		load();
		halt("3");
		PageFactory.initElements(driver, this);
		input(userName, un);
		input(passWord, pw);
		click(LandingButton);
		halt("3");
		return assertTitleIs("席媒无纸化会议管理系统");
	}

	@Override
	public String assertTitleIs(String target) {

		switch (count) {
		case 1:
			logger.debug("开始执行第一组测试数据。。。。。。。。。。");
			count++;
			return super.assertTitleIs("席媒无纸化会议管理系统");
            
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

	}

}

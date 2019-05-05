package com.xmkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController//表示该类的所有方法返回json格式
@SpringBootApplication(scanBasePackages = {"com.xmkg.*"})//等同余扫包 ，扫同级包，以及当前包
public class Application {
	@RequestMapping("/hello")
	public String hello() {
		return "hello World!!!";
	}

    //整个程序的入口，启动springboot，创建内置tomcat，并加载springMVC注解启动类
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

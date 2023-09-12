package com.yy.mySpring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource()
public class MySpringApplication {
	public static  void main(String [] args){
		
		System.err.println("启动中....");
		SpringApplication.run(MySpringApplication.class, args);
		System.err.println("启动成功！");
	}
}

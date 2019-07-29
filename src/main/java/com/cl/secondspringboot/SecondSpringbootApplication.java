package com.cl.secondspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@MapperScan("com.cl.secondspringboot.dao")  //包扫描
@EnableWebMvc
@SpringBootApplication
public class SecondSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondSpringbootApplication.class, args);
	}

}

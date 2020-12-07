package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = "com.example.mapper")
public class SpringBootReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReviewApplication.class, args);
	}

}

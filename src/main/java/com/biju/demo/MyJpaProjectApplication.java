package com.biju.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication //(exclude = JpaRepositoriesAutoConfiguration.class)  //DataSourceAutoConfiguration.class
public class MyJpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyJpaProjectApplication.class, args);
	}

}

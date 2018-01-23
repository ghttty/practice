package com.learn.testdb;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TestdbApplication {


	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.dbcp2")
	public BasicDataSource dataSource(){
		return (BasicDataSource) DataSourceBuilder.create().type(BasicDataSource.class).build();
	}



	public static void main(String[] args) {
		SpringApplication.run(TestdbApplication.class, args);
	}


}

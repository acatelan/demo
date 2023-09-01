package com.example.demo;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public DataSource dataSource(@Value("${DB_JDBC_URL:}") String jdbcUrl,
								 @Value("${DB_USERNAME:bombardier}") String user,
								 @Value("${DB_PASSWORD:}") String pass) {
		HikariDataSource ds = new HikariDataSource();
		ds.setJdbcUrl(jdbcUrl);
		ds.setUsername(user);
		ds.setPassword(pass);
		return ds;
	}

}

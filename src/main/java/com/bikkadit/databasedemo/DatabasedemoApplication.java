package com.bikkadit.databasedemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabasedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabasedemoApplication.class, args);

		System.out.println("hello");
	}

}

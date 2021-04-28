package com.bootcamp.botcampSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.origin.SystemEnvironmentOrigin;

import com.bootcamp.botcampSpring.service.RestService;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class BotcampSpringApplication{

	@Autowired
	private static RestService service;
	
	public static void main(String[] args) {
		SpringApplication.run(BotcampSpringApplication.class, args);
		service = new RestService();
		System.out.println(service.searchPerson("persona1", "planta1"));
	}
	
}

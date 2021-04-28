package com.bootcamp.botcampSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.bootcamp.botcampSpring.service.RestService;

public class Controlador {
	@Autowired
	private RestService service;
	
	public Controlador(RestService service) {
		this.service = service;
	}
	
	

}

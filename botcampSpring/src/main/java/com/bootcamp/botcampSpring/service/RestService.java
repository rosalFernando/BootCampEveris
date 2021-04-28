package com.bootcamp.botcampSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.botcampSpring.BotcampSpringApplication;

@Service
public class RestService{

	@Autowired
	private BotcampSpringApplication bta;

	String plantaPersonas[][] = { { "persona1 planta1", "persona2 planta1", "persona3 planta1", }, {"planta vacia"},
			{ "persona1 planta3", "persona2 planta3", "persona3 planta3", }, {"planta vacia"} };

	public RestService() {
		
	}
	public String searchPerson(String nomb, String apell) {
		String cadena = "";
		for (int i = 0;i<plantaPersonas.length;i++) {
			
			for (int j = 0;j<plantaPersonas.length;j++) {
				
					cadena = plantaPersonas[i][j];
				
				
			}
		}
		return cadena;

	}

	

}

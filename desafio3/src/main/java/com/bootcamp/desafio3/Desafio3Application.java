package com.bootcamp.desafio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bootcamp.desafio3.repository.repoCliente;
import com.bootcamp.desafio3.service.servicioCliente;
import com.bootcamp.desafio3.service.servicioClienteInterface;

@SpringBootApplication
public class Desafio3Application {

	@Autowired
	private servicioCliente servicio;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio3Application.class, args);
	}
	
	public void run(String... args) throws Exception {
		final repoCliente rp = new repoCliente();
		rp.setNombre("Fernando");
		rp.setApellidos("del Rosal Cuesta");
		rp.setDni("222333111F");
		servicio.insertarNuevoCliente(rp);
		
		final repoCliente rp2 = new repoCliente();
		rp2.setNombre("Antonio");
		rp2.setApellidos("perez y lo que sigue");
		rp2.setDni("222332452F");
		servicio.insertarNuevoCliente(rp2);
		
		System.out.println("-------Todos los clientes-------");
		servicio.getAll();
	
		System.out.println("--------buscando a Fernando del Rosal");
		servicio.searchByName("Fernando","del Rosal Cuesta");
		
		
	}

}

package com.bootcamp.desafio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.desafio3.repository.repoCliente;
import com.bootcamp.desafio3.repository.repoClienteInterface;

@Service("servicioCliente")
public class servicioCliente implements servicioClienteInterface{
	
	@Autowired
	static repoClienteInterface cliente;

	@Override
	public repoCliente insertarNuevoCliente(repoCliente newCliente) {
		newCliente = cliente.save(newCliente);
		return newCliente;
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchByName(final String nombre,final String apellidos) {
		
		final List<repoCliente> buscar = cliente.findByNameAndSurName1AndSurName2(nombre,apellidos);
		buscar.toString();
		
	}

}

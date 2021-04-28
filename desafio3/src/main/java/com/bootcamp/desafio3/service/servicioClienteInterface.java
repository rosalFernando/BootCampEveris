package com.bootcamp.desafio3.service;

import com.bootcamp.desafio3.repository.repoCliente;

public interface servicioClienteInterface {
	
	public repoCliente insertarNuevoCliente(final repoCliente newCliente);

	
	public void getAll();
	
	public void searchByName(final String nombre,final String apellidos);
}

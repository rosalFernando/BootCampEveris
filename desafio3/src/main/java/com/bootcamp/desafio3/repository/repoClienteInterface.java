package com.bootcamp.desafio3.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repoClienteInterface extends JpaRepository<repoCliente, Long>{

	public List<repoCliente> findByNameAndSurName1AndSurName2(final String nombre, final String apellidos);
}

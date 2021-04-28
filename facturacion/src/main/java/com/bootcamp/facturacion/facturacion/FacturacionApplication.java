package com.bootcamp.facturacion.facturacion;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bootcamp.facturacion.facturacion.repository.Pedido;
import com.bootcamp.facturacion.facturacion.repository.Producto;
import com.bootcamp.facturacion.facturacion.services.ServicePedido21Imp;
import com.bootcamp.facturacion.facturacion.services.ServicioPedido4Imp;

@SpringBootApplication
public class FacturacionApplication implements CommandLineRunner{
	@Autowired
	@Qualifier("ServicioPedido4Imp")
	private ServicioPedido4Imp servicio4;
	
	@Autowired
	@Qualifier("ServicePedido21Imp")
	private ServicePedido21Imp servicio21;
	

	public static void main(String[] args) {
		SpringApplication.run(FacturacionApplication.class, args);
	}
	
	public void run(String... arg)throws Exception{
		ArrayList<Producto> product = new ArrayList<Producto>();
		ArrayList<Pedido> order = new ArrayList<Pedido>();
		Producto producto;
		Pedido pedido ;
		producto = new Producto(1, "bicicleta", 0, 5);
		product.add(producto);
		producto = new Producto(2, "patinete", 0, 12);
		product.add(producto);
		pedido = new Pedido(1, "usuario destinatario", "calle falsa 123", true, product);
		order.add(pedido);
		pedido = new Pedido(2, "otro usuario destinatario", "calle verdadera", false, product);
		order.add(pedido);
		
		/*
		 * a partir de aqui la idea es recorrer el array de los pedidos
		 * obtener los productos de cada pedido y calcular el PVP usando el metodo
		 * del servicio
		 * */
		
		
	}

}

package com.bootcamp.facturacion.facturacion.services;

import org.springframework.stereotype.Service;

@Service("ServicePedido21Imp")
public class ServicePedido21Imp implements ServicesPedido{

	@Override
	public double PVP(double precio) {
		double porcentaje = precio/0.21;
		double total = precio + porcentaje;
		return total;
	}

	
}

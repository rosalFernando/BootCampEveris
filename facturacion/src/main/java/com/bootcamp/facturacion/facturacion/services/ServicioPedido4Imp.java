package com.bootcamp.facturacion.facturacion.services;

import org.springframework.stereotype.Service;

@Service("ServicioPedido4Imp")
public class ServicioPedido4Imp implements ServicesPedido{

	@Override
	public double PVP(double precio) {
		// TODO Auto-generated method stub
		double porcentaje = precio/0.04;
		double total = precio + porcentaje;
		return total;
	}

	

}

package com.bootcamp.facturacion.facturacion.repository;

import org.springframework.beans.factory.annotation.Autowired;

public class Producto {

	private int id;
	private String nombre;
	private double pvp;
	private double precioSinImpuestos;

	public Producto(int id, String nombre, double pvp, double precioSinImpuestos) {
		
		this.id = id;
		this.nombre = nombre;
		this.pvp = pvp;
		this.precioSinImpuestos = precioSinImpuestos;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPvp() {
		
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public double getPrecioSinImpuestos() {
		return precioSinImpuestos;
	}

	public void setPrecioSinImpuestos(double precioSinImpuestos) {
		this.precioSinImpuestos = precioSinImpuestos;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", pvp=" + pvp + ", precioSinImpuestos="
				+ precioSinImpuestos + "]";
	}

}

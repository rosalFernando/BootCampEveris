package com.bootcamp.facturacion.facturacion.repository;

import java.util.ArrayList;

public class Pedido {

	private int id;
	private String destinatario;
	private String direccionEntrega;
	private boolean indicador;
	private ArrayList<Producto> producto = new ArrayList<Producto>();

	public Pedido(int id, String destinatario, String direccionEntrega, boolean indicador,
			ArrayList<Producto> producto) {
		
		this.id = id;
		this.destinatario = destinatario;
		this.direccionEntrega = direccionEntrega;
		this.indicador = false;
		this.producto = producto;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}

	public boolean getIndicador() {
		return indicador;
	}

	public void setIndicador(boolean indicador) {
		this.indicador = indicador;
	}

	public ArrayList<Producto> getProducto() {
		return producto;
	}

	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", destinatario=" + destinatario + ", direccionEntrega=" + direccionEntrega
				+ ", indicador=" + indicador + ", producto=" + producto + "]";
	}

}

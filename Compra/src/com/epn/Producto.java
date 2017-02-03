package com.epn;

public class Producto {
	
	private String nombre;
	private int cant;
	private boolean stock;
	
	public Producto() {
		super();
	}
	
	public Producto(String nombre, int cant, boolean stock) {
		super();
		this.nombre = nombre;
		this.cant = cant;
		this.stock = stock;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCant() {
		return cant;
	}
	
	public void setCant(int cant) {
		this.cant = cant;
	}
	
	public boolean isStock() {
		return stock;
	}
	
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Producto  [Nombre=" + nombre + ", Cantidad=" + cant + ", Stock=" + stock + "]";
	}	
}
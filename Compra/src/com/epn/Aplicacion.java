package com.epn;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
	
		Lista lista = new Lista();
				
		Producto Atun= new Producto("Atun",10,false);
		Producto Helado= new Producto("Helado",5,false);
		Producto Mayonesa= new Producto("Mayonesa",2,true);
		Producto Manzanas= new Producto("Manzanas",10,false);
		Producto Fideos= new Producto("Fideos",4,false);
		Producto Papaya= new Producto("Papaya",3,true);
		Producto Maicena= new Producto("Maicena",5,false);
		Producto Platanos= new Producto("Platanos",25,false);
		
		Lista lista1 = new Lista();
		lista1.InsertarListaProd(Atun);
		lista1.InsertarListaProd(Helado);
		lista1.InsertarListaProd(Mayonesa);
		lista1.InsertarListaProd(Manzanas);
		lista1.InsertarListaProd(Fideos);
		lista1.InsertarListaProd(Papaya);
		lista1.InsertarListaProd(Maicena);
		lista1.InsertarListaProd(Platanos);
		
		JOptionPane.showMessageDialog(null, "\n********************** LISTA DE COMPRAS *********************\n"+
		"---------------------------------------------------------------------------------------\n"+lista1.toString()+"\n"+
		"---------------------------------------------------------------------------------------"+
		"\n********************** Productos en stock *********************\n"+"---------------------------------------------------------------------------------------\n"+
		lista1.ProductoSobrante()+"\n");
	}
}

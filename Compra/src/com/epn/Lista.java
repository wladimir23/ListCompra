package com.epn;

public class Lista {
	
	private Nodo primero;
	private int tamaño;
	
	public Lista(){
		primero=null;
		tamaño=0;		
	}
	
	public boolean EstaVacio(){
		return (primero==null && tamaño==0);
	}
	
	public void InsertarListaProd(Producto  dat){
		Nodo nodo = new Nodo(dat, null);
		if(EstaVacio()){
			primero= nodo;
			tamaño=1;
		}
		else{
			Nodo aux;
			aux= primero;
			while(aux.getLiga()!=null){
				aux=aux.getLiga();
			}
			aux.setLiga(nodo);
			tamaño=tamaño+1;
		}
	}
	public String ProductoSobrante(){
		String linea="";
		Nodo aux=primero;
		if(aux.getDato().isStock())
			linea+=aux+"\n";
		while(aux.getLiga()!=null){
			if(aux.getDato().isStock())
				linea+=aux.getDato()+"\n";
			aux=aux.getLiga();
		}
		return linea;
	}
	
	@Override
	public String toString() {
		String linea="";
		Nodo aux=primero;
		linea+=aux+"\n";
		while(aux.getLiga()!=null){
			linea+=aux.getLiga()+"\n";
			aux=aux.getLiga();
		}
		linea+="Tamaño de Lista: "+tamaño;
		return linea;
	}
	
}
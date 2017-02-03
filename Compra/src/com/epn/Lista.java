package com.epn;

public class Lista {
	
	private Nodo primero;
	private int tama�o;
	
	public Lista(){
		primero=null;
		tama�o=0;		
	}
	
	public boolean EstaVacio(){
		return (primero==null && tama�o==0);
	}
	
	public void InsertarListaProd(Producto  dat){
		Nodo nodo = new Nodo(dat, null);
		if(EstaVacio()){
			primero= nodo;
			tama�o=1;
		}
		else{
			Nodo aux;
			aux= primero;
			while(aux.getLiga()!=null){
				aux=aux.getLiga();
			}
			aux.setLiga(nodo);
			tama�o=tama�o+1;
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
		linea+="Tama�o de Lista: "+tama�o;
		return linea;
	}
	
}
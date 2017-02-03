package com.epn;

public class Nodo {

		private Producto dato;
		private Nodo liga;
	
		public Nodo() {
			super();
		}
		public Nodo(Producto dato, Nodo liga) {
			super();
			this.dato = dato;
			this.liga = liga;
		}
		public Producto getDato() {
			return dato;
		}
		public void setDato(Producto dato) {
			this.dato = dato;
		}
		public Nodo getLiga() {
			return liga;
		}
		public void setLiga(Nodo liga) {
			this.liga = liga;
		}

		@Override
		public String toString() {
			return " [dato=" + dato + "]";
		}	
}
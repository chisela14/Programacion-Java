package com.jacaranda.partitura;

public class Partitura {
	protected String nombre;
	protected int tempo;
	protected Pentagrama[] pentagramas;

	public Partitura(String nombre) {
		super();
		this.nombre = nombre;
		//datos temporales, crear funcion para hacerlos aleatorios
		this.tempo = 80;
		
	}
	
	public static String mostrarDatos(Partitura p1) {
		String datos = "Nombre de la obra: " + p1.getNombre() + "Tempo: " + p1.getTempo() ;
		return datos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public Pentagrama[] getPentagramas() {
		return pentagramas;
	}

	public void setPentagramas(Pentagrama[] pentagramas) {
		this.pentagramas = pentagramas;
	}
	
	
}

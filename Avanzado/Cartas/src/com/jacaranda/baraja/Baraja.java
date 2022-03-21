package com.jacaranda.baraja;

//import java.util.Random;
import java.util.Arrays;

public abstract class Baraja implements Repartible {
	//Atributos
	protected int numCartas;
	private int siguiente;
	protected Carta[] listaCartas;
	
	//Constructor
	public Baraja (int numCartas){
		super();
		this.numCartas = numCartas;
		this.siguiente = 0;
		this.listaCartas = new Carta [numCartas];
		barajar();
	}
	
	//Metodos
	public void barajar () {
		int numCartasGeneradas = 0;
		while (numCartasGeneradas < this.numCartas) {
			int numero = generaNumero();
			String palo = generaPalo ();
			Carta c1 = new Carta (numero, palo);
			boolean encontrado = false;
				for (int i=0; i<numCartasGeneradas && encontrado == false; i++) {
					if (c1.equals(listaCartas[i])){
						encontrado = true;
					}
				}
				if (encontrado == false) {
					listaCartas [numCartasGeneradas++] = c1;
				}
		}
		
	}

	public Carta getSiguiente() {
		if (siguiente == this.numCartas) {
			siguiente = 0;
		}
		Carta resultado = new Carta (listaCartas[siguiente].getNumber(), listaCartas[siguiente].getPalo());
		siguiente++;
		return resultado;
	}
	
	protected abstract String generaPalo(); 
	//{
		//int num = (int) (Math.random()*4) +1;
		//String[] listaPalos={"oros", "bastos", "copas", "espadas"};
		//return listaPalos [num];
	//}
	private int generaNumero() {
		int num = (int) (Math.random()*(this.numCartas/4)) + 1;
		return num;
	}

	@Override
	public String toString() {
		return "Baraja [numCartas=" + numCartas + ", siguiente=" + siguiente + ", listaCartas="
				+ Arrays.toString(listaCartas) + "]";
	}
	
	public void ordenar () {
		Arrays.sort(listaCartas);
	}
	
	
}

package sieteymedia;

import java.util.Random;
import java.util.Arrays;

public class Baraja {
	//Atributos
	private int numCartas;
	private int siguiente;
	private Carta[] listaCartas = new Carta[40];
	private Carta carta;
	
	//Constructor
	Baraja (){
		
	}
	
	//Metodos
	public void barajar () {
		while (Carta[]<40) {
			carta
		}
		
	}

	public int getSiguiente() {
		return siguiente;
	}
	
	private String generaPalo() {
		int num = (int) (Math.random()*4) +1;
		String[] listaPalos={"oros", "bastos", "copas", "espadas"};
		return listaPalos [num];
	}
	private int generaNumero() {
		int num = (int) (Math.random()*(this.numCartas/4)) + 1;
		return num;
	}
	
	//hashcode
	
}

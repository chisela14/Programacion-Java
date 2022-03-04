package com.jacaranda.baraja;

public class BarajaInglesa extends Baraja {
	
	private static final int CARTAS_BARAJA_INGLESA = 52;
	
	public BarajaInglesa () {
		super (CARTAS_BARAJA_INGLESA);
	}

	@Override
	protected String generaPalo() {
		int resultado = (int) (Math.random()*4);
		return PalosBarajaInglesa.values()[resultado].toString();
	}

	@Override
	public String toString() {
		StringBuilder resultado= new StringBuilder ("Baraja Inglesa\n");
		for (int i=0; i< super.numCartas; i++) {
			if (super.listaCartas[i].getNumber() <= 10) {
				resultado.append (super.listaCartas [i].getNumber());
			}else {
				if (super.listaCartas[i].getNumber() <= 11) {
					resultado.append("J");
				}else if (super.listaCartas[i].getNumber() <= 12) {
					resultado.append("Q");
				}else {
					resultado.append("K");
				}
			}
			resultado.append(" " + super.listaCartas[i].getPalo() + "\n");
		}
		return resultado.toString();
	}
	
	
}

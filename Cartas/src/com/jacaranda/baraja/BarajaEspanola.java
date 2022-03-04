package com.jacaranda.baraja;

public class BarajaEspanola extends Baraja {
private static final int CARTAS_BARAJA_ESPANOLA = 40;
	
	public BarajaEspanola () {
		super (CARTAS_BARAJA_ESPANOLA);
	}

	@Override
	protected String generaPalo() {
		int resultado = (int) (Math.random()*4);
		return PalosBarajaEspanola.values()[resultado].toString();
	}

	@Override
	public String toString() {
		StringBuilder resultado= new StringBuilder ("Baraja Española\n");
		for (int i=0; i< super.numCartas; i++) {
			if (super.listaCartas[i].getNumber() <= 10) {
				resultado.append (super.listaCartas [i].getNumber());
			}else {
				if (super.listaCartas[i].getNumber() <= 11) {
					resultado.append("Sota");
				}else if (super.listaCartas[i].getNumber() <= 12) {
					resultado.append("Caballo");
				}else {
					resultado.append("Rey");
				}
			}
			resultado.append(" " + super.listaCartas[i].getPalo() + "\n");
		}
		return resultado.toString();
	}

}

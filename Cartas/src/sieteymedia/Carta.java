package sieteymedia;

import java.util.Objects;

public class Carta {
	//Atributos
	private int number;
	private String palo;
	
	//Constructores
	Carta (int number, String palo){
		this.number = number;
		this.palo = palo;
	}
	//Metodos
	public int getNumber() {
		return number;
	}

	public String getPalo() {
		return palo;
	}

	public double getValor() {
		double valor;
		if (number >= 1 && number <=7) {
			valor = this.number;
		}else {
			valor = 0.5;
		}
		return valor;
	}
	
	//hashcode
	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return number == other.number && Objects.equals(palo, other.palo);
	}
	@Override
	public String toString() {
		return "Carta [number=" + number + ", palo=" + palo + "]";
	}
	
	
	
}

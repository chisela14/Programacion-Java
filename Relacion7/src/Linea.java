import java.util.Objects;

public class Linea {
	
	//Atributos
	private Punto puntoA, puntoB;
	
	//Constructores
	Linea () {
		this.puntoA = new Punto(0,0);
		this.puntoB = new Punto(0,0);
	}
	Linea (Punto punto, Punto punto2) {
		this.puntoA = punto;
		this.puntoB = punto2;
	}
	
	//métodos
	public Linea moverDerecha (double distancia) {
		double moverA = puntoA.getX();
		double moverB = puntoB.getX();
		moverA = moverA + distancia;
		moverB = moverB + distancia;
		Punto p1 = new Punto (moverA, puntoA.getY());
		Punto p2 = new Punto (moverB, puntoB.getY());
		Linea resultado = new Linea (p1, p2);
		return resultado;
	}
	public Linea moverIzquierda (double distancia) {
		double moverA = puntoA.getX();
		double moverB = puntoB.getX();
		moverA = moverA - distancia;
		moverB = moverB - distancia;
		Punto p1 = new Punto (moverA, puntoA.getY());
		Punto p2 = new Punto (moverB, puntoB.getY());
		Linea resultado = new Linea (p1, p2);
		return resultado;
	}
	public Linea moverArriba (double distancia) {
		double moverA = puntoA.getY();
		double moverB = puntoB.getY();
		moverA = moverA + distancia;
		moverB = moverB + distancia;
		Punto p1 = new Punto (puntoA.getX(), moverA);
		Punto p2 = new Punto (puntoB.getX(), moverB);
		Linea resultado = new Linea (p1, p2);
		return resultado;
	}
	public Linea moverAbajo (double distancia) {
		double moverA = puntoA.getY();
		double moverB = puntoB.getY();
		moverA = moverA - distancia;
		moverB = moverB - distancia;
		Punto p1 = new Punto (puntoA.getX(), moverA);
		Punto p2 = new Punto (puntoB.getX(), moverB);
		Linea resultado = new Linea (p1, p2);
		return resultado;
	}
	//Método que nos permita mostrar la información de la línea de la siguiente forma:
	//[puntoA,puntoB]. Por ejemplo: [(0.0,0.0),(1.0,1.0)].
	
	public String mostrarPuntos (Punto punto, Punto punto2) {
		String resultado = "(" + puntoA.getX() + "," + puntoA.getY() + ")" + "(" + puntoB.getX() + "," + puntoB.getY() + ")";
		return resultado;
	}
	
	//get set
	public Punto getPuntoA() {
		return puntoA;
	}
	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}
	public Punto getPuntoB() {
		return puntoB;
	}
	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}
	
	//hashcode
	@Override
	public int hashCode() {
		return Objects.hash(puntoA, puntoB);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linea other = (Linea) obj;
		return Objects.equals(puntoA, other.puntoA) && Objects.equals(puntoB, other.puntoB);
	}
	@Override
	public String toString() {
		return "Linea [puntoA=" + puntoA + ", puntoB=" + puntoB + "]";
	}
	
	
}
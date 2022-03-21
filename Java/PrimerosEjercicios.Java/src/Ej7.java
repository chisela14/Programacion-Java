// Método que muestre los números del 1 al 100 utilizando la instrucción for (para)

public class Ej7 {

	public static void main(String[] args) {
		// Mostrar resultado del método
		System.out.println(mostrarNumeros());
	}
	public static String mostrarNumeros() {
		String resultado="";
		for (int i=1; i<=100; i = i+1 ) {
			resultado = resultado + String.valueOf(i) + "\n";
		}
		return resultado;
	}

}

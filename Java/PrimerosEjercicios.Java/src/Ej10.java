// Escribe los números del 100 al 1 utilizando la instrucción for

public class Ej10 {
	
	public static void main(String[] args) {
		// Mostrar resultado del método
		System.out.println(mostrarNumeros());

	}
	
	public static String mostrarNumeros() {
		String resultado="";
		for (int i=100; i>=1; i = i-1 ) {
			resultado = resultado + String.valueOf(i) + "\n";
		}
		return resultado;
	}

}

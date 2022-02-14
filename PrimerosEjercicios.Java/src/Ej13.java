// Calcula y escribe los números múltiplos de 5 de 0 a 100 utilizando un bucle for.

public class Ej13 {

	public static void main(String[] args) {
		// Mostrar resultados
		System.out.println(multiplo5());

	}
	public static String multiplo5() {
		String resultado="";
		for (int i=0; i<=100; i=i+1) {
			if (i%5==0) {
				resultado = resultado + String.valueOf(i) + "\n";
			}
		}
		return resultado;
	}

}

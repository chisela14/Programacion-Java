// Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.

public class Ej16 {

	public static void main(String[] args) {
		// Mostrar resultado del método
		System.out.println(contarVeinte());
	}
	
	public static String contarVeinte() {
		String resultado="";
		for (int i=320; i<=160; i = i-20 ) {
			resultado = resultado + String.valueOf(i) + "\n";
		}
		return resultado;
	}

}

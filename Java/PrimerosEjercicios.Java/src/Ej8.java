//Muestra los números del 1 al 100 utilizando la instrucción while (mientras)

public class Ej8 {

	public static void main(String[] args) {
		// Mostrar números
		System.out.println(mostrarNumeros());
	}
	public static String mostrarNumeros() {
		int num=1;
		String resultado = "";
		while (num >= 1 && num<=100) {
			resultado = resultado + num + "\n";
			num = num + 1;
		}
		return resultado;
	}

}

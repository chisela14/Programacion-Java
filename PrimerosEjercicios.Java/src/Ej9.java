//Método que muestre los números del 1 al 100 utilizando la instrucción do.while (repetir .. hasta)

public class Ej9 {
	

	public static void main(String[] args) {
		// Mostrar números
		System.out.println(mostrarNumeros());
	}
	public static String mostrarNumeros() {
		int num=1;
		String resultado = "";
		
		do {
			resultado = resultado + num + "\n";
			num = num + 1;
		}while (num >= 1 && num<=100);
		
		return resultado;
	}

}


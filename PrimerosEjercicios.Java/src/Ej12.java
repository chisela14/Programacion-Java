
public class Ej12 {

	public static void main(String[] args) {
		// Mostrar números
		System.out.println(mostrarNumeros());
	}
	public static String mostrarNumeros() {
		int num=100;
		String resultado = "";
		
		do {
			resultado = resultado + num + "\n";
			num = num - 1;
		}while (num <= 100 && num >= 1);
		
		return resultado;
	}

}

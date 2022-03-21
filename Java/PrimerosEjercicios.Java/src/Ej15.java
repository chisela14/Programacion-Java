// Realiza un programa que muestre los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
public class Ej15 {

	public static void main(String[] args) {
		// Mostrar resultado del método
		System.out.println(multiplo5());
	}
	
	public static String multiplo5 () {
		int num=0;
		String resultado="";
		do {
			if (num%5==0) {
				resultado = resultado + String.valueOf(num) + "\n";
			}
			num = num + 1;
		}while (num >= 0 && num <=100);
		 
		return resultado;
	}
}

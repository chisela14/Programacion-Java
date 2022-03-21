/*Realiza un programa que pida un número por teclado y que luego muestre ese número al
revés. Utilizar cadenas para facilitar la tarea*/

import java.util.Scanner;

public class Ej41 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Declarar variables
		String num;
		// Pedir número
		System.out.println("Introduce un número: ");
		num = String.valueOf(teclado.nextLine());
		// Mostrar resultado del método
		System.out.println(darVuelta(num));
	}
	public static String darVuelta (String num) {
		String resultado="";
		int numNumeros=0;
		for (i=0; i)
		
		return resultado;
	}

}

/*Crea un programa que permita sumar N números. El usuario decide cuándo termina de
introducir números al indicar la palabra ‘fin’.*/

import java.util.Scanner;

public class Ej26 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// declarar variables
		int num1=0,num2=0, suma=0;
		//bucle para pedir numeros mientras no se introduzca "fin"
		do {
		//pedir numeros
		System.out.println("Introduce un número o 'fin' para terminar: ");
		String respuesta = teclado.nextLine();
		if (todosNumeros(respuesta)) {
			num1 = Integer.parseInt(respuesta);
		}else {
			num1 = String.parseString (respuesta);
		}
		
		System.out.println("Introduce otro número: ");
		num2 = Integer.parseInt(teclado.nextLine());
		//calcular y mostrar la suma
		suma = num1 + num2;
		System.out.println(suma);
		}while (String.valueOf(num1) != "fin");

	}
	
	//devuelve true si todos los caracteres son numeros
	public static boolean todosNumeros (String cadena) {
		boolean resultado = true;
		
		return resultado;
		
	}

}

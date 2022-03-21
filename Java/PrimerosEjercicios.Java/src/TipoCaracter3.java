/*Escribir un método que reciba un carácter y devuelva el tipo que es. Debe devolver una de las se
imprimir los siguientes mensajes según corresponda.
◦ Letra mayúscula
◦ Letra minúscula
◦ Dígito entre 0 y 9
◦ Signo de puntuación
◦ Espacio en blanco
◦ Paréntesis () o llaves {}
◦ Otro carácter*/

import java.util.Scanner;

public class TipoCaracter3 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Declarar variables
		char caracter;
		//Pedir caracter
		System.out.println("Introduce un carácter: ");
		caracter = teclado.nextLine().charAt(0);
		//Menú para distinguir el caracter
		if (caracter >= 65 && caracter <=90) {
			System.out.println("Es una letra mayúscula");
		}else if (caracter >= 97 && caracter <=122) {
			System.out.println("Es una letra minúscula");	
		}else if (caracter >= 48 && caracter <=57) {
			System.out.println("Es un dígito entre 0 y 9");
		}else if (caracter == 44 || caracter == 46 || caracter == 58 || caracter == 59) {
			System.out.println("Es un signo de puntuación");
		}else if (caracter == 32) {
			System.out.println("Es un espacio en blanco");	
		}else if (caracter=='(' || caracter==')'){
				System.out.println("Es un paréntesis");
		}else if (caracter=='{' || caracter=='}') {
				System.out.println("Es una llave");
		}else {
			System.out.println("Es otro tipo de caracter");
		}
	}

}
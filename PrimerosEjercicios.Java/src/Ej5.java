/*Realiza un método que reciba una hora por parámetro y que muestre luego buenos días, buenas
tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
respectivamente. Sólo se tienen en cuenta las horas.*/

import java.util.Scanner;

public class Ej5 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// declarar variables
		int hora;
		//pedir y guardar la hora
		System.out.println("Introduce la hora (sin minutos): ");
		hora = Integer.parseInt(teclado.nextLine());
		//calcular el saludo con el método "saludo"
		System.out.println(saludo (hora));
	}
	
	//método para calcular el saludo
	public static String saludo (int hora) {
		String saludo = null;
		if (hora >= 6 && hora <= 12) {
			saludo = "Buenos días";
		}else if (hora >=13 && hora <=20) {
			saludo = "Buenas tardes";
		}else if (hora >=21 && hora <=24 || hora >=0 && hora <=5) {
			saludo = "Buenas noches";
		}else {
			saludo="error";
		}
		return saludo;
	}

}

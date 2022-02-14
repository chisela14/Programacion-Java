/*Calcular las calificaciones de un alumno con un método que reciba la nota de la parte práctica, la
nota de los problemas y la parte teórica. La nota final se calcula según el siguiente criterio: la parte
práctica vale el 10%; la parte de problemas vale el 50% y la parte teórica el 40%. Las notas deben
estar entre 0 y 10, si no lo están, deberá devolver un mensaje de error. Realiza el método que
calcule la media de tres notas y te devuelva la nota del boletín (insuficiente, suficiente, bien,
notable o sobresaliente).*/

import java.util.Scanner;

public class Calificaciones4 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Declarar variables
		double practica, problemas, teoria, nfinal;
		String nota = null;
		boolean error=false;
		//Pedir datos
		System.out.println("Introduce la nota de la parte práctica: ");
		practica = Double.parseDouble(teclado.nextLine());
		System.out.println("Introduce la nota de los problemas: ");
		problemas = Double.parseDouble(teclado.nextLine());
		System.out.println("Introduce la nota de la parte teórica: ");
		teoria = Double.parseDouble(teclado.nextLine());
		//Calcular la nota
		nfinal = (practica*0.1) + (problemas*0.5) +(teoria*0.4);
		System.out.println(nfinal);
		//Menu para devolver la nota del boletín (o error)
		if (nfinal >= 0 && nfinal <= 4) {
			nota = ("insuficiente");
		} else if (nfinal >= 5 && nfinal <= 5.999) {
			nota = ("suficiente");
		} else if (nfinal >= 6 && nfinal <= 6.999) {
			nota = ("bien");
		} else if (nfinal >= 7 && nfinal <= 8) {
			nota = ("notable");
		} else if (nfinal >= 9 && nfinal <= 10) {
			nota = ("sobresaliente");
		}else {
			error = true;
			System.out.println("error");
		}
		if (error == false){
			System.out.println("La nota del boletín es: " + nota);
		}
	}
}

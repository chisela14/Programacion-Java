/*Programa que solicite al usuario tres notas y muestre la calificación final. A continuación
 * debe preguntar si quiere introducir otra nota o no (S/N). Si dice que si (S) se deberá pedir
 * a continuación las tres notas del alumno. El programa terminará cuando responda que no (N)
 * quiere introducir más notas.*/

import java.util.Scanner;

public class NotasVariosAlumnos {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Declarar variables
		char eleccion;
		double notaPractica,notaProblema,notaTeoria;
		//Bucle 
		do {
			//Pedir notas
			System.out.println("Introduce la primera nota (pŕactica): ");
			notaPractica = Double.parseDouble(teclado.nextLine());
			System.out.println("Introduce la segunda nota (problemas): ");
			notaProblema = Double.parseDouble(teclado.nextLine());
			System.out.println("Introduce la tercera nota (teoría): ");
			notaTeoria = Double.parseDouble(teclado.nextLine());
			System.out.println("Tu nota final es " + media (notaPractica, notaProblema, notaTeoria));
			//Continuar bucle o no
			System.out.println("¿Quieres introducir más notas? (S/N): ");
			eleccion = teclado.nextLine().charAt(0);
		} while (eleccion == 'S');
	}
	
	// método para calcular la notal final
	public static double media (double notaPractica, double notaProblema, double notaTeoria) {
		double resultado = 0.1*notaPractica + 0.5*notaTeoria + 0.4*notaProblema;
		return resultado;
	}

}

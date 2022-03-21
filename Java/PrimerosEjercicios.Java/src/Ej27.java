/*Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.*/

import java.util.Scanner;

public class Ej27 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Declarar variables
		final int nSueldos=10;
		int sueldo=0, mayor1000=0, suma=0;
		//Bucle para pedir los sueldos
		for (int i=1; i<=nSueldos; i++) {
			System.out.println("Introduce un sueldo: ");
			sueldo = Integer.parseInt(teclado.nextLine());
			suma = suma + sueldo;
			if (sueldo > 1000) {
				mayor1000 = mayor1000 + 1;
			}
		}
		//Mostrar resultados
		System.out.println("La suma de todos los sueldos es " + suma);
		System.out.println("Hay " + mayor1000 + " sueldos mayores que 1000");

	}

}

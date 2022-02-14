/*Programar un sistema de calefacción-refrigeración que compruebe en función del día y el mes la
estación en la que estamos y en función de la estación programe la temperatura: Invierno->19o,
Primavera->20o, Verano->24o, Otoño→19o. El método deberá recibir como parámetro el mes y el
día actual, y el método deberá devolver los grados a los que deberemos programar el sistema.*/

import java.util.Scanner;

public class Ej6 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// declarar variables
		int dia,mes;
		//pedir el día y el mes
		System.out.println("Introduce el día: ");
		dia = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el mes: ");
		mes = Integer.parseInt(teclado.nextLine());
		//mostrar resultado del método
		System.out.println("La calefacción-refrigeración se pone a " + grados (dia,mes) + "o");

	}
	public static int grados (int dia, int mes) {
		//declarar variables
		int grados = 0;
		char estacion;
		//calcular estación
			// lo pilla sin paréntesis pero no sabemos por qué, mejor ponerlos
		if ((dia >= 21 && dia <=31 && mes == 12) || mes == 1 || mes == 2 || (dia >= 1 && dia <=20 && mes == 3)) {
			estacion = 'I';
		}else if ((dia >= 21 && dia <=31 && mes == 3) || mes == 4 || mes == 5 || (dia >= 1 && dia <=20 && mes == 6)) {
			estacion = 'P';
		}else if ((dia >= 21 && dia <=30 && mes == 6) || mes == 7 || mes == 8 || (dia >= 1 && dia <=20 && mes == 9)) {
			estacion = 'V';
		}else {
			estacion = 'O';
		}
		//menú para cambiar los grados según la estación
		switch (estacion) {
			case 'I': {
				//no es lo que pide el ejercicio pero es para comprobar que lo pilla bien
				grados = 28;
				break;
			}
			case 'O': {
				grados = 19;
				break;
			}
			case 'P': {
				grados = 20;
				break;
			}
			case 'V': {
				grados = 24;
				break;
			}
		}
		return grados;
	}

}

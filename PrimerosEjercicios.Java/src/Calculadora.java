//programa calculadora (pedir 2 números y dar 4 opciones)

import java.util.Scanner;

public class Calculadora {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Declaración variables
		int num1,num2,resultado=0;
		char tipo;
		boolean error=false;
		//Petición operación
		System.out.println("Indique la operación a realizar (+,-,x,/): ");
		tipo = teclado.nextLine().charAt(0);
		//Petición números
		System.out.println("Introduce un número: ");
		num1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce otro número: ");
		num2 = Integer.parseInt(teclado.nextLine());
		//Bucle
		do {
			//menú operaciones con switch
			switch (tipo) {
				case '+': {
					error = false;
					resultado = num1+num2;
					break;
				}
				case '-': {
					error = false;
					resultado = num1-num2;
					break;
				}
				case 'x': {
					error = false;
					resultado = num1*num2;
					break;
				}
				case '/': {
					if (num2 == 0) {
						error = true;
					}else {
						resultado = num1/num2;
					}
					
					break;
				}
				default:
					error = true;
			}
			if (error == true) {
				System.out.println("Se ha producido un error");
			}else {
				System.out.println(resultado); 
			}
			System.out.println("Indique la operación a realizar (+,-,x,/), introduzca 'e' para salir: ");
			tipo = teclado.nextLine().charAt(0);
		}while (tipo != 'e');	
		
	}

}

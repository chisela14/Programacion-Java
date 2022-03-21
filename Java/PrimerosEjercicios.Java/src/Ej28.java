/*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
El número n se debe introducir por teclado.*/

import java.util.Scanner;

public class Ej28 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// declarar variables
		int num;
		//pedir numero de numeros de la serie
		System.out.println("Introduce el número de numeros de la serie que quieres ver: ");
		num = Integer.parseInt(teclado.nextLine());
		//mostrar serie de numeros
		System.out.println(fibonacci(num));
	}
	
	public static String fibonacci(int num) {
		int r2=0, r1=1, total=0;
		String serie="";
		for (int i=1; i==num; i=i+1) {
			total = r2+r1;
			r2 = r1;
			r1 = total;
			serie = serie + String.valueOf(total);
		}
		return serie;
	}
	

}

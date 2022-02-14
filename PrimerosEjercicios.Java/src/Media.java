//programa que pida 10 números y calcule la media
import java.util.Scanner;

public class Media {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Declarar variables
		double num=0,suma=0, resultado;
		int i;
		final int MEDIA = 10;
		//Bucle para pedir números y acumularlos
		for (i=0;i<MEDIA;i=i+1) {
			System.out.println("Introduce un número: ");
			num = Integer.parseInt(teclado.nextLine());
			suma = suma + num;
		}
		//Realizar la media de los números acumulados
		resultado = suma/MEDIA;
		System.out.println("La media es: " + resultado);
	}

}

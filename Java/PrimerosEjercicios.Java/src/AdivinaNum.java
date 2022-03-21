//programa que adivine mi número
import java.util.Scanner;

public class AdivinaNum {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Declarar variables
		int premio,num,intentos=0;
		//crear número aleatorio
		premio = (int)Math.floor(Math.random()*101) ;
			// System.out.println(num);
		//Bucle para que el usuario intente adivinar el numero
		do {
			System.out.println("Intenta adivinar mi número: ");
			num = Integer.parseInt(teclado.nextLine());
			intentos = intentos + 1;
			if (num<premio) {
				System.out.println("Tu número es más bajo que el mío");
			}else if (num>premio) {
				System.out.println("Tu número es más alto que el mío");
			}
		} while (num != premio);
		if (num == premio) {
			System.out.println("Has acertado el número, te ha costado " + intentos + " intentos");
		}
	}

}

//Escribe un método que reciba por parámetro el día de la semana (Lunes, Martes,
//Miércoles, etc) y devuelva qué asignatura toca a primera hora ese día.
import java.util.Scanner;

public class PrimeraHora2 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Declarar variables
		char dia;
		String asignatura;
		//Pedir día
		System.out.println("Indica el día de la semana (L/M/X/J/V): ");
		dia = teclado.nextLine().charAt(0);
		//menú
		switch (dia) {
			case ('L'): {
				asignatura = "entornos";
				System.out.println("El lunes tienes " + asignatura);
				break;
			}
			case ('M'):
			case ('V'): {
				asignatura = "programación";
				if (dia == 'M') {
					System.out.println("El martes tienes " + asignatura);
				}else {
					System.out.println("El viernes tienes " + asignatura);
				}
				break;
			}
			case ('X'): {
				asignatura = "FOL";
				System.out.println("El miércoles tienes " + asignatura);
				break;
			}
			case ('J'): {
				asignatura = "sistemas";
				System.out.println("El jueves tienes " + asignatura);
				break;
			}
		}
	}

}

import java.util.Scanner;

public class CuentaMain {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Crear cuenta con el saldo que nos den
		System.out.println("Introduce tu saldo: ");
		int saldo = Integer.parseInt(teclado.nextLine());
		Cuenta c1 = new Cuenta (saldo);
		//mostrar menú al usuario
		System.out.println("¿Qué opción quieres realizar con tu cuenta?: \nHacer un reintegro (R)\nHacer un ingreso (I)"
				+ "\nConsultar el saldo y el número de ingresos y reintegros realizados (C)\nSalir (S)\n");
		char opcion = teclado.nextLine().charAt(0);
		//crear menú
		switch (opcion) {
			case ('R'):
		}
	}
}

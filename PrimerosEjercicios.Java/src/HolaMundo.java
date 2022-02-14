import java.util.Scanner;

public class HolaMundo {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Declaración de variables
		int num1, num2, resultado;
		char opc;
		
		System.out.println("Hola mundo");
		
		System.out.println("¿Quieres realizar la suma? (S/N): ");
		opc = teclado.nextLine().charAt(0);
		if (opc == 'S') {
			System.out.println("Introduce un número entero: ");
			num1=Integer.parseInt(teclado.nextLine());
			
			System.out.println("Introduce otro número entero: ");
			num2=Integer.parseInt(teclado.nextLine());
			
			resultado = num1+num2;
			System.out.println(resultado);
		}else if (opc == 'N') {
			System.out.println("Entonces para qué me ejecutas");
		}else {
			System.out.println("Error");
		}
		
	}

}

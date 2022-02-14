//programa que lea dos números y nos diga cual es mayor y cual es menor
import java.util.Scanner;

public class MayorMenor {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
        System.out.println("Introduce un número: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce otro número: ");
        num2 = Integer.parseInt(teclado.nextLine());
        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo");
        }else {
            System.out.println("El segundo número es mayor que el primero");
        }

	}

}

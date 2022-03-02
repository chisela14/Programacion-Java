import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Plato> listaPlatos = new ArrayList<Plato> ();
		int opcion;
		
		do {
			mostrarMenu();
			opcion = teclado.nextLine().charAt(0);
			if (opcion == 1) {
				
				darAlta (listaPlatos);
			}
			
		}while (opcion !=6);
		
	}
	
	public static void mostrarMenu () {
		System.out.println("Bienvenid@ al restaurante, indica que quieres hacer: \n"
				+ "1. Dar de alta un plato\n"
				+ "2. Modificar el precio de un plato\n"
				+ "3. Asignar un vino a un plato \n"
				+ "4. Mostrar informacion de un plato\n"
				+ "5. Monstrar informacion de todos los platos\n"
				+ "6. Salir\n");
		
	}
	
	public static void darAlta (ArrayList<Plato> listaPlatos) {
		System.out.println("Introduce el nombre del plato: ");
		String nombre = teclado.nextLine();
		for (int i=0; i<listaPlatos.size(); i++) {
			Plato plato = listaPlatos.get(i);
			if (plato.getNombre() == nombre) {
				System.out.println("No se puede añadir el plato porque ya existe");
				//break;
			}
		}
		System.out.println("Introduce el precio: ");
		double precio = Double.parseDouble(teclado.nextLine());
		Plato p1 = new Plato (nombre, precio);
		listaPlatos.add (p1);
		
	}

}

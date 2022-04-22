package com.jacaranda.principal;

import com.jacaranda.partitura.Partitura;

public class Main {

	public static void main(String[] args) {
		// Crear partitura anónima (1)
		Partitura anon = new Partitura ("Romance Anónimo");
		// Crear partitura con autor (2)
		Partitura autor = new Partitura ("Para Elisa");
		// Ver datos (2)
		System.out.print(autor.mostrarDatos(autor));
		// Ver música (1)
		// Modificar un pentagrama (1)
		// Añadir pentagrama (2)
		// Retirar pentagrama (2)
		
		

	}

}

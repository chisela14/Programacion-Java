package notasAlumnos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno a1 = new Alumno ("1234");
		a1.setNotaPrimerTrimestre(10);
		a1.setNotaSegundoTrimestre(8);
		
		System.out.println(a1.toString());
	}

}

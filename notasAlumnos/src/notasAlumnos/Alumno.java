package notasAlumnos;

public class Alumno {
	
	// Atributos
	
	private String nombre;
	private String apellidos;
	private String dni;
	private double notaPrimerTrimestre;
	private double notaSegundoTrimestre;
	private double notaTercerTrimestre;
	
	//Crear el objeto e inicializar los atributos con el valor adecuado
	Alumno (String dni){
		this.dni = dni;
		this.notaPrimerTrimestre = -1;
		this.notaSegundoTrimestre = -1;
		this.notaTercerTrimestre = -1;
	}
	
	public Alumno(String nombre, String apellidos, String dni) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}




	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", notaPrimerTrimestre="
				+ notaPrimerTrimestre + ", notaSegundoTrimestre=" + notaSegundoTrimestre + ", notaTercerTrimestre="
				+ notaTercerTrimestre + "]";
	}

	//Clic derecho -> Source -> Generate getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getNotaPrimerTrimestre() {
		return notaPrimerTrimestre;
	}
	public void setNotaPrimerTrimestre(double notaPrimerTrimestre) {
		this.notaPrimerTrimestre = notaPrimerTrimestre;
	}
	public double getNotaSegundoTrimestre() {
		return notaSegundoTrimestre;
	}
	public void setNotaSegundoTrimestre(double notaSegundoTrimestre) {
		this.notaSegundoTrimestre = notaSegundoTrimestre;
	}
	public double getNotaTercerTrimestre() {
		return notaTercerTrimestre;
	}
	public void setNotaTercerTrimestre(double notaTercerTrimestre) {
		this.notaTercerTrimestre = notaTercerTrimestre;
	}
	public String getDni() {
		return dni;
	}
	
	
	
	
	
	public void ponerNotaPrimerTrimestre (double nota) {
		notaPrimerTrimestre = nota;
	}

	public void ponerNota (double nota, int trimestre) {
		switch (trimestre) {
		case 1:
			notaPrimerTrimestre = nota;
			break;
		case 2:
			notaSegundoTrimestre = nota;
			break;
		case 3:
			notaTercerTrimestre = nota;
			break;
		default:
				break;
		} 
	}
}

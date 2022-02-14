import java.util.Scanner;

public class examen3 {
	
	//Entiendo que la tecla pulsada no se pedirá por pantalla pero declaro esto para hacer pruebas
	public static Scanner teclado =new Scanner(System.in);
	
	public static void main(String[] args) {
		String nota = "mi";
		boolean sostenido = true;
		System.out.println(devolverFrecuencia (nota, sostenido));
	}
	
	public static double devolverFrecuencia (String nota, boolean sostenido) {
		double frecuencia=0;
		//Guardar la tecla en mayúsculas y minúsculas
		String notaMayus, notaMinus;
		notaMayus = nota.toUpperCase();
		notaMinus = nota.toLowerCase();
		//Devolver la frecuencia dependiendo de la nota que sea
		if (notaMayus.equals("DO") || notaMinus.equals("do")){
			frecuencia = 523.25;
		}else if (notaMayus.equals("RE") || notaMinus.equals("re")){
			frecuencia = 587.33;
		}else if (notaMayus.equals("MI") || notaMinus.equals("mi")){
			frecuencia = 659.26;
		}else if (notaMayus.equals("FA") || notaMinus.equals("fa")){
			frecuencia = 698.46;
		}else if (notaMayus.equals("SOL") || notaMinus.equals("sol")){
			frecuencia = 783.99;
		}else if (notaMayus.equals("LA") || notaMinus.equals("la")){
			frecuencia = 880;
		}else if (notaMayus.equals("SI") || notaMinus.equals("si")){
			frecuencia = 987.77;
		}
		if (sostenido == true) {
			frecuencia = frecuencia * 1.03;
		}
		return frecuencia;
	}

}

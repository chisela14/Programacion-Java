package method;


public class Ejercicio {
	
	public static final Double PI = 3.14;
	
	

	public static void main(String[] args) {
				
		// Variables
		
		// Inicio
		
				
				
	}
	
	/* Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que reciba los
	coeficientes de una ecuación de segundo grado y devuelva el número de soluciones que
	tiene. Si los argumentos no son válidos (el primer coeficiente tiene que ser distinto de cero)
	debe devolver un -1. */
	public static int numeroSolucionesEcuacionSegundoGrado(int a, int b, int c) {
		int soluciones;
		if (a==0) {
			soluciones = -1;
		}else {
			if (b * b - 4 * a * c > 0) {
				//se podra hacer -b + y -b -
				soluciones = 2;
			} else {
				if (b * b - 4 * a * c < 0) {
					// no tiene solución
					soluciones = 0;
				} else {
					// la solucion es 0 así que da igual -b + que -b -
					soluciones = 1;
				}
			}
		}
		
		return soluciones;
	}
	
	/* Realizar un método llamado solucionSumaEcuacionSegundoGrado que reciba los
	coeficientes de una ecuación de segundo grado y devuelva la solución de realizar la suma si
	tiene dos soluciones, la única solución existente en el caso de que sólo tenga una solución o
	-1000 si no tiene solución. */
	public static Double solucionSumaEcuacionSegundoGrado(int a, int b, int c) {
		double resultado;
		if (numeroSolucionesEcuacionSegundoGrado(a, b, c) == 2) {
			resultado = (-b + Math.sqrt(b * b - 4 * a * c))/2*a;
		}else if (numeroSolucionesEcuacionSegundoGrado(a, b, c) == 1) {
			resultado = (-b + 0) / 2*a;
		} else {
			resultado = -1000;
		}
		return resultado;
	}
	
	/*Realizar un método llamado solucionRestaEcuacionSegundoGrado que reciba los
	coeficientes de una ecuación de segundo grado y devuelva la solución de realizar la resta si
	tiene dos soluciones, la única solución existente en el caso de que sólo tenga una solución o
	-1000 si no tiene solución.*/
	public static Double solucionRestaEcuacionSegundoGrado(int a, int b, int c) {
		double resultado;
		if (numeroSolucionesEcuacionSegundoGrado(a, b, c) == 2) {
			resultado = (-b - Math.sqrt(b * b - 4 * a * c))/2*a;
		}else if (numeroSolucionesEcuacionSegundoGrado(a, b, c) == 1) {
			resultado = (-b - 0) / 2*a;
		} else {
			resultado = -1000;
		}
		return resultado;
	}	
	
	/*Realizar un método llamado areaCirculo que devuelva el área de un círculo. El radio se
	pasará como argumento. A=PI*r^2.*/
	public static Double areaCirculo(Double r) {
		double area = PI*(r*r);
		return area;
	}
	
	/*Realizar un método llamado longitudCirculo que devuelva la longitud de un círculo El
	radio se pasará como argumento. L=2*PI*r.*/
	public static Double longitudCirculo(Double r) {
		double longitud = 2 * PI * r;
		return longitud;
	}
	
	/*Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si el
	primer número es múltiplo del segundo.*/
	public static boolean esMultiplo(int a, int b) {
		boolean resultado;
		if (b == 0) {
			resultado = false;
		}else if (a%b==0 && a != 0) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
	
	/*Realizar un método llamado horaMayor que recibirá seis valores enteros, los tres primeros
	representarán la hora, minuto y segundos de la primera hora y los otros tres de la segunda
	hora. Se deberá devolver un 1 si la primera hora es mayor que la segunda, un 2 si la segunda
	hora es mayor que la primera, un 0 si son iguales y un -1000 si los datos no son correctos.*/
	public static int horaMayor(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		int resultado=0;
		//comprobar datos correctos
		if ((hora1 < 0 && hora1 >24) || (hora2 < 0 && hora2 >24)) {
			resultado = -1000;
		}else if ((min1 < 0 && min1 >59) || (min2 < 0 && min2 >59)) {
			resultado = -1000;
		}else if ((seg1 < 0 && seg1 >59) || (seg2 < 0 && seg2 >59)) {
			resultado = -1000;
		}
		//comparar hora
			
		if ((hora1>hora2)|| (hora1==hora2 && min1>min2) || (hora1==hora2 && min1==min2 && seg1>seg2) && resultado !=-1000) {
			resultado = 1;
		}else if ((hora1<hora2)|| (hora1==hora2 && min1<min2) || (hora1==hora2 && min1==min2 && seg1<seg2) && resultado !=-100) {
			resultado = 2;
		}else if ((hora1==hora2)|| (hora1==hora2 && min1==min2) || (hora1==hora2 && min1==min2 && seg1==seg2)&& resultado !=-100) {
			resultado = 0;
		}
		return resultado;
		
	}
	
	public static int segundosEntre(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
				
		
	}
	
	public static int maximoComunDivisor(int a, int b) {
		
	}
	
	public static int minimoComunMultiplo(int a, int b) {
		
	}
	
	public static String binario(int num) {
		
	}
	
	public static int decimal(String num) {
		
	}
}

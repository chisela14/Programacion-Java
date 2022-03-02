
public class Plato {
	private String nombre;
	private double precio;
	
	Plato(String nombre){
		this.nombre = nombre;
	}

	public Plato(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	

}

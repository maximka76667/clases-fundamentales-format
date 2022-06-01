package ej01;

public class Plato {
	private String nombre;
	private double precio, calorias;

	public Plato(String nombre, double precio, double calorias) {
		this.nombre = nombre;
		this.precio = precio;
		this.calorias = calorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

}

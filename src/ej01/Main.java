package ej01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Plato> platos = new ArrayList<Plato>();
		
		platos.add(new Plato("Patacas con ali-oli", 7, 500));
		platos.add(new Plato("Fingers", 8, 1000));
		
		System.out.format("%-30s %16s %10s %n", "Nombre", "Precio", "Calorias");
		for(Plato plato : platos) {
			System.out.format("%-30s %15.2f€ %10.2f %n", plato.getNombre(), plato.getPrecio(), plato.getCalorias());
		}
	}

}

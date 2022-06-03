package ej03;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		ArrayList<Venta> ventas = new ArrayList<Venta>();

		ventas.add(new Venta("Antonio", "Rodriguez", "Hernandez", 2000.30));
		ventas.add(new Venta("Jesus", "Rodriguez", "Hernandez", 4000.50));
		ventas.add(new Venta("Antonio", "Rodriguez", "Hernandez", 500));
		ventas.add(new Venta("Antonio", "Rodriguez", "Hernandez", 1300));

		DecimalFormat myFormatter = new DecimalFormat("###,###.00");

		LocalDate fechaActual = LocalDate.now();
		int mesNumero = fechaActual.getMonthValue();
		String mes = "";
		switch (mesNumero) {
		case 1:mes = "enero";break;
		case 2:mes = "febrero";break;
		case 3:mes = "marzo";break;
		case 4:mes = "abril";break;
		case 5:mes = "mayo";break;
		case 6:mes = "junio";break;
		case 7:mes = "julio";break;
		case 8:mes = "agosto";break;
		case 9:mes = "septimbre";break;
		case 10:mes = "octubre";break;
		case 11:mes = "noviembre";break;
		case 12:mes = "deciembre";break;
		default:break;
		}
		int anho = fechaActual.getYear();

		System.out.println("ACME");
		System.out.println("Total Ventas del mes de " + mes + " del " + anho);

		System.out.format("%-4s   %-10s   %-15s %-15s  %-10s     %-10s %n", "ID", "Nombre", "Apellido1", "Apellido2",
				"Ventas", "Comisión");
		for (Venta venta : ventas) {
			System.out.format("%04d   %-10s   %-15s %-15s %9s €    %8s € %n", venta.getId(), venta.getNombreVendedor(),
					venta.getApellido1(), venta.getApellido2(), myFormatter.format(venta.getImportVentasMas()),
					myFormatter.format(venta.comision()));
		}

		double totalVentas = 0;
		double totalComisiones = 0;

		for (Venta venta : ventas) {
			totalVentas += venta.getImportVentasMas();
			totalComisiones += venta.comision();
		}
		System.out.println();
		System.out.format("%-10s                                         %10s €  %10s € %n", "Totales:",
				myFormatter.format(totalVentas), myFormatter.format(totalComisiones));

	}

}

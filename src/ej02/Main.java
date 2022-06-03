package ej02;

import java.util.ArrayList;
import java.util.Scanner;

import ej01.Plato;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<LineaPedido> lineasPedido = new ArrayList<LineaPedido>();
		
		String id = "";
		
		while(true) {
			System.out.print("Dame id de nuevo producto: ");
			id = entrada.nextLine();
			
			if(id.equals("*")) {
				break;
			}
			
			System.out.print("Cantidad: ");
			int cantidad = entrada.nextInt();
			
			entrada.nextLine();
			
			System.out.print("Descripcion: ");
			String desc = entrada.nextLine();

			System.out.print("Precio: ");
			double precio = entrada.nextDouble();
			
			lineasPedido.add(new LineaPedido(id, desc, precio, cantidad));
			System.out.println("Producto ha anadido");
			
			entrada.nextLine();
		}
		
		System.out.format("%-10s %5s %20s %10s %10s %n", "Id", "Cantidad", "Descripcion", "Precio", "Importe");
		for(LineaPedido lineaPedido : lineasPedido) {
			System.out.format("%-10s %5d %20s %12.2f %11.2f %n", lineaPedido.getIdProducto(), lineaPedido.getCantidadProducto(), lineaPedido.getDescripcionProducto(), lineaPedido.getPrecioBaseProducto(), lineaPedido.getCantidadProducto() * lineaPedido.getPrecioBaseProducto());
		}
		
		double sumaImporte = 0;
		for (LineaPedido lineaPedido : lineasPedido) {
			sumaImporte += lineaPedido.getPrecioBaseProducto() * lineaPedido.getCantidadProducto();
		}
		
		System.out.format("%-50s  %10.2f", "Total: ", sumaImporte);
	}

}

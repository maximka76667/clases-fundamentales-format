package ej03;

public class Venta {
	private int id;
	private String nombreVendedor, apellido1, apellido2;
	private double importeVentasMas;

	static int numerodeVentas = 1;
	static final int comision = 7;

	public Venta(String nombreVendedor, String apellido1, String apellido2, double importeVentasMas) {
		this.nombreVendedor = nombreVendedor;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.importeVentasMas = importeVentasMas;
		this.id = Venta.numerodeVentas;
		Venta.numerodeVentas += 1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public double getImportVentasMas() {
		return importeVentasMas;
	}

	public void setImportVentasMas(double importeVentasMas) {
		this.importeVentasMas = importeVentasMas;
	}

	public static int getNumerodeVentas() {
		return numerodeVentas;
	}

	public static void setNumerodeVentas(int numerodeVentas) {
		Venta.numerodeVentas = numerodeVentas;
	}
	
	public double comision() {
		return this.importeVentasMas * Venta.comision / 100;
	}
}

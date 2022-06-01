package ej02;

public class LineaPedido {

	private String idProducto, descripcionProducto;
	private double precioBaseProducto;
	private int cantidadProducto;
	
	public LineaPedido(String idProducto, String descripcionProducto, double precioBaseProducto, int cantidadProducto) {
		this.idProducto = idProducto;
		this.descripcionProducto = descripcionProducto;
		this.precioBaseProducto = precioBaseProducto;
		this.cantidadProducto = cantidadProducto;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public double getPrecioBaseProducto() {
		return precioBaseProducto;
	}

	public void setPrecioBaseProducto(double precioBaseProducto) {
		this.precioBaseProducto = precioBaseProducto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
}

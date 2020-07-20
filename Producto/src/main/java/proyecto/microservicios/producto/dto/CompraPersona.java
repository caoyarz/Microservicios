package proyecto.microservicios.producto.dto;

public class CompraPersona {

	private String nombrePersona;
	private String rutPersona;
	private String nombreProducto;
	private Integer precioProducto;
	private String fechaCompra;
	
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getRutPersona() {
		return rutPersona;
	}
	public void setRutPersona(String rutPersona) {
		this.rutPersona = rutPersona;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Integer getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Integer precioProducto) {
		this.precioProducto = precioProducto;
	}
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public CompraPersona(String nombrePersona, String rutPersona, String nombreProducto, Integer precioProducto,
			String fechaCompra) {
		super();
		this.nombrePersona = nombrePersona;
		this.rutPersona = rutPersona;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.fechaCompra = fechaCompra;
	}
	@Override
	public String toString() {
		return "CompraPersona [nombrePersona=" + nombrePersona + ", rutPersona=" + rutPersona + ", nombreProducto="
				+ nombreProducto + ", precioProducto=" + precioProducto + ", fechaCompra=" + fechaCompra + "]";
	}
	
	public CompraPersona () {}
}

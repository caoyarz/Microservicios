package proyecto.microservicios.producto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="compra_producto")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CompraProducto {
	
	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "producto")
	Long id;
	
	@Column(name="fecha_compra")
	String fechaCompra;
	
	@Column(name="tipo_pago")
	String tipoPago;
	
	@Column(name="activo")
	Integer activo;
	
	@Column(name="persona_id")
	String personaId;
	
	@ManyToOne
	Producto producto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public String getPersonaId() {
		return personaId;
	}

	public void setPersonaId(String personaId) {
		this.personaId = personaId;
	}

	public Producto getProductoId() {
		return producto;
	}

	public void setProductoId(Producto productoId) {
		this.producto = productoId;
	}

	public CompraProducto(Long id, String fechaCompra, String tipoPago, Integer activo, String personaId,
			Producto producto) {
		super();
		this.id = id;
		this.fechaCompra = fechaCompra;
		this.tipoPago = tipoPago;
		this.activo = activo;
		this.personaId = personaId;
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "CompraProducto [id=" + id + ", fechaCompra=" + fechaCompra + ", tipoPago=" + tipoPago + ", activo="
				+ activo + ", personaId=" + personaId + ", productoId=" + producto + "]";
	}
	
	public CompraProducto() {}
}

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
@Table(name="producto")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Producto {
	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "producto")
	Long id;
	
	@Column(name="nombre_producto")
	String nombreProducto;
	
	@Column(name = "activo")
	Integer activo;
	
	@Column(name="precio_producto")
	Integer precioProducto;
	
	@ManyToOne
	TipoProducto tipoProducto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Integer getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Integer precioProducto) {
		this.precioProducto = precioProducto;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Producto(Long id, String nombreProducto,Integer activo, Integer precioProducto, TipoProducto tipoProducto) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.activo = activo;
		this.precioProducto = precioProducto;
		this.tipoProducto = tipoProducto;
	}

	
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombreProducto=" + nombreProducto + ", activo=" + activo + ", precioProducto="
				+ precioProducto + ", tipoProducto=" + tipoProducto + "]";
	}

	public Producto() {}
}

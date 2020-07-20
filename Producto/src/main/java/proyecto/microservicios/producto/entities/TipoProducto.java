package proyecto.microservicios.producto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="tipo_producto")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TipoProducto {
	
	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "producto")
	Long id;
	
	@Column(name = "nombre_tipo_producto")
	String nombreTipoProducto;
	
	@Column(name="activo")
	Integer activo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreTipoProducto() {
		return nombreTipoProducto;
	}

	public void setNombreTipoProducto(String nombreTipoProducto) {
		this.nombreTipoProducto = nombreTipoProducto;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public TipoProducto(Long id, String nombreTipoProducto, Integer activo) {
		super();
		this.id = id;
		this.nombreTipoProducto = nombreTipoProducto;
		this.activo = activo;
	}
	
	public TipoProducto(){}

	@Override
	public String toString() {
		return "TipoProducto [id=" + id + ", nombreTipoProducto=" + nombreTipoProducto + ", activo=" + activo + "]";
	}
	
}
 
	
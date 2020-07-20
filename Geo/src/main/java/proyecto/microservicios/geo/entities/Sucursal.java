package proyecto.microservicios.geo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="sucursal")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Sucursal {
	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "geo")
	Long id;
	
	@Column(name="nombre_sucursal")
	private String nombreSucursal;
	
	@Column(name="activo")
	private Integer activo;
	
	@OneToOne
	Direccion direccion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreSucursal() {
		return nombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Sucursal(Long id, String nombreSucursal, Integer activo, Direccion direccion) {
		super();
		this.id = id;
		this.nombreSucursal = nombreSucursal;
		this.activo = activo;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Sucursal [id=" + id + ", nombreSucursal=" + nombreSucursal + ", activo=" + activo + ", direccion="
				+ direccion + "]";
	}
	
	public Sucursal() {}
}

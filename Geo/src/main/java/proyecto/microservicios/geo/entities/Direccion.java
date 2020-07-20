package proyecto.microservicios.geo.entities;

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
@Table(name = "direccion")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Direccion {
	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "geo")
	Long id;
	
	@Column(name="nombre_direccion")
	private String nombreDireccion;
	
	@Column(name="activo")
	private Integer activo;
	
	@ManyToOne 
	Comuna comuna;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreDireccion() {
		return nombreDireccion;
	}

	public void setNombreDireccion(String nombreDireccion) {
		this.nombreDireccion = nombreDireccion;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}

	public Direccion(Long id, String nombreDireccion, Integer activo, Comuna comuna) {
		super();
		this.id = id;
		this.nombreDireccion = nombreDireccion;
		this.activo = activo;
		this.comuna = comuna;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", nombreDireccion=" + nombreDireccion + ", activo=" + activo + ", comuna="
				+ comuna + "]";
	}
	
	public Direccion () {}
}

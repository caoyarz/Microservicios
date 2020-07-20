package proyecto.microservicios.geo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="region")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Region {
	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "geo")
	Long id;
	
	@Column(name="nombre_region")
	private String nombreRegion;
	
	@Column(name="activo")
	private Integer activo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreRegion() {
		return nombreRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", nombreRegion=" + nombreRegion + ", activo=" + activo + "]";
	}

	public Region(Long id, String nombreRegion, Integer activo) {
		super();
		this.id = id;
		this.nombreRegion = nombreRegion;
		this.activo = activo;
	}

	public Region() {}
	
	
}

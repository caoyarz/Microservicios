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
@Table(name = "provincia")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Provincia {

	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "geo")
	Long id;
	
	@Column(name = "nombre_provincia")
	private String nombreProvincia;
	
	@Column(name = "activo")
	private Integer activo;
	
	@ManyToOne
	Region region;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Provincia(Long id, String nombreProvincia, Integer activo, Region region) {
		super();
		this.id = id;
		this.nombreProvincia = nombreProvincia;
		this.activo = activo;
		this.region = region;
	}

	@Override
	public String toString() {
		return "Provincia [id=" + id + ", nombreProvincia=" + nombreProvincia + ", activo=" + activo + ", region="
				+ region + "]";
	}
	
 public Provincia() {}
	
	
}

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
@Table(name = "comuna")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Comuna {

	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "geo")
	Long id;
	
	@Column(name="nombre_comuna")
	private String nombreComuna;
	
	@Column(name="activo")
	private Integer activo;
	
	@ManyToOne
	Provincia provincia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreComuna() {
		return nombreComuna;
	}

	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Comuna(Long id, String nombreComuna, Integer activo, Provincia provincia) {
		super();
		this.id = id;
		this.nombreComuna = nombreComuna;
		this.activo = activo;
		this.provincia = provincia;
	}
	
	public Comuna() {}

	@Override
	public String toString() {
		return "Comuna [id=" + id + ", nombreComuna=" + nombreComuna + ", activo=" + activo + ", provincia=" + provincia
				+ "]";
	}
	
	
}

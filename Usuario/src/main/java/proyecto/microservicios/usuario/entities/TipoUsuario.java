package proyecto.microservicios.usuario.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Table(name="tipo_usuario")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TipoUsuario {
	
	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "usuario")
	Long id;
	
	@Column(name = "nombre_tipo_usuario")
	String nombreTipoUsuario;
	
	@Column(name = "activo")
	Integer activo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreTipoUsuario() {
		return nombreTipoUsuario;
	}
	public void setNombreTipoUsuario(String nombreTipoUsuario) {
		this.nombreTipoUsuario = nombreTipoUsuario;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	
	public TipoUsuario(Long id, String nombreTipoUsuario, Integer activo) {
		super();
		this.id = id;
		this.nombreTipoUsuario = nombreTipoUsuario;
		this.activo = activo;
	}
	
	public TipoUsuario() {}
	@Override
	public String toString() {
		return "TipoUsuario [id=" + id + ", nombreTipoUsuario=" + nombreTipoUsuario + ", activo=" + activo + "]";
	}
		
}
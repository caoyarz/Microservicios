package proyecto.microservicios.usuario.entities;

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
@Table(name="usuario")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Usuario {

	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "usuario")
	Long id;
	
	@Column(name = "nombre_usuario")
	String nombreUsuario;
	
	@Column(name = "contrasena")
	String contrasenaUsuario;
	
	@Column(name = "email")
	String emailUsuario;
	
	@Column(name = "activo")
	Integer activoUsuario;
	
	@ManyToOne
	TipoUsuario tipoUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenaUsuario() {
		return contrasenaUsuario;
	}

	public void setContrasenaUsuario(String contrasenaUsuario) {
		this.contrasenaUsuario = contrasenaUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public Integer getActivoUsuario() {
		return activoUsuario;
	}

	public void setActivoUsuario(Integer activoUsuario) {
		this.activoUsuario = activoUsuario;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Usuario( String nombreUsuario, String contrasenaUsuario, String emailUsuario, Integer activoUsuario,
			TipoUsuario tipoUsuario) {
		super();
		
		this.nombreUsuario = nombreUsuario;
		this.contrasenaUsuario = contrasenaUsuario;
		this.emailUsuario = emailUsuario;
		this.activoUsuario = activoUsuario;
		this.tipoUsuario = tipoUsuario;
	}
	
	public Usuario() {}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", contrasenaUsuario=" + contrasenaUsuario
				+ ", emailUsuario=" + emailUsuario + ", activoUsuario=" + activoUsuario + ", tipoUsuario=" + tipoUsuario
				+ "]";
	}
	
	
}

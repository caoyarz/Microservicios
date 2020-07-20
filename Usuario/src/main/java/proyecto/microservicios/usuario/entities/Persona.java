package proyecto.microservicios.usuario.entities;

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
@Table(name="persona")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Persona {
	@Id
	@GeneratedValue(generator="my_sequence")
	@SequenceGenerator(name="my_sequence",sequenceName="my_sequence", allocationSize = 1, schema = "usuario")
    private Long id;

    @Column(name = "nombre_persona")
    private String nombrePersona;
    
    @Column(name = "rut")
    private String rut;
    
    @Column(name = "activo")
    private Integer activo;
    
    @Column(name = "direccion_id")
    private Long direccionId;
    
    @OneToOne
    private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Long getDireccionId() {
		return direccionId;
	}

	public void setDireccionId(Long direccionId) {
		this.direccionId = direccionId;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	public Persona(Long id, String nombrePersona, String rut, Integer activo, Long direccionId, Usuario usuario) {
		super();
		this.id = id;
		this.nombrePersona = nombrePersona;
		this.rut = rut;
		this.activo = activo;
		this.direccionId = direccionId;
		this.usuario = usuario;
	}
	
	public Persona() {}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombrePersona=" + nombrePersona + ", rut=" + rut + ", activo=" + activo
				+ ", direccionId=" + direccionId + ", usuario=" + usuario + "]";
	}


}

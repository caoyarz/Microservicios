package proyecto.microservicios.usuario.dto;

public class PersonaDTO {
	private Long id;
    private String nombrePersona;
    private String rut;
    private Long direccionId;
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
	public Long getDireccionId() {
		return direccionId;
	}
	public void setDireccionId(Long direccionId) {
		this.direccionId = direccionId;
	}
	@Override
	public String toString() {
		return "PersonaDTO [id=" + id + ", nombrePersona=" + nombrePersona + ", rut=" + rut + ", direccionId="
				+ direccionId + "]";
	}
	public PersonaDTO(Long id, String nombrePersona, String rut, Long direccionId) {
		super();
		this.id = id;
		this.nombrePersona = nombrePersona;
		this.rut = rut;
		this.direccionId = direccionId;
	}
	
	public PersonaDTO(Long id, String nombrePersona) {
		super();
		this.id = id;
		this.nombrePersona = nombrePersona;
	}


}

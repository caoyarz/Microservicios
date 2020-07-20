package proyecto.microservicios.usuario.dto;

public class PersonaGeo {

	private String nombrePersona;
	private String rut; 
	private String nombreDireccion;
	private String nombreComuna;
	private String nombreProvincia;
	private String nombreRegion;
	
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

	public String getNombreComuna() {
		return nombreComuna;
	}
	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}
	public String getNombreProvincia() {
		return nombreProvincia;
	}
	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}
	public String getNombreDireccion() {
		return nombreDireccion;
	}
	public void setNombreDireccion(String nombreDireccion) {
		this.nombreDireccion = nombreDireccion;
	}
	public String getNombreRegion() {
		return nombreRegion;
	}
	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}
	

	public PersonaGeo(String nombrePersona, String rut, String nombreDireccion, String nombreComuna,
			String nombreProvincia, String nombreRegion) {
		super();
		this.nombrePersona = nombrePersona;
		this.rut = rut;
		this.nombreDireccion = nombreDireccion;
		this.nombreComuna = nombreComuna;
		this.nombreProvincia = nombreProvincia;
		this.nombreRegion = nombreRegion;
	}
	@Override
	public String toString() {
		return "PersonaGeo [nombrePersona=" + nombrePersona + ", rut=" + rut + ", nombreDireccion=" + nombreDireccion
				+ ", nombreComuna=" + nombreComuna + ", nombreProvincia=" + nombreProvincia + ", nombreRegion="
				+ nombreRegion + "]";
	}
	public PersonaGeo() {}
}

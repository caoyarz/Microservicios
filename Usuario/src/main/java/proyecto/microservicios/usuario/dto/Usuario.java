package proyecto.microservicios.usuario.dto;

public class Usuario {

	private String nombrePersona;
	private String rutPersona;
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getRutPersona() {
		return rutPersona;
	}
	public void setRutPersona(String rutPersona) {
		this.rutPersona = rutPersona;
	}
	public Usuario(String nombrePersona, String rutPersona) {
		super();
		this.nombrePersona = nombrePersona;
		this.rutPersona = rutPersona;
	}
	@Override
	public String toString() {
		return "Usuario [nombrePersona=" + nombrePersona + ", rutPersona=" + rutPersona + "]";
	}
	
	public Usuario() {}
}

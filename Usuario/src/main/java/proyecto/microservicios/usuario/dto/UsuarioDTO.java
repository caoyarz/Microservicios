package proyecto.microservicios.usuario.dto;

public class UsuarioDTO {

	private String nombrePersona;
	private String nombreUsuario;
	private String nombbreTipoUsuario;
	
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getNombbreTipoUsuario() {
		return nombbreTipoUsuario;
	}
	public void setNombbreTipoUsuario(String nombbreTipoUsuario) {
		this.nombbreTipoUsuario = nombbreTipoUsuario;
	}
	public UsuarioDTO(String nombrePersona, String nombreUsuario, String nombbreTipoUsuario) {
		super();
		this.nombrePersona = nombrePersona;
		this.nombreUsuario = nombreUsuario;
		this.nombbreTipoUsuario = nombbreTipoUsuario;
	}
	@Override
	public String toString() {
		return "UsuarioDTO [nombrePersona=" + nombrePersona + ", nombreUsuario=" + nombreUsuario
				+ ", nombbreTipoUsuario=" + nombbreTipoUsuario + "]";
	}
	
	
}

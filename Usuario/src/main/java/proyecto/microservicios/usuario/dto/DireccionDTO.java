package proyecto.microservicios.usuario.dto;

public class DireccionDTO {
	private String nombreDireccion;
	private Long comunaId;
	
	public String getNombreDireccion() {
		return nombreDireccion;
	}
	public void setNombreDireccion(String nombreDireccion) {
		this.nombreDireccion = nombreDireccion;
	}
	public Long getComunaId() {
		return comunaId;
	}
	public void setComunaId(Long comunaId) {
		this.comunaId = comunaId;
	}
	public DireccionDTO(String nombreDireccion, Long comunaId) {
		super();
		this.nombreDireccion = nombreDireccion;
		this.comunaId = comunaId;
	}
	@Override
	public String toString() {
		return "DireccionDTO [nombreDireccion=" + nombreDireccion + ", comunaId=" + comunaId + "]";
	}
public DireccionDTO() {}
}

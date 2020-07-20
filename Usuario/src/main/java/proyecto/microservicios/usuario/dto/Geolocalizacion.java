package proyecto.microservicios.usuario.dto;
import java.io.Serializable;
public class Geolocalizacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nombreDireccion;
	private String nombreComuna;
	private String nombreProvincia;
	private String nombreRegion;
	
	public String getNombreDireccion() {
		return nombreDireccion;
	}
	public void setNombreDireccion(String nombreDireccion) {
		this.nombreDireccion = nombreDireccion;
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
	public String getNombreRegion() {
		return nombreRegion;
	}
	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}
	
	
	public Geolocalizacion(String nombreDireccion, String nombreComuna, String nombreProvincia, String nombreRegion) {
		super();
		this.nombreDireccion = nombreDireccion;
		this.nombreComuna = nombreComuna;
		this.nombreProvincia = nombreProvincia;
		this.nombreRegion = nombreRegion;
	}
	public Geolocalizacion() {
		
	}
	@Override
	public String toString() {
		return "Geolocalizacion [nombreDireccion=" + nombreDireccion + ", nombreComuna=" + nombreComuna
				+ ", nombreProvincia=" + nombreProvincia + ", nombreRegion=" + nombreRegion + "]";
	}
	
	
}

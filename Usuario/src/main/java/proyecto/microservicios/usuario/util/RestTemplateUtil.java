package proyecto.microservicios.usuario.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import proyecto.microservicios.usuario.dto.Geolocalizacion;


@Service
public class RestTemplateUtil {
 
	private RestTemplate restTemplate;
	
	
	private RestTemplateUtil() {
		restTemplate = new RestTemplate();
	}
	
	public ResponseEntity<Geolocalizacion> getGeo(final String endPoint)
    {
		Geolocalizacion personaGeo;
		ResponseEntity<Geolocalizacion> rs;
         
		try {
			personaGeo = restTemplate.getForObject(endPoint, Geolocalizacion.class);
			rs = new ResponseEntity<>(personaGeo, HttpStatus.OK);
		} catch (Exception e) {
			rs = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
   
        return rs;
    }
	



}

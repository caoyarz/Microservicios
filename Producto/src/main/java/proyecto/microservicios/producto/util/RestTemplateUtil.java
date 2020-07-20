package proyecto.microservicios.producto.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import proyecto.microservicios.producto.dto.Usuario;

@Service
public class RestTemplateUtil {
 
	private RestTemplate restTemplate;
	
	
	private RestTemplateUtil() {
		restTemplate = new RestTemplate();
	}
	
	public ResponseEntity<Usuario> getUsuario(final String endPoint)
    {
		Usuario personaU;
		ResponseEntity<Usuario> rs;
         
		try {
			personaU = restTemplate.getForObject(endPoint, Usuario.class);
			rs = new ResponseEntity<>(personaU, HttpStatus.OK);
		} catch (Exception e) {
			rs = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
   
        return rs;
    }
	

}

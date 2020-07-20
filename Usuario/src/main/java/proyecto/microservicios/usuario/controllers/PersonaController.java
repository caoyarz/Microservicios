package proyecto.microservicios.usuario.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.microservicios.usuario.dto.Usuario;
import proyecto.microservicios.usuario.dto.PersonaDTO;
import proyecto.microservicios.usuario.dto.PersonaGeo;
import proyecto.microservicios.usuario.dto.UsuarioDTO;
import proyecto.microservicios.usuario.entities.Persona;
import proyecto.microservicios.usuario.services.PersonaService;

@RestController
@RequestMapping("/api")
public class PersonaController {

	@Autowired
	private PersonaService personaServicio;
	
	@GetMapping(value="listar-personas")
	public List<Persona> listarPersonas(){
		return this.personaServicio.listarPersonas();
	}
	
	@GetMapping(value="usuarios-admin-activos")
	public List<UsuarioDTO> traerUsuarioAdminActivo(){
		return this.personaServicio.listarUsuariosActivos();
	}
	
	@GetMapping(value = "/persona-geo", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<PersonaGeo> obtenerPersonaGeo() {
		return this.personaServicio.obtenerPersonasGeo();
	}

	
	@GetMapping(value = "/leer-personas", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Object leerPersonas() {
		return this.personaServicio.leerPersonas();
	}
	

	@GetMapping(value = "/persona-por-id/{personaId}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Persona personaPorId(@PathVariable Long personaId) {
		return this.personaServicio.personaPorId(personaId);
	}	
	
	
	@GetMapping(value = "/persona-flutter/{personaId}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Object personaFlutter(@PathVariable Long personaId) {
		return this.personaServicio.personaFlutter(personaId);
	}
	
	@GetMapping(value = "/lista-persona-custom", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<PersonaDTO> listarPersonasCustom() {
		return this.personaServicio.listarPersonasCustom();
	}
	
	@CrossOrigin
	@PostMapping(value = "/crear-persona", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Object crearPersona(@RequestBody Persona persona) {
		return this.personaServicio.crearPersona(persona);
	}
	
	
	@GetMapping(value="/compra-persona/{personaId}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public Usuario obtenerPersonasCompras(@PathVariable Long personaId){
		return this.personaServicio.obtenerPersona(personaId);
	}
	/*
	
	@PostMapping(value = "crear-direccion-persona", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Object crearDireccionPersona(@RequestBody DireccionDTO direccionDto, HttpServletRequest request) {
		return this.personaServicio.crearDireccionPersona(direccionDto, request);
	}
	
*/
}

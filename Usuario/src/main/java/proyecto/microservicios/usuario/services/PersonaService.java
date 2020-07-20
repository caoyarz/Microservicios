package proyecto.microservicios.usuario.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import proyecto.microservicios.usuario.dto.Geolocalizacion;
import proyecto.microservicios.usuario.dto.PersonaDTO;
import proyecto.microservicios.usuario.dto.PersonaGeo;

import proyecto.microservicios.usuario.dto.UsuarioDTO;
import proyecto.microservicios.usuario.entities.Persona;
import proyecto.microservicios.usuario.entities.Usuario;
import proyecto.microservicios.usuario.repositories.PersonaRepositorio;
import proyecto.microservicios.usuario.repositories.UsuarioRepositorio;
import proyecto.microservicios.usuario.util.EndPoints;
import proyecto.microservicios.usuario.util.RestTemplateUtil;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepositorio personaRepo;
	@Autowired
	private UsuarioRepositorio usuarioRepo;
	@Autowired
	private RestTemplateUtil restTemplate;
	
	public List<Persona> listarPersonas(){
		return this.personaRepo.findAll();
	}
	
	public List<UsuarioDTO> listarUsuariosActivos(){
		return this.personaRepo.traerUsuarioActivoAdmin();
	}
	public Object personaFlutter(Long personaId) {
		return this.personaRepo.findPersonaById(personaId);
	}
	public List<PersonaDTO> listarPersonasCustom(){
		return this.personaRepo.listaPersonasCustomizada();
	}

	
	public List<PersonaGeo> obtenerPersonasGeo() {
		//Lista de todas las personas
		List<Persona> listaPersona = this.personaRepo.findAll();
		//Lista para guardar la respuesta personalizada
		List<PersonaGeo> listarPersonaGeo = new LinkedList<PersonaGeo>();
		for(Persona index: listaPersona) {
			//nuevo objeto respuestas
			PersonaGeo personaGeo = new PersonaGeo();
			personaGeo.setNombrePersona(index.getNombrePersona());
			personaGeo.setRut(index.getRut());			
			
			/*Llamada al microservicio de geolocalizacion*/
			
			Geolocalizacion geoIndex = restTemplate.getGeo(EndPoints.DIRECCION_PERSONA + 
														   index.getDireccionId()).getBody();
		
			personaGeo.setNombreRegion(geoIndex.getNombreRegion());
			personaGeo.setNombreDireccion(geoIndex.getNombreDireccion());
			personaGeo.setNombreComuna(geoIndex.getNombreComuna());
			personaGeo.setNombreProvincia(geoIndex.getNombreProvincia());
		
			//Se agrega objeto repuesta a la lista de respuesta personalizada
			listarPersonaGeo.add(personaGeo);		
		}
		return listarPersonaGeo;
	}
	


	/*
	public Object crearDireccionPersona(DireccionDTO direccionDto, HttpServletRequest request) {
		return this.restTemplate.callResource(EndPoints.CREAR_DIRECCION_PERSONA, HttpMethod.POST, direccionDto, request);
	}
	*/
	
	public Object leerPersonas() {
		return this.personaRepo.findAll();
	}
	
	
	
	public Persona personaPorId(Long personaId) {
		Optional<Persona> optPersona = this.personaRepo.findById(personaId);
		Persona r = (optPersona.isPresent())?optPersona.get():null;
		return r;
	}
	
	public Object crearPersona(Persona persona) {
		Usuario usuario = new Usuario(persona.getUsuario().getNombreUsuario(), 
									  persona.getUsuario().getContrasenaUsuario(), 
									  persona.getUsuario().getEmailUsuario(), 1, 
									  persona.getUsuario().getTipoUsuario());
		//TipoUsuario tipoUsuario = new TipoUsuario();
		this.usuarioRepo.save(usuario);
		persona.setDireccionId(Long.valueOf("1"));
		persona.setActivo(1);
		persona.setUsuario(usuario);
		return this.personaRepo.save(persona);
	}

	public proyecto.microservicios.usuario.dto.Usuario obtenerPersona(Long personaId) {
		return this.personaRepo.obtenerUser(personaId);
	}

}

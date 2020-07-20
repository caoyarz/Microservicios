package proyecto.microservicios.usuario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import  proyecto.microservicios.usuario.entities.TipoUsuario;
import  proyecto.microservicios.usuario.services.TipoUsuarioService;

@RestController
@RequestMapping("/api")
public class TipoUsuarioController {

	@Autowired
	private TipoUsuarioService tipoUsuarioService;
	
	@GetMapping(value="leer-tipo-usuarios")
	public List<TipoUsuario> devolverListaTipoUsuario(){
		return this.tipoUsuarioService.traerDatos();
	}
	

}

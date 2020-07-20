package proyecto.microservicios.usuario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.microservicios.usuario.entities.Usuario;
import proyecto.microservicios.usuario.services.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value="listar-usuarios")
	public List<Usuario> listarTodosLosUsuarios(){
		return this.usuarioService.listarUsuario();
	}
}

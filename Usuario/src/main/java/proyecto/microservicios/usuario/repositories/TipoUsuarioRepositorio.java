package proyecto.microservicios.usuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.microservicios.usuario.entities.TipoUsuario;

@Repository
public interface TipoUsuarioRepositorio extends JpaRepository<TipoUsuario, Long> {

}

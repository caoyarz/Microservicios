package proyecto.microservicios.geo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.microservicios.geo.entities.Comuna;

@Repository
public interface ComunaRepositorio extends JpaRepository<Comuna, Long>{

}

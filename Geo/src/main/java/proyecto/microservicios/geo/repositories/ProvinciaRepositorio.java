package proyecto.microservicios.geo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.microservicios.geo.entities.Provincia;

@Repository
public interface ProvinciaRepositorio extends JpaRepository<Provincia, Long>{

}

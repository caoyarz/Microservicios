package proyecto.microservicios.geo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.microservicios.geo.entities.Region;

@Repository
public interface RegionRepositorio extends JpaRepository<Region,Long>{

}

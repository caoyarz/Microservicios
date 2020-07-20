package proyecto.microservicios.producto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.microservicios.producto.entities.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

}

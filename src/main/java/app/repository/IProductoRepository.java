package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import app.entity.Producto;
import app.service.dto.ProductoProjection;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long>{
	@Query("SELECT p.id as id, p.nombre as nombre, p.precio as precio FROM Producto p WHERE p.nombre LIKE %:nombre%")
	List<ProductoProjection> findByNombreContaining(@Param("nombre") String nombre);
}

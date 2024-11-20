package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long>{

}

package app.service;

import java.util.List;

import app.service.dto.FullProductoDTO;
import app.service.dto.ProductoDTO;
import app.service.dto.ProductoProjection;

public interface IProductoService {
	FullProductoDTO guardarProducto(ProductoDTO productoDTO);
	List<ProductoProjection> buscarPorNombre(String nombre);
}

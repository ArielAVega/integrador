package app.service;

import app.service.dto.FullProductoDTO;
import app.service.dto.ProductoDTO;

public interface IProductoService {
	FullProductoDTO guardarProducto(ProductoDTO productoDTO);
}

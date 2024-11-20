package app.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;
import app.repository.IProductoRepository;
import app.service.IProductoService;
import app.service.dto.FullProductoDTO;
import app.service.dto.ProductoDTO;
import app.service.dto.ProductoProjection;
import app.service.dto.mappert.ProductoMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductoServiceImp implements IProductoService{
	private IProductoRepository productoRepository;
	private ProductoMapper productoMapper;

	@Override
	public FullProductoDTO guardarProducto(ProductoDTO productoDTO) {
		return productoMapper.toFullProductoDTO(productoRepository.
				save(productoMapper.toProducto(productoDTO)));
	}

	@Override
	public List<ProductoProjection> buscarPorNombre(String nombre) {
		return productoRepository.findByNombreContaining(nombre);
	}

}

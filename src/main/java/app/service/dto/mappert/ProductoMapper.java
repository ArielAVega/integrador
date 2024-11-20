package app.service.dto.mappert;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import app.entity.Producto;
import app.service.dto.FullProductoDTO;
import app.service.dto.ProductoDTO;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
	@Mapping(target = "id", ignore = true)
	Producto toProducto(ProductoDTO productoDTO);
	FullProductoDTO toFullProductoDTO(Producto producto);

}

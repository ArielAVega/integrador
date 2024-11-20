package app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.service.IProductoService;
import app.service.dto.FullProductoDTO;
import app.service.dto.ProductoDTO;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/productos")
@AllArgsConstructor
public class ProductoController {
	private IProductoService productoService;
	
	@PostMapping("/guardar")
	public ResponseEntity<FullProductoDTO> guardarProducto(@RequestBody  ProductoDTO productoDTO){
		FullProductoDTO productoGuardado = productoService.guardarProducto(productoDTO);
		return new ResponseEntity<FullProductoDTO>(productoGuardado,HttpStatus.CREATED);
	}
	
}

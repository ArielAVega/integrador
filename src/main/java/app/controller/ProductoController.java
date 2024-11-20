package app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.service.IProductoService;
import app.service.dto.FullProductoDTO;
import app.service.dto.ProductoDTO;
import app.service.dto.ProductoProjection;
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
	
	@GetMapping("/buscar/{nombre}")
	public ResponseEntity<List<ProductoProjection>> obtenerEstudiantes(@PathVariable String nombre){
		return ResponseEntity.ok(productoService.buscarPorNombre(nombre));
	}
	
	
}

package app.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductoDTO {
	private String nombre;
	private Double precio;
}

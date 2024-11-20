package app.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FullProductoDTO {
	private Long id;
	private String nombre;
	private Double precio;
}

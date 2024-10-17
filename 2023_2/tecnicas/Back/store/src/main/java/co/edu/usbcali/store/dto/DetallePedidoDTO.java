package co.edu.usbcali.store.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetallePedidoDTO {
    private Integer id ;
    private Integer pedidoId;
    private Integer productoId;
    private BigDecimal cantidad;
    private BigDecimal valor;
}

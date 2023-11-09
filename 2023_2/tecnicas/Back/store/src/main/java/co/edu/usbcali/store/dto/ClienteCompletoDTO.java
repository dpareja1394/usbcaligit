package co.edu.usbcali.store.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteCompletoDTO {
    private Integer id;
    private String nombres;
    private String apellidos;
    private String documento;
    private String estado;
    private Integer tipoDocumentoId;
    private List<PedidoDTO> pedidos;
}

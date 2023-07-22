package co.edu.usbcali.tiendaapp.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VerClientesActivosResponse {
    private String nombres;
    private String apellidos;
    private String documento;
    private Integer tipoDocumentoId;
    private String tipoDocumentoDescripcion;
}

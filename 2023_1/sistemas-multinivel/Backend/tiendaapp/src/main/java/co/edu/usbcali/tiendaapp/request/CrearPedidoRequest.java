package co.edu.usbcali.tiendaapp.request;

import co.edu.usbcali.tiendaapp.util.messages.PedidoServiceMessages;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CrearPedidoRequest {

    @NotBlank(message = PedidoServiceMessages.IDENTIFICACION_REQUERIDA)
    private String identificacion;

    @NotNull(message = PedidoServiceMessages.TIPO_DOCUMENTO_ID_REQUERIDO)
    private Integer tipoDocumentoId;

}

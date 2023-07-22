package co.edu.usbcali.tiendaapp.request;

import co.edu.usbcali.tiendaapp.util.messages.CategoriaServiceMessages;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CrearCategoriaRequest {

    @NotBlank(message = CategoriaServiceMessages.NOMBRE_REQUERIDO)
    private String nombre;

    @NotBlank(message = CategoriaServiceMessages.DESCRIPCION_REQUERIDA)
    private String descripcion;

}

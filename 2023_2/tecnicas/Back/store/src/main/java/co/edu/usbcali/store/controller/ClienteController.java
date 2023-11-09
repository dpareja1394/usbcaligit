package co.edu.usbcali.store.controller;

import co.edu.usbcali.store.dto.CategoriaDTO;
import co.edu.usbcali.store.dto.ClienteCompletoDTO;
import co.edu.usbcali.store.dto.ProductoDTO;
import co.edu.usbcali.store.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/buscarDatosClienteYPedidos/{clienteId}")
    public ResponseEntity<ClienteCompletoDTO> buscarDatosClienteYPedidos(Integer clienteId) {
        try {
            return new ResponseEntity<>(clienteService.buscarDatosClienteYPedidos(clienteId)
                    , HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

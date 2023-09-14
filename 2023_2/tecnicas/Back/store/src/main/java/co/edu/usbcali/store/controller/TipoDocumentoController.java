package co.edu.usbcali.store.controller;


import co.edu.usbcali.store.domain.TipoDocumento;
import co.edu.usbcali.store.repository.TipoDocumentoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipoDocumento")
public class TipoDocumentoController {

    private final TipoDocumentoRepository tipoDocumentoRepository;

    public TipoDocumentoController(TipoDocumentoRepository tipoDocumentoRepository) {
        this.tipoDocumentoRepository = tipoDocumentoRepository;
    }

    @GetMapping("/validar")
    public String validarController() {
        return "Controlador correcto";
    }

    @GetMapping("/obtenerTodos")
    public List<TipoDocumento> obtenerTodos() {
        List<TipoDocumento> tiposDocumentos = tipoDocumentoRepository.findAll();
        return tiposDocumentos;
    }

    @GetMapping("/porId/{id}")
    public String buscarPorId(@PathVariable Integer id) throws Exception {
        return tipoDocumentoRepository.getReferenceById(id).toString();
    }
}

package co.edu.usbcali.store.controller;

import co.edu.usbcali.store.domain.Categoria;
import co.edu.usbcali.store.dto.CategoriaDTO;
import co.edu.usbcali.store.repository.CategoriaRepository;
import co.edu.usbcali.store.service.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/obtenerTodas")
    public List<CategoriaDTO> obtenerTodas(){
        try {
            return categoriaService.obtenerTodas();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<CategoriaDTO> guardarCategoria(@RequestBody CategoriaDTO categoriaDTO) throws Exception {

        CategoriaDTO categoriaDTO1 = categoriaService.guardarNuevaCategoria(categoriaDTO);

        return new ResponseEntity<>(categoriaDTO1, HttpStatus.OK);
    }

}

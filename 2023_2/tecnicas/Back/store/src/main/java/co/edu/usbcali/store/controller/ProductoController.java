package co.edu.usbcali.store.controller;

import co.edu.usbcali.store.dto.ProductoDTO;
import co.edu.usbcali.store.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/buscarTodos")
    public ResponseEntity<List<ProductoDTO>> buscarTodos() {
        return new ResponseEntity<>(productoService.buscarTodos(), HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<ProductoDTO> guardarProducto(@RequestBody ProductoDTO productoDTO) throws Exception {
        ProductoDTO productoDTO1 = productoService.guardarNuevoProducto(productoDTO);
        return new ResponseEntity<>(productoDTO1, HttpStatus.OK);
    }

    @GetMapping("/buscarProductosPorCategoria/{categoriaId}")
    public ResponseEntity<List<ProductoDTO>> buscarProductosPorCategoria(Integer categoriaId) {
        try {
            return new ResponseEntity<>(productoService.buscarProductosPorCategoria(categoriaId)
                    , HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

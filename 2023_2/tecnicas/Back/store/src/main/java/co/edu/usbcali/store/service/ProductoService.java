package co.edu.usbcali.store.service;

import co.edu.usbcali.store.dto.ProductoDTO;

import java.util.List;

public interface ProductoService {
    ProductoDTO guardarNuevoProducto(ProductoDTO productoDTO) throws Exception;
    List<ProductoDTO> buscarTodos();

    List<ProductoDTO> buscarProductosPorCategoria(Integer categoriaId) throws Exception;
}

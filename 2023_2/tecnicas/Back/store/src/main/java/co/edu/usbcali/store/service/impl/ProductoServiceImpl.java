package co.edu.usbcali.store.service.impl;

import co.edu.usbcali.store.domain.Categoria;
import co.edu.usbcali.store.domain.Producto;
import co.edu.usbcali.store.dto.ProductoDTO;
import co.edu.usbcali.store.mapper.ProductoMapper;
import co.edu.usbcali.store.repository.CategoriaRepository;
import co.edu.usbcali.store.repository.ProductoRepository;
import co.edu.usbcali.store.service.ProductoService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository, CategoriaRepository categoriaRepository) {
        this.productoRepository = productoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public ProductoDTO guardarNuevoProducto(ProductoDTO productoDTO) throws Exception {
        // 1. Validar que el ProductoDTO no sea nulo
        if(productoDTO == null) {
            throw new Exception("El ProductoDTO viene nulo");
        }

        if(productoDTO.getCategoriaId() == null || productoDTO.getCategoriaId() == 0) {
            throw new Exception("El valor de la categoría no es apto");
        }

        if(productoDTO.getReferencia() == null || productoDTO.getReferencia().isBlank()) {
            throw new Exception("Debe ingresar un valor para la referencia");
        }

        if(productoDTO.getNombre() == null || productoDTO.getNombre().isBlank()) {
            throw new Exception("Debe ingresar un valor para el nombre");
        }

        if(productoDTO.getDescripcion() == null || productoDTO.getDescripcion().isBlank()) {
            throw new Exception("Debe ingresar un valor para la descripción");
        }

        if(productoDTO.getPrecioUnitario() == null || productoDTO.getPrecioUnitario().equals(BigDecimal.ZERO)) {
            throw new Exception("Debe ingresar un precio unitario para el producto");
        }

        if (productoDTO.getUnidadesDisponibles() == null) {
            throw new Exception("Debe poner un valor para las unidades disponibles");
        }

        // Validar que no exista un producto con la misma referencia
        Optional<Producto> productoOptional = productoRepository.findByReferencia(productoDTO.getReferencia());
        if(productoOptional.isPresent()) {
            throw new Exception(String.format("Ya existe un producto con la Referencia: %s", productoDTO.getReferencia()));
        }

        // Validar si existe la categoria
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(productoDTO.getCategoriaId());
        if(categoriaOptional.isEmpty()) {
            throw new Exception(String.format("No se puede registrar el producto puesto que no existe una categoría con id: %d"
                    , productoDTO.getCategoriaId()));
        }

        Producto producto = ProductoMapper.dtoToDomain(productoDTO);
        producto.setCategoria(categoriaOptional.get());

        producto = productoRepository.save(producto);

        return ProductoMapper.domainToDto(producto);
    }

    @Override
    public List<ProductoDTO> buscarTodos() {
        return ProductoMapper.domainToDtoList(productoRepository.findAll());
    }
}

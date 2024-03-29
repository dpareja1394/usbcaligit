package co.edu.usbcali.tiendaapp.service.impl;

import co.edu.usbcali.tiendaapp.domain.Categoria;
import co.edu.usbcali.tiendaapp.domain.Producto;
import co.edu.usbcali.tiendaapp.mapper.ProductoMapper;
import co.edu.usbcali.tiendaapp.repository.ProductoRepository;
import co.edu.usbcali.tiendaapp.request.CrearProductoRequest;
import co.edu.usbcali.tiendaapp.response.CrearProductoResponse;
import co.edu.usbcali.tiendaapp.service.CategoriaService;
import co.edu.usbcali.tiendaapp.service.ProductoService;
import co.edu.usbcali.tiendaapp.util.messages.ProductoServiceMessages;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    private final CategoriaService categoriaService;

    public ProductoServiceImpl(ProductoRepository productoRepository, CategoriaService categoriaService) {
        this.productoRepository = productoRepository;
        this.categoriaService = categoriaService;
    }


    @Override
    public CrearProductoResponse guardarNuevo(CrearProductoRequest crearProductoRequest) throws Exception {
        // Ya se hizo validación de campos
        // Buscar la Categoría en Base de Datos
        Categoria categoria = categoriaService.buscarCategoriaPorId(crearProductoRequest.getCategoriaId());

        // Validar si ya existe la referencia en la Categoría
        boolean existeReferenciaEnCategoria = productoRepository
                .existsByCategoriaIdAndReferencia(crearProductoRequest.getCategoriaId(), crearProductoRequest.getReferencia());
        if (existeReferenciaEnCategoria) throw new Exception(
                String.format(ProductoServiceMessages.EXISTE_REFERENCIA_EN_CATEGORIA,
                        crearProductoRequest.getReferencia(), (categoria.getId()+" - "+categoria.getNombre()))
        );

        // Mapear del request al Producto
        Producto producto = ProductoMapper.crearRequestToDomain(crearProductoRequest);

        // Inyectar la categoría buscada al Objeto del dominio Producto
        producto.setCategoria(categoria);

        // 1. Guarda el nuevo producto
        // 2. Mapea el producto al Response
        return ProductoMapper.crearDomainToResponse(productoRepository.save(producto));
    }


}

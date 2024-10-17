package co.edu.usbcali.store.service;

import co.edu.usbcali.store.dto.TipoDocumentoDTO;

import java.util.List;

public interface TipoDocumentoService {

    List<TipoDocumentoDTO> buscarTodos();

    TipoDocumentoDTO buscarPorId(Integer id) throws Exception;

}

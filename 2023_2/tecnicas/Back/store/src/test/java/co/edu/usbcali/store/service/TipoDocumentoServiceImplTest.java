package co.edu.usbcali.store.service;

import co.edu.usbcali.store.dto.TipoDocumentoDTO;
import co.edu.usbcali.store.mocks.TipoDocumentoMockTest;
import co.edu.usbcali.store.repository.TipoDocumentoRepository;
import co.edu.usbcali.store.service.impl.TipoDocumentoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@SpringBootTest
public class TipoDocumentoServiceImplTest {

    @Mock
    private TipoDocumentoRepository tipoDocumentoRepository;

    @InjectMocks
    private TipoDocumentoServiceImpl tipoDocumentoService;

    @Test
    void pruebaCorrecta() {
        assertEquals(1, 1);
    }

    @Test
    void buscarTodos() {

        // MOck de la respuesta desde DB
        given(tipoDocumentoRepository.findAll())
                .willReturn(TipoDocumentoMockTest.TIPOS_DOCUMENTOS_LIST);

        // Llamado al servivcio para validar
        List<TipoDocumentoDTO> tiposDocumentosEsperados
                = tipoDocumentoService.buscarTodos();

        // Verificación del resultado;
        assertEquals(2, tiposDocumentosEsperados.size());

        assertEquals(TipoDocumentoMockTest.CEDULA, tiposDocumentosEsperados.get(0).getDescripcion());


    }

}

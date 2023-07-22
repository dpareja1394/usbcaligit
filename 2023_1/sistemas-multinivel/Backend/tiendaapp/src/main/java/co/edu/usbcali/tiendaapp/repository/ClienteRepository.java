package co.edu.usbcali.tiendaapp.repository;

import co.edu.usbcali.tiendaapp.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    boolean existsByTipoDocumentoIdAndDocumento(Integer tipoDocumentoId, String documento);
    Optional<Cliente> findByTipoDocumentoIdAndDocumento(Integer tipoDocumentoId, String documento);

    List<Cliente> findByEstado(String estado);
}

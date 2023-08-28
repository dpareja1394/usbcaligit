package co.edu.usbcali.store.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detallespedido")
public class DetallePedido {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 19, precision = 2, nullable = false)
    private BigDecimal cantidad;

    @Column(length = 19, precision = 2, nullable = false)
    private BigDecimal valor;

}
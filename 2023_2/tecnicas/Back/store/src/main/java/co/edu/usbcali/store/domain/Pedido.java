package co.edu.usbcali.store.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Entity
@Table(name = "pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "clie_id", referencedColumnName = "id", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "espe_id", referencedColumnName = "id", nullable = false)
    private EstadoPedido estadoPedido;
	
	@Column(nullable=false)
	private Instant fecha;
	
	@Column(nullable=false)
	private BigDecimal total;
}

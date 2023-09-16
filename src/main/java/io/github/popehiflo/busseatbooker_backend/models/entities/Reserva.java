package io.github.popehiflo.busseatbooker_backend.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reserva")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "programa_id")
    private Programa programa;
    private Long fechaHoraReserva;
    private String fechaSalida;
    private Integer totalAsientosReservados;
    private String numeroAsiento;
    private String estadoReserva;
    private Double precioTotal;
}

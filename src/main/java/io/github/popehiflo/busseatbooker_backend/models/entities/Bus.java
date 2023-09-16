package io.github.popehiflo.busseatbooker_backend.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bus")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "tipo_bus_id")
    private TipoBus tipoBus;
    private int totalAsientos;
    @Column(unique = true)
    private String placa;
}

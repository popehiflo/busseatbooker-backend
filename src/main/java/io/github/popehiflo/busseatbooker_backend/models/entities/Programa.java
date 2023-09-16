package io.github.popehiflo.busseatbooker_backend.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "programa")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Programa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;
    @OneToOne
    @JoinColumn(name = "ruta_id")
    private Ruta ruta;
    private String horaDeSalida;
    private Double precioBoleto;
    private Double descuento;
    private Double cuotaDeProcesamiento;
}

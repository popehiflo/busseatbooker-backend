package io.github.popehiflo.busseatbooker_backend.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ruta")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ruta;
    @ManyToOne
    @JoinColumn(name = "ciudad_origen_id")
    private Ciudad ciudadOrigen;
    @ManyToOne
    @JoinColumn(name = "ciudad_destino_id")
    private Ciudad ciudadDestino;
    private Double distanciaEnKm;
}

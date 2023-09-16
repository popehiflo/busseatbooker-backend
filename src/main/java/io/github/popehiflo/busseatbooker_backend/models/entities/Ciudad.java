package io.github.popehiflo.busseatbooker_backend.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ciudad")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ciudad;
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;
}

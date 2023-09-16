package io.github.popehiflo.busseatbooker_backend.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String dni;
    private String nombre;
    private String apellido;
    @Column(unique = true)
    private String celular;
    @Column(unique = true)
    private String correo;

}

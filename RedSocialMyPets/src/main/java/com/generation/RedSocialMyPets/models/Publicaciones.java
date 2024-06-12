package com.generation.RedSocialMyPets.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="publicaciones")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Publicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="usuario_id")
    private int usuario_id;
    @Column(name="mascota_id")
    private int mascota_id;
    @Column(name="contenido")
    private String contenido;

    @CreationTimestamp
    @Column(name="fecha_publicacion")
    private LocalDateTime fecha_publicacion;
}

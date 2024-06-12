package com.generation.RedSocialMyPets.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "likes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Likes {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="publicacion_id")
    private int publicacionId;
    @Column(name="usuario_id")
    private int usuarioId;

}

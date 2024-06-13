package com.generation.RedSocialMyPets.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "like")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="like_id")
    private int likeId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "like_usuario_id")
    private Usuario likeUsuarioId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "like_publicacion_id")
    private Publicacion likePublicacionId;



}

package com.generation.RedSocialMyPets.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comentarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comentario_id")
    private String ComentarioId;

    @Column(name = "comentario_contenido")
    private String comentarioContenido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comentario_usuario_id")
    private Usuario comentarioUsuarioId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comentario_publicacion_id")
    private Publicacion comentarioPublicacionId;

}

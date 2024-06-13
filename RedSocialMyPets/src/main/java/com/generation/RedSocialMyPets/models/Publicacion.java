package com.generation.RedSocialMyPets.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="publicacion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="publicacion_id")
    private int publicacionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publicacion_usuario_id")
    private Usuario publicacionUsuarioId;

     /*private int publicacionMascotaId;*/

    @Column(name="publicacion_contenido")
    private String publicacionContenido;

    @CreationTimestamp
    @Column(name="publicacion_fecha")
    private LocalDateTime publicacionFecha;


    /*private int publicacionComentarioId;*/


    @OneToMany(mappedBy = "fotoPublicacionId", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "publiacacion_foto_id")
    private List<Foto> publicacionFotoId;

    @OneToMany(mappedBy = "comentarioPublicacionId")
    @Column(name = "publicacion_comentario_id")
    private List<Comentario> publicacionComentarioId;

    @OneToMany(mappedBy = "likePublicacionId")
    @Column(name = "publiacacion_like_id")
    private List<Like> publicacionLikeId;

    @ManyToMany
    @JoinTable(name = "publicacion_mascota",
    joinColumns = @JoinColumn(name = "publicacion_id"),
    inverseJoinColumns = @JoinColumn(name = "mascota_id"))
    private List<Mascota> publicacionMascota;



}

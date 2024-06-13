package com.generation.RedSocialMyPets.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name="usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="usuario_id")
    private long usuarioId;
    @Column(name="usuario_nombre")
    private String usuarioNombre;
    @Column(name="usuario_nombre_completo")
    private String usuarioNombreCompleto;
    @Column(name="password")
    private String password;
    @Column(name="usuario_correo")
    private String usuarioCorreo;




    @OneToMany(mappedBy = "mascotaTutorId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mascota> tutorMascotaId;

    @OneToMany(mappedBy = "likeUsuarioId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Like> usuarioLikeId;

    @OneToMany(mappedBy = "publicacionUsuarioId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Publicacion> usuarioPublicacionId;

    @OneToMany(mappedBy = "comentarioUsuarioId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comentario> usuarioComentarioId;

    @OneToMany(mappedBy = "fotoUsuarioId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Foto> usuarioFotoId;





}

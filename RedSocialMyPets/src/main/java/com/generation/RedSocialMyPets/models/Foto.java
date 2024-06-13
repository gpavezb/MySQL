package com.generation.RedSocialMyPets.models;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "foto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Foto{
    @Id
    @GeneratedValue
    @Column(name="foto_id")
    private Long fotoId
            ;
    @Column(name="foto_url")
    private String fotoUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "foto_publicacion_id")
    private Publicacion fotoPublicacionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="foto_usuario_id")
    private Usuario fotoUsuarioId;

}

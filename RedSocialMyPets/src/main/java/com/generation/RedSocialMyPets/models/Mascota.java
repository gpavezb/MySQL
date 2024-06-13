package com.generation.RedSocialMyPets.models;
import jakarta.persistence.*;
import lombok.Getter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="mascota")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="mascota_id")
    private Long mascotaId;

    @Column(name="mascota_nombre")
    private String mascotaNombre;

    @Column(name="mascota_edad")
    private int mascotaEdad;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mascota_especie_id")
    private Especie mascotaEspecieId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mascota_tutor_id")
    private Usuario mascotaTutorId;

    @ManyToMany(mappedBy = "publicacionMascota")
    private List<Publicacion> mascotaPublicacion;

    /*@JoinTable (name="PublicacionMascota",
            joinColumns = @JoinColumn(name="mascota_id"),
            inverseJoinColumns = @JoinColumn (name="publicacion_id"))
    private List<Publicacion> mascotaPublicacion;*/

}

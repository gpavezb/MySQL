package com.generation.RedSocialMyPets.models;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="especie")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Especie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "especie_id")
    private Long especieId;

    @Column(name="especie_nombre")
    private String especieNombre;


    @OneToMany(mappedBy = "mascotaEspecieId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mascota> especieMascotaId;

}

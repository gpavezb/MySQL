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

@Entity
@Table(name="mascota")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="edad")
    private int edad;
    @Column(name="tipo")
    private String tipo;
    @Column(name="usuario_id")
    private int usuario_id;


}

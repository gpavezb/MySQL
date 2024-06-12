package com.generation.RedSocialMyPets.repository;

import com.generation.RedSocialMyPets.models.Publicaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionesRepository extends JpaRepository<Publicaciones, Long> {
}

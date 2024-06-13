package com.generation.RedSocialMyPets.repository;
import com.generation.RedSocialMyPets.models.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoRepository extends JpaRepository<Foto, Long> {
}

package com.generation.RedSocialMyPets.repository;
import com.generation.RedSocialMyPets.models.Especie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecieRepository extends JpaRepository<Especie, Long> {
}

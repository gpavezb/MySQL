package com.generation.RedSocialMyPets.repository;
import com.generation.RedSocialMyPets.models.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRespository extends JpaRepository<Like, Long> {
}

package com.generation.RedSocialMyPets.repository;

import com.generation.RedSocialMyPets.models.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRespository extends JpaRepository<Likes, Long> {
}

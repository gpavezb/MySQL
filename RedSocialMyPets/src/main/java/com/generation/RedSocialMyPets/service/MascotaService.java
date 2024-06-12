package com.generation.RedSocialMyPets.service;

import com.generation.RedSocialMyPets.models.Mascota;
import com.generation.RedSocialMyPets.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;
    public Mascota obtenerMascotaPorId(long id) {
        return mascotaRepository.getReferenceById(id);
    }
}

package com.joel2222.clinica_veterinaria.repository;

import com.joel2222.clinica_veterinaria.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
    
}

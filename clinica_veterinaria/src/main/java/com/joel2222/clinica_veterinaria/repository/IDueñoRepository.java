package com.joel2222.clinica_veterinaria.repository;

import com.joel2222.clinica_veterinaria.entity.Dueño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDueñoRepository extends JpaRepository<Dueño, Long>{
    
}

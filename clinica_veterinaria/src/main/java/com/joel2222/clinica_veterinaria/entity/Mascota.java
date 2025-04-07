package com.joel2222.clinica_veterinaria.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
    
    @Basic
    private String nombre;
    private String especie;
    private String Raza;
    private String Color;

    @OneToOne
    @JoinColumn(name = "duenio",
        referencedColumnName = "id_duenio")
   private Dueño dueño;
    
    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre, String especie, String Raza, String Color, Dueño dueño) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.Raza = Raza;
        this.Color = Color;
        this.dueño = dueño;
    }

    
}

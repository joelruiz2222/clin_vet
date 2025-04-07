package com.joel2222.clinica_veterinaria.service;

import com.joel2222.clinica_veterinaria.dto.MascotaDTO;
import com.joel2222.clinica_veterinaria.entity.Mascota;
import java.util.List;

public interface IMascotaService {

  public void saveMascota(Mascota mascota);
    
    public void deleteMascota(Long id_mascota);
    
    public void editMascota(Mascota mascota);
    
    public Mascota findMascota(Long id_mascota);
    
    public List<Mascota> getMascotas();
    
    public List<Mascota> getCaciche();
    
    public List <MascotaDTO> getMascXDuenio();
    
}

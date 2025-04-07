package com.joel2222.clinica_veterinaria.controller;

import com.joel2222.clinica_veterinaria.dto.MascotaDTO;
import com.joel2222.clinica_veterinaria.entity.Mascota;
import com.joel2222.clinica_veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService servMasco;
    
    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota masc){
    
    servMasco.saveMascota(masc);
        
        return "La mascota fue creada con exito!!";
    
    }      
    
    @DeleteMapping("/mascota/borrar/{id_mascota}")
    public String deleteMascota(@PathVariable Long id_mascota){
    
    servMasco.deleteMascota(id_mascota);
    
        return "La mascota fue borrada con exito!!";
    
    }
    
    @PutMapping("/mascota/editar")
    public Mascota editMascota(@RequestBody Mascota mascota){
    
    servMasco.editMascota(mascota);
    
        return servMasco.findMascota(mascota.getId_mascota());
    
    }
    
    @GetMapping("/mascota/buscar/{id_mascota}")
    public Mascota findMascota(@PathVariable Long id_mascota){
        
        return servMasco.findMascota(id_mascota);
        
    }
    
    @GetMapping("/mascota/traer")
    public List<Mascota> getMascotas(){
    
       List<Mascota> listaMascotas =  servMasco.getMascotas();
        
        return listaMascotas;
    
    }
    
    @GetMapping("/mascota/caniche")
    public List<Mascota> getCaniches(){
    
       List<Mascota> listaCaniches =  servMasco.getCaciche();
    
       return listaCaniches;
    
    }
    
    @GetMapping("/mascota/dueño")
    public List<MascotaDTO> getMascXDueño(){
    
    List<MascotaDTO> listaMxD = servMasco.getMascXDuenio();
    
        return listaMxD;
    
    }
    
}

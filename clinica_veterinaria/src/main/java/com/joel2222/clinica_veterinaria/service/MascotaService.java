package com.joel2222.clinica_veterinaria.service;

import com.joel2222.clinica_veterinaria.dto.MascotaDTO;
import com.joel2222.clinica_veterinaria.entity.Mascota;
import com.joel2222.clinica_veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepository repoMasco;
    
    @Override
    public void saveMascota(Mascota mascota) {
        
        repoMasco.save(mascota);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        
        repoMasco.deleteById(id_mascota);
    }

    @Override
    public void editMascota(Mascota mascota) {
        
     this.saveMascota(mascota);
        
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        
        Mascota masc = repoMasco.findById(id_mascota).orElse(null);
        
        return masc;
        
    }

    @Override
    public List<Mascota> getMascotas() {
        
        List<Mascota> listaMascota = repoMasco.findAll();
        
        return listaMascota;
        
    }

    @Override
    public List<Mascota> getCaciche() {
        
        List<Mascota>listaCaniche = new ArrayList<>();
        
        for (Mascota masco : repoMasco.findAll()) {
            
            if (masco.getEspecie().equalsIgnoreCase("perro") && masco.getRaza().equalsIgnoreCase("caniche")) {
                
                listaCaniche.add(masco);
                
            }
            
        }
        
        return listaCaniche;
        
    }

    @Override
    public List <MascotaDTO> getMascXDuenio() {
        
        MascotaDTO mXd = new MascotaDTO();

        List<MascotaDTO> listaMxD = new ArrayList<>();

        for (Mascota masc : repoMasco.findAll()) {

            mXd.setNombre_mascota(masc.getNombre());
            mXd.setEspecie(masc.getEspecie());
            mXd.setRaza(masc.getRaza());
            mXd.setNombre_duenio(masc.getDueño().getNombre());
            mXd.setApellido_duenio(masc.getDueño().getApellido());

            listaMxD.add(mXd);

            mXd = new MascotaDTO();
            
        }

        return listaMxD;

    }
    
}

package com.joel2222.clinica_veterinaria.service;

import com.joel2222.clinica_veterinaria.entity.Dueño;
import com.joel2222.clinica_veterinaria.repository.IDueñoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DueñoService implements IDueñoService{

    @Autowired
    private IDueñoRepository repoDuenio;
    
    @Override
    public void saveDueño(Dueño duenio) {
        
        repoDuenio.save(duenio);
    }

    @Override
    public void deleteDueño(Long id_duenio) {
        
        repoDuenio.deleteById(id_duenio);
    }

    @Override
    public void editDueño(Dueño duenio) {
        
     this.saveDueño(duenio);
        
    }

    @Override
    public Dueño findDueño(Long id_duenio) {
        
        Dueño duen = repoDuenio.findById(id_duenio).orElse(null);
        
        return duen;
        
    }

    @Override
    public List<Dueño> getDueños() {
        
        List<Dueño> listaDuenios = repoDuenio.findAll();
        
        return listaDuenios;
        
    }
    
}

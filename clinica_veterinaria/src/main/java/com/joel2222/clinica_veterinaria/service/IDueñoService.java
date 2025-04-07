package com.joel2222.clinica_veterinaria.service;

import com.joel2222.clinica_veterinaria.entity.Dueño;
import java.util.List;

public interface IDueñoService {
    
    public void saveDueño(Dueño dueño);
    
    public void deleteDueño(Long id_dueño);
    
    public void editDueño(Dueño dueño);
    
    public Dueño findDueño(Long id_dueño);
    
    public List<Dueño> getDueños();
    
}

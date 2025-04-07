package com.joel2222.clinica_veterinaria.controller;

import com.joel2222.clinica_veterinaria.entity.Dueño;
import com.joel2222.clinica_veterinaria.service.IDueñoService;
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
public class DueñoController {

    @Autowired
    private IDueñoService servDuenio;

    @PostMapping("/duenio/crear")
    public String saveDueño(@RequestBody Dueño duenio) {

        servDuenio.saveDueño(duenio);

        return "El dueño fue creada con exito!!";

    }

    @DeleteMapping("/duenio/borrar/{id_duenio}")
    public String deleteDueño(@PathVariable Long id_duenio) {

        servDuenio.deleteDueño(id_duenio);

        return "El dueño fue borrada con exito!!";

    }

    @PutMapping("/duenio/editar")
    public Dueño editDueño(@RequestBody Dueño duenio) {

        servDuenio.editDueño(duenio);

        return servDuenio.findDueño(duenio.getId_duenio());

    }

    @GetMapping("/duenio/buscar/{id_duenio}")
    public Dueño findDueño(@PathVariable Long id_duenio) {

        return servDuenio.findDueño(id_duenio);
    }

    @GetMapping("/duenio/traer")
    public List<Dueño> getDueños() {

        List<Dueño> listaDuenios = servDuenio.getDueños();

        return listaDuenios;

    }

}

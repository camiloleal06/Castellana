package org.castellana.controladores;

import java.util.List;

import org.castellana.interfaces.impl.MedicoImplInterface;
import org.castellana.modelo.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {
    @Autowired
    MedicoImplInterface servicio;

    @PostMapping
    public ResponseEntity<Medico> saveMedico(@RequestBody Medico medico) {
        return new ResponseEntity<>(servicio.guardarMedico(medico), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Medico>> getMedico() {
        return new ResponseEntity<>(servicio.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping("/{cedula}")
    public ResponseEntity<Medico> getMedicoPorCedula(@PathVariable Integer cedula) {
        return new ResponseEntity<>(servicio.buscarPorCedula(cedula), HttpStatus.OK);
    }

    @PutMapping("/{cedula}")
    public ResponseEntity<Medico> actualizarMedicoPorCedula(@PathVariable Integer cedula, @RequestBody Medico medico) {
        return new ResponseEntity<>(servicio.actualizarMedicos(medico, cedula), HttpStatus.OK);
    }

}

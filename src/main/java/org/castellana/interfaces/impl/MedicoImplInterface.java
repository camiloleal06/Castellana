package org.castellana.interfaces.impl;

import java.util.List;

import org.castellana.errore.BadRequestException;
import org.castellana.errore.NotFoundException;
import org.castellana.interfaces.MedicoInterface;
import org.castellana.modelo.Medico;
import org.castellana.repositorio.MedicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoImplInterface implements MedicoInterface {

    @Autowired
    MedicoRepositorio repo;

    @Override
    public Medico guardarMedico(Medico medico) {
        if (this.existeMedico(medico.getCedula()))
            return repo.save(medico);
        else
            throw new BadRequestException("El Medico ya existe");
    }

    @Override
    public List<Medico> buscarTodos() {
        return repo.findAll();
    }

    @Override
    public Medico buscarPorCedula(Integer cedula) {
        return repo.findById(cedula).orElseThrow(() -> new NotFoundException("El medico con este ID no existe"));
    }

    @Override
    public Medico actualizarMedicos(Medico medico, Integer cedula) {
        return repo.save(medico);

    }

    private boolean existeMedico(Integer cedula) {
        return repo.existsById(cedula);
    }

}

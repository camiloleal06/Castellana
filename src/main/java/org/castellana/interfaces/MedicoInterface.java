package org.castellana.interfaces;

import java.util.List;

import org.castellana.modelo.Medico;

public interface MedicoInterface {

    Medico guardarMedico(Medico medico);

    List<Medico> buscarTodos();

    Medico buscarPorCedula(Integer cedula);

    Medico actualizarMedicos(Medico medico, Integer cedula);
}

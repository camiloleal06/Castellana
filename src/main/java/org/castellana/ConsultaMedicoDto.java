package org.castellana;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ConsultaMedicoDto {
    private Integer cedula;
    private String nombre;
    private String rm;
    private String lc;
    private String consultorio;
    private String piso;
    private String estado;
    private String cantidad;
    private String atiende;
    private String nomres;

}

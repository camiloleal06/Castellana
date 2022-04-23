package org.castellana.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler", "fieldHandler" })
@Table(name = "medicos")
public class Medico {
    @Id
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

package org.paulo.back.model;

import java.time.LocalDate;
import java.util.List;

public class Discurso {
    private Integer numero;
    private String tema;
    private LocalDate ultimaData;
    private List<Discurso_Orador> oradores;

    public Discurso(Integer numero, String tema) {
        this.numero = numero;
        this.tema = tema;
    }
}
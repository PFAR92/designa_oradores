package org.paulo.back.model;

import java.time.LocalDate;
import java.util.List;

public class Discurso {
    private Long id;
    private String nome;
    private String congregacao;
    private LocalDate data;
    private List<Discurso_Orador> discursos;
}

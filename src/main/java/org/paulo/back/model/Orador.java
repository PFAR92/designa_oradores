package org.paulo.back.model;

import java.time.LocalDate;
import java.util.List;

public class Orador {
    private Integer id;
    private String nome;
    private String congregacao;
    private LocalDate data;
    private List<Discurso_Orador> discursos;

    public Orador(String nome, String congregacao, LocalDate data) {
        this.nome = nome;
        this.congregacao = congregacao;
        this.data = data;
    }

}

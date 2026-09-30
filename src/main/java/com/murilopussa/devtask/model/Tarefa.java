package com.murilopussa.devtask.model;

public class Tarefa {
    private Long id;
    private String titulo;
    private String descricao;
    private StatusTarefa status;

    public Tarefa(Long id, String titulo, String descricao, StatusTarefa status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    // GETTERS

    public Long getId() {

        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {

        return descricao;
    }

    public StatusTarefa getStatus() {

        return status;
    }

    // SETTERS

    public void setId(Long id){
        this.id = id;
    }
}

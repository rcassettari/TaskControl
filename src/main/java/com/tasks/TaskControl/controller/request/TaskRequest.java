package com.tasks.TaskControl.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class TaskRequest {

    @NotBlank
    @Size(min = 1, max = 255)
    private String titulo;

    @NotEmpty
    private LocalDate diaAtividade;

    private Boolean importante;

    public TaskRequest(String titulo, LocalDate diaAtividade, Boolean importante) {
        this.titulo = titulo;
        this.diaAtividade = diaAtividade;
        this.importante = importante;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDiaAtividade() {
        return diaAtividade;
    }

    public void setDiaAtividade(LocalDate diaAtividade) {
        this.diaAtividade = diaAtividade;
    }

    public Boolean getImportante() {
        return importante;
    }

    public void setImportante(Boolean importante) {
        this.importante = importante;
    }
}

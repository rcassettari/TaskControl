package com.tasks.TaskControl.entity;

import jakarta.persistence.*;
import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "task")
public class Task {

    @Id
    private String uuid = UUID.randomUUID().toString();

    private String titulo;

    private LocalDate diaAtividade;

    private Boolean importante;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

package br.com.ebac.microservicegerenciamentomemes.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
public class Meme {
    @Id
    private String id;

    private String nome;
    private String descricao;
    private Date dataCadastro;

    public Meme(){}

    public Meme(String id, String nome, String descricao, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @PrePersist
    public void criarId(){
        this.id = UUID.randomUUID().toString();
    }

}
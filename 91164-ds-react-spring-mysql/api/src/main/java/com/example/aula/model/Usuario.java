package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import javax.swing.*;

@Entity
@Table (name = "tab_jogadores")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank (message = "é obrigatorio")
    private String sexo;

    @NotBlank (message = "informe a idade")
    private String idade;

    @NotBlank (message = "informe a altura")
    private String altura;

    @NotBlank (message =  "informe o peso ")
    private String peso;

    @NotBlank (message = "informe a posição")
    private String posicao;

    @NotBlank (message = "informe o numero da camisa")
    private String numeroCamisa;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String sexo, String idade, String altura, String peso, String posicao, String numeroCamisa) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "é obrigatorio") String getSexo() {
        return sexo;
    }

    public void setSexo(@NotBlank(message = "é obrigatorio") String sexo) {
        this.sexo = sexo;
    }

    public @NotBlank(message = "informe a idade") String getIdade() {
        return idade;
    }

    public void setIdade(@NotBlank(message = "informe a idade") String idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "informe a altura") String getAltura() {
        return altura;
    }

    public void setAltura(@NotBlank(message = "informe a altura") String altura) {
        this.altura = altura;
    }

    public @NotBlank(message = "informe o peso ") String getPeso() {
        return peso;
    }

    public void setPeso(@NotBlank(message = "informe o peso ") String peso) {
        this.peso = peso;
    }

    public @NotBlank(message = "informe a posição") String getPosicao() {
        return posicao;
    }

    public void setPosicao(@NotBlank(message = "informe a posição") String posicao) {
        this.posicao = posicao;
    }

    public @NotBlank(message = "informe o numero da camisa") String getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(@NotBlank(message = "informe o numero da camisa") String numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade='" + idade + '\'' +
                ", altura='" + altura + '\'' +
                ", peso='" + peso + '\'' +
                ", posicao='" + posicao + '\'' +
                ", numeroCamisa='" + numeroCamisa + '\'' +
                '}';
    }
}

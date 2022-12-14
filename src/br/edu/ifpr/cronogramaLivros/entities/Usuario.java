/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.entities;

/**
 *
 * @author heloi
 */
public class Usuario {
    String email;
    String senha;
    String nome;
    boolean isAdmin;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Usuario(String email, String senha, String nome, boolean isAdmin) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.isAdmin = isAdmin;
    }

    public Usuario() {
    }
    
    @Override
    public String toString() {
        return nome + " - " + email;
    }

    
}

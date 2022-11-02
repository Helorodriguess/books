/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.entities;

import java.sql.Date;

/**
 *
 * @author heloi
 */
public class Cronograma {
    int id;
    Usuario usuario;
    Date dataInicial;
    int paginasDiarias;
    boolean finalizado;

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public int getPaginasDiarias() {
        return paginasDiarias;
    }

    public void setPaginasDiarias(int paginasDiarias) {
        this.paginasDiarias = paginasDiarias;
    }

    public Cronograma(Usuario usuario, Date dataInicial, int paginasDiarias, boolean finalizado) {
        this.usuario = usuario;
        this.dataInicial = dataInicial;
        this.paginasDiarias = paginasDiarias;
        this.finalizado = finalizado;
    }
    
}

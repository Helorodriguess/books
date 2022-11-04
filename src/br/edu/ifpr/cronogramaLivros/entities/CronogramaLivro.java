/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.entities;

/**
 *
 * @author heloi
 */
public class CronogramaLivro {
    Cronograma cronograma;
    Livro livro;
    boolean lido;

    public CronogramaLivro() {
    }

    public Cronograma getCronograma() {
        return cronograma;
    }

    public void setCronograma(Cronograma cronograma) {
        this.cronograma = cronograma;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    public CronogramaLivro(Cronograma cronograma, Livro livro, boolean lido) {
        this.cronograma = cronograma;
        this.livro = livro;
        this.lido = lido;
    }
    
}

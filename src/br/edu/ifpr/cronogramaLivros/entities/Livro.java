/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.entities;

/**
 *
 * @author heloi
 */
public class Livro {

    int id;
    String titulo;
    String autor;
    String editora;
    int paginas;
    String sinopse;
    Genero genero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Livro(String titulo, String autor, String editora, int paginas, String sinopse, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
        this.sinopse = sinopse;
        this.genero = genero;
    }

    public Livro() {
    }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.apresentacao;

import java.util.ArrayList;

/**
 *
 * @author heloi
 */
public class NewClass {

    public static void main(String[] args) {
        ArrayList<String> livros = new ArrayList();

        livros.add("a");
        livros.add("a");
        livros.add("a");
        livros.add("a");
        livros.add("a");
        livros.add("a");
        livros.add("a");
        
        ArrayList<String> livrosCronograma = new ArrayList<>();
        
        for(int i = 1; i <= 4; i++){
            int min = 0;
            int max = livros.size() - 1;
            int posicao = (int) ((Math.random() * (min - max)) + min);
            livrosCronograma.add(livros.get(posicao));
            livros.remove(posicao)
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.models;

import br.edu.ifpr.cronogramaLivros.DAO.AvaliacaoDAO;
import br.edu.ifpr.cronogramaLivros.entities.Avaliacao;
import br.edu.ifpr.cronogramaLivros.entities.Livro;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author heloi
 */
public class ExibirAvaliacoesModel extends AbstractTableModel {

    String[] colunas = {"Nota", "Comentário"};
    AvaliacaoDAO dao = new AvaliacaoDAO();

    ArrayList<Avaliacao> avaliacoes;

    public ExibirAvaliacoesModel(Livro livro) throws SQLException {
        avaliacoes = dao.selecionar(livro);
    }

    @Override
    public int getRowCount() {
        return avaliacoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        if (coluna == 0) {
            return avaliacoes.get(linha).getNota();
        } else if (coluna == 1) {
            return avaliacoes.get(linha).getComentario();
        } else {
            return null;
        }
    }

    @Override
    public String getColumnName(int index) {
        return colunas[index];
    }


}

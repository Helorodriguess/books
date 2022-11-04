/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.models;

import br.edu.ifpr.cronogramaLivros.DAO.CronogramaLivroDAO;
import br.edu.ifpr.cronogramaLivros.entities.CronogramaLivro;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author heloi
 */
public class ExibirCronogramaModel extends AbstractTableModel {

    String[] colunas = {"Livro", "Autor", "Dias"};
    CronogramaLivroDAO dao = new CronogramaLivroDAO();

    ArrayList<CronogramaLivro> cronogramaLivro;

    public ExibirCronogramaModel() throws SQLException {
        cronogramaLivro = dao.selecionar();
    }

    @Override
    public int getRowCount() {
        return cronogramaLivro.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        if (coluna == 0) {
            return cronogramaLivro.get(linha).getLivro().getTitulo();
        } else if (coluna == 1) {
            return cronogramaLivro.get(linha).getLivro().getAutor();
        } else if (coluna == 2) {
            int paginas = cronogramaLivro.get(linha).getLivro().getPaginas();
            int paginasPorDia = cronogramaLivro.get(linha).getCronograma().getPaginasDiarias();
            float dias = paginas / paginasPorDia;
            return dias;
        } else if (coluna == 3) {
            cronogramaLivro.get(linha).isLido();
        } else {
            return null;
        }
        return null;
    }

    @Override
    public String getColumnName(int index) {
        return colunas[index];
    }

    Class[] types = new Class[]{
        java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
    };

    @Override
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

}

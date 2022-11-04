/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.models;

import br.edu.ifpr.cronogramaLivros.DAO.GeneroDAO;
import br.edu.ifpr.cronogramaLivros.entities.Genero;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author heloi
 */
public class GerarCronogramaModel extends AbstractTableModel {

    String[] colunas = {"Genero", "Quantidade"};
    GeneroDAO dao = new GeneroDAO();

    ArrayList<Genero> generos;

    boolean[] canEdit = new boolean[]{
        false, true
    };

    public GerarCronogramaModel() throws SQLException {
        generos = dao.selecionar();
    }

    @Override
    public int getRowCount() {
        return generos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        if (coluna == 0) { 
            return generos.get(linha).getNome();
        } else if (coluna == 1) {
            return null;
        } else {
            return null;
        }
    }
    
     @Override
    public String getColumnName(int index) {
        return colunas[index];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }

}

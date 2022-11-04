/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.DAO;

import br.edu.ifpr.cronogramaLivros.entities.Cronograma;
import br.edu.ifpr.cronogramaLivros.factories.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author heloi
 */
public class CronogramaDAO {
    public void alterarCronograma(Cronograma cronograma) throws SQLException {
        String sql = "UPDATE CRONOGRAMA SET FINALIZADO = TRUE WHERE ID = ?";   
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, cronograma.getId());
        
        stmt.execute();
        
        stmt.close();
        con.close();

    }
    
}

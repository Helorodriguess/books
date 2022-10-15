/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.DAO;

import br.edu.ifpr.cronogramaLivros.entities.Genero;
import br.edu.ifpr.cronogramaLivros.factories.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author heloi
 */
public class GeneroDAO {

    public void adinionarGenero(Genero genero) throws SQLException {

        String sql = "INSERT INTO GENERO (NOME) VALUES (?)";

        Connection con = new ConnectionFactory().getConnection();

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setString(1, genero.getNome());

        stmt.execute();

        stmt.close();

        con.close();

    }

    public ArrayList<Genero> selecionar() throws SQLException {

        ArrayList<Genero> retorno = new ArrayList<>();

        String sql = "SELECT ID, NOME FROM GENERO ORDER BY NOME";

        Connection con = new ConnectionFactory().getConnection();

        PreparedStatement stmt = con.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next() == true) {
            Genero genero = new Genero();

            genero.setId(rs.getInt("ID"));
            genero.setNome(rs.getString("NOME"));

            retorno.add(genero);
        }

        return retorno;

    }

}

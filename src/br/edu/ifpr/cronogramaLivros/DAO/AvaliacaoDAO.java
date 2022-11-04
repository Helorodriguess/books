/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.DAO;

import br.edu.ifpr.cronogramaLivros.entities.Avaliacao;
import br.edu.ifpr.cronogramaLivros.entities.Livro;
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
public class AvaliacaoDAO {

    public void adicionarAvaliacao(Avaliacao avaliacao) throws SQLException {
        String sql = "INSERT INTO AVALIACAO (NOTA, COMENTARIO, EMAIL_USUARIO, ID_LIVRO) "
                + "VALUES (?,?,?,?)";

        Connection con = new ConnectionFactory().getConnection();

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setInt(1, avaliacao.getNota());
        stmt.setString(2, avaliacao.getComentario());
        stmt.setString(3, avaliacao.getUsuario().getEmail());
        stmt.setInt(4, avaliacao.getLivro().getId());
        stmt.execute();

        stmt.close();
        con.close();
    }

    public ArrayList<Avaliacao> selecionar(Livro livro) throws SQLException {

        ArrayList<Avaliacao> retorno = new ArrayList<>();
        String sql = "SELECT AVALIACAO.NOTA, AVALIACAO.COMENTARIO, LIVRO.ID "
                + "FROM AVALIACAO INNER JOIN LIVRO ON AVALIACAO.ID_LIVRO = LIVRO.ID "
                + "WHERE LIVRO.ID =  ? ORDER BY AVALIACAO.NOTA";

        Connection con = new ConnectionFactory().getConnection();

        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, livro.getId());

        ResultSet rs = stmt.executeQuery();

        while (rs.next() == true) {

            Avaliacao avaliacao = new Avaliacao();
            
            livro.setId(rs.getInt("ID"));
            avaliacao.setNota(rs.getInt("NOTA"));
            avaliacao.setComentario(rs.getString("COMENTARIO"));
            avaliacao.setLivro(livro);

            retorno.add(avaliacao);
        }

        return retorno;

    }

}

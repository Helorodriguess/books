/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.DAO;

import br.edu.ifpr.cronogramaLivros.entities.Genero;
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
public class LivroDAO {
    
    public void adicionarLivro(Livro livro) throws SQLException {
        String sql = "INSERT INTO LIVRO (TITULO, AUTOR, EDITORA, PAGINAS, SINOPSE, ID_GENERO) "
                + "VALUES (?,?,?,?,?,?)";

        Connection con = new ConnectionFactory().getConnection();

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setString(1, livro.getTitulo());
        stmt.setString(2, livro.getAutor());
        stmt.setString(3, livro.getEditora());
        stmt.setInt(4, livro.getPaginas());
        stmt.setString(5, livro.getSinopse());
        stmt.setInt(6, livro.getGenero().getId());

        stmt.execute();

        stmt.close();
        con.close();
    }
    
    public ArrayList<Livro> selecionar() throws SQLException {

        ArrayList<Livro> retorno = new ArrayList<>();
        String sql = "SELECT ID, TITULO, AUTOR, EDITORA, PAGINAS, SINOPSE, ID_GENERO FROM LIVRO ORDER BY TITULO";

        Connection con = new ConnectionFactory().getConnection();

        PreparedStatement stmt = con.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next() == true) {
            
            Genero genero = new Genero();
            genero.setId(rs.getInt("ID_GENERO"));
            
            Livro livro = new Livro();
            livro.setId(rs.getInt("ID"));
            livro.setTitulo(rs.getString("TITULO"));
            livro.setAutor(rs.getString("AUTOR"));
            livro.setEditora(rs.getString("EDITORA"));
            livro.setPaginas(rs.getInt("PAGINAS"));
            livro.setSinopse(rs.getString("SINOPSE"));
            livro.setGenero(genero);

            retorno.add(livro);
        }

        return retorno;
        
    }
    
    public void alterarLivro(Livro livro) throws SQLException {
        String sql = "UPDATE LIVRO SET TITULO = ?, AUTOR = ?, EDITORA = ?, PAGINAS = ?, SINOPSE = ?, ID_GENERO = ? WHERE ID = ?";   
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, livro.getTitulo());
        stmt.setString(2, livro.getAutor());
        stmt.setString(3, livro.getEditora());
        stmt.setInt(4, livro.getPaginas());
        stmt.setString(5, livro.getSinopse());
        stmt.setInt(6, livro.getGenero().getId());
        stmt.setInt(7, livro.getId());

        
        stmt.execute();
        
        stmt.close();
        con.close();

    }
    
    public void removerLivro(Livro livro) throws SQLException {
    
        String sql = "DELETE FROM LIVRO WHERE ID = ?";   
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, livro.getId());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    
    }
}

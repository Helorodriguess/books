/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.DAO;

import br.edu.ifpr.cronogramaLivros.entities.Cronograma;
import br.edu.ifpr.cronogramaLivros.entities.CronogramaLivro;
import br.edu.ifpr.cronogramaLivros.entities.Livro;
import br.edu.ifpr.cronogramaLivros.entities.Usuario;
import br.edu.ifpr.cronogramaLivros.factories.ConnectionFactory;
import br.edu.ifpr.cronogramaLivros.global.UsuarioAutenticado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author heloi
 */
public class CronogramaLivroDAO {
    
    public ArrayList<CronogramaLivro> selecionar() throws SQLException {

        ArrayList<CronogramaLivro> retorno = new ArrayList<>();
        String sql = "SELECT CRONOGRAMA_LIVRO.ID_CRONOGRAMA, CRONOGRAMA_LIVRO.ID_LIVRO, "
                + "CRONOGRAMA.ID, CRONOGRAMA.DATA_INICIO, CRONOGRAMA.PAGINAS_POR_DIA, CRONOGRAMA.FINALIZADO, "
                + "LIVRO.ID, LIVRO.TITULO, LIVRO.AUTOR, LIVRO.PAGINAS, "
                + "USUARIO.EMAIL "
                + "FROM CRONOGRAMA_LIVRO INNER JOIN CRONOGRAMA ON CRONOGRAMA_LIVRO.ID_CRONOGRAMA = CRONOGRAMA.ID "
                + "INNER JOIN LIVRO ON CRONOGRAMA_LIVRO.ID_LIVRO = LIVRO.ID "
                + "INNER JOIN USUARIO ON CRONOGRAMA.EMAIL_USUARIO = USUARIO.EMAIL "
                + "WHERE CRONOGRAMA.FINALIZADO = FALSE";

        Connection con = new ConnectionFactory().getConnection();

        PreparedStatement stmt = con.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next() == true) {

            Livro livro = new Livro();
            Cronograma cronograma = new Cronograma();
            Usuario usuario = UsuarioAutenticado.usuario;
            CronogramaLivro cronogramaLivro = new CronogramaLivro();
            
            livro.setId(rs.getInt("ID"));
            livro.setTitulo(rs.getString("TITULO"));
            livro.setAutor(rs.getString("AUTOR"));
            livro.setPaginas(rs.getInt("PAGINAS"));
            
            cronograma.setId(rs.getInt("ID"));
            cronograma.setDataInicial(rs.getDate("DATA_INICIO"));
            cronograma.setPaginasDiarias(rs.getInt("PAGINAS_POR_DIA"));
            cronograma.setFinalizado(rs.getBoolean("FINALIZADO"));
            cronograma.setUsuario(usuario);
            
            cronogramaLivro.setCronograma(cronograma);
            cronogramaLivro.setLivro(livro);

            retorno.add(cronogramaLivro);
        }

        return retorno;

    }
    
    
    public void alterarCronogramaLivro(CronogramaLivro cronogramaLivro) throws SQLException {
        String sql = "UPDATE CRONOGRAMA_LIVRO SET LIDO = TRUE WHERE ID_LIVRO = ?";   
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, cronogramaLivro.getLivro().getId());
        
        stmt.execute();
        
        stmt.close();
        con.close();

    }
    
    public ArrayList<CronogramaLivro> mostrarHistorico() throws SQLException {

        ArrayList<CronogramaLivro> retorno = new ArrayList<>();
        String sql = "SELECT CRONOGRAMA.ID, CRONOGRAMA_LIVRO.ID_CRONOGRAMA, CRONOGRAMA_LIVRO.ID_LIVRO, "
                + "CRONOGRAMA_LIVRO.LIDO, LIVRO.ID, LIVRO.TITULO, LIVRO.AUTOR, USUARIO.EMAIL "
                + "FROM CRONOGRAMA_LIVRO "
                + "INNER JOIN CRONOGRAMA ON CRONOGRAMA_LIVRO.ID_CRONOGRAMA = CRONOGRAMA.ID "
                + "INNER JOIN LIVRO ON CRONOGRAMA_LIVRO.ID_LIVRO = LIVRO.ID "
                + "INNER JOIN USUARIO ON CRONOGRAMA.EMAIL_USUARIO = USUARIO.EMAIL "
                + "WHERE CRONOGRAMA_LIVRO.LIDO = TRUE";

        Connection con = new ConnectionFactory().getConnection();

        PreparedStatement stmt = con.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next() == true) {

            Livro livro = new Livro();
            Cronograma cronograma = new Cronograma();
            Usuario usuario = UsuarioAutenticado.usuario;
            CronogramaLivro cronogramaLivro = new CronogramaLivro();
            
            livro.setId(rs.getInt("ID"));
            livro.setTitulo(rs.getString("TITULO"));
            livro.setAutor(rs.getString("AUTOR"));
            
            cronograma.setId(rs.getInt("ID"));
            cronograma.setUsuario(usuario);
            
            cronogramaLivro.setCronograma(cronograma);
            cronogramaLivro.setLivro(livro);
            cronogramaLivro.setLido(rs.getBoolean("LIDO"));

            retorno.add(cronogramaLivro);
        }

        return retorno;

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.DAO;

import br.edu.ifpr.cronogramaLivros.entities.Usuario;
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
public class UsuarioDAO {
    
     public void adicionarUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO USUARIO (EMAIL, SENHA, NOME, ISADM) "
                + "VALUES (?,?,?,?)";

        Connection con = new ConnectionFactory().getConnection();

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setString(1, usuario.getEmail());
        stmt.setString(2, usuario.getSenha());
        stmt.setString(3, usuario.getNome());
        stmt.setBoolean(4, usuario.isIsAdmin());

        stmt.execute();

        stmt.close();
        con.close();
    }
     
     public ArrayList<Usuario> selecionar() throws SQLException {

        ArrayList<Usuario> retorno = new ArrayList<>();
        String sql = "SELECT EMAIL, SENHA, NOME, ISADM FROM USUARIO ORDER BY NOME";

        Connection con = new ConnectionFactory().getConnection();

        PreparedStatement stmt = con.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next() == true) {
            Usuario usuario = new Usuario();
            usuario.setEmail(rs.getString("EMAIL"));
            usuario.setSenha(rs.getString("SENHA"));
            usuario.setNome(rs.getString("NOME"));
            usuario.setIsAdmin(rs.getBoolean("ISADM"));

            retorno.add(usuario);
        }

        return retorno;
    }
     
     public void alterarUsuario(Usuario usuario) throws SQLException {
        String sql = "UPDATE USUARIO SET EMAIL = ?, SENHA = ?, NOME = ?, ISADM = ? WHERE EMAIL = ?";   
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, usuario.getEmail());
        stmt.setString(2, usuario.getSenha());
        stmt.setString(3, usuario.getNome());
        stmt.setBoolean(4, usuario.isIsAdmin());
        stmt.setString(5, usuario.getEmail());
        
        stmt.execute();
        
        stmt.close();
        con.close();

    }
     
      public void removerUsuario(Usuario usuario) throws SQLException {
    
        String sql = "DELETE FROM USUARIO WHERE EMAIL = ?";   
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, usuario.getEmail());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    
    }
     
    
}

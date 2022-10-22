/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.apresentacao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heloi
 */
public class MenuAdminTela extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdminTela
     */
    public MenuAdminTela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrarLivro = new javax.swing.JButton();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnAlterarLivro = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        btnRemoverLivro = new javax.swing.JButton();
        btnRemoverUsuario = new javax.swing.JButton();
        btnCadastrarGenero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bem vindo/a, Admin, ao programa das únicas pessoas perfeitas no universo inteiro (emoji que manda beijo) <3");

        jLabel2.setText("Boa Leitura!!!");

        jLabel3.setText("Proprietárias: Carmem, Heloiza e Tamires");

        btnCadastrarLivro.setText("Cadastrar livro");
        btnCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivroActionPerformed(evt);
            }
        });

        btnCadastrarUsuario.setText("Cadastrar usuário");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnAlterarLivro.setText("Alterar livro");
        btnAlterarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarLivroActionPerformed(evt);
            }
        });

        btnAlterarUsuario.setText("Alterar usuário");
        btnAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuarioActionPerformed(evt);
            }
        });

        btnRemoverLivro.setText("Remover livro");
        btnRemoverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverLivroActionPerformed(evt);
            }
        });

        btnRemoverUsuario.setText("Remover usuário");
        btnRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverUsuarioActionPerformed(evt);
            }
        });

        btnCadastrarGenero.setText("Cadastrar gênero");
        btnCadastrarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(284, 284, 284))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCadastrarGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCadastrarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAlterarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemoverLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemoverLivro)
                        .addGap(27, 27, 27)
                        .addComponent(btnRemoverUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrarLivro)
                            .addComponent(btnAlterarLivro))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrarUsuario)
                            .addComponent(btnAlterarUsuario))))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarGenero)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivroActionPerformed
        // TODO add your handling code here:
        CadastrarLivroTela tela = null;
        try {
            tela = new CadastrarLivroTela();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdminTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarLivroActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        // TODO add your handling code here:
        CadastrarUsuarioTela tela = new CadastrarUsuarioTela();
        this.setVisible(false);
        tela.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnCadastrarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarGeneroActionPerformed
        // TODO add your handling code here:
        CadastrarGeneroTela tela = new CadastrarGeneroTela();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarGeneroActionPerformed

    private void btnAlterarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarLivroActionPerformed
        // TODO add your handling code here:
        AlterarLivroTela tela = null;
        try {
            tela = new AlterarLivroTela();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdminTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnAlterarLivroActionPerformed

    private void btnAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuarioActionPerformed
        // TODO add your handling code here:
        AlterarUsuarioTela tela = null;
        try {
            tela = new AlterarUsuarioTela();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdminTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnAlterarUsuarioActionPerformed

    private void btnRemoverLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverLivroActionPerformed
        // TODO add your handling code here:
        RemoverLivroTela tela = null;
        try {
            tela = new RemoverLivroTela();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdminTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnRemoverLivroActionPerformed

    private void btnRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverUsuarioActionPerformed
        // TODO add your handling code here:
        RemoverUsuarioTela tela = null;
        try {
            tela = new RemoverUsuarioTela();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdminTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnRemoverUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdminTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdminTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarLivro;
    private javax.swing.JButton btnAlterarUsuario;
    private javax.swing.JButton btnCadastrarGenero;
    private javax.swing.JButton btnCadastrarLivro;
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnRemoverLivro;
    private javax.swing.JButton btnRemoverUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

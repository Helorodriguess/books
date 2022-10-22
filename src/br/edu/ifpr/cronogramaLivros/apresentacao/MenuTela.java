/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.cronogramaLivros.apresentacao;

/**
 *
 * @author heloi
 */
public class MenuTela extends javax.swing.JFrame {

    /**
     * Creates new form MenuTela
     */
    public MenuTela() {
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
        btnCriarCronograma = new javax.swing.JButton();
        btnConsultarHistorico = new javax.swing.JButton();
        btnMeuCronograma = new javax.swing.JButton();
        btnAvaliar = new javax.swing.JButton();
        btnVerAvaliacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jLabel1.setText("Bem vindo/a ao programa das únicas pessoas perfeitas no universo inteiro (emoji que manda beijo) <3");

        jLabel2.setText("Boa Leitura!!!");

        jLabel3.setText("Proprietárias: Carmem, Heloiza e Tamires");

        btnCriarCronograma.setText("Gerar cronograma");
        btnCriarCronograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarCronogramaActionPerformed(evt);
            }
        });

        btnConsultarHistorico.setText("Consultar histórico");
        btnConsultarHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarHistoricoActionPerformed(evt);
            }
        });

        btnMeuCronograma.setText("Meu cronograma");
        btnMeuCronograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeuCronogramaActionPerformed(evt);
            }
        });

        btnAvaliar.setText("Avaliar");
        btnAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaliarActionPerformed(evt);
            }
        });

        btnVerAvaliacoes.setText("Ver avaliações");
        btnVerAvaliacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAvaliacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnMeuCronograma)
                        .addGap(18, 18, 18)
                        .addComponent(btnCriarCronograma)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarHistorico)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAvaliar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addComponent(btnVerAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(319, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarHistorico)
                    .addComponent(btnMeuCronograma)
                    .addComponent(btnCriarCronograma))
                .addGap(27, 27, 27)
                .addComponent(btnAvaliar)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(177, Short.MAX_VALUE)
                    .addComponent(btnVerAvaliacoes)
                    .addGap(44, 44, 44)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMeuCronogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeuCronogramaActionPerformed
        // TODO add your handling code here:
        ExibirCronogramaTela tela = new ExibirCronogramaTela();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnMeuCronogramaActionPerformed

    private void btnCriarCronogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarCronogramaActionPerformed
        // TODO add your handling code here:
        CriarCronogramaTela tela = new CriarCronogramaTela();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnCriarCronogramaActionPerformed

    private void btnConsultarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarHistoricoActionPerformed
        // TODO add your handling code here:
        ExibirHistoricoLeituraTela tela = new ExibirHistoricoLeituraTela();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnConsultarHistoricoActionPerformed

    private void btnAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaliarActionPerformed
        // TODO add your handling code here:
        FazerAvaliacaoTela tela = new FazerAvaliacaoTela();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnAvaliarActionPerformed

    private void btnVerAvaliacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAvaliacoesActionPerformed
        // TODO add your handling code here:
        ExibirAvaliacoesLivroTela tela = new ExibirAvaliacoesLivroTela();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_btnVerAvaliacoesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvaliar;
    private javax.swing.JButton btnConsultarHistorico;
    private javax.swing.JButton btnCriarCronograma;
    private javax.swing.JButton btnMeuCronograma;
    private javax.swing.JButton btnVerAvaliacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

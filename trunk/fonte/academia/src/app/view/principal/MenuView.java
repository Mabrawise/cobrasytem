/*
 * Copyright (c) 2014 WISE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    WISE - initial API and implementation and/or initial documentation
 */

package app.view.principal;

import app.controller.AtividadeController;
import app.controller.AtletaController;
import app.controller.FuncionarioController;
import app.model.Atividade;
import conf.Global;

/**
 *
 * @author WISE
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        this.setExtendedState(this.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
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

        menuPrincipal = new javax.swing.JMenuBar();
        menuAquivo = new javax.swing.JMenu();
        miAlterarSenha = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        menuCadastrado = new javax.swing.JMenu();
        miFuncionario = new javax.swing.JMenuItem();
        miAtividade = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuFinanceiro = new javax.swing.JMenu();
        contasReceberMenu = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COBRA SYSTEM");
        setName("menuFrame"); // NOI18N

        menuAquivo.setText("Arquivo");

        miAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-locked.png"))); // NOI18N
        miAlterarSenha.setText("Alterar Senha");
        miAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAlterarSenhaActionPerformed(evt);
            }
        });
        menuAquivo.add(miAlterarSenha);

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-exit.png"))); // NOI18N
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        menuAquivo.add(miSair);

        menuPrincipal.add(menuAquivo);

        menuCadastrado.setText("Cadastro");

        miFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        miFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-user2.png"))); // NOI18N
        miFuncionario.setText("Funcionário");
        miFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFuncionarioActionPerformed(evt);
            }
        });
        menuCadastrado.add(miFuncionario);

        miAtividade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        miAtividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-digg2.png"))); // NOI18N
        miAtividade.setText("Atividade");
        miAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAtividadeActionPerformed(evt);
            }
        });
        menuCadastrado.add(miAtividade);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-walking.png"))); // NOI18N
        jMenuItem1.setText("Atleta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCadastrado.add(jMenuItem1);

        menuPrincipal.add(menuCadastrado);

        menuFinanceiro.setText("Financeiro");

        contasReceberMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, 0));
        contasReceberMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money_bag.png"))); // NOI18N
        contasReceberMenu.setText("Contas a receber");
        menuFinanceiro.add(contasReceberMenu);

        menuPrincipal.add(menuFinanceiro);

        menuAjuda.setText("Ajuda");

        miSobre.setText("Sobre");
        menuAjuda.add(miSobre);

        menuPrincipal.add(menuAjuda);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSairActionPerformed

    private void miFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFuncionarioActionPerformed
        FuncionarioController fc = new FuncionarioController();
        fc.despachar();
    }//GEN-LAST:event_miFuncionarioActionPerformed

    private void miAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAlterarSenhaActionPerformed
        FuncionarioController fc = new FuncionarioController();
        fc.alterar_senha_form();
    }//GEN-LAST:event_miAlterarSenhaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       AtletaController ac = new AtletaController();
       ac.despachar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void miAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAtividadeActionPerformed
       AtividadeController ac = new AtividadeController();
       ac.despachar();
    }//GEN-LAST:event_miAtividadeActionPerformed

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
                if (Global.TEMA.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem contasReceberMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuAquivo;
    private javax.swing.JMenu menuCadastrado;
    private javax.swing.JMenu menuFinanceiro;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem miAlterarSenha;
    private javax.swing.JMenuItem miAtividade;
    private javax.swing.JMenuItem miFuncionario;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    // End of variables declaration//GEN-END:variables
}

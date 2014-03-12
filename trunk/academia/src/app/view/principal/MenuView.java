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
import app.controller.ContaController;
import app.controller.FrequenciaController;
import app.controller.FuncionarioController;
import app.view.contas.ContasResumo;
import app.view.frequencia.FrequenciaDataPicker;
import app.view.sobre.SobreView;
import conf.Global;

/**
 *
 * @author WISE
 */
public class MenuView extends javax.swing.JFrame {

    private FrequenciaController fc;
    private ContaController cc;
    private AtletaController ac;

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        this.setExtendedState(this.MAXIMIZED_BOTH);

        initComponents();
        setLocationRelativeTo(null);

        /*ROTINAS*/
        carregarAta();
        carregaRotinaContas();
        carregaAtualziarAtleta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        frequenciaBt = new javax.swing.JButton();
        contasBt = new javax.swing.JButton();
        freManual = new javax.swing.JButton();
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
        pendenciasMenuBT = new javax.swing.JMenuItem();
        moviMenuBt = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        resumoMensal = new javax.swing.JMenuItem();
        frequenciaMenu = new javax.swing.JMenu();
        ataAtletasMenu = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        frequenciaDiariaBt = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Global.NOME + Global.VERSAO);
        setName("menuFrame"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Atalhos"));

        frequenciaBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard.png"))); // NOI18N
        frequenciaBt.setText("Frenquência");
        frequenciaBt.setRequestFocusEnabled(false);
        frequenciaBt.setRolloverEnabled(false);
        frequenciaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequenciaBtActionPerformed(evt);
            }
        });

        contasBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/balance.png"))); // NOI18N
        contasBt.setText("Contas");
        contasBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contasBtActionPerformed(evt);
            }
        });

        freManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tick.png"))); // NOI18N
        freManual.setText("Chek in M.");
        freManual.setToolTipText("Chek in manual.");
        freManual.setRequestFocusEnabled(false);
        freManual.setRolloverEnabled(false);
        freManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freManualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frequenciaBt)
                .addGap(18, 18, 18)
                .addComponent(freManual, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contasBt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frequenciaBt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contasBt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(freManual, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

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
        contasReceberMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contasReceberMenuActionPerformed(evt);
            }
        });
        menuFinanceiro.add(contasReceberMenu);

        pendenciasMenuBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/balance--minus.png"))); // NOI18N
        pendenciasMenuBT.setText("Pendências");
        pendenciasMenuBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendenciasMenuBTActionPerformed(evt);
            }
        });
        menuFinanceiro.add(pendenciasMenuBT);

        moviMenuBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/balance--arrow.png"))); // NOI18N
        moviMenuBt.setText("Movimentação");
        moviMenuBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviMenuBtActionPerformed(evt);
            }
        });
        menuFinanceiro.add(moviMenuBt);
        menuFinanceiro.add(jSeparator1);

        resumoMensal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboardd.png"))); // NOI18N
        resumoMensal.setText("Resumo mensal");
        resumoMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumoMensalActionPerformed(evt);
            }
        });
        menuFinanceiro.add(resumoMensal);

        menuPrincipal.add(menuFinanceiro);

        frequenciaMenu.setText("Frequência");

        ataAtletasMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard.png"))); // NOI18N
        ataAtletasMenu.setText("Ata de atletas");
        ataAtletasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataAtletasMenuActionPerformed(evt);
            }
        });
        frequenciaMenu.add(ataAtletasMenu);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tick.png"))); // NOI18N
        jMenuItem3.setText("Check in manual");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        frequenciaMenu.add(jMenuItem3);

        frequenciaDiariaBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book-open-bookmark.png"))); // NOI18N
        frequenciaDiariaBt.setText("Frequência Diaria");
        frequenciaDiariaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequenciaDiariaBtActionPerformed(evt);
            }
        });
        frequenciaMenu.add(frequenciaDiariaBt);

        menuPrincipal.add(frequenciaMenu);

        menuAjuda.setText("Ajuda");

        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(miSobre);

        menuPrincipal.add(menuAjuda);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
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

    private void contasReceberMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contasReceberMenuActionPerformed
        ContaController cc = new ContaController();
        cc.chamarContasView(0);
    }//GEN-LAST:event_contasReceberMenuActionPerformed

    private void contasBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contasBtActionPerformed
        ContaController cc = new ContaController();
        cc.chamarContasView(0);
    }//GEN-LAST:event_contasBtActionPerformed

    private void pendenciasMenuBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendenciasMenuBTActionPerformed
        ContaController cc = new ContaController();
        cc.chamarContasView(1);
    }//GEN-LAST:event_pendenciasMenuBTActionPerformed

    private void moviMenuBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviMenuBtActionPerformed
        ContaController cc = new ContaController();
        cc.chamarContasView(2);
    }//GEN-LAST:event_moviMenuBtActionPerformed

    private void frequenciaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequenciaBtActionPerformed
        FrequenciaController fc = new FrequenciaController();
        fc.chamarViewFrequencia();
    }//GEN-LAST:event_frequenciaBtActionPerformed

    private void freManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freManualActionPerformed
        FrequenciaController fc = new FrequenciaController();
        fc.chamaChekinManualForm();
    }//GEN-LAST:event_freManualActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         FrequenciaController fc = new FrequenciaController();
        fc.chamaChekinManualForm();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ataAtletasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataAtletasMenuActionPerformed
      FrequenciaController fc = new FrequenciaController();
        fc.chamarViewFrequencia();
    }//GEN-LAST:event_ataAtletasMenuActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
       SobreView sw = new SobreView(this, true);
       sw.setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void frequenciaDiariaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequenciaDiariaBtActionPerformed
        FrequenciaDataPicker fd = new FrequenciaDataPicker(this, true);
        fd.setVisible(true);
        
    }//GEN-LAST:event_frequenciaDiariaBtActionPerformed

    private void resumoMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumoMensalActionPerformed
        ContasResumo cr = new ContasResumo(null, true);
        cr.setVisible(true);
    }//GEN-LAST:event_resumoMensalActionPerformed
    /*FUNÇÃO DE ROTINA
    
     */

    public void carregarAta() {
        fc = new FrequenciaController();
        fc.gerarAta();

    }
    /*ATUALIA TODA AS CONTAS*/

    public void carregaRotinaContas() {
        cc = new ContaController();
        cc.rotinaAtualizarConta();
    }
    
    public void carregaAtualziarAtleta(){
        ac = new AtletaController();
        ac.carregarRotina();
    }
    /*FIM FUNÇÕES DE ROTINA*/

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
    private javax.swing.JMenuItem ataAtletasMenu;
    private javax.swing.JButton contasBt;
    private javax.swing.JMenuItem contasReceberMenu;
    private javax.swing.JButton freManual;
    private javax.swing.JButton frequenciaBt;
    private javax.swing.JMenuItem frequenciaDiariaBt;
    private javax.swing.JMenu frequenciaMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
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
    private javax.swing.JMenuItem moviMenuBt;
    private javax.swing.JMenuItem pendenciasMenuBT;
    private javax.swing.JMenuItem resumoMensal;
    // End of variables declaration//GEN-END:variables
}

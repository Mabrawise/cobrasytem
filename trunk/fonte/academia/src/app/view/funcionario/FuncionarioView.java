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
package app.view.funcionario;

import app.controller.FuncionarioController;
import conf.Global;
import java.util.ArrayList;
import java.util.List;
import app.model.Funcionario;
import app.model.FuncionarioModel;
import app.model.tablemodel.FuncionarioTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author WISE
 */
public class FuncionarioView extends javax.swing.JDialog {

    private FuncionarioTableModel fModel;
    public static String cpf;
    public static String nome;
    private static int linhaSelecionada;
    public static String Selecionado;

    /**
     * Creates new form FuncionarioView
     *
     * @param parent
     */
    public FuncionarioView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        //cria a lista com os produtos
        List<Funcionario> lista = new ArrayList<Funcionario>();
        FuncionarioModel fm = new FuncionarioModel();

        fm.Listar();

        for (Funcionario f : fm.funcs) {
            lista.add(new Funcionario(f.getCpf(), f.getNome(), f.getBairro(), f.getTelefone(), f.getLogin()));

        }

        //cria o modelo de Produto
        fModel = new FuncionarioTableModel(lista);
        //atribui o modelo à tabela
        funcionarioTable.setModel(fModel);/*Seta os tamanhos das colunas*/
        funcionarioTable.getColumnModel().getColumn(0).setPreferredWidth(350);
        funcionarioTable.getColumnModel().getColumn(1).setPreferredWidth(100);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGrupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        funcionarioTable = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        pesquisaTxt = new javax.swing.JTextField();
        radioNome = new javax.swing.JRadioButton();
        radioCpf = new javax.swing.JRadioButton();
        btPesquisar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionários");
        setAutoRequestFocus(false);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        funcionarioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        funcionarioTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        funcionarioTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funcionarioTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(funcionarioTable);

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-user2.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-trash.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.setEnabled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-refresh3.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btGrupo1.add(radioNome);
        radioNome.setToolTipText("Pesquisar por nome");
        radioNome.setSelected(true);
        radioNome.setText("Nome");

        btGrupo1.add(radioCpf);
        radioCpf.setToolTipText("Pesquisar por CPF.");
        radioCpf.setText("Cpf");

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-search.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-cross.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pesquisaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(radioNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioCpf))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioNome)
                    .addComponent(radioCpf)
                    .addComponent(btPesquisar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btFechar)))
                .addGap(27, 27, 27))
        );

        radioNome.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        this.setModal(false);// tira o foco obrigatório
        FuncionarioForm fm = new FuncionarioForm(null, true);
        fm.setVisible(true);
        /**
         * Depois que ser fechado *
         */


    }//GEN-LAST:event_btCadastrarActionPerformed

    private void funcionarioTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionarioTableMouseClicked
        
        
        if (funcionarioTable.getModel().getRowCount() > 0){
        
        linhaSelecionada = funcionarioTable.getSelectedRow();
        int coluna = funcionarioTable.getSelectedColumn();
        int count = evt.getClickCount();
        cpf = funcionarioTable.getModel().getValueAt(linhaSelecionada, 1).toString();
        nome = funcionarioTable.getModel().getValueAt(linhaSelecionada, 0).toString();
       

        btEditar.setEnabled(true);
        btRemover.setEnabled(true);

        if (count > 1) {
            FuncionarioController fc = new FuncionarioController();
            FuncionarioController.linhaSelecionadaTabelela = linhaSelecionada;
            fc.editar(cpf);

        }   
        }
    }//GEN-LAST:event_funcionarioTableMouseClicked

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        FuncionarioController fc = new FuncionarioController();
        int dialogResultado = JOptionPane.showConfirmDialog(null, "Deseja realmente remover?");
        if (dialogResultado == JOptionPane.YES_OPTION) {
            fc.deletar(cpf, linhaSelecionada);
            btEditar.setEnabled(false);
            btRemover.setEnabled(false);
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        FuncionarioController fc = new FuncionarioController();
        FuncionarioController.linhaSelecionadaTabelela = linhaSelecionada;
        fc.editar(cpf);
        btEditar.setEnabled(false);
        btRemover.setEnabled(false);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String pesquisa = pesquisaTxt.getText();

        if (radioCpf.isSelected() == true) {
            Selecionado = "cpf";
        }

        if (radioNome.isSelected() == true) {
            Selecionado = "nome";
        }
        
        FuncionarioController fc = new FuncionarioController();
        fc.filtrar(pesquisa, Selecionado);

    }//GEN-LAST:event_btPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FuncionarioView dialog = new FuncionarioView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btFechar;
    private javax.swing.ButtonGroup btGrupo1;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRemover;
    public static javax.swing.JTable funcionarioTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisaTxt;
    private javax.swing.JRadioButton radioCpf;
    private javax.swing.JRadioButton radioNome;
    // End of variables declaration//GEN-END:variables
}

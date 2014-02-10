
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
import app.model.Funcionario;
import app.model.tablemodel.FuncionarioTableModel;
import conf.Global;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import libs.Validador;

/**
 *
 * @author WISE
 */
public class FuncionarioForm extends javax.swing.JDialog {

    private FuncionarioTableModel fModel;
    private TableModel fModel2;

    /**
     * Creates new form FuncionarioForm
     */
    public FuncionarioForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        guiaPrincipal = new javax.swing.JTabbedPane();
        painelDados = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        lbCpf = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        enderecoTxt = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        cidadeTxt = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        bairroTxt = new javax.swing.JTextField();
        cpfTxt = new javax.swing.JFormattedTextField();
        telefoneTxt = new javax.swing.JFormattedTextField();
        cepTxt = new javax.swing.JFormattedTextField();
        painelAcesso = new javax.swing.JTabbedPane();
        painelAutenticacao = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        loginTxt = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        lbSenha2 = new javax.swing.JLabel();
        senha2Txt = new javax.swing.JPasswordField();
        senhaTxt = new javax.swing.JPasswordField();
        msgSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setAutoRequestFocus(false);
        setBackground(java.awt.Color.white);
        setName("funcionarioFormDialog"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-check.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-cross.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        guiaPrincipal.setBackground(new java.awt.Color(204, 255, 255));

        lbNome.setText("Nome");

        nomeTxt.setToolTipText("Limite de 100 caracteres.");

        lbCpf.setText("CPF");

        lbTelefone.setText("Telefone");

        lbCep.setText("CEP");

        lbEndereco.setText("Endereço");

        enderecoTxt.setToolTipText("Limite de caracteres: 100");

        lbCidade.setText("Cidade");

        cidadeTxt.setToolTipText("Limite de caracteres: 45");

        lbBairro.setText("Bairro");

        bairroTxt.setToolTipText("Limite de caracteres: 45");

        try {
            cpfTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefoneTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cepTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome)
                    .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(painelDadosLayout.createSequentialGroup()
                            .addComponent(lbCidade)
                            .addGap(127, 127, 127)
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bairroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbBairro))
                            .addGap(35, 35, 35))
                        .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadosLayout.createSequentialGroup()
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCpf)
                                .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTelefone)
                                .addComponent(telefoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCep)
                                .addComponent(cepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEndereco)
                            .addComponent(enderecoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(cidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(lbTelefone)
                    .addComponent(lbCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(lbCidade)
                    .addComponent(lbBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        guiaPrincipal.addTab("Dados do Funcionário", painelDados);

        painelAcesso.setBackground(new java.awt.Color(204, 255, 255));

        lbLogin.setText("Login");

        loginTxt.setToolTipText("Nome de acesso ao sistema. Limite de caracteres: 35");

        lbSenha.setText("Senha");

        lbSenha2.setText("Digite a senha novamente");

        senha2Txt.setToolTipText("Limite de caracteres: 32");

        senhaTxt.setToolTipText("Limite de caracteres: 32");

        javax.swing.GroupLayout painelAutenticacaoLayout = new javax.swing.GroupLayout(painelAutenticacao);
        painelAutenticacao.setLayout(painelAutenticacaoLayout);
        painelAutenticacaoLayout.setHorizontalGroup(
            painelAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAutenticacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbLogin)
                    .addComponent(loginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(lbSenha)
                    .addComponent(senhaTxt))
                .addGap(24, 24, 24)
                .addGroup(painelAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSenha2)
                    .addComponent(senha2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        painelAutenticacaoLayout.setVerticalGroup(
            painelAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAutenticacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(lbSenha2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        painelAcesso.addTab("Dados de Autenticação", painelAutenticacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelAcesso)
                    .addComponent(guiaPrincipal)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(msgSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(guiaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar)
                            .addComponent(btCancelar))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(msgSenha)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        String id, nome, cpf, endereco, cidade, bairro, cep, senha, senha2, telefone, login;
        String msg = "";

        Validador.valida_textField(nomeTxt, 100, true, false, 8, "Nome");
        Validador.valida_textField(enderecoTxt, 100, false, false, 1, "Endereço");
        Validador.valida_textField(cidadeTxt, 45, false, false, 2, "Cidade");
        Validador.valida_textField(bairroTxt, 45, false, false, 3, "Bairro");
        Validador.valida_textField(cepTxt, 15, true, false, 4, "CEP");
        Validador.validaSenha(senhaTxt, senha2Txt, 32, true, 5, "Senhas");
        Validador.valida_textField(telefoneTxt, 10, false, false, 6, "Telefone");
        Validador.valida_textField(loginTxt, 35, true, false, 7, "Login");
        Validador.cpf(cpfTxt.getText());

        if (Validador.erros == 0) {

            nome = nomeTxt.getText();
            cpf = cpfTxt.getText();
            endereco = enderecoTxt.getText();
            cidade = cidadeTxt.getText();
            bairro = bairroTxt.getText();
            cep = cepTxt.getText();
            senha = senhaTxt.getText();
            senha2 = senha2Txt.getText();
            telefone = telefoneTxt.getText();
            login = loginTxt.getText();

            Funcionario f = new Funcionario(cpf, nome, endereco, cidade, bairro, cep, telefone, login, senha);
            FuncionarioController fc = new FuncionarioController();
            if (fc.cadastro(f) == true) {

                nomeTxt.setText("");
                cpfTxt.setText("");
                enderecoTxt.setText("");
                cidadeTxt.setText("");
                bairroTxt.setText("");
                cepTxt.setText("");
                senhaTxt.setText("");
                senha2Txt.setText("");
                telefoneTxt.setText("");
                loginTxt.setText("");
            }

        } else {

            for (int i = 0; i < 9; i++) {//Lista os erros
                for (int j = 0; j < 3; j++) {
                    if (null != Validador.arrayErros[i][j]) {
                        msg = msg + Validador.arrayErros[i][j];
                    }

                }
            }

            JOptionPane.showMessageDialog(null, msg, "Erros", JOptionPane.ERROR_MESSAGE);
            Validador.erros = 0;
            for (int i = 0; i < 9; i++) {// Apaga os erros para não se acumular.
                for (int j = 0; j < 3; j++) {
                    if (null != Validador.arrayErros[i][j]) {
                        Validador.arrayErros[i][j] = "";
                    }

                }
            }
        }


    }//GEN-LAST:event_btCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FuncionarioForm dialog = new FuncionarioForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField bairroTxt;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JFormattedTextField cepTxt;
    private javax.swing.JTextField cidadeTxt;
    public javax.swing.JFormattedTextField cpfTxt;
    private javax.swing.JTextField enderecoTxt;
    private javax.swing.JTabbedPane guiaPrincipal;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbSenha2;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JTextField loginTxt;
    private javax.swing.JLabel msgSenha;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTabbedPane painelAcesso;
    private javax.swing.JPanel painelAutenticacao;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPasswordField senha2Txt;
    private javax.swing.JPasswordField senhaTxt;
    private javax.swing.JFormattedTextField telefoneTxt;
    // End of variables declaration//GEN-END:variables
}

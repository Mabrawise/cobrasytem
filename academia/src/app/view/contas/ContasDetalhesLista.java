/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.contas;

import app.model.contadetalhes.ContaDetalhes;
import app.model.tablemodel.ContasDetalhesTableModel;
import java.util.List;
import javax.swing.ListSelectionModel;

/**
 *
 * @author MafraWise
 */
public final class ContasDetalhesLista extends javax.swing.JDialog {

    /**
     * Creates new form ContasDetalhesLista
     *
     * @param parent
     * @param modal
     * @param idContasRecebeer Id da conta a receber.
     */
    public int idContasReceber;
    private ContasDetalhesTableModel cdtm;

    

    public void setIdContasReceber(int idContasReceber) {
        this.idContasReceber = idContasReceber;
    }

    public int getIdContasReceber() {
        return idContasReceber;
    }

    public ContasDetalhesLista(java.awt.Frame parent, boolean modal, int idContasReceber, List<ContaDetalhes> contas) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        carregarTabela(idContasReceber, contas);
    }

    public void carregarTabela(int idContasReceber, List<ContaDetalhes> contas) {
        cdtm = new ContasDetalhesTableModel(contas); /*Detalhes*/
        int qtd = cdtm.getRowCount();

        detalhesTabela.setModel(cdtm);
        detalhesTabela.removeColumn(detalhesTabela.getColumnModel().getColumn(0));
        detalhesTabela.removeColumn(detalhesTabela.getColumnModel().getColumn(2));
        detalhesTabela.getColumnModel().getColumn(0).setPreferredWidth(100); //NOME.
        detalhesTabela.getColumnModel().getColumn(1).setPreferredWidth(20); //NOME.

        detalhesTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        contaLabel.setText(String.valueOf(qtd));
        
        float total = 0;
        for (int i = 0; i < detalhesTabela.getModel().getRowCount(); i++) {
            total = total + (float) detalhesTabela.getModel().getValueAt(i, 2);
        }
        totalLabel.setText(String.valueOf(total));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalhesPainel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalhesTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        contaLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        fecharBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        detalhesPainel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da conta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        detalhesTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(detalhesTabela);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Atividades");

        contaLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        contaLabel.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Total: R$");

        totalLabel.setForeground(new java.awt.Color(0, 0, 255));
        totalLabel.setText("00.00");

        javax.swing.GroupLayout detalhesPainelLayout = new javax.swing.GroupLayout(detalhesPainel);
        detalhesPainel.setLayout(detalhesPainelLayout);
        detalhesPainelLayout.setHorizontalGroup(
            detalhesPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalhesPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detalhesPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detalhesPainelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(detalhesPainelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detalhesPainelLayout.setVerticalGroup(
            detalhesPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalhesPainelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detalhesPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(contaLabel)
                    .addGroup(detalhesPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(totalLabel))))
        );

        fecharBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-cross.png"))); // NOI18N
        fecharBt.setText("Fechar");
        fecharBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecharBt)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(detalhesPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detalhesPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecharBt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_fecharBtActionPerformed

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
            java.util.logging.Logger.getLogger(ContasDetalhesLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContasDetalhesLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContasDetalhesLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContasDetalhesLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ContasDetalhesLista dialog = new ContasDetalhesLista(new javax.swing.JFrame(), true, 0, null);
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
    private javax.swing.JLabel contaLabel;
    private javax.swing.JPanel detalhesPainel;
    private javax.swing.JTable detalhesTabela;
    private javax.swing.JButton fecharBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}

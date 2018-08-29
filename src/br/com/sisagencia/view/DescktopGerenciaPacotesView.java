/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisagencia.view;

import br.com.sisagencia.controller.PacoteviajemController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Jhonatan Nobre
 */
public class DescktopGerenciaPacotesView extends javax.swing.JInternalFrame {
private PacoteviajemController pct;
    /**
     * Creates new form NewJFrame
     */
    public DescktopGerenciaPacotesView() throws Exception {
        pct = new PacoteviajemController();
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jButtonCadastrar = new javax.swing.JButton();
        jButtonexcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDataIda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooserida = new com.toedter.calendar.JDateChooser();
        jDateChooserVolta = new com.toedter.calendar.JDateChooser();
        jLabelRoteiro = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelTipoPg = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldTipoPacote = new javax.swing.JTextField();
        jTextFieldTipoPg = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePacote = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRoteiro = new javax.swing.JTextArea();
        jLabelFundo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, 30));

        jButtonexcluir.setText("EXCLUIR");
        jButtonexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 110, 30));

        jButtonCancelar.setText("FECHAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 110, 30));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTitulo.setText("CADASTRO DE PACOTES DE VIAJENS");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabelDataIda.setText("Data de IDA:");
        getContentPane().add(jLabelDataIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 20));

        jLabel1.setText("Data Volta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, 20));
        getContentPane().add(jDateChooserida, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 140, 30));
        getContentPane().add(jDateChooserVolta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 140, 30));

        jLabelRoteiro.setText("Roteiro:");
        getContentPane().add(jLabelRoteiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabelTipo.setText("Tipo Pacote:");
        getContentPane().add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabelTipoPg.setText("Forma de Pagamento:");
        getContentPane().add(jLabelTipoPg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabelValor.setText("Valor Pagamento:");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${pct.pacoteviajem.tipoPacote}"), jTextFieldTipoPacote, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldTipoPacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoPacoteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTipoPacote, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 190, 30));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${pct.pacoteviajem.tipoPagamento}"), jTextFieldTipoPg, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        getContentPane().add(jTextFieldTipoPg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, 30));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${pct.pacoteviajem.valorPagamento}"), jTextFieldValor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, 30));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${pct.pacotesviajens}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTablePacote);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idvendaPacoteViajem}"));
        columnBinding.setColumnName("codigo Pacote");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${roteiroViajem}"));
        columnBinding.setColumnName("Roteiro Viajem");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoPacote}"));
        columnBinding.setColumnName("Tipo Pacote");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoPagamento}"));
        columnBinding.setColumnName("Forma de Pagamento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorPagamento}"));
        columnBinding.setColumnName("Valor Pagamento");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTablePacote);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 590, 150));

        jTextAreaRoteiro.setColumns(20);
        jTextAreaRoteiro.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${pct.pacoteviajem.roteiroViajem}"), jTextAreaRoteiro, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTextAreaRoteiro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 250, -1));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisagencia/imagens/fundoCadastro2.png"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
    try {
        pct.inserirPacoteviajem();
        JOptionPane.showMessageDialog(null, "Pacote de Viajem Cadastrado com Sucesso!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Pacote de Viajem!", "Alerta!", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(DescktopGerenciaPacotesView.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexcluirActionPerformed
       //NÃO DEIXA EXCLUIR SE NÃO ESTIVER SELECIONADO ALGUMA LINHA
        if (jTablePacote.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela para excluir !");
            return;
        }

        int result = JOptionPane.showConfirmDialog(this, "você tem certeza?", "Remover este Pacote de Viajens", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == 0) {
            try {
               int selecionado = jTablePacote.getSelectedRow();
               pct.removerPacoteviajem((int) jTablePacote.getValueAt(selecionado,0));
               JOptionPane.showMessageDialog(this, "Pacote de Viajem Removido com sucesso !");
               
            } catch (NoSuchAlgorithmException ex) {
               Logger.getLogger(DescktopGerenciarUsuariosView.class.getName()).log(Level.SEVERE, null, ex);
           } catch (Exception ex) {
               Logger.getLogger(DescktopGerenciarUsuariosView.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        //AQUI É QUANDO A TABELA É ATUALIZADA
        jTablePacote.revalidate();
    }//GEN-LAST:event_jButtonexcluirActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jTextFieldTipoPacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoPacoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTipoPacoteActionPerformed

    public PacoteviajemController getPct() {
        return pct;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonexcluir;
    private com.toedter.calendar.JDateChooser jDateChooserVolta;
    private com.toedter.calendar.JDateChooser jDateChooserida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDataIda;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelRoteiro;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTipoPg;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePacote;
    private javax.swing.JTextArea jTextAreaRoteiro;
    private javax.swing.JTextField jTextFieldTipoPacote;
    private javax.swing.JTextField jTextFieldTipoPg;
    private javax.swing.JTextField jTextFieldValor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
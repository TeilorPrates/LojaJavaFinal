/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Loja.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicos.ClienteServicos;
import model.Cliente;

/**
 *
 * @author 182120011
 */
//public class JFcadastro extends javax.swing.JFrame {
public class jtPessoas extends javax.swing.JFrame{
    public jtPessoas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jftfTelefone = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jbDeletar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPessoas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Identificação de Pessoas ");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("*Nome :");

        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("*CPF :");

        jtfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCpfActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("*Telefone :");

        jftfTelefone.setText("( )  -");
        jftfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfTelefoneActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("*Endereço :");

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jtPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Telefone", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPessoasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPessoas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                        .addComponent(jtfCpf))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbDeletar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbFechar)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDeletar)
                    .addComponent(jbEditar)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar)
                    .addComponent(jbFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

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

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jftfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfTelefoneActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        
        jbDeletar.setVisible(false);
        jbSalvar.setText("Confirmar");
        jbLimpar.setText("Cancelar");
        jtfCpf.setEnabled(false);
        int linha = jtPessoas.getSelectedRow();
        String cpf = (String) jtPessoas.getValueAt(linha, 0);
        ClienteServicos clienteServicos = ServicosFactory.getClienteServicos();
        Cliente c = clienteServicos.getClienteByDoc(cpf);
        jtfNome.setText(c.getNome());
        jtfCpf.setText(c.getCpf());
        jtfEndereco.setText(c.getEndereco());
        jftfTelefone.setText(c.getTelefone());
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        // TODO add your handling code here:
         this.dispose();
                  
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jtPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPessoasMouseClicked
        // TODO add your handling code here:
        jbDeletar.setVisible(true);
        jbEditar.setEnabled(true);
    }//GEN-LAST:event_jtPessoasMouseClicked

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        // TODO add your handling code here:
         int linha = jtPessoas.getSelectedRow();
        String cpf = (String) jtPessoas.getValueAt(linha, 0);
        ClienteServicos clienteS = ServicosFactory.getClienteServicos();
        String nome = clienteS.getClienteByDoc(cpf).getNome();
        Object[] btnMSG = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this,
                "Deseja realmente deletar " + nome, ".: Deletar :.",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, btnMSG, btnMSG[0]);
        if (resp == 0) {
            clienteS.deletarCliente(cpf);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Pessoa deletada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Ok, delete cancelado pelo usuário!");
        }
        jbLimpar.doClick();
        
        
    }//GEN-LAST:event_jbDeletarActionPerformed

     public void limparCampos() {
        jtfNome.setText("");
        jtfCpf.setText("");
        jtfEndereco.setText("");
        jftfTelefone.setText("");
    }
    
    
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
         if (validaInputs()) {
            String cpf = jtfCpf.getText();
            String nome = jtfNome.getText().toUpperCase();
            String telefone = jftfTelefone .getText();
            String endereco = jtfEndereco.getText().toUpperCase();

            ClienteServicos clienteS = ServicosFactory.getClienteServicos();
            Cliente c = new Cliente(0, nome, cpf, endereco, telefone);
            //Cliente c = new Cliente(ERROR, nome, cpf, endereco, telefone);
                    //new Pessoa(0, nome, cpf, endereco, telefone);
            if (jbSalvar.getText().equals("Salvar")) {
                clienteS.cadastroCliente(c);
                //clienteS.cadastroCliente(c);
            } else {
                clienteS.atualizarCliente(c);
            }
            addRowToTable();
            limparCampos();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCpfActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
          if (jbLimpar.getText().equals("Limpar")) {
            limparCampos();
        } else {
            jbEditar.setEnabled(false);
            jbLimpar.setText("Limpar");
            jbSalvar.setText("Salvar");
            limparCampos();
        }
    }//GEN-LAST:event_jbLimparActionPerformed

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
            java.util.logging.Logger.getLogger(jtPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jtPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jtPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jtPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jtPessoas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField jftfTelefone;
    private javax.swing.JTable jtPessoas;
    private javax.swing.JTextField jtfCpf;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables

    private boolean validaInputs() {
      if (jtfCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher CPF!");
            jtfCpf.requestFocus();
            return false;
        } else if (jtfNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher nome!");
            jtfNome.requestFocus();
            return false;
        } else if (jtfEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher endereço!");
            jtfEndereco.requestFocus();
            return false;
        } else if (jftfTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher telefone!");
            jftfTelefone.requestFocus();
            return false;
        }
        return true;        
    }

    private void addRowToTable() {
        
    }

   
}

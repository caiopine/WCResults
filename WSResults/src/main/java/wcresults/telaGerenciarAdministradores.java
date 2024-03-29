/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wcresults;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 822161401
 */
public class telaGerenciarAdministradores extends javax.swing.JFrame {

    /**
     * Creates new form gerenciarTimes
     */
    
    public telaGerenciarAdministradores() {
        super ("Tela Gerenciar Administradores");
        initComponents();
        setLocationRelativeTo(null);
        
        try {
           this.admsTable.setModel(new AdmsTableModel());
        }
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao buscar os administradores cadastrados.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cadastrarAdministradorButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        admsTable = new javax.swing.JTable();
        loginAdministradorTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        confSenhaPasswordField = new javax.swing.JPasswordField();
        excluirAdministradorButton = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        gerenciarTimesMenuBar = new javax.swing.JMenuBar();
        inicioMenu = new javax.swing.JMenu();
        gerenciarTimesMenu = new javax.swing.JMenu();
        gerenciarAdmsMenu = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WC Results");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ADMINISTRADOR");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cadastrarAdministradorButton.setBackground(new java.awt.Color(153, 0, 0));
        cadastrarAdministradorButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cadastrarAdministradorButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarAdministradorButton.setText("CADASTRAR");
        cadastrarAdministradorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAdministradorButtonActionPerformed(evt);
            }
        });

        admsTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        admsTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        admsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        admsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        admsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(admsTable);

        loginAdministradorTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loginAdministradorTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insira login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        loginAdministradorTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        loginAdministradorTextField.setName(""); // NOI18N
        loginAdministradorTextField.setSelectionEnd(11);
        loginAdministradorTextField.setSelectionStart(11);
        loginAdministradorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAdministradorTextFieldActionPerformed(evt);
            }
        });

        senhaPasswordField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insira a senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        senhaPasswordField.setPreferredSize(new java.awt.Dimension(64, 39));
        senhaPasswordField.setSelectionEnd(11);
        senhaPasswordField.setSelectionStart(11);

        confSenhaPasswordField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        confSenhaPasswordField.setToolTipText("");
        confSenhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirme a senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        confSenhaPasswordField.setPreferredSize(new java.awt.Dimension(64, 39));
        confSenhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confSenhaPasswordFieldActionPerformed(evt);
            }
        });

        excluirAdministradorButton.setBackground(new java.awt.Color(153, 0, 0));
        excluirAdministradorButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        excluirAdministradorButton.setForeground(new java.awt.Color(255, 255, 255));
        excluirAdministradorButton.setText("EXCLUIR");
        excluirAdministradorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirAdministradorButtonActionPerformed(evt);
            }
        });

        idTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idTextField.setToolTipText("");
        idTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginAdministradorTextField)
                    .addComponent(senhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confSenhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(cadastrarAdministradorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(idTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluirAdministradorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(loginAdministradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(senhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confSenhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarAdministradorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(excluirAdministradorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        gerenciarTimesMenuBar.setBackground(new java.awt.Color(204, 0, 0));
        gerenciarTimesMenuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gerenciarTimesMenuBar.setForeground(new java.awt.Color(255, 255, 255));
        gerenciarTimesMenuBar.setAutoscrolls(true);
        gerenciarTimesMenuBar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gerenciarTimesMenuBar.setMaximumSize(new java.awt.Dimension(378, 400));
        gerenciarTimesMenuBar.setMinimumSize(new java.awt.Dimension(378, 50));
        gerenciarTimesMenuBar.setName(""); // NOI18N
        gerenciarTimesMenuBar.setOpaque(true);
        gerenciarTimesMenuBar.setPreferredSize(new java.awt.Dimension(450, 30));

        inicioMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        inicioMenu.setForeground(new java.awt.Color(255, 255, 255));
        inicioMenu.setText("Início");
        inicioMenu.setAlignmentX(1.0F);
        inicioMenu.setAlignmentY(1.0F);
        inicioMenu.setAutoscrolls(true);
        inicioMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inicioMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicioMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inicioMenu.setMargin(new java.awt.Insets(6, 6, 6, 6));
        inicioMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMenuMouseClicked(evt);
            }
        });
        gerenciarTimesMenuBar.add(inicioMenu);

        gerenciarTimesMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        gerenciarTimesMenu.setText("Gerenciar Times");
        gerenciarTimesMenu.setAlignmentX(1.0F);
        gerenciarTimesMenu.setAlignmentY(1.0F);
        gerenciarTimesMenu.setAutoscrolls(true);
        gerenciarTimesMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gerenciarTimesMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciarTimesMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gerenciarTimesMenu.setMargin(new java.awt.Insets(6, 6, 6, 6));
        gerenciarTimesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerenciarTimesMenuMouseClicked(evt);
            }
        });
        gerenciarTimesMenuBar.add(gerenciarTimesMenu);

        gerenciarAdmsMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        gerenciarAdmsMenu.setText("Gerenciar Administradores");
        gerenciarAdmsMenu.setAlignmentX(1.0F);
        gerenciarAdmsMenu.setAlignmentY(1.0F);
        gerenciarAdmsMenu.setAutoscrolls(true);
        gerenciarAdmsMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gerenciarAdmsMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciarAdmsMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gerenciarAdmsMenu.setMargin(new java.awt.Insets(6, 6, 6, 6));
        gerenciarTimesMenuBar.add(gerenciarAdmsMenu);

        setJMenuBar(gerenciarTimesMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarAdministradorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAdministradorButtonActionPerformed
        String login = loginAdministradorTextField.getText();
        String senha = senhaPasswordField.getText();
        String confSenha = confSenhaPasswordField.getText();
        
        try {
            Administrador adm = new Administrador(login, senha);
            DAOAdm dao = new DAOAdm();
            if (dao.existeAdm(adm)) {
                JOptionPane.showMessageDialog(null, "Administrador já existente");
            }
            else if ("".equals(login)) {
                JOptionPane.showMessageDialog(null, "Preencha o login");
            }
            else if ("".equals(senha)) {
                JOptionPane.showMessageDialog(null, "Preencha os campos de senha corretamente");
            }
            else if (!senha.equals(confSenha)) {
                JOptionPane.showMessageDialog(null, "Senhas não coincidem");
            }
            else {
                dao.cadastrarAdm(adm);
                JOptionPane.showMessageDialog(null, "Administrador cadastrado");
                this.admsTable.setModel(new AdmsTableModel());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_cadastrarAdministradorButtonActionPerformed

    private void loginAdministradorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAdministradorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAdministradorTextFieldActionPerformed

    private void confSenhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confSenhaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confSenhaPasswordFieldActionPerformed

    private void gerenciarTimesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarTimesMenuMouseClicked
        // IR PARA A TELA GERENCIAR TIMES
        telaGerenciarTimes vs = new telaGerenciarTimes();
        vs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gerenciarTimesMenuMouseClicked

    private void inicioMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMenuMouseClicked
        // IR PARA A TELA PRINCIPAL ADM
        TelaPrincipalAdm vs = new TelaPrincipalAdm();
        vs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inicioMenuMouseClicked

    private void excluirAdministradorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirAdministradorButtonActionPerformed
        DAOAdm dao = new DAOAdm();
        try {
            ExcluirAdm();
            this.admsTable.setModel(new AdmsTableModel());
            JOptionPane.showMessageDialog (null, "Administrador excluído com sucesso.");
        } catch (Exception ex) {
            Logger.getLogger(telaGerenciarAdministradores.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog (null, "Erro.");
        }     
    }//GEN-LAST:event_excluirAdministradorButtonActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(telaGerenciarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGerenciarAdministradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable admsTable;
    private javax.swing.JButton cadastrarAdministradorButton;
    private javax.swing.JPasswordField confSenhaPasswordField;
    private javax.swing.JButton excluirAdministradorButton;
    private javax.swing.JMenu gerenciarAdmsMenu;
    private javax.swing.JMenu gerenciarTimesMenu;
    private javax.swing.JMenuBar gerenciarTimesMenuBar;
    private javax.swing.JTextField idTextField;
    private javax.swing.JMenu inicioMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField loginAdministradorTextField;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
    /*private void buscarAdministradores() {
        try {
            DAOAdm daoa = new DAOAdm();
            Administrador [] adms = daoa.obterAdministradores();
            idAdmsComboBox.setModel(new DefaultComboBoxModel<>(adms));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cursos indisponíveis, tente novamente mais tarde.");
            e.printStackTrace();
        }
    }*/
    
    public void ExcluirAdm() throws Exception {
        int id = Integer.parseInt(idTextField.getText());
        Administrador adm = new Administrador(id);
        adm.setId(id);
        
        DAOAdm dao = new DAOAdm();
        dao.excluirAdm(adm);
    }
}

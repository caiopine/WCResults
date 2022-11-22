/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wcresults;

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
        super ("Tela Gerenciar Times");
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        cadastrarAdministradorButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        administradoresTable = new javax.swing.JTable();
        loginAdministradorTextField = new javax.swing.JTextField();
        confSenhaPasswordField = new javax.swing.JPasswordField();
        senhaPasswordField = new javax.swing.JPasswordField();
        gerenciarTimesMenuBar = new javax.swing.JMenuBar();
        inicioMenu = new javax.swing.JMenu();
        gerenciarTimesMenu = new javax.swing.JMenu();
        gerenciarAdmsMenu = new javax.swing.JMenu();
        loginMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WC Results");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRAR ADMINISTRADOR");
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

        administradoresTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        administradoresTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        administradoresTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ADMINISTRADORES CADASTRADOS", "SENHAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        administradoresTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        administradoresTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(administradoresTable);
        if (administradoresTable.getColumnModel().getColumnCount() > 0) {
            administradoresTable.getColumnModel().getColumn(0).setMinWidth(50);
            administradoresTable.getColumnModel().getColumn(0).setMaxWidth(50);
            administradoresTable.getColumnModel().getColumn(1).setMinWidth(200);
            administradoresTable.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        loginAdministradorTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loginAdministradorTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insira login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        loginAdministradorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAdministradorTextFieldActionPerformed(evt);
            }
        });

        confSenhaPasswordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        confSenhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirme a senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        confSenhaPasswordField.setPreferredSize(new java.awt.Dimension(64, 39));

        senhaPasswordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insira a senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        senhaPasswordField.setPreferredSize(new java.awt.Dimension(64, 39));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(cadastrarAdministradorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginAdministradorTextField)
                            .addComponent(confSenhaPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(senhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(loginAdministradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confSenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cadastrarAdministradorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addContainerGap(15, Short.MAX_VALUE))
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

        loginMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        loginMenu.setText("Login Administrador");
        loginMenu.setAlignmentX(1.0F);
        loginMenu.setAlignmentY(1.0F);
        loginMenu.setAutoscrolls(true);
        loginMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginMenu.setMargin(new java.awt.Insets(6, 6, 6, 6));
        gerenciarTimesMenuBar.add(loginMenu);

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
            else if (!senha.equals(confSenha)) {
                JOptionPane.showMessageDialog(null, "Senhas não coincidem");
            }
            else {
                dao.cadastrarAdm(adm);
                JOptionPane.showMessageDialog(null, "Administrador cadastrado");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_cadastrarAdministradorButtonActionPerformed

    private void loginAdministradorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAdministradorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAdministradorTextFieldActionPerformed

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
    private javax.swing.JTable administradoresTable;
    private javax.swing.JButton cadastrarAdministradorButton;
    private javax.swing.JPasswordField confSenhaPasswordField;
    private javax.swing.JMenu gerenciarAdmsMenu;
    private javax.swing.JMenu gerenciarTimesMenu;
    private javax.swing.JMenuBar gerenciarTimesMenuBar;
    private javax.swing.JMenu inicioMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField loginAdministradorTextField;
    private javax.swing.JMenu loginMenu;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}

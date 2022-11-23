/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wcresults;

import java.awt.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 822161401
 */
public class telaGerenciarTimes extends javax.swing.JFrame {
    
    private List <Time> times;
        private String [] colunas = {"ID", "NOME"};
        
        public telaGerenciarTimes (Time time) throws Exception {
            DAOTime daot = new DAOTime();
            this.times = daot.buscarTimes(time);
        }
        
        public int getRowCount(){
            return times.size();
        }
        
        public int getColumnCount(){
            return 2;
        }
        
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return this.times.get(rowIndex).getId();
                case 1:
                    return this.times.get(rowIndex).getNome();
                default:
                    return null;
            }
        }
        
        public String getColumnName(int column) {
            return this.colunas[column];
        }
    
    public telaGerenciarTimes() {
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
        txtTime = new javax.swing.JTextField();
        cadastrarTimeButton = new javax.swing.JButton();
        importarOficiaisButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        timesTable = new javax.swing.JTable();
        idTimeComboBox = new javax.swing.JComboBox<>();
        gerenciarTimesMenuBar = new javax.swing.JMenuBar();
        inicioMenu = new javax.swing.JMenu();
        gerenciarTimesMenu = new javax.swing.JMenu();
        gerenciarAdmsMenu = new javax.swing.JMenu();
        loginMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WC Results");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ALTERAR TIME CADASTRADO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtTime.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTime.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insira o nome do time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        cadastrarTimeButton.setBackground(new java.awt.Color(153, 0, 0));
        cadastrarTimeButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cadastrarTimeButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarTimeButton.setText("ALTERAR TIME");
        cadastrarTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarTimeButtonActionPerformed(evt);
            }
        });

        importarOficiaisButton.setBackground(new java.awt.Color(153, 0, 0));
        importarOficiaisButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        importarOficiaisButton.setForeground(new java.awt.Color(255, 255, 255));
        importarOficiaisButton.setText("IMPORTAR OFICIAIS");
        importarOficiaisButton.setOpaque(true);
        importarOficiaisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarOficiaisButtonActionPerformed(evt);
            }
        });

        timesTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        timesTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME DO TIME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        timesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        timesTable.setShowGrid(true);
        timesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(timesTable);
        if (timesTable.getColumnModel().getColumnCount() > 0) {
            timesTable.getColumnModel().getColumn(0).setMinWidth(50);
            timesTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        idTimeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        idTimeComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        idTimeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTimeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(importarOficiaisButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrarTimeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(idTimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(cadastrarTimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(importarOficiaisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        gerenciarTimesMenuBar.setBackground(new java.awt.Color(204, 0, 0));
        gerenciarTimesMenuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gerenciarTimesMenuBar.setForeground(new java.awt.Color(255, 255, 255));
        gerenciarTimesMenuBar.setAutoscrolls(true);
        gerenciarTimesMenuBar.setMaximumSize(new java.awt.Dimension(378, 400));
        gerenciarTimesMenuBar.setMinimumSize(new java.awt.Dimension(378, 50));
        gerenciarTimesMenuBar.setName(""); // NOI18N
        gerenciarTimesMenuBar.setOpaque(true);
        gerenciarTimesMenuBar.setPreferredSize(new java.awt.Dimension(500, 30));

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
        inicioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioMenuActionPerformed(evt);
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
        gerenciarTimesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarTimesMenuActionPerformed(evt);
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
        gerenciarAdmsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarAdmsMenuActionPerformed(evt);
            }
        });
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
        loginMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuActionPerformed(evt);
            }
        });
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTimeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTimeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTimeComboBoxActionPerformed

    private void importarOficiaisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarOficiaisButtonActionPerformed
        //SUBSTITUIR COM OS 32 TIMES OFICIAS DA COPA A TABELA DE TIMES

    }//GEN-LAST:event_importarOficiaisButtonActionPerformed

    private void cadastrarTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarTimeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarTimeButtonActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed

    }//GEN-LAST:event_txtTimeActionPerformed

    private void inicioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioMenuActionPerformed
        // Chamando a Tela Principal de Administrador
        new TelaPrincipalAdm().setVisible(true);
        dispose();
    }//GEN-LAST:event_inicioMenuActionPerformed

    private void gerenciarTimesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarTimesMenuActionPerformed

    }//GEN-LAST:event_gerenciarTimesMenuActionPerformed

    private void gerenciarAdmsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarAdmsMenuActionPerformed
        // Ir para a tela Gerenciar Administradores
        new telaGerenciarAdministradores().setVisible(true);
        dispose();
    }//GEN-LAST:event_gerenciarAdmsMenuActionPerformed

    private void loginMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuActionPerformed
        // TODO add your handling code here
        new telaGerenciarAdministradores().setVisible(true);
        dispose();
    }//GEN-LAST:event_loginMenuActionPerformed

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
            java.util.logging.Logger.getLogger(telaGerenciarTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGerenciarTimes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarTimeButton;
    private javax.swing.JMenu gerenciarAdmsMenu;
    private javax.swing.JMenu gerenciarTimesMenu;
    private javax.swing.JMenuBar gerenciarTimesMenuBar;
    private javax.swing.JComboBox<String> idTimeComboBox;
    private javax.swing.JButton importarOficiaisButton;
    private javax.swing.JMenu inicioMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu loginMenu;
    private javax.swing.JTable timesTable;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}

    public class Time extends AbstractTableModel{
        

    }

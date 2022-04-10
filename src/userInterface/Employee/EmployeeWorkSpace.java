/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Employee;

import Business.Employee.Employee;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vamsimokari
 */
public class EmployeeWorkSpace extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Employee loginEmp;
    public EmployeeWorkSpace(JPanel userProcessContainer, Employee emp) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.loginEmp = emp;
        loggedInEmp.setText(this.loginEmp.getUserName());
        Date today = new Date();
        System.out.println(emp.getEmployedDate());
        System.out.println(today);
//        if(emp.getEmployedDate().before(today)) {
//            JOptionPane.showMessageDialog(null, "You are towards end of Your Employment Please Re-new");
//        }
//        if(emp.getEmployedDate().equals(today)) {
//            JOptionPane.showMessageDialog(null, "Welcome on your First Day");
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAddclient = new javax.swing.JButton();
        btnManageclient = new javax.swing.JButton();
        loggedInEmp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Employee Workspace");

        btnAddclient.setBackground(new java.awt.Color(115, 195, 137));
        btnAddclient.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddclient.setText("Add Client");
        btnAddclient.setPreferredSize(new java.awt.Dimension(160, 30));
        btnAddclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddclientActionPerformed(evt);
            }
        });

        btnManageclient.setBackground(new java.awt.Color(115, 195, 137));
        btnManageclient.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnManageclient.setText("Manage Client");
        btnManageclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageclientActionPerformed(evt);
            }
        });

        loggedInEmp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Login User: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(717, 717, 717)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnManageclient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddclient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(304, 304, 304)))
                .addComponent(loggedInEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loggedInEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnAddclient, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageclient, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddclientActionPerformed
        // TODO add your handling code here:
        AddClientJPanel addclientJPanel = new AddClientJPanel(userProcessContainer);
        userProcessContainer.add("AddclientJPanel", addclientJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddclientActionPerformed

    private void btnManageclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageclientActionPerformed
        // TODO add your handling code here:
        ManageClients manageclientJPanel = new ManageClients(userProcessContainer);
        userProcessContainer.add("ManageclientJPanel", manageclientJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageclientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddclient;
    private javax.swing.JButton btnManageclient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loggedInEmp;
    // End of variables declaration//GEN-END:variables
}
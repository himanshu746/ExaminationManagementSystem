/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems.ems;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author himanshu
 */
public class ViewStudents extends javax.swing.JFrame {
    
    private ArrayList<Integer> studentIds;
    private DefaultTableModel myModel;
    private int companyId;

    /**
     * Creates new form ViewStudents
     */
    public ViewStudents() {
        initComponents();
        
        titleLabel.setHorizontalAlignment(CENTER);
        
        studentList.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        studentList.getColumnModel().getColumn(0).setMinWidth(50);
        studentList.getColumnModel().getColumn(0).setMaxWidth(75);
        studentList.getColumnModel().getColumn(1).setMinWidth(100);
        //studentList.getColumnModel().getColumn(1).setMaxWidth(200);
        studentList.getColumnModel().getColumn(2).setMinWidth(100);
        //studentList.getColumnModel().getColumn(2).setMaxWidth(200); 
        studentList.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
        studentIds = new ArrayList<>();
        myModel = (DefaultTableModel) studentList.getModel();
        
        int companyId = 1;
        
        fillTableWithStudentInfos(companyId);
    }
    
    public ViewStudents(int companyId) {
        initComponents();
        
        this.companyId = companyId;
        titleLabel.setHorizontalAlignment(CENTER);
        
        studentList.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        studentList.getColumnModel().getColumn(0).setMinWidth(50);
        studentList.getColumnModel().getColumn(0).setMaxWidth(75);
        studentList.getColumnModel().getColumn(1).setMinWidth(100);
        //studentList.getColumnModel().getColumn(1).setMaxWidth(200);
        studentList.getColumnModel().getColumn(2).setMinWidth(100);
        //studentList.getColumnModel().getColumn(2).setMaxWidth(200); 
        studentList.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
        studentIds = new ArrayList<>();
        myModel = (DefaultTableModel) studentList.getModel();
        
        fillTableWithStudentInfos(this.companyId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        degreeLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        marksLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        contactNumberLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        emailIdLabel = new javax.swing.JLabel();
        viewProfileButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        titleLabel.setText("Student list");

        studentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Student Name", "Applied for"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentList);
        if (studentList.getColumnModel().getColumnCount() > 0) {
            studentList.getColumnModel().getColumn(0).setResizable(false);
            studentList.getColumnModel().getColumn(1).setResizable(false);
            studentList.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("First name:");

        jLabel3.setText("Last name:");

        jLabel6.setText("Date of birth:");

        jLabel8.setText("Degree:");

        jLabel10.setText("Marks:");

        jLabel12.setText("Contact number:");

        jLabel14.setText("Email address:");

        viewProfileButton.setText("View profile");
        viewProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(95, 95, 95)
                                .addComponent(lastNameLabel)
                                .addGap(179, 179, 179))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailIdLabel)
                                    .addComponent(contactNumberLabel)
                                    .addComponent(marksLabel)
                                    .addComponent(degreeLabel)
                                    .addComponent(dobLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewProfileButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dobLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(degreeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(marksLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(contactNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(emailIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileButtonActionPerformed
        int index = studentList.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Select student and then click here");
        } else {
            int studentId = studentIds.get(index);
            showStudentInfo(studentId);
        }
    }//GEN-LAST:event_viewProfileButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JLabel degreeLabel;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel emailIdLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel marksLabel;
    private javax.swing.JTable studentList;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewProfileButton;
    // End of variables declaration//GEN-END:variables

    private void fillTableWithStudentInfos(int companyId) {
        try {
            CsvReader applications = new CsvReader("applications.csv");
            
            applications.readHeaders();
            
            int sn = 0;
            
            while (applications.readRecord()) {
//                jobIds.add(Integer.parseInt(jobs.get("id")));
//                companyIds.add(Integer.parseInt(jobs.get("companyId")));
//                profileLinks.add(jobs.get("profileLink"));
                int cI = Integer.parseInt(applications.get("companyId"));
                if (companyId == cI) {
                    studentIds.add(Integer.parseInt(applications.get("studentId")));
                    String name = applications.get("studentName");
                    String JT = applications.get("jobTitle");
                    myModel.addRow(new String[]{String.valueOf(sn + 1), name, JT});
                    sn++;
                }
            }
            
            applications.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error displaying jobs");
            dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reding database");
            dispose();
        }
    }

    private void showStudentInfo(int studentId) {
        try {
            CsvReader students = new CsvReader("students.csv");
            students.readHeaders();
            while(students.readRecord()) {
                String idInString = students.get("id");
                int id = Integer.parseInt(idInString);
                if (id == studentId) {
                    firstNameLabel.setText(students.get("firstName"));
                    lastNameLabel.setText(students.get("lastName"));
                    
                    long dob = Long.parseLong(students.get("dob"));
        
                    SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, YYYY");
                    String formattedDate = formatter.format(new Date(dob));
                    dobLabel.setText(formattedDate);
                    
                    degreeLabel.setText(students.get("degree"));
                    marksLabel.setText(students.get("marks"));
                    contactNumberLabel.setText(students.get("contactNumber"));
                    emailIdLabel.setText(students.get("emailId"));
                    break;
                }
            }
            students.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Unable to access database");
            return;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reading database");
            return;
        }
    }
}

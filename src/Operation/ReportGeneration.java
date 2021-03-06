/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import lms.*;
import lms.Validation;

/**
 *
 * @author HP
 */
public class ReportGeneration extends javax.swing.JPanel {

    FileDirectory dirctory;
    
    JFrame frame;
    public ReportGeneration(JFrame frame) {
        initComponents();
        dirctory=new FileDirectory();
        this.frame=frame;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentReport = new javax.swing.JButton();
        labReport = new javax.swing.JButton();

        studentReport.setFont(new Font("Times New Roman",Font.BOLD,20));
        studentReport.setBackground(new java.awt.Color(255, 255, 255));
        studentReport.setText("<html>Student<br/>Report</html>");
        studentReport.setIcon(new ImageIcon(getClass().getResource("/ImageIcons/studentReport.png")));
        studentReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentReportActionPerformed(evt);
            }
        });

        labReport.setFont(new Font("Times New Roman",Font.BOLD,20));
        labReport.setBackground(new java.awt.Color(255, 255, 255));
        labReport.setText("<html>Lab<br/>Report</html>");
        labReport.setIcon(new ImageIcon(getClass().getResource("/ImageIcons/LabReport.png")));
        labReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(studentReport, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labReport, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentReport, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labReport, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void studentReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentReportActionPerformed
        
        System.out.println("Director"+dirctory.getDirectoryPath());
       StudentReport sdr=new StudentReport(dirctory.getDirectoryPath(),frame);
       frame.setEnabled(false);
       
    }//GEN-LAST:event_studentReportActionPerformed

    private void labReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labReportActionPerformed
        LabReport labReport=new LabReport(dirctory.getDirectoryPath(),frame);
       frame.setEnabled(false);
    }//GEN-LAST:event_labReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton labReport;
    private javax.swing.JButton studentReport;
    // End of variables declaration//GEN-END:variables


    
}
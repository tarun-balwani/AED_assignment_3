/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jinal
 */
public class ViewStudentFeedbackDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCollegePanel
     */
    public ViewStudentFeedbackDetailsPanel() {
        initComponents();
        
         generateTableForListOfStudentFeedbackDetails();
    }
     private void generateTableForListOfStudentFeedbackDetails(){
         
        DefaultTableModel dtm = (DefaultTableModel)tblViewStudentFeedbackDetailsPanel.getModel();      
        Object row[] = new Object[4];
        
        dtm.setRowCount(0);
        
        row[0] = "1561792";
        row[1] = "Web Design and UX Engineering";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row);
        
        
        row[0] = "1561793";
        row[1] = "DWBI";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row);
        
        row[0] = "1561794";
        row[1] = "Web Design and UX Engineering";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row);  
        
        row[0] = "1561795";
        row[1] = "Web Design and UX Engineering";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row); 
        
        
         
        row[0] = "1561796";
        row[1] = "Program Structures Algorithm";
        row[2] = "5";
        row[3] = "Best";
        dtm.addRow(row); 
        
        row[0] = "1561797";
        row[1] = "Data Science Engineering methods and tools";
        row[2] = "5";
        row[3] = "Best";
        dtm.addRow(row); 
        
        
        row[0] = "1561798";
        row[1] = "Data Science Engineering methods and tools";
        row[2] = "5";
        row[3] = "Best";
        dtm.addRow(row); 
        
        
        row[0] = "1561799";
        row[1] = "DWBI";
        row[2] = "3";
        row[3] = "Could Be Better";
        dtm.addRow(row); 
        
        
        row[0] = "1561800";
        row[1] = "Web Development tools";
        row[2] = "3";
        row[3] = "Could Be Better";
        dtm.addRow(row); 
        
        row[0] = "1561801";
        row[1] = "Program Structures Algorithm";
        row[2] = "5";
        row[3] = "Best";
        dtm.addRow(row); 
        
        row[0] = "1561802";
        row[1] = "Concepts of Object Oriented Design";
        row[2] = "5";
        row[3] = "Best";
        dtm.addRow(row); 
        
        row[0] = "1561803";
        row[1] = "Concepts of Object Oriented Design";
        row[2] = "3";
        row[3] = "Could Be Better";
        dtm.addRow(row); 
             
        row[0] = "1561804";
        row[1] = "Cloud computing";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row); 
                  
        row[0] = "1561805";
        row[1] = "Concepts of Object Oriented Design";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row); 
        
        
        row[0] = "1561806";
        row[1] = "Concepts of Object Oriented Design";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row); 
        
        
        row[0] = "1561807";
        row[1] = "Big Data Engineering";
        row[2] = "3";
        row[3] = "Could be better";
        dtm.addRow(row); 
        
        
        row[0] = "1561808";
        row[1] = "DWBI";
        row[2] = "3";
        row[3] = "Could be better";
        dtm.addRow(row); 
     
        row[0] = "1561809";
        row[1] = "Cloud computing";
        row[2] = "3";
        row[3] = "Could be better";
        dtm.addRow(row); 
      
        row[0] = "1561810";
        row[1] = "Program Structures Algorithm";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row);  
        
        row[0] = "1561811";
        row[1] = "Web Development tools";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row);  
      
        
        row[0] = "1561812";
        row[1] = "Web Development tools";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row); 
        
        
        row[0] = "1561813";
        row[1] = "Cloud computing";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row); 
        
        row[0] = "1561814";
        row[1] = "Application Engineering Development";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row); 

        row[0] = "1561815";
        row[1] = "Cloud computing";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row); 
   
        row[0] = "1561816";
        row[1] = "Big Data Engineering";
        row[2] = "3";
        row[3] = "Could be better";
        dtm.addRow(row); 

        row[0] = "1561818";
        row[1] = "Application Engineering Development";
        row[2] = "2";
        row[3] = "Needs Improvement";
        dtm.addRow(row); 
        
        
        
        row[0] = "1561819";
        row[1] = "Application Engineering Development";
        row[2] = "2";
        row[3] = "Needs Improvement";
        dtm.addRow(row); 
        
        row[0] = "1561820";
        row[1] = "Big Data Engineering";
        row[2] = "3";
        row[3] = "Could be better";
        dtm.addRow(row); 

        row[0] = "1561821";
        row[1] = "Web Design and UX Engineering";
        row[2] = "4";
        row[3] = "Good";
        dtm.addRow(row); 

        
        row[0] = "1561822";
        row[1] = "DWBI";
        row[2] = "5";
        row[3] = "Best";
        dtm.addRow(row); 
        
        row[0] = "1561823";
        row[1] = "Big Data Engineering";
        row[2] = "5";
        row[3] = "Best";
        dtm.addRow(row); 
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewStudentFeedbackDetailsPanel = new javax.swing.JTable();
        lblViewListOfStudentEnrollmentDetails = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        tblViewStudentFeedbackDetailsPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUID", "Course Name", "Ratings", "Remarksl"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewStudentFeedbackDetailsPanel);

        lblViewListOfStudentEnrollmentDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblViewListOfStudentEnrollmentDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblViewListOfStudentEnrollmentDetails.setText("View List of Student Feedback Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lblViewListOfStudentEnrollmentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblViewListOfStudentEnrollmentDetails)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewListOfStudentEnrollmentDetails;
    private javax.swing.JTable tblViewStudentFeedbackDetailsPanel;
    // End of variables declaration//GEN-END:variables
}

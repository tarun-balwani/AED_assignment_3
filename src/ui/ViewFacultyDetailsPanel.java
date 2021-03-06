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
public class ViewFacultyDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCollegePanel
     */
    public ViewFacultyDetailsPanel() {
        initComponents();
        
           generateTableForListOfFaculty();
    }

     private void generateTableForListOfFaculty(){
        DefaultTableModel dtm = (DefaultTableModel)tblViewFacultyPanel.getModel();
         
        Object row[] = new Object[4];
        
        
          dtm.setRowCount(0);
                          
           row[0] = "114895";
           row[1] = "Kal";
           row[2] = "Bugara";
           row[3] = "Application Engineering Development"; 
           dtm.addRow(row);
           
           
           row[0] = "114896";
           row[1] = "Vishal";
           row[2] = "Chawla";
           row[3] = "Web Design and UX Engineering"; 
           dtm.addRow(row);
           
           row[0] = "114897";
           row[1] = "Amuthan";
           row[2] = "Arularaj";
           row[3] = "Web Design and UX Engineering"; 
           dtm.addRow(row);  
        
           row[0] = "114898";
           row[1] = "Daniel";
           row[2] = "Peters";
           row[3] = "Concepts of Object Oriented Design"; 
           dtm.addRow(row); 
           
           row[0] = "114890";
           row[1] = "Nick";
           row[2] = "Brown";
           row[3] = "Program structures and algorithms"; 
           dtm.addRow(row); 
           
           row[0] = "114891";
           row[1] = "Robin";
           row[2] = "Hillyard";
           row[3] = "Program structures and algorithms"; 
           dtm.addRow(row); 
           
           row[0] = "114892";
           row[1] = "Aretha";
           row[2] = "Rocque";
           row[3] = "DWBI"; 
           dtm.addRow(row); 
           
           
           row[0] = "114895";
           row[1] = "Praneet";
           row[2] = "Breganza";
           row[3] = "DWBI"; 
           dtm.addRow(row); 
           
           
           row[0] = "114871";
           row[1] = "Dino";
           row[2] = "K";
           row[3] = "Data Science Engineering methods and tools"; 
           dtm.addRow(row); 
           
           row[0] = "114871";
           row[1] = "Dino";
           row[2] = "K";
           row[3] = "Data Science Engineering methods and tools"; 
           dtm.addRow(row); 
           
          row[0] = "114872";
           row[1] = "Shinzo";
           row[2] = "Abe";
           row[3] = "Data Science Engineering methods and tools"; 
           dtm.addRow(row); 
           
           row[0] = "114873";
           row[1] = "Lee chong";
           row[2] = "We";
           row[3] = "Web Development tools"; 
           dtm.addRow(row); 
           
            row[0] = "114874";
           row[1] = "Severus";
           row[2] = "Snape";
           row[3] = "Big Data Engineering"; 
           dtm.addRow(row); 
           
            row[0] = "114875";
           row[1] = "Nitish";
           row[2] = "Parikh";
           row[3] = "Cloud computing"; 
           dtm.addRow(row); 
           
           
            row[0] = "114876";
           row[1] = "Mohan";
           row[2] = "Nanwani";
           row[3] = "Web Development tools"; 
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
        tblViewFacultyPanel = new javax.swing.JTable();
        lblViewListOfFacultyDetails = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        tblViewFacultyPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUID", "First Name", "Last Name", "Course Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewFacultyPanel);

        lblViewListOfFacultyDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblViewListOfFacultyDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblViewListOfFacultyDetails.setText("View List of Faculty Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lblViewListOfFacultyDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblViewListOfFacultyDetails)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewListOfFacultyDetails;
    private javax.swing.JTable tblViewFacultyPanel;
    // End of variables declaration//GEN-END:variables
}

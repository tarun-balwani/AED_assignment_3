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
public class ViewClassesPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCollegePanel
     */
    public ViewClassesPanel() {
        initComponents();
        
          generateTableForListOfClasses();
    }
    
      private void generateTableForListOfClasses()
     {
         DefaultTableModel dtm = (DefaultTableModel)tblViewClassesPanel.getModel();
         
        Object row[] = new Object[3];
         
        
         dtm.setRowCount(0);
                          
           row[0] = "1";
           row[1] = "Application Engineering Development";
           row[2] = "Kal Bugrara";    
           dtm.addRow(row);
           
           
           row[0] = "2";
           row[1] = "Web Design and UX Engineering";
           row[2] = "Vishal Chawla";    
           dtm.addRow(row);
           
           row[0] = "3";
           row[1] = "Concepts of Object Oriented Design";
           row[2] = "Amuthan Arulraj";    
           dtm.addRow(row);
           
           row[0] = "4";
           row[1] = "Concepts of Object Oriented Design";
           row[2] = "Daniel Peters";    
           dtm.addRow(row);
         
           row[0] = "5";
           row[1] = "Program Structures Algorithm";
           row[2] = "Nick Brown";    
           dtm.addRow(row);
           
        
           row[0] = "6";
           row[1] = "Program Structures Algorithm";
           row[2] = "Robin Hillyard";    
           dtm.addRow(row);
           
           row[0] = "7";
           row[1] = "DWBI";
           row[2] = "Aretha Rocque";    
           dtm.addRow(row);
           
           row[0] = "8";
           row[1] = "DWBI";
           row[2] = "Praneet Breganza";    
           dtm.addRow(row);
                       
           row[0] = "9";
           row[1] = "Data Science Engineering methods and tools";
           row[2] = "Dino K";    
           dtm.addRow(row);
           
           row[0] = "10";
           row[1] = "Data Science Engineering methods and tools";
           row[2] = "Shinzo Abe";    
           dtm.addRow(row);
           
           
           row[0] = "11";
           row[1] = "Web Development tools";
           row[2] = "Lee chong We";    
           dtm.addRow(row);
           
           row[0] = "12";
           row[1] = "Big Data Engineering";
           row[2] = "Severus Snape";    
           dtm.addRow(row);
           
           row[0] = "13";
           row[1] = "Cloud computing";
           row[2] = "Nitish Parikh";    
           dtm.addRow(row);
           
           row[0] = "14";
           row[1] = "Web Development tools";
           row[2] = "Mohan Nanwani";    
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
        tblViewClassesPanel = new javax.swing.JTable();
        lblViewListOfClasses = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        tblViewClassesPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Class Unique ID", "Class Name", "Faculty Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewClassesPanel);

        lblViewListOfClasses.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblViewListOfClasses.setForeground(new java.awt.Color(255, 255, 255));
        lblViewListOfClasses.setText("View List of Classes");

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
                        .addGap(101, 101, 101)
                        .addComponent(lblViewListOfClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblViewListOfClasses)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewListOfClasses;
    private javax.swing.JTable tblViewClassesPanel;
    // End of variables declaration//GEN-END:variables
}

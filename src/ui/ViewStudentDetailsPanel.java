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
public class ViewStudentDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCollegePanel
     */
    public ViewStudentDetailsPanel() {
        initComponents();
         generateTableForListOfStudents();
    }
    
    
         private void generateTableForListOfStudents()
     {
         DefaultTableModel dtm = (DefaultTableModel)tblViewStudentPanel.getModel();
         
        Object row[] = new Object[4];
         
        
         dtm.setRowCount(0);
                          
           row[0] = "1561792";
           row[1] = "Tarun";
           row[2] = "Balwani";
           row[3] = "Web Design and UX Engineering"; 
           dtm.addRow(row);
           
           row[0] = "1561793";
           row[1] = "Sneha";
           row[2] = "Methwani";
           row[3] = "DWBI"; 
           dtm.addRow(row);
        
                              
           row[0] = "1561794";
           row[1] = "Jinal";
           row[2] = "Mamaniya";
           row[3] = "Web Design and UX Engineering"; 
           dtm.addRow(row);
           
           
           row[0] = "1561795";
           row[1] = "Virendra";
           row[2] = "Rathore";
           row[3] = "Web Design and UX Engineering"; 
           dtm.addRow(row);
           
           row[0] = "1561796";
           row[1] = "Kiran";
           row[2] = "Reddy";
           row[3] = "Data Science Engineering methods and tools"; 
           dtm.addRow(row);
           
           row[0] = "1561796";
           row[1] = "Diksha";
           row[2] = "Bhatia";
           row[3] = "Program Structures Algorithm"; 
           dtm.addRow(row);
           
           row[0] = "1561797";
           row[1] = "Harshil";
           row[2] = "Patel";
           row[3] = "Data Science Engineering methods and tools"; 
           dtm.addRow(row);
           
           
           row[0] = "1561798";
           row[1] = "Pooja";
           row[2] = "Singh";
           row[3] = "Data Science Engineering methods and tools"; 
           dtm.addRow(row);
           
           
           row[0] = "1561799";
           row[1] = "Aravind";
           row[2] = "Poornachandra";
           row[3] = "DWBI"; 
           dtm.addRow(row);
           
           row[0] = "1561800";
           row[1] = "Piyush";
           row[2] = "Pohekar";
           row[3] = "Web Development tools"; 
           dtm.addRow(row);
           
           row[0] = "1561801";
           row[1] = "Akshay";
           row[2] = "Bayes";
           row[3] = "Program Structures Algorithm"; 
           dtm.addRow(row); 
           
           
           
           
           row[0] = "1561802";
           row[1] = "Ray";
           row[2] = "Ban";
           row[3] = "Concepts of Object Oriented Design"; 
           dtm.addRow(row); 
           
           
           
           row[0] = "1561803";
           row[1] = "Loius";
           row[2] = "Vuitton";
           row[3] = "Concepts of Object Oriented Design"; 
           dtm.addRow(row); 
           
           
           row[0] = "1561804";
           row[1] = "Calvin";
           row[2] = "Klein";
           row[3] = "Cloud computing"; 
           dtm.addRow(row); 
           
           row[0] = "1561805";
           row[1] = "Vinit";
           row[2] = "Harsora";
           row[3] = "Concepts of Object Oriented Design"; 
           dtm.addRow(row); 
             
           row[0] = "1561806";
           row[1] = "Pratik";
           row[2] = "Nakave";
           row[3] = "Concepts of Object Oriented Design"; 
           dtm.addRow(row); 
           

           
           
           row[0] = "1561807";
           row[1] = "Chinmay";
           row[2] = "Ashtikar";
           row[3] = "Big Data Engineering"; 
           dtm.addRow(row); 
           
           
           row[0] = "1561808";
           row[1] = "Tejas";
           row[2] = "Wate";
           row[3] = "DWBI"; 
           dtm.addRow(row); 
           
           
           row[0] = "1561809";
           row[1] = "Dinesh";
           row[2] = "Reddy";
           row[3] = "Cloud computing"; 
           dtm.addRow(row); 
           
           
           
           row[0] = "1561810";
           row[1] = "Nithin";
           row[2] = "Reddy";
           row[3] = "Program Structures Algorithm"; 
           dtm.addRow(row); 
           
           row[0] = "1561811";
           row[1] = "Charan";
           row[2] = "Reddy";
           row[3] = "Web Development tools"; 
           dtm.addRow(row); 
           
           
           row[0] = "1561812";
           row[1] = "Shivangee";
           row[2] = "Nagar";
           row[3] = "Web Development tools"; 
           dtm.addRow(row); 
           
           
           row[0] = "1561813";
           row[1] = "Aishwarya";
           row[2] = "Balyaya";
           row[3] = "Cloud computing"; 
           dtm.addRow(row); 
           
            row[0] = "1561814";
           row[1] = "Mohan";
           row[2] = "Nanwani";
           row[3] = "Application Engineering Development"; 
           dtm.addRow(row); 
           
            row[0] = "1561815";
           row[1] = "Anmol";
           row[2] = "Malik";
           row[3] = "Cloud computing"; 
           dtm.addRow(row); 
           
          
           
           
            row[0] = "1561816";
           row[1] = "Akash";
           row[2] = "Kedia";
           row[3] = "Big Data Engineering"; 
           dtm.addRow(row); 
           
           
            row[0] = "1561818";
           row[1] = "Shirley";
           row[2] = "Setiya";
           row[3] = "Application Engineering Development"; 
           dtm.addRow(row); 
           
            row[0] = "1561819";
           row[1] = "Pranjal";
           row[2] = "Sharma";
           row[3] = "Application Engineering Development"; 
           dtm.addRow(row); 
           
           
           row[0] = "1561820";
           row[1] = "Nihal";
           row[2] = "Kashyap";
           row[3] = "Big Data Engineering"; 
           dtm.addRow(row); 
           
            row[0] = "1561821";
           row[1] = "Sahil";
           row[2] = "Upadhye";
           row[3] = "Web Design and UX Engineering"; 
           dtm.addRow(row); 
           
           
            row[0] = "1561822";
           row[1] = "Junaid";
           row[2] = "Sheikh";
           row[3] = "DWBI"; 
           dtm.addRow(row); 
           
           
            row[0] = "1561823";
           row[1] = "Khatua";
           row[2] = "Balyaya";
           row[3] = "Big Data Engineering"; 
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
        tblViewStudentPanel = new javax.swing.JTable();
        lblViewListOfStudentDetails = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        tblViewStudentPanel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblViewStudentPanel);

        lblViewListOfStudentDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblViewListOfStudentDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblViewListOfStudentDetails.setText("View List of Student Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(lblViewListOfStudentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblViewListOfStudentDetails)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewListOfStudentDetails;
    private javax.swing.JTable tblViewStudentPanel;
    // End of variables declaration//GEN-END:variables
}

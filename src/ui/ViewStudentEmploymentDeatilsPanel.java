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
public class ViewStudentEmploymentDeatilsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCollegePanel
     */
    public ViewStudentEmploymentDeatilsPanel() {
        initComponents();
        
        generateTableForListOfStudentEmployment();
    }

     private void generateTableForListOfStudentEmployment(){
         
        DefaultTableModel dtm = (DefaultTableModel)tblViewStudentEmploymentDetailsPanel.getModel();      
        Object row[] = new Object[4];
        
        dtm.setRowCount(0);
        
        row[0] = "1561792";
        row[1] = "Co-Op";
        row[2] = "Tesla";
        dtm.addRow(row);
        
        row[0] = "1561793";
        row[1] = "Co-Op";
        row[2] = "Amazon";
        dtm.addRow(row);
        
        row[0] = "1561794";
        row[1] = "Co-Op";
        row[2] = "Facebook";
        dtm.addRow(row);
        
        row[0] = "1561796";
        row[1] = "Internship";
        row[2] = "Ahold Delhaize";
        dtm.addRow(row);
        
        row[0] = "1561797";
        row[1] = "Internship";
        row[2] = "Athena health";
        dtm.addRow(row); 
     
          
        row[0] = "1561798";
        row[1] = "Co-Op";
        row[2] = "Athena health";
        dtm.addRow(row); 
        
        row[0] = "1561799";
        row[1] = "Co-Op";
        row[2] = "Ahold Delhaize";
        dtm.addRow(row); 
        
        
        row[0] = "1561800";
        row[1] = "Co-Op";
        row[2] = "Instakart";
        dtm.addRow(row); 
                   
        row[0] = "1561801";
        row[1] = "Internship";
        row[2] = "Cubic Transportation";
        dtm.addRow(row); 
                    
        row[0] = "1561802";
        row[1] = "Internship";
        row[2] = "Oracle";
        dtm.addRow(row); 
        
        row[0] = "1561803";
        row[1] = "Co-Op";
        row[2] = "LinkedIn";
        dtm.addRow(row); 
           
        row[0] = "1561804";
        row[1] = "Co-Op";
        row[2] = "Microsoft";
        dtm.addRow(row); 
        
           
        row[0] = "1561805";
        row[1] = "Co-Op";
        row[2] = "Netflix";
        dtm.addRow(row); 
        
        
        row[0] = "1561806";
        row[1] = "Internship";
        row[2] = "Mercedes";
        dtm.addRow(row); 
        
        row[0] = "1561807";
        row[1] = "Internship";
        row[2] = "Fiat";
        dtm.addRow(row); 
      
        row[0] = "1561808";
        row[1] = "Co-Op";
        row[2] = "Philips";
        dtm.addRow(row); 
        
        row[0] = "1561809";
        row[1] = "Co-Op";
        row[2] = "Salesforce";
        dtm.addRow(row); 
      
        
        row[0] = "1561810";
        row[1] = "Co-Op";
        row[2] = "Blackrock";
        dtm.addRow(row); 
        
        row[0] = "1561811";
        row[1] = "Internship";
        row[2] = "Datamatics";
        dtm.addRow(row); 
        
        
        row[0] = "1561812";
        row[1] = "Internship";
        row[2] = "Fidelity Investments";
        dtm.addRow(row); 
        
        row[0] = "1561813";
        row[1] = "Co-Op";
        row[2] = "Amazon Robotics";
        dtm.addRow(row); 
        
        row[0] = "1561814";
        row[1] = "Co-Op";
        row[2] = "Verizon";
        dtm.addRow(row); 
        
        row[0] = "1561815";
        row[1] = "Co-Op";
        row[2] = "Dell";
        dtm.addRow(row); 
        
        row[0] = "1561816";
        row[1] = "Internship";
        row[2] = "Google";
        dtm.addRow(row);
        
        row[0] = "1561818";
        row[1] = "Internship";
        row[2] = "Philips";
        dtm.addRow(row);
        
        
        row[0] = "1561819";
        row[1] = "Mercedes";
        row[2] = "Dell";
        dtm.addRow(row); 
        
        
        row[0] = "1561820";
        row[1] = "Schindler";
        row[2] = "Dell";
        dtm.addRow(row); 
        
        row[0] = "1561821";
        row[1] = "Walmart";
        row[2] = "Dell";
        dtm.addRow(row); 
        
        row[0] = "1561822";
        row[1] = "Internship";
        row[2] = "Accenture";
        dtm.addRow(row); 
        
        row[0] = "1561823";
        row[1] = "Internship";
        row[2] = "Delloite";
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
        tblViewStudentEmploymentDetailsPanel = new javax.swing.JTable();
        lblViewListOfStudentEmploymentDetails = new javax.swing.JLabel();
        lblStudentEmployment = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        tblViewStudentEmploymentDetailsPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NUID", "Type Of Employment", "Employer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewStudentEmploymentDetailsPanel);

        lblViewListOfStudentEmploymentDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblViewListOfStudentEmploymentDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblViewListOfStudentEmploymentDetails.setText("View List of Student Employment Details");

        lblStudentEmployment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/employer_dashboard_small.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblViewListOfStudentEmploymentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblStudentEmployment)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblViewListOfStudentEmploymentDetails)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStudentEmployment)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStudentEmployment;
    private javax.swing.JLabel lblViewListOfStudentEmploymentDetails;
    private javax.swing.JTable tblViewStudentEmploymentDetailsPanel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author Jinal
 */
public class ViewStudentEnrollmentDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCollegePanel
     */
    public ViewStudentEnrollmentDetailsPanel() {
        initComponents();
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
        tblViewStudentEnrollmentPanel = new javax.swing.JTable();
        lblViewListOfStudentEnrollmentDetails = new javax.swing.JLabel();
        lblViewStudentEnrollmentDashboard = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        tblViewStudentEnrollmentPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NUID", "Course Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewStudentEnrollmentPanel);

        lblViewListOfStudentEnrollmentDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblViewListOfStudentEnrollmentDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblViewListOfStudentEnrollmentDetails.setText("View List of Student Enrollment Details");

        lblViewStudentEnrollmentDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/courses_dashboard_small.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lblViewListOfStudentEnrollmentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblViewStudentEnrollmentDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 1351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblViewListOfStudentEnrollmentDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblViewStudentEnrollmentDashboard)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewListOfStudentEnrollmentDetails;
    private javax.swing.JLabel lblViewStudentEnrollmentDashboard;
    private javax.swing.JTable tblViewStudentEnrollmentPanel;
    // End of variables declaration//GEN-END:variables
}

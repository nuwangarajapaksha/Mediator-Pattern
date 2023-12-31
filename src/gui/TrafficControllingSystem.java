/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.formdev.flatlaf.IntelliJTheme;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Lane;
import model.TrafficMediator;
import model.TrafficMediatorImpl;
import model.Vehicle;

/**
 *
 * @author NUWAA
 */
public class TrafficControllingSystem extends javax.swing.JFrame {

    /**
     * Creates new form TrafficControllingSystem
     */
    TrafficMediator trafficMediator;

    public TrafficControllingSystem() {
        initComponents();
        trafficMediator = new TrafficMediatorImpl();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vehicleNumberTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        speedTextField = new javax.swing.JTextField();
        addVehicleButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        laneNameLabel = new javax.swing.JLabel();
        laneNameTextField = new javax.swing.JTextField();
        addLaneButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        totalVehiclesButton = new javax.swing.JButton();
        totalLanesButton = new javax.swing.JButton();
        totalVehiclesLabel = new javax.swing.JLabel();
        totalLanesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traffic Controlling System");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Traffic Controlling System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Vehicle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Vehicle Number : ");

        vehicleNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Speed : ");

        speedTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        speedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                speedTextFieldKeyTyped(evt);
            }
        });

        addVehicleButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addVehicleButton.setText("Add Vehicle");
        addVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addVehicleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vehicleNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(speedTextField)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehicleNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(speedTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Lane", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        laneNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        laneNameLabel.setText("Lane Name : ");

        laneNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        addLaneButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addLaneButton.setText("Add Lane");
        addLaneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLaneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(laneNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laneNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(addLaneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(laneNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laneNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addLaneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        totalVehiclesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalVehiclesButton.setText("Total Vehicles :");
        totalVehiclesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalVehiclesButtonActionPerformed(evt);
            }
        });

        totalLanesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalLanesButton.setText("Total Lanes :");
        totalLanesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalLanesButtonActionPerformed(evt);
            }
        });

        totalVehiclesLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalVehiclesLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalVehiclesLabel.setText(" 0");
        totalVehiclesLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        totalLanesLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalLanesLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalLanesLabel.setText(" 0");
        totalLanesLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalVehiclesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalVehiclesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalLanesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLanesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(totalVehiclesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalVehiclesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalLanesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLanesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleButtonActionPerformed
        // TODO add your handling code here:

        String vehicleNumber = vehicleNumberTextField.getText();
        String speed = speedTextField.getText();

        if (vehicleNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Vehicle Number", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (speed.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Speed", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            List<Vehicle> vehicleList = trafficMediator.getVehicleList();
            boolean isVehicleExisits = false;
            for (Vehicle existVehicle : vehicleList) {
                if (existVehicle.getVehicleNumber().equals(vehicleNumber)) {
                    isVehicleExisits = true;
                }
            }
            if (isVehicleExisits) {
                JOptionPane.showMessageDialog(this, "This Vehicle Already Exists", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Vehicle vehicle = new Vehicle(trafficMediator, vehicleNumber, Double.parseDouble(speed));
            trafficMediator.addVehicle(vehicle);
            VehicleDashboard vehicleDashboard = new VehicleDashboard(vehicle);
            vehicleDashboard.setVisible(true);
        }

    }//GEN-LAST:event_addVehicleButtonActionPerformed

    private void addLaneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLaneButtonActionPerformed
        // TODO add your handling code here:
        String laneName = laneNameTextField.getText();

        if (laneName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Lane Name", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Lane lane = new Lane(trafficMediator,laneName);
            List<Lane> laneList = trafficMediator.getLaneList();
            boolean isLaneExisits = false;
            for (Lane existLane : laneList) {
                if (existLane.getLaneName().equals(laneName)) {
                    isLaneExisits = true;
                }
            }
            if (isLaneExisits) {
                JOptionPane.showMessageDialog(this, "This Lane Already Exists", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            trafficMediator.addLane(lane);
            JOptionPane.showMessageDialog(this, "Lane " + laneName + " is Created", "Message", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_addLaneButtonActionPerformed

    private void totalVehiclesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalVehiclesButtonActionPerformed
        // TODO add your handling code here:
        totalVehiclesLabel.setText(" "+String.valueOf(trafficMediator.getVehicleList().size()));
    }//GEN-LAST:event_totalVehiclesButtonActionPerformed

    private void totalLanesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalLanesButtonActionPerformed
        // TODO add your handling code here:
        totalLanesLabel.setText(" "+String.valueOf(trafficMediator.getLaneList().size()));
    }//GEN-LAST:event_totalLanesButtonActionPerformed

    private void speedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_speedTextFieldKeyTyped
        // TODO add your handling code here:
        if (((Character.isDigit(evt.getKeyChar())) | (String.valueOf(evt.getKeyChar()).equals(".")))) {
            if (speedTextField.getText().contains(".")) {
                if (!Character.isDigit(evt.getKeyChar())) {
                    evt.consume();
                }
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_speedTextFieldKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TrafficControllingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TrafficControllingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TrafficControllingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TrafficControllingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }

        try {
//            UIManager.setLookAndFeel(new FlatLightLaf());
            IntelliJTheme.setup(TrafficControllingSystem.class.getResourceAsStream(
                    "/resources/themes/arc-theme.theme.json"));
            UIManager.put("Table.showHorizontalLines", true);
            UIManager.put("Table.showVerticalLines", true);
            UIManager.put("ScrollBar.showButtons", true);
            UIManager.put("ScrollBar.width", 16);
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrafficControllingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLaneButton;
    private javax.swing.JButton addVehicleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel laneNameLabel;
    private javax.swing.JTextField laneNameTextField;
    private javax.swing.JTextField speedTextField;
    private javax.swing.JButton totalLanesButton;
    private javax.swing.JLabel totalLanesLabel;
    private javax.swing.JButton totalVehiclesButton;
    private javax.swing.JLabel totalVehiclesLabel;
    private javax.swing.JTextField vehicleNumberTextField;
    // End of variables declaration//GEN-END:variables
}

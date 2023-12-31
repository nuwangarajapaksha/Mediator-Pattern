/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.formdev.flatlaf.IntelliJTheme;
import java.awt.HeadlessException;
import java.util.Date;
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
public class VehicleDashboard extends javax.swing.JFrame {

    /**
     * Creates new form VehicleInfo
     */
    Vehicle vehicle;
    TrafficMediator trafficMediator;

    public VehicleDashboard(Vehicle vehicle) {
        initComponents();
        this.vehicle = vehicle;
        vehicleNumberLabel.setText("Vehicle Number : " + vehicle.getVehicleNumber());
        speedLabel.setText("Speed : " + String.valueOf(vehicle.getSpeed()));
        setSpeedTextField.setText(String.valueOf(vehicle.getSpeed()));
        this.trafficMediator = this.vehicle.getTrafficMediator();
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
        vehicleNumberLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        addToLaneTextField = new javax.swing.JTextField();
        setSpeedTextField = new javax.swing.JTextField();
        addToLaneButton = new javax.swing.JButton();
        setSpeedButton = new javax.swing.JButton();
        getInformationTextField = new javax.swing.JTextField();
        getInformationButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informationTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vehicle Dashboard");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Vehicle Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vehicleNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vehicleNumberLabel.setText("Vehicle Number : ");

        speedLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedLabel.setText("Speed : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehicleNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(speedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vehicleNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(speedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addToLaneTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        setSpeedTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        setSpeedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                setSpeedTextFieldKeyTyped(evt);
            }
        });

        addToLaneButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addToLaneButton.setText("Add To Lane");
        addToLaneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToLaneButtonActionPerformed(evt);
            }
        });

        setSpeedButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setSpeedButton.setText("Set Speed");
        setSpeedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setSpeedButtonActionPerformed(evt);
            }
        });

        getInformationTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        getInformationButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getInformationButton.setText("Get Information");
        getInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInformationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addToLaneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(setSpeedTextField)
                    .addComponent(getInformationTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addToLaneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setSpeedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getInformationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addToLaneButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(addToLaneTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(setSpeedButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(setSpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getInformationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getInformationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        informationTextArea.setColumns(20);
        informationTextArea.setRows(5);
        jScrollPane1.setViewportView(informationTextArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addToLaneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToLaneButtonActionPerformed
        // TODO add your handling code here:
        String laneName = addToLaneTextField.getText();

        if (laneName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Lane", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            List<Lane> laneList = trafficMediator.getLaneList();
            for (Lane lane : laneList) {
                List<Vehicle> vehicleList = lane.getVehicleList();
                for (int i = 0; i < vehicleList.size(); i++) {
                    if (vehicleList.get(i).getVehicleNumber().equals(vehicle.getVehicleNumber())) {
                        lane.getVehicleList().remove(i);
                    }
                }
            }

            for (Lane lane : laneList) {
                if (lane.getLaneName().equalsIgnoreCase(laneName)) {
                    trafficMediator.addVehicleToLane(vehicle, lane);
                    JOptionPane.showMessageDialog(this, "Vehicle " + vehicle.getVehicleNumber() + " is Added to Lane " + lane.getLaneName(), "Message", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        }


    }//GEN-LAST:event_addToLaneButtonActionPerformed

    private void setSpeedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setSpeedButtonActionPerformed
        // TODO add your handling code here:
        String speed = setSpeedTextField.getText();
        if (speed.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Speed", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            this.vehicle.setSpeed(Double.parseDouble(speed));
            speedLabel.setText("Speed : " + String.valueOf(vehicle.getSpeed()));
        }
    }//GEN-LAST:event_setSpeedButtonActionPerformed

    private void getInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInformationButtonActionPerformed
        // TODO add your handling code here:
        runFetchLaneDataThread();
    }//GEN-LAST:event_getInformationButtonActionPerformed

    private void setSpeedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_setSpeedTextFieldKeyTyped
        // TODO add your handling code here:
        if (((Character.isDigit(evt.getKeyChar())) | (String.valueOf(evt.getKeyChar()).equals(".")))) {
            if (setSpeedTextField.getText().contains(".")) {
                if (!Character.isDigit(evt.getKeyChar())) {
                    evt.consume();
                }
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_setSpeedTextFieldKeyTyped

    private void runFetchLaneDataThread() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        fetchLaneData();
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        });
        t.start();
    }

    private void fetchLaneData() {
        String laneName = getInformationTextField.getText();
        List<Lane> laneList = trafficMediator.getLaneList();
        for (Lane lane : laneList) {
            if (lane.getLaneName().equalsIgnoreCase(laneName)) {
                String msg = new Date().toString()+"\n"+lane.getInformation();
                informationTextArea.setText(msg);
                return;
            }
        }
    }

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
//            java.util.logging.Logger.getLogger(VehicleDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VehicleDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VehicleDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VehicleDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }

        try {
//            UIManager.setLookAndFeel(new FlatLightLaf());
            IntelliJTheme.setup(VehicleDashboard.class.getResourceAsStream(
                    "/resources/themes/arc-theme.theme.json"));
            UIManager.put("Table.showHorizontalLines", true);
            UIManager.put("Table.showVerticalLines", true);
            UIManager.put("ScrollBar.showButtons", true);
            UIManager.put("ScrollBar.width", 16);
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleDashboard(new Vehicle(new TrafficMediatorImpl(), "", 0.00)).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToLaneButton;
    private javax.swing.JTextField addToLaneTextField;
    private javax.swing.JButton getInformationButton;
    private javax.swing.JTextField getInformationTextField;
    private javax.swing.JTextArea informationTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton setSpeedButton;
    private javax.swing.JTextField setSpeedTextField;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JLabel vehicleNumberLabel;
    // End of variables declaration//GEN-END:variables
}

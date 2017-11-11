package gympackage;
import java.sql.*;
import javax.swing.*;

public class AddEquipment extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;

    public AddEquipment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rentalamount = new javax.swing.JPanel();
        etype = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        floorarea = new javax.swing.JLabel();
        maintainancecost = new javax.swing.JLabel();
        warranty = new javax.swing.JLabel();
        jtxtEquipmentType = new javax.swing.JTextField();
        jtxtWarranty = new javax.swing.JTextField();
        jtxtMaintainanceCost = new javax.swing.JTextField();
        jtxtFloorArea = new javax.swing.JTextField();
        jtxtPrice = new javax.swing.JTextField();
        jbtnReset = new javax.swing.JButton();
        jbtnSubmit = new javax.swing.JButton();
        rent = new javax.swing.JLabel();
        jtxtrent = new javax.swing.JTextField();
        header = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rentalamount.setBackground(new java.awt.Color(255, 255, 255));

        etype.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        etype.setText("Equipment Type");

        price.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        price.setText("Price");

        floorarea.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        floorarea.setText("Floor Area");

        maintainancecost.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        maintainancecost.setText("Maintainance Cost");

        warranty.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        warranty.setText("Warranty");

        jtxtEquipmentType.setBackground(new java.awt.Color(204, 255, 204));
        jtxtEquipmentType.setBorder(null);

        jtxtWarranty.setBackground(new java.awt.Color(204, 255, 204));
        jtxtWarranty.setBorder(null);

        jtxtMaintainanceCost.setBackground(new java.awt.Color(204, 255, 204));
        jtxtMaintainanceCost.setBorder(null);

        jtxtFloorArea.setBackground(new java.awt.Color(204, 255, 204));
        jtxtFloorArea.setBorder(null);

        jtxtPrice.setBackground(new java.awt.Color(204, 255, 204));
        jtxtPrice.setBorder(null);

        jbtnReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnSubmit.setText("Submit");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });

        rent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rent.setText("Rental Amount");

        jtxtrent.setBackground(new java.awt.Color(204, 255, 204));
        jtxtrent.setBorder(null);

        javax.swing.GroupLayout rentalamountLayout = new javax.swing.GroupLayout(rentalamount);
        rentalamount.setLayout(rentalamountLayout);
        rentalamountLayout.setHorizontalGroup(
            rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalamountLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rent)
                    .addGroup(rentalamountLayout.createSequentialGroup()
                        .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnSubmit)
                            .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(warranty)
                                .addComponent(maintainancecost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(floorarea)
                                .addComponent(etype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(117, 117, 117)
                        .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtWarranty, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jtxtMaintainanceCost, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jtxtFloorArea, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jtxtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jtxtEquipmentType, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jtxtrent)
                            .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        rentalamountLayout.setVerticalGroup(
            rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalamountLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etype, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtEquipmentType, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floorarea)
                    .addComponent(jtxtFloorArea, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maintainancecost, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jtxtMaintainanceCost))
                .addGap(18, 18, 18)
                .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(warranty)
                    .addComponent(jtxtWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtrent, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(rentalamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        header.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        header.setText("Add Equipments");

        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(rentalamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(header)
                .addGap(18, 18, 18)
                .addComponent(rentalamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtEquipmentType.setText(null);
        jtxtFloorArea.setText(null);
        jtxtMaintainanceCost.setText(null);
        jtxtPrice.setText(null);
        jtxtWarranty.setText(null);
        jtxtrent.setText(null);

    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        conn=MysqlConnect.ConnectDB();
        String Sql="Insert into equipment(MaintainenceCost,Warranty,Price,Type,RentalAmount,FloorArea) values (?,?,?,?,?,?)";
        try{
            pst=conn.prepareStatement(Sql);
            pst.setString(1,jtxtMaintainanceCost.getText());
            pst.setString(2,jtxtWarranty.getText());
            pst.setString(3,jtxtPrice.getText());
            pst.setString(4,jtxtEquipmentType.getText());
            pst.setString(5,jtxtrent.getText());
            pst.setString(6,jtxtFloorArea.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Entry Successful...!");
            this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEquipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel etype;
    private javax.swing.JLabel floorarea;
    private javax.swing.JLabel header;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JTextField jtxtEquipmentType;
    private javax.swing.JTextField jtxtFloorArea;
    private javax.swing.JTextField jtxtMaintainanceCost;
    private javax.swing.JTextField jtxtPrice;
    private javax.swing.JTextField jtxtWarranty;
    private javax.swing.JTextField jtxtrent;
    private javax.swing.JLabel maintainancecost;
    private javax.swing.JLabel price;
    private javax.swing.JLabel rent;
    private javax.swing.JPanel rentalamount;
    private javax.swing.JLabel warranty;
    // End of variables declaration//GEN-END:variables
}
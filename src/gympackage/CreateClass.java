package gympackage;
import java.sql.*;
import javax.swing.*;

public class CreateClass extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null,pst1=null,pst2=null;
ResultSet rs=null;

    public CreateClass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        sname = new javax.swing.JLabel();
        cost = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        roomno = new javax.swing.JLabel();
        prerequisite = new javax.swing.JLabel();
        jtxtStaffName = new javax.swing.JTextField();
        jtxtTitle = new javax.swing.JTextField();
        jtxtTime = new javax.swing.JTextField();
        jtxtCost = new javax.swing.JTextField();
        jtxtDate = new javax.swing.JTextField();
        jtxtPreRequisite = new javax.swing.JTextField();
        jtxtRoomNo = new javax.swing.JTextField();
        jbtnReset = new javax.swing.JButton();
        jbtnSubmit = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        sname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sname.setText("Staff Name");

        cost.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cost.setText("Cost");

        title.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        title.setText("Title");

        time.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        time.setText("Time");

        date.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        date.setText("Date");

        roomno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        roomno.setText("Room No");

        prerequisite.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        prerequisite.setText("PreRequisite");

        jtxtStaffName.setBackground(new java.awt.Color(204, 255, 204));
        jtxtStaffName.setBorder(null);
        jtxtStaffName.setMinimumSize(new java.awt.Dimension(8, 362));

        jtxtTitle.setBackground(new java.awt.Color(204, 255, 204));
        jtxtTitle.setBorder(null);

        jtxtTime.setBackground(new java.awt.Color(204, 255, 204));
        jtxtTime.setBorder(null);

        jtxtCost.setBackground(new java.awt.Color(204, 255, 204));
        jtxtCost.setBorder(null);

        jtxtDate.setBackground(new java.awt.Color(204, 255, 204));
        jtxtDate.setBorder(null);

        jtxtPreRequisite.setBackground(new java.awt.Color(204, 255, 204));
        jtxtPreRequisite.setBorder(null);

        jtxtRoomNo.setBackground(new java.awt.Color(204, 255, 204));
        jtxtRoomNo.setBorder(null);

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

        header.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        header.setText("Create Class");

        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jbtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sname)
                            .addComponent(title)
                            .addComponent(time)
                            .addComponent(cost)
                            .addComponent(date)
                            .addComponent(prerequisite)
                            .addComponent(roomno))
                        .addGap(43, 43, 43)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtTitle)
                            .addComponent(jtxtStaffName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtTime)
                            .addComponent(jtxtCost)
                            .addComponent(jtxtDate)
                            .addComponent(jtxtPreRequisite)
                            .addComponent(jtxtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addComponent(header)
                        .addGap(324, 324, 324))))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(header)
                .addGap(41, 41, 41)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prerequisite, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPreRequisite, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtTitle.setText(null);
        jtxtTime.setText(null);
        jtxtDate.setText(null);
        jtxtCost.setText(null);
        jtxtPreRequisite.setText(null);
        jtxtRoomNo.setText(null);
        jtxtStaffName.setText(null);

    }//GEN-LAST:event_jbtnResetActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        conn=MysqlConnect.ConnectDB();
        String Sql="Insert into class(ClassTimings,Date,Title,Cost,Prerequisite,RID) values (?,?,?,?,?,?)";
        String Sql1="Select CLID from class where ClassTimings=? AND Date=? AND Title=? AND Cost=? AND Prerequisite=? AND RID=?";
        String Sql2="Insert into staff_class(SID,CLID) values((Select SID from staff where SName=?),?)";
        try{
            String id=null;
            pst=conn.prepareStatement(Sql);
            pst.setString(1,jtxtTime.getText());
            pst.setString(2,jtxtDate.getText());
            pst.setString(3,jtxtTitle.getText());
            pst.setString(4,jtxtCost.getText());
            pst.setString(5,jtxtPreRequisite.getText());
            pst.setString(6,jtxtRoomNo.getText());
            pst.executeUpdate();
            pst1=conn.prepareStatement(Sql1);
            pst1.setString(1,jtxtTime.getText());
            pst1.setString(2,jtxtDate.getText());
            pst1.setString(3,jtxtTitle.getText());
            pst1.setString(4,jtxtCost.getText());
            pst1.setString(5,jtxtPreRequisite.getText());
            pst1.setString(6,jtxtRoomNo.getText());
            rs=pst1.executeQuery();
            if (rs.next())
                id=rs.getString(1);
            pst2=conn.prepareStatement(Sql2);
            pst2.setString(1,jtxtStaffName.getText());
            pst2.setString(2,id);
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(null,"Entry Successful...!");
            this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel body;
    private javax.swing.JLabel cost;
    private javax.swing.JLabel date;
    private javax.swing.JLabel header;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JTextField jtxtCost;
    private javax.swing.JTextField jtxtDate;
    private javax.swing.JTextField jtxtPreRequisite;
    private javax.swing.JTextField jtxtRoomNo;
    private javax.swing.JTextField jtxtStaffName;
    private javax.swing.JTextField jtxtTime;
    private javax.swing.JTextField jtxtTitle;
    private javax.swing.JLabel prerequisite;
    private javax.swing.JLabel roomno;
    private javax.swing.JLabel sname;
    private javax.swing.JLabel time;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}

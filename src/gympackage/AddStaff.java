package gympackage;
import java.sql.*;
import javax.swing.*;

public class AddStaff extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;

    public AddStaff() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        timings = new javax.swing.JLabel();
        experience = new javax.swing.JLabel();
        designation = new javax.swing.JLabel();
        areaofexpertise = new javax.swing.JLabel();
        jtxtSName = new javax.swing.JTextField();
        jtxtSAge = new javax.swing.JTextField();
        jtxtSalary = new javax.swing.JTextField();
        jtxtTimings = new javax.swing.JTextField();
        jtxtExpertise = new javax.swing.JTextField();
        jtxtExperience = new javax.swing.JTextField();
        jtxtDesignation = new javax.swing.JTextField();
        jbtnSubmit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        name.setText("Name");

        age.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        age.setText("Age");

        salary.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        salary.setText("Salary");

        timings.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        timings.setText("Timings");

        experience.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        experience.setText("Experience");

        designation.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        designation.setText("Designation");

        areaofexpertise.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        areaofexpertise.setText("Area Of Expertise");

        jtxtSName.setBackground(new java.awt.Color(204, 255, 204));
        jtxtSName.setBorder(null);

        jtxtSAge.setBackground(new java.awt.Color(204, 255, 204));
        jtxtSAge.setBorder(null);

        jtxtSalary.setBackground(new java.awt.Color(204, 255, 204));
        jtxtSalary.setBorder(null);

        jtxtTimings.setBackground(new java.awt.Color(204, 255, 204));
        jtxtTimings.setBorder(null);

        jtxtExpertise.setBackground(new java.awt.Color(204, 255, 204));
        jtxtExpertise.setBorder(null);

        jtxtExperience.setBackground(new java.awt.Color(204, 255, 204));
        jtxtExperience.setBorder(null);

        jtxtDesignation.setBackground(new java.awt.Color(204, 255, 204));
        jtxtDesignation.setBorder(null);

        jbtnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnSubmit.setText("Submit");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        header.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        header.setText("Add Staff ");

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
                .addGap(291, 291, 291)
                .addComponent(jbtnSubmit)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)
                        .addGap(23, 23, 23))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jbtnReset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(header)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salary, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timings, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(designation, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(experience, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaofexpertise, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtxtExpertise, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtTimings, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSAge, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(243, 243, 243))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jtxtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtSAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtTimings)
                        .addGap(12, 12, 12)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jtxtDesignation)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtExpertise, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(header)
                        .addGap(54, 54, 54)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(salary)
                        .addGap(18, 18, 18)
                        .addComponent(timings)
                        .addGap(12, 12, 12)
                        .addComponent(experience)
                        .addGap(18, 18, 18)
                        .addComponent(designation)
                        .addGap(18, 18, 18)
                        .addComponent(areaofexpertise)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addComponent(back)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnSubmit)
                            .addComponent(jbtnReset))
                        .addGap(59, 59, 59))))
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
        jtxtSName.setText(null);
        jtxtSAge.setText(null);
        jtxtSalary.setText(null);
        jtxtTimings.setText(null);
        jtxtExperience.setText(null);
        jtxtDesignation.setText(null);
        jtxtExpertise.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        conn=MysqlConnect.ConnectDB();
        String Sql="Insert into staff(SName,SAge,Salary,Timings,Experience,Designation,AreaOfExpertise) values (?,?,?,?,?,?,?)";
        try{
            pst=conn.prepareStatement(Sql);
            pst.setString(1,jtxtSName.getText());
            pst.setString(2,jtxtSAge.getText());
            pst.setString(3,jtxtSalary.getText());
            pst.setString(4,jtxtTimings.getText());
            pst.setString(5,jtxtExperience.getText());
            pst.setString(6,jtxtDesignation.getText());
            pst.setString(7,jtxtExpertise.getText());
            pst.executeUpdate();
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
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel areaofexpertise;
    private javax.swing.JButton back;
    private javax.swing.JPanel body;
    private javax.swing.JLabel designation;
    private javax.swing.JLabel experience;
    private javax.swing.JLabel header;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JTextField jtxtDesignation;
    private javax.swing.JTextField jtxtExperience;
    private javax.swing.JTextField jtxtExpertise;
    private javax.swing.JTextField jtxtSAge;
    private javax.swing.JTextField jtxtSName;
    private javax.swing.JTextField jtxtSalary;
    private javax.swing.JTextField jtxtTimings;
    private javax.swing.JLabel name;
    private javax.swing.JLabel salary;
    private javax.swing.JLabel timings;
    // End of variables declaration//GEN-END:variables
}

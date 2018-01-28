package gympackage;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class AddCustomer extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
    public AddCustomer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        emailid = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        packagelevel = new javax.swing.JLabel();
        memvalidity = new javax.swing.JLabel();
        jtxtAge = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtGender = new javax.swing.JTextField();
        jtxtHeight = new javax.swing.JTextField();
        jtxtWeight = new javax.swing.JTextField();
        jtxtContact = new javax.swing.JTextField();
        jtxtValidity = new javax.swing.JTextField();
        jbtnSubmit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jtxtPackage = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        header.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        header.setText("Add Customer Details");

        body.setBackground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        name.setText("Name");

        age.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        age.setText("Age");

        address.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        address.setText("Address");

        gender.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        gender.setText("Gender");

        emailid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        emailid.setText("Email Id");

        contact.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        contact.setText("Contact No");

        height.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        height.setText("Height");

        weight.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        weight.setText("Weight");

        packagelevel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        packagelevel.setText("Package Level");

        memvalidity.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        memvalidity.setText("Membership Validity");

        jtxtAge.setBackground(new java.awt.Color(204, 255, 204));

        jtxtAddress.setBackground(new java.awt.Color(204, 255, 204));

        jtxtGender.setBackground(new java.awt.Color(204, 255, 204));

        jtxtHeight.setBackground(new java.awt.Color(204, 255, 204));

        jtxtWeight.setBackground(new java.awt.Color(204, 255, 204));

        jtxtContact.setBackground(new java.awt.Color(204, 255, 204));

        jtxtValidity.setBackground(new java.awt.Color(204, 255, 204));

        jbtnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnSubmit.setText("Submit");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });

        jbtnReset.setBackground(new java.awt.Color(204, 204, 255));
        jbtnReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jtxtPackage.setBackground(new java.awt.Color(204, 255, 204));

        jtxtEmail.setBackground(new java.awt.Color(204, 255, 204));

        jtxtName.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memvalidity)
                            .addComponent(contact)
                            .addComponent(weight)
                            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(packagelevel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(137, 137, 137)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtWeight, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtHeight, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtValidity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtPackage, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtContact, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtAge)
                                    .addComponent(jtxtAddress)
                                    .addComponent(jtxtGender)
                                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addComponent(jbtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266))))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtName)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtGender)
                    .addComponent(gender))
                .addGap(12, 12, 12)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailid)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtContact)
                    .addComponent(contact))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(height))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weight)
                    .addComponent(jtxtWeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(packagelevel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPackage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(memvalidity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtValidity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

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
                .addComponent(back)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(header)
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(back)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtName.setText(null);
        jtxtAge.setText(null);
        jtxtAddress.setText(null);
        jtxtGender.setText(null);
        jtxtEmail.setText(null);
        jtxtContact.setText(null);
        jtxtHeight.setText(null);
        jtxtWeight.setText(null);
        jtxtValidity.setText(null);
        jtxtPackage.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        conn=MysqlConnect.ConnectDB();
        java.sql.Date today= new java.sql.Date(Calendar.getInstance().getTime().getTime());
        String Sql="Insert into customer(Cname,CAge,Phone,Email,Address,Gender,Height,Weight,MEMID,DateOfMem,MemDeadline) values (?,?,?,?,?,?,?,?,(Select MEMID from membership where PackageLevel=?),?,?)";
        try{
            pst=conn.prepareStatement(Sql);
            pst.setString(1,jtxtName.getText());
            pst.setString(2,jtxtAge.getText());
            pst.setString(3,jtxtContact.getText());
            pst.setString(4,jtxtEmail.getText());
            pst.setString(5,jtxtAddress.getText());
            pst.setString(6,jtxtGender.getText());
            pst.setString(7,jtxtWeight.getText());
            pst.setString(8,jtxtHeight.getText());
            pst.setString(9,jtxtPackage.getText());
            pst.setDate(10,today);
            pst.setString(11,jtxtValidity.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Entry Successful...!");
            this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JButton back;
    private javax.swing.JPanel body;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel emailid;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel header;
    private javax.swing.JLabel height;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtAge;
    private javax.swing.JTextField jtxtContact;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtGender;
    private javax.swing.JTextField jtxtHeight;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtPackage;
    private javax.swing.JTextField jtxtValidity;
    private javax.swing.JTextField jtxtWeight;
    private javax.swing.JLabel memvalidity;
    private javax.swing.JLabel name;
    private javax.swing.JLabel packagelevel;
    private javax.swing.JLabel weight;
    // End of variables declaration//GEN-END:variables
}
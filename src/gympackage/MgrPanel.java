package gympackage;
import java.sql.*;
import javax.swing.*;

public class MgrPanel extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
String thisuser=Login.username;


    public MgrPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        hometab = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        homecontent = new javax.swing.JLabel();
        homebackground = new javax.swing.JLabel();
        custtab = new javax.swing.JPanel();
        addcustomer = new javax.swing.JButton();
        viewcustomer = new javax.swing.JButton();
        custbackground = new javax.swing.JLabel();
        equiptab = new javax.swing.JPanel();
        addequipment = new javax.swing.JButton();
        viewequipment = new javax.swing.JButton();
        equipbackground = new javax.swing.JLabel();
        memtab = new javax.swing.JPanel();
        viewmembership = new javax.swing.JButton();
        upgrademembership = new javax.swing.JButton();
        membackground = new javax.swing.JLabel();
        paytab = new javax.swing.JPanel();
        viewpayment = new javax.swing.JButton();
        acceptpayment = new javax.swing.JButton();
        paybackground = new javax.swing.JLabel();
        stafftab = new javax.swing.JPanel();
        viewstaff = new javax.swing.JButton();
        addstaff = new javax.swing.JButton();
        staffbackground = new javax.swing.JLabel();
        classtab = new javax.swing.JPanel();
        viewclass = new javax.swing.JButton();
        addclass = new javax.swing.JButton();
        classbackground = new javax.swing.JLabel();
        proftab = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        proftabtimings = new javax.swing.JTextField();
        proftabnamev = new javax.swing.JTextField();
        proftabexperience = new javax.swing.JTextField();
        proftabagev = new javax.swing.JTextField();
        proftabdesignation = new javax.swing.JTextField();
        proftabsalary = new javax.swing.JTextField();
        proftabareaofexpertise = new javax.swing.JTextField();
        areaofexpertise = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        timings = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        experience = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        designation = new javax.swing.JLabel();
        showprofile = new javax.swing.JButton();
        profbackground = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        gymnametitle = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.setFont(new java.awt.Font("Segoe Print", 1, 17)); // NOI18N

        hometab.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jPanel2.setLayout(null);

        homecontent.setFont(new java.awt.Font("Bookman Old Style", 3, 26)); // NOI18N
        homecontent.setForeground(new java.awt.Color(255, 255, 255));
        homecontent.setText("WELCOME TO POWER GYM PORTAL");
        jPanel2.add(homecontent);
        homecontent.setBounds(310, 50, 490, 80);

        homebackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg3.jpg")); // NOI18N
        jPanel2.add(homebackground);
        homebackground.setBounds(0, 30, 1090, 500);

        javax.swing.GroupLayout hometabLayout = new javax.swing.GroupLayout(hometab);
        hometab.setLayout(hometabLayout);
        hometabLayout.setHorizontalGroup(
            hometabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hometabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE)
                .addContainerGap())
        );
        hometabLayout.setVerticalGroup(
            hometabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hometabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Home", hometab);

        custtab.setLayout(null);

        addcustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addcustomer.setText("Add  Customer");
        addcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustomerActionPerformed(evt);
            }
        });
        custtab.add(addcustomer);
        addcustomer.setBounds(610, 460, 221, 63);

        viewcustomer.setBackground(new java.awt.Color(204, 204, 255));
        viewcustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewcustomer.setText("View Customers");
        viewcustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewcustomer.setOpaque(false);
        viewcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcustomerActionPerformed(evt);
            }
        });
        custtab.add(viewcustomer);
        viewcustomer.setBounds(290, 460, 221, 63);

        custbackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg6.jpg")); // NOI18N
        custtab.add(custbackground);
        custbackground.setBounds(10, 20, 1100, 530);

        tabs.addTab("Customers", custtab);

        equiptab.setLayout(null);

        addequipment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addequipment.setText("Add Equipment");
        addequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addequipmentActionPerformed(evt);
            }
        });
        equiptab.add(addequipment);
        addequipment.setBounds(590, 120, 229, 50);

        viewequipment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewequipment.setText("View Equipments");
        viewequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewequipmentActionPerformed(evt);
            }
        });
        equiptab.add(viewequipment);
        viewequipment.setBounds(300, 120, 229, 50);

        equipbackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg2.jpg")); // NOI18N
        equiptab.add(equipbackground);
        equipbackground.setBounds(10, 30, 1100, 520);

        tabs.addTab("Equipments", equiptab);

        memtab.setLayout(null);

        viewmembership.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewmembership.setText("View Membership");
        viewmembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewmembershipActionPerformed(evt);
            }
        });
        memtab.add(viewmembership);
        viewmembership.setBounds(280, 430, 240, 63);

        upgrademembership.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upgrademembership.setText("Upgrade Membership");
        upgrademembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgrademembershipActionPerformed(evt);
            }
        });
        memtab.add(upgrademembership);
        upgrademembership.setBounds(610, 430, 240, 63);

        membackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg7.jpg")); // NOI18N
        memtab.add(membackground);
        membackground.setBounds(10, 20, 1100, 550);

        tabs.addTab("Membership", memtab);

        paytab.setLayout(null);

        viewpayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewpayment.setText("View Payment");
        viewpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpaymentActionPerformed(evt);
            }
        });
        paytab.add(viewpayment);
        viewpayment.setBounds(310, 360, 222, 63);

        acceptpayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acceptpayment.setText("Accept Payment");
        acceptpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptpaymentActionPerformed(evt);
            }
        });
        paytab.add(acceptpayment);
        acceptpayment.setBounds(620, 360, 222, 66);

        paybackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg11.jpg")); // NOI18N
        paytab.add(paybackground);
        paybackground.setBounds(11, 20, 1080, 550);

        tabs.addTab("Payment", paytab);

        stafftab.setLayout(null);

        viewstaff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewstaff.setText("View Staff");
        viewstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstaffActionPerformed(evt);
            }
        });
        stafftab.add(viewstaff);
        viewstaff.setBounds(320, 450, 204, 65);

        addstaff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addstaff.setText("Add Staff");
        addstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffActionPerformed(evt);
            }
        });
        stafftab.add(addstaff);
        addstaff.setBounds(580, 450, 204, 65);

        staffbackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg12.jpg")); // NOI18N
        stafftab.add(staffbackground);
        staffbackground.setBounds(11, 10, 1100, 570);

        tabs.addTab("Staff", stafftab);

        classtab.setLayout(null);

        viewclass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewclass.setText("View Class");
        viewclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewclassActionPerformed(evt);
            }
        });
        classtab.add(viewclass);
        viewclass.setBounds(290, 380, 202, 65);

        addclass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addclass.setText("Add Class");
        addclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclassActionPerformed(evt);
            }
        });
        classtab.add(addclass);
        addclass.setBounds(620, 380, 202, 58);

        classbackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg16.jpg")); // NOI18N
        classtab.add(classbackground);
        classbackground.setBounds(10, 20, 1100, 550);

        tabs.addTab("Class", classtab);

        proftab.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(222, 231, 231));

        proftabtimings.setEditable(false);
        proftabtimings.setBackground(new java.awt.Color(172, 241, 227));

        proftabnamev.setEditable(false);
        proftabnamev.setBackground(new java.awt.Color(172, 241, 227));

        proftabexperience.setEditable(false);
        proftabexperience.setBackground(new java.awt.Color(172, 241, 227));

        proftabagev.setEditable(false);
        proftabagev.setBackground(new java.awt.Color(172, 241, 227));

        proftabdesignation.setEditable(false);
        proftabdesignation.setBackground(new java.awt.Color(172, 241, 227));

        proftabsalary.setEditable(false);
        proftabsalary.setBackground(new java.awt.Color(172, 241, 227));

        proftabareaofexpertise.setEditable(false);
        proftabareaofexpertise.setBackground(new java.awt.Color(172, 241, 227));

        areaofexpertise.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        areaofexpertise.setText("Area Of Expertise");

        salary.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        salary.setText("Salary");

        timings.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        timings.setText("Timings");

        name.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        name.setText("Name");

        experience.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        experience.setText("Experience");

        age.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        age.setText("Age");

        designation.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        designation.setText("Designation");

        showprofile.setText("Show");
        showprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showprofileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age)
                            .addComponent(name)
                            .addComponent(salary)
                            .addComponent(timings, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(148, 148, 148))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(designation)
                            .addComponent(areaofexpertise)
                            .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(proftabtimings, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(proftabexperience, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(proftabareaofexpertise)
                            .addComponent(proftabdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(proftabnamev)
                            .addComponent(proftabsalary)
                            .addComponent(proftabagev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(showprofile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proftabnamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proftabagev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proftabsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salary))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proftabtimings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timings))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proftabexperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experience))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proftabdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(designation))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proftabareaofexpertise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaofexpertise))
                .addGap(56, 56, 56)
                .addComponent(showprofile)
                .addGap(34, 34, 34))
        );

        proftab.add(jPanel1);
        jPanel1.setBounds(30, 50, 644, 495);

        profbackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg19.jpg")); // NOI18N
        proftab.add(profbackground);
        profbackground.setBounds(710, 120, 360, 310);

        tabs.addTab("My Profile", proftab);

        header.setBackground(new java.awt.Color(255, 255, 255));

        gymnametitle.setBackground(new java.awt.Color(255, 255, 255));
        gymnametitle.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        gymnametitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/gymlogo.jpg"))); // NOI18N
        gymnametitle.setText("POWER GYM");

        logout.setBackground(new java.awt.Color(204, 153, 255));
        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel2.setText("....A moto to change");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gymnametitle, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(178, 178, 178)
                .addComponent(logout)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout)
                    .addComponent(jLabel2))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gymnametitle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login w=new Login();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void addclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclassActionPerformed
        CreateClass w=new CreateClass();
        w.setVisible(true);
    }//GEN-LAST:event_addclassActionPerformed

    private void viewclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewclassActionPerformed
        ViewClass w=new ViewClass();
        w.setVisible(true);
    }//GEN-LAST:event_viewclassActionPerformed

    private void addstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffActionPerformed
        AddStaff w=new AddStaff();
        w.setVisible(true);
    }//GEN-LAST:event_addstaffActionPerformed

    private void viewstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstaffActionPerformed
        ViewStaff w= new ViewStaff();
        w.setVisible(true);
    }//GEN-LAST:event_viewstaffActionPerformed

    private void acceptpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptpaymentActionPerformed
        AcceptPayment w=new AcceptPayment();
        w.setVisible(true);
    }//GEN-LAST:event_acceptpaymentActionPerformed

    private void viewpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpaymentActionPerformed
        ViewPayment w=new ViewPayment();
        w.setVisible(true);
    }//GEN-LAST:event_viewpaymentActionPerformed

    private void upgrademembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgrademembershipActionPerformed
        UpgradeMembership w=new UpgradeMembership();
        w.setVisible(true);
    }//GEN-LAST:event_upgrademembershipActionPerformed

    private void viewmembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewmembershipActionPerformed
        ViewMembership w=new ViewMembership();
        w.setVisible(true);
    }//GEN-LAST:event_viewmembershipActionPerformed

    private void viewequipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewequipmentActionPerformed
        ViewEquipment w=new ViewEquipment();
        w.setVisible(true);
    }//GEN-LAST:event_viewequipmentActionPerformed

    private void addequipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addequipmentActionPerformed
        AddEquipment w=new AddEquipment();
        w.setVisible(true);
    }//GEN-LAST:event_addequipmentActionPerformed

    private void viewcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcustomerActionPerformed
        ViewCustomer w=new ViewCustomer();
        w.setVisible(true);
    }//GEN-LAST:event_viewcustomerActionPerformed

    private void addcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustomerActionPerformed
        AddCustomer w=new AddCustomer();
        w.setVisible(true);
    }//GEN-LAST:event_addcustomerActionPerformed

    private void showprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showprofileActionPerformed
        conn=MysqlConnect.ConnectDB();
        String Sql="Select * from staff where SName=?";
        try{
            pst=conn.prepareStatement(Sql);
            pst.setString(1,thisuser);
            rs=pst.executeQuery();
            if(rs.next()){
                proftabnamev.setText(rs.getString(2));
                proftabagev.setText(rs.getString(3)+" years");
                proftabsalary.setText(rs.getString(4)+" INR");
                proftabtimings.setText(rs.getString(5));
                proftabexperience.setText(rs.getString(6)+" years");
                proftabdesignation.setText(rs.getString(7));
                proftabareaofexpertise.setText(rs.getString(8));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_showprofileActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MgrPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptpayment;
    private javax.swing.JButton addclass;
    private javax.swing.JButton addcustomer;
    private javax.swing.JButton addequipment;
    private javax.swing.JButton addstaff;
    private javax.swing.JLabel age;
    private javax.swing.JLabel areaofexpertise;
    private javax.swing.JLabel classbackground;
    private javax.swing.JPanel classtab;
    private javax.swing.JLabel custbackground;
    private javax.swing.JPanel custtab;
    private javax.swing.JLabel designation;
    private javax.swing.JLabel equipbackground;
    private javax.swing.JPanel equiptab;
    private javax.swing.JLabel experience;
    private javax.swing.JLabel gymnametitle;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homebackground;
    private javax.swing.JLabel homecontent;
    private javax.swing.JPanel hometab;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JLabel membackground;
    private javax.swing.JPanel memtab;
    private javax.swing.JLabel name;
    private javax.swing.JLabel paybackground;
    private javax.swing.JPanel paytab;
    private javax.swing.JLabel profbackground;
    private javax.swing.JPanel proftab;
    private javax.swing.JTextField proftabagev;
    private javax.swing.JTextField proftabareaofexpertise;
    private javax.swing.JTextField proftabdesignation;
    private javax.swing.JTextField proftabexperience;
    private javax.swing.JTextField proftabnamev;
    private javax.swing.JTextField proftabsalary;
    private javax.swing.JTextField proftabtimings;
    private javax.swing.JLabel salary;
    private javax.swing.JButton showprofile;
    private javax.swing.JLabel staffbackground;
    private javax.swing.JPanel stafftab;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JLabel timings;
    private javax.swing.JButton upgrademembership;
    private javax.swing.JButton viewclass;
    private javax.swing.JButton viewcustomer;
    private javax.swing.JButton viewequipment;
    private javax.swing.JButton viewmembership;
    private javax.swing.JButton viewpayment;
    private javax.swing.JButton viewstaff;
    // End of variables declaration//GEN-END:variables
}

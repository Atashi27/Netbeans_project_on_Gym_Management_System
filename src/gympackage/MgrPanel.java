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
        homecontent = new javax.swing.JLabel();
        custtab = new javax.swing.JPanel();
        addcustomer = new javax.swing.JButton();
        viewcustomer = new javax.swing.JButton();
        equiptab = new javax.swing.JPanel();
        addequipment = new javax.swing.JButton();
        viewequipment = new javax.swing.JButton();
        memtab = new javax.swing.JPanel();
        viewmembership = new javax.swing.JButton();
        upgrademembership = new javax.swing.JButton();
        paytab = new javax.swing.JPanel();
        viewpayment = new javax.swing.JButton();
        acceptpayment = new javax.swing.JButton();
        stafftab = new javax.swing.JPanel();
        viewstaff = new javax.swing.JButton();
        addstaff = new javax.swing.JButton();
        classtab = new javax.swing.JPanel();
        viewclass = new javax.swing.JButton();
        addclass = new javax.swing.JButton();
        proftab = new javax.swing.JPanel();
        gender = new javax.swing.JLabel();
        proftabheightv = new javax.swing.JTextField();
        height = new javax.swing.JLabel();
        proftabweightv = new javax.swing.JTextField();
        weight = new javax.swing.JLabel();
        proftabcontactv = new javax.swing.JTextField();
        proftabemailv = new javax.swing.JTextField();
        contact = new javax.swing.JLabel();
        proftabaddressv = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        showprofile = new javax.swing.JButton();
        address = new javax.swing.JLabel();
        proftabnamev = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        proftabagev = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        proftabgenderv = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        gymnametitle = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.setFont(new java.awt.Font("Segoe Print", 1, 17)); // NOI18N

        hometab.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        homecontent.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        homecontent.setText("Welcome to POWER GYM Portal");

        javax.swing.GroupLayout hometabLayout = new javax.swing.GroupLayout(hometab);
        hometab.setLayout(hometabLayout);
        hometabLayout.setHorizontalGroup(
            hometabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hometabLayout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addComponent(homecontent)
                .addGap(416, 416, 416))
        );
        hometabLayout.setVerticalGroup(
            hometabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hometabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homecontent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(539, Short.MAX_VALUE))
        );

        tabs.addTab("Home", hometab);

        addcustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addcustomer.setText("Add  Customer");
        addcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustomerActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout custtabLayout = new javax.swing.GroupLayout(custtab);
        custtab.setLayout(custtabLayout);
        custtabLayout.setHorizontalGroup(
            custtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custtabLayout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addGroup(custtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(addcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(457, Short.MAX_VALUE))
        );
        custtabLayout.setVerticalGroup(
            custtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custtabLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(viewcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(addcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        tabs.addTab("Customers", custtab);

        addequipment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addequipment.setText("Add Equipment");
        addequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addequipmentActionPerformed(evt);
            }
        });

        viewequipment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewequipment.setText("View Equipment");
        viewequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewequipmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout equiptabLayout = new javax.swing.GroupLayout(equiptab);
        equiptab.setLayout(equiptabLayout);
        equiptabLayout.setHorizontalGroup(
            equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equiptabLayout.createSequentialGroup()
                .addContainerGap(484, Short.MAX_VALUE)
                .addGroup(equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addequipment, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewequipment, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(458, 458, 458))
        );
        equiptabLayout.setVerticalGroup(
            equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equiptabLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(viewequipment, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(addequipment, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        tabs.addTab("Equipments", equiptab);

        viewmembership.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewmembership.setText("View Membership");
        viewmembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewmembershipActionPerformed(evt);
            }
        });

        upgrademembership.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upgrademembership.setText("Upgrade Membership");
        upgrademembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgrademembershipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout memtabLayout = new javax.swing.GroupLayout(memtab);
        memtab.setLayout(memtabLayout);
        memtabLayout.setHorizontalGroup(
            memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memtabLayout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addGroup(memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewmembership, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(upgrademembership, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addContainerGap(485, Short.MAX_VALUE))
        );
        memtabLayout.setVerticalGroup(
            memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memtabLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(viewmembership, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(upgrademembership, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        tabs.addTab("Membership", memtab);

        viewpayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewpayment.setText("View Payment");
        viewpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpaymentActionPerformed(evt);
            }
        });

        acceptpayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acceptpayment.setText("Accept Payment");
        acceptpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptpaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paytabLayout = new javax.swing.GroupLayout(paytab);
        paytab.setLayout(paytabLayout);
        paytabLayout.setHorizontalGroup(
            paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paytabLayout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addGroup(paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewpayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acceptpayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(471, 471, 471))
        );
        paytabLayout.setVerticalGroup(
            paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paytabLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(viewpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(acceptpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        tabs.addTab("Payment", paytab);

        viewstaff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewstaff.setText("View Staff");
        viewstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstaffActionPerformed(evt);
            }
        });

        addstaff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addstaff.setText("Add Staff");
        addstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stafftabLayout = new javax.swing.GroupLayout(stafftab);
        stafftab.setLayout(stafftabLayout);
        stafftabLayout.setHorizontalGroup(
            stafftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stafftabLayout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addGroup(stafftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewstaff, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(addstaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(505, Short.MAX_VALUE))
        );
        stafftabLayout.setVerticalGroup(
            stafftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stafftabLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(viewstaff, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addstaff, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        tabs.addTab("Staff", stafftab);

        viewclass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewclass.setText("View Class");
        viewclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewclassActionPerformed(evt);
            }
        });

        addclass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addclass.setText("Add Class");
        addclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout classtabLayout = new javax.swing.GroupLayout(classtab);
        classtab.setLayout(classtabLayout);
        classtabLayout.setHorizontalGroup(
            classtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classtabLayout.createSequentialGroup()
                .addGap(468, 468, 468)
                .addGroup(classtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewclass, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(addclass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(505, Short.MAX_VALUE))
        );
        classtabLayout.setVerticalGroup(
            classtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classtabLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(viewclass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(addclass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        tabs.addTab("Class", classtab);

        gender.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        gender.setText("Gender");

        proftabheightv.setEditable(false);
        proftabheightv.setBackground(new java.awt.Color(255, 255, 153));

        height.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        height.setText("Height");

        proftabweightv.setEditable(false);
        proftabweightv.setBackground(new java.awt.Color(255, 255, 153));

        weight.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        weight.setText("Weight");

        proftabcontactv.setEditable(false);
        proftabcontactv.setBackground(new java.awt.Color(255, 255, 153));

        proftabemailv.setEditable(false);
        proftabemailv.setBackground(new java.awt.Color(255, 255, 153));

        contact.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        contact.setText("Contact");

        proftabaddressv.setEditable(false);
        proftabaddressv.setBackground(new java.awt.Color(255, 255, 153));

        email.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        email.setText("Email");

        showprofile.setText("Show");
        showprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showprofileActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        address.setText("Address");

        proftabnamev.setEditable(false);
        proftabnamev.setBackground(new java.awt.Color(255, 255, 153));

        name.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        name.setText("Name");

        proftabagev.setEditable(false);
        proftabagev.setBackground(new java.awt.Color(255, 255, 153));

        age.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        age.setText("Age");

        proftabgenderv.setEditable(false);
        proftabgenderv.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout proftabLayout = new javax.swing.GroupLayout(proftab);
        proftab.setLayout(proftabLayout);
        proftabLayout.setHorizontalGroup(
            proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proftabLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(proftabLayout.createSequentialGroup()
                            .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(proftabLayout.createSequentialGroup()
                                    .addComponent(weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(148, 148, 148))
                                .addGroup(proftabLayout.createSequentialGroup()
                                    .addComponent(height, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(149, 149, 149)))
                            .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(proftabheightv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proftabweightv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(proftabLayout.createSequentialGroup()
                            .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(address)
                                .addComponent(email)
                                .addComponent(contact))
                            .addGap(143, 143, 143)
                            .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(proftabaddressv)
                                .addComponent(proftabemailv)
                                .addComponent(proftabcontactv, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(proftabLayout.createSequentialGroup()
                        .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proftabLayout.createSequentialGroup()
                                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gender)
                                    .addComponent(age))
                                .addGap(148, 148, 148))
                            .addGroup(proftabLayout.createSequentialGroup()
                                .addComponent(name)
                                .addGap(166, 166, 166)))
                        .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(proftabnamev)
                            .addComponent(proftabgenderv)
                            .addComponent(proftabagev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(528, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proftabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showprofile)
                .addGap(115, 115, 115))
        );
        proftabLayout.setVerticalGroup(
            proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proftabLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(proftabnamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(proftabagev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(proftabgenderv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(height)
                    .addComponent(proftabheightv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight)
                    .addComponent(proftabweightv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact)
                    .addComponent(proftabcontactv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(proftabemailv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addGap(34, 34, 34)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(proftabaddressv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(showprofile)
                .addGap(44, 44, 44))
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabs))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustomerActionPerformed
        AddCustomer w=new AddCustomer();
        w.setVisible(true);
    }//GEN-LAST:event_addcustomerActionPerformed

    private void addequipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addequipmentActionPerformed
        AddEquipment w=new AddEquipment();
        w.setVisible(true);
    }//GEN-LAST:event_addequipmentActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void viewcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcustomerActionPerformed
        ViewCustomer w=new ViewCustomer();
        w.setVisible(true);
    }//GEN-LAST:event_viewcustomerActionPerformed

    private void viewequipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewequipmentActionPerformed
        ViewEquipment w=new ViewEquipment();
        w.setVisible(true);
    }//GEN-LAST:event_viewequipmentActionPerformed

    private void acceptpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptpaymentActionPerformed
        AcceptPayment w=new AcceptPayment();
        w.setVisible(true);
    }//GEN-LAST:event_acceptpaymentActionPerformed

    private void addstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffActionPerformed
        AddStaff w=new AddStaff();
        w.setVisible(true);
    }//GEN-LAST:event_addstaffActionPerformed

    private void upgrademembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgrademembershipActionPerformed
        UpgradeMembership w=new UpgradeMembership();
        w.setVisible(true);
    }//GEN-LAST:event_upgrademembershipActionPerformed

    private void viewpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpaymentActionPerformed
        ViewPayment w=new ViewPayment();
        w.setVisible(true);
    }//GEN-LAST:event_viewpaymentActionPerformed

    private void addclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclassActionPerformed
        CreateClass w=new CreateClass();
        w.setVisible(true);
    }//GEN-LAST:event_addclassActionPerformed

    private void viewstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstaffActionPerformed
        ViewStaff w= new ViewStaff();
        w.setVisible(true);
    }//GEN-LAST:event_viewstaffActionPerformed

    private void viewclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewclassActionPerformed
        ViewClass w=new ViewClass();
        w.setVisible(true);
    }//GEN-LAST:event_viewclassActionPerformed

    private void viewmembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewmembershipActionPerformed
        ViewMembership w=new ViewMembership();
        w.setVisible(true);
    }//GEN-LAST:event_viewmembershipActionPerformed

    private void showprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showprofileActionPerformed
        conn=MysqlConnect.ConnectDB();
        String Sql="Select * from customer where CName=?";
        try{
            pst=conn.prepareStatement(Sql);
            pst.setString(1,thisuser);
            rs=pst.executeQuery();
            if(rs.next()){
                proftabnamev.setText(rs.getString(2));
                proftabagev.setText(rs.getString(3));
                proftabcontactv.setText(rs.getString(4));
                proftabemailv.setText(rs.getString(5));
                proftabaddressv.setText(rs.getString(6));
                proftabgenderv.setText(rs.getString(7));
                proftabheightv.setText(rs.getString(8));
                proftabweightv.setText(rs.getString(9));
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
    private javax.swing.JLabel address;
    private javax.swing.JButton addstaff;
    private javax.swing.JLabel age;
    private javax.swing.JPanel classtab;
    private javax.swing.JLabel contact;
    private javax.swing.JPanel custtab;
    private javax.swing.JLabel email;
    private javax.swing.JPanel equiptab;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel gymnametitle;
    private javax.swing.JPanel header;
    private javax.swing.JLabel height;
    private javax.swing.JLabel homecontent;
    private javax.swing.JPanel hometab;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logout;
    private javax.swing.JPanel memtab;
    private javax.swing.JLabel name;
    private javax.swing.JPanel paytab;
    private javax.swing.JPanel proftab;
    private javax.swing.JTextField proftabaddressv;
    private javax.swing.JTextField proftabagev;
    private javax.swing.JTextField proftabcontactv;
    private javax.swing.JTextField proftabemailv;
    private javax.swing.JTextField proftabgenderv;
    private javax.swing.JTextField proftabheightv;
    private javax.swing.JTextField proftabnamev;
    private javax.swing.JTextField proftabweightv;
    private javax.swing.JButton showprofile;
    private javax.swing.JPanel stafftab;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JButton upgrademembership;
    private javax.swing.JButton viewclass;
    private javax.swing.JButton viewcustomer;
    private javax.swing.JButton viewequipment;
    private javax.swing.JButton viewmembership;
    private javax.swing.JButton viewpayment;
    private javax.swing.JButton viewstaff;
    private javax.swing.JLabel weight;
    // End of variables declaration//GEN-END:variables
}

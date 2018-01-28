package gympackage;
import java.sql.*;
import javax.swing.*;

public class UserPanel extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null,pst1=null;
    ResultSet rs=null,rs1=null;
    String thisuser=Login.username;
    public UserPanel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        hometab = new javax.swing.JPanel();
        homecontent = new javax.swing.JLabel();
        memtab = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        memtabpackagev = new javax.swing.JTextField();
        memtabfeesv = new javax.swing.JTextField();
        memtabfacilityv = new javax.swing.JTextField();
        memtabdatev = new javax.swing.JTextField();
        memtabdeadlinev = new javax.swing.JTextField();
        memdeadline = new javax.swing.JLabel();
        packagelevel = new javax.swing.JLabel();
        fees = new javax.swing.JLabel();
        facility = new javax.swing.JLabel();
        dateofmem = new javax.swing.JLabel();
        showmembership = new javax.swing.JButton();
        paytab = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        paytabstatusv = new javax.swing.JTextField();
        paytabamountv = new javax.swing.JTextField();
        paytablastdatev = new javax.swing.JTextField();
        paytabmodev = new javax.swing.JTextField();
        status = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        lastdateofpayment = new javax.swing.JLabel();
        modeofpayment = new javax.swing.JLabel();
        showpayment = new javax.swing.JButton();
        equiptab = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        equiptabtypev = new javax.swing.JTextField();
        equiptabrentv = new javax.swing.JTextField();
        equiptablevalidityv = new javax.swing.JTextField();
        equiptabrentdatev = new javax.swing.JTextField();
        equipname = new javax.swing.JLabel();
        equipname1 = new javax.swing.JLabel();
        validity = new javax.swing.JLabel();
        rentaldate = new javax.swing.JLabel();
        showequipment = new javax.swing.JButton();
        proftab = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        proftabaddressv = new javax.swing.JTextField();
        proftabnamev = new javax.swing.JTextField();
        proftabagev = new javax.swing.JTextField();
        proftabgenderv = new javax.swing.JTextField();
        proftabheightv = new javax.swing.JTextField();
        proftabweightv = new javax.swing.JTextField();
        proftabcontactv = new javax.swing.JTextField();
        proftabemailv = new javax.swing.JTextField();
        weight = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        showprofile = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        gymnametitle = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        moto = new javax.swing.JLabel();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hometabLayout.createSequentialGroup()
                .addContainerGap(452, Short.MAX_VALUE)
                .addComponent(homecontent)
                .addGap(416, 416, 416))
        );
        hometabLayout.setVerticalGroup(
            hometabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hometabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homecontent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(526, Short.MAX_VALUE))
        );

        tabs.addTab("Home", hometab);

        jPanel1.setBackground(new java.awt.Color(222, 231, 231));

        memtabpackagev.setEditable(false);
        memtabpackagev.setBackground(new java.awt.Color(172, 241, 227));

        memtabfeesv.setEditable(false);
        memtabfeesv.setBackground(new java.awt.Color(172, 241, 227));

        memtabfacilityv.setEditable(false);
        memtabfacilityv.setBackground(new java.awt.Color(172, 241, 227));

        memtabdatev.setEditable(false);
        memtabdatev.setBackground(new java.awt.Color(172, 241, 227));

        memtabdeadlinev.setEditable(false);
        memtabdeadlinev.setBackground(new java.awt.Color(172, 241, 227));

        memdeadline.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        memdeadline.setText("Membership Deadline");

        packagelevel.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        packagelevel.setText("Package Level");

        fees.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        fees.setText("Fees");

        facility.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        facility.setText("Facility");

        dateofmem.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        dateofmem.setText("Date Of Membership");

        showmembership.setText("Show");
        showmembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showmembershipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(packagelevel)
                                    .addComponent(facility)
                                    .addComponent(fees))
                                .addGap(166, 166, 166))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dateofmem, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(memdeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(memtabdeadlinev)
                            .addComponent(memtabdatev)
                            .addComponent(memtabfeesv)
                            .addComponent(memtabpackagev)
                            .addComponent(memtabfacilityv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(showmembership)
                        .addGap(241, 241, 241)))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fees)
                                    .addComponent(memtabfeesv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(packagelevel))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(facility)
                            .addComponent(memtabfacilityv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateofmem)
                            .addComponent(memtabdatev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(memdeadline)
                            .addComponent(memtabdeadlinev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(memtabpackagev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(showmembership)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout memtabLayout = new javax.swing.GroupLayout(memtab);
        memtab.setLayout(memtabLayout);
        memtabLayout.setHorizontalGroup(
            memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memtabLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        memtabLayout.setVerticalGroup(
            memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memtabLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        tabs.addTab("My Membership", memtab);

        jPanel4.setBackground(new java.awt.Color(222, 231, 231));

        paytabstatusv.setEditable(false);
        paytabstatusv.setBackground(new java.awt.Color(172, 241, 227));

        paytabamountv.setEditable(false);
        paytabamountv.setBackground(new java.awt.Color(172, 241, 227));

        paytablastdatev.setEditable(false);
        paytablastdatev.setBackground(new java.awt.Color(172, 241, 227));

        paytabmodev.setEditable(false);
        paytabmodev.setBackground(new java.awt.Color(172, 241, 227));

        status.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        status.setText("Status");

        amount.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        amount.setText("Amount");

        lastdateofpayment.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        lastdateofpayment.setText("Last Date Of Payment");

        modeofpayment.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        modeofpayment.setText("Mode Of Payment");

        showpayment.setText("Show");
        showpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status)
                    .addComponent(lastdateofpayment)
                    .addComponent(amount)
                    .addComponent(modeofpayment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paytabmodev, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paytabamountv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paytabstatusv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paytablastdatev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(showpayment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(status)
                        .addGap(31, 31, 31)
                        .addComponent(amount)
                        .addGap(32, 32, 32)
                        .addComponent(lastdateofpayment)
                        .addGap(30, 30, 30)
                        .addComponent(modeofpayment))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(paytabstatusv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(paytabamountv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(paytablastdatev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(paytabmodev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(showpayment)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout paytabLayout = new javax.swing.GroupLayout(paytab);
        paytab.setLayout(paytabLayout);
        paytabLayout.setHorizontalGroup(
            paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paytabLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        paytabLayout.setVerticalGroup(
            paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paytabLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        tabs.addTab("My Payment", paytab);

        jPanel3.setBackground(new java.awt.Color(222, 231, 231));

        equiptabtypev.setEditable(false);
        equiptabtypev.setBackground(new java.awt.Color(172, 241, 227));

        equiptabrentv.setEditable(false);
        equiptabrentv.setBackground(new java.awt.Color(172, 241, 227));

        equiptablevalidityv.setEditable(false);
        equiptablevalidityv.setBackground(new java.awt.Color(172, 241, 227));

        equiptabrentdatev.setEditable(false);
        equiptabrentdatev.setBackground(new java.awt.Color(172, 241, 227));

        equipname.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        equipname.setText("Equipment Type");

        equipname1.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        equipname1.setText("Rent");

        validity.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        validity.setText("Validity");

        rentaldate.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        rentaldate.setText("Rental Date");

        showequipment.setText("Show");
        showequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showequipmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rentaldate)
                    .addComponent(validity, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipname)
                    .addComponent(equipname1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(equiptablevalidityv)
                    .addComponent(equiptabrentdatev)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equiptabrentv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equiptabtypev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showequipment)
                .addGap(269, 269, 269))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(equipname)
                        .addGap(31, 31, 31)
                        .addComponent(equipname1)
                        .addGap(34, 34, 34)
                        .addComponent(validity)
                        .addGap(37, 37, 37)
                        .addComponent(rentaldate))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(equiptabtypev, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(equiptabrentv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(equiptablevalidityv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(equiptabrentdatev, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(showequipment)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout equiptabLayout = new javax.swing.GroupLayout(equiptab);
        equiptab.setLayout(equiptabLayout);
        equiptabLayout.setHorizontalGroup(
            equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equiptabLayout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        equiptabLayout.setVerticalGroup(
            equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equiptabLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        tabs.addTab("My Equipment", equiptab);

        jPanel2.setBackground(new java.awt.Color(222, 231, 231));

        proftabaddressv.setBackground(new java.awt.Color(172, 241, 227));

        proftabnamev.setBackground(new java.awt.Color(172, 241, 227));

        proftabagev.setBackground(new java.awt.Color(172, 241, 227));

        proftabgenderv.setBackground(new java.awt.Color(172, 241, 227));

        proftabheightv.setBackground(new java.awt.Color(172, 241, 227));

        proftabweightv.setBackground(new java.awt.Color(172, 241, 227));

        proftabcontactv.setBackground(new java.awt.Color(172, 241, 227));

        proftabemailv.setBackground(new java.awt.Color(172, 241, 227));

        weight.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        weight.setText("Weight");

        contact.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        contact.setText("Contact");

        email.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        email.setText("Email");

        address.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        address.setText("Address");

        name.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        name.setText("Name");

        age.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        age.setText("Age");

        gender.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        gender.setText("Gender");

        height.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        height.setText("Height");

        showprofile.setText("Show");
        showprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showprofileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(email)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name)
                                .addComponent(gender)
                                .addComponent(age))
                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(proftabweightv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(proftabcontactv, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proftabaddressv, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proftabemailv, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(proftabnamev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(proftabagev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(proftabgenderv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addComponent(proftabheightv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contact)
                            .addComponent(address))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(showprofile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proftabnamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(proftabagev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proftabgenderv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proftabheightv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(height))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proftabweightv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weight))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proftabcontactv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact)))
                    .addComponent(age))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proftabemailv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proftabaddressv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address))
                .addGap(15, 15, 15)
                .addComponent(showprofile)
                .addContainerGap())
        );

        javax.swing.GroupLayout proftabLayout = new javax.swing.GroupLayout(proftab);
        proftab.setLayout(proftabLayout);
        proftabLayout.setHorizontalGroup(
            proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proftabLayout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        proftabLayout.setVerticalGroup(
            proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proftabLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
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

        moto.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        moto.setText("....A moto to change");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gymnametitle, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moto)
                .addGap(178, 178, 178)
                .addComponent(logout)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(moto)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logout)
                    .addComponent(gymnametitle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tabs))
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

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

    private void showpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpaymentActionPerformed
        conn=MysqlConnect.ConnectDB();
        String Sql="Select * from payment where CID=(Select CID from customer where CName=?)";
        try{
            pst=conn.prepareStatement(Sql);
            pst.setString(1,thisuser);
            rs=pst.executeQuery();
            if(rs.next()){
                paytabstatusv.setText(rs.getString(2));
                paytabamountv.setText(rs.getString(3));
                paytablastdatev.setText(rs.getString(4));
                paytabmodev.setText(rs.getString(5));
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_showpaymentActionPerformed

    private void showmembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showmembershipActionPerformed
        conn=MysqlConnect.ConnectDB();
        String Sql="Select * from customer where CName=?";
        String Sql1="Select * from membership where MEMID=?";
        try{
            String id=null;
            pst=conn.prepareStatement(Sql);
            pst1=conn.prepareStatement(Sql1);
            pst.setString(1,thisuser);
            rs=pst.executeQuery();
            if(rs.next()){
                memtabdatev.setText(rs.getString(11));
                memtabdeadlinev.setText(rs.getString(12));
                id =rs.getString(10);
                }
            pst1.setString(1,id);
            rs1=pst1.executeQuery();
            if(rs1.next()){
                memtabfeesv.setText(rs1.getString(2));
                memtabpackagev.setText(rs1.getString(3));
                memtabfacilityv.setText(rs1.getString(4));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_showmembershipActionPerformed

    private void showequipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showequipmentActionPerformed
        conn=MysqlConnect.ConnectDB();
        String Sql="Select * from customer_equipment where CID=(Select CID from customer where CName=?)";
        String Sql1="Select * from equipment where EID=?";
        try{
            String id=null;
            pst=conn.prepareStatement(Sql);
            pst1=conn.prepareStatement(Sql1);
            pst.setString(1,thisuser);
            rs=pst.executeQuery();
            if(rs.next()){
                equiptablevalidityv.setText(rs.getString(3));
                equiptabrentdatev.setText(rs.getString(4));
                id =rs.getString(2);
                }
            pst1.setString(1,id);
            rs1=pst1.executeQuery();
            if(rs1.next()){
                equiptabtypev.setText(rs1.getString(5));
                equiptabrentv.setText(rs1.getString(6));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_showequipmentActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPanel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel dateofmem;
    private javax.swing.JLabel email;
    private javax.swing.JLabel equipname;
    private javax.swing.JLabel equipname1;
    private javax.swing.JPanel equiptab;
    private javax.swing.JTextField equiptablevalidityv;
    private javax.swing.JTextField equiptabrentdatev;
    private javax.swing.JTextField equiptabrentv;
    private javax.swing.JTextField equiptabtypev;
    private javax.swing.JLabel facility;
    private javax.swing.JLabel fees;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel gymnametitle;
    private javax.swing.JPanel header;
    private javax.swing.JLabel height;
    private javax.swing.JLabel homecontent;
    private javax.swing.JPanel hometab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lastdateofpayment;
    private javax.swing.JButton logout;
    private javax.swing.JLabel memdeadline;
    private javax.swing.JPanel memtab;
    private javax.swing.JTextField memtabdatev;
    private javax.swing.JTextField memtabdeadlinev;
    private javax.swing.JTextField memtabfacilityv;
    private javax.swing.JTextField memtabfeesv;
    private javax.swing.JTextField memtabpackagev;
    private javax.swing.JLabel modeofpayment;
    private javax.swing.JLabel moto;
    private javax.swing.JLabel name;
    private javax.swing.JLabel packagelevel;
    private javax.swing.JPanel paytab;
    private javax.swing.JTextField paytabamountv;
    private javax.swing.JTextField paytablastdatev;
    private javax.swing.JTextField paytabmodev;
    private javax.swing.JTextField paytabstatusv;
    private javax.swing.JPanel proftab;
    private javax.swing.JTextField proftabaddressv;
    private javax.swing.JTextField proftabagev;
    private javax.swing.JTextField proftabcontactv;
    private javax.swing.JTextField proftabemailv;
    private javax.swing.JTextField proftabgenderv;
    private javax.swing.JTextField proftabheightv;
    private javax.swing.JTextField proftabnamev;
    private javax.swing.JTextField proftabweightv;
    private javax.swing.JLabel rentaldate;
    private javax.swing.JButton showequipment;
    private javax.swing.JButton showmembership;
    private javax.swing.JButton showpayment;
    private javax.swing.JButton showprofile;
    private javax.swing.JLabel status;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JLabel validity;
    private javax.swing.JLabel weight;
    // End of variables declaration//GEN-END:variables
}

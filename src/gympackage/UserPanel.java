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
        facility = new javax.swing.JLabel();
        memtabdatev = new javax.swing.JTextField();
        dateofmem = new javax.swing.JLabel();
        memtabdeadlinev = new javax.swing.JTextField();
        memdeadline = new javax.swing.JLabel();
        showmembership = new javax.swing.JButton();
        memtabpackagev = new javax.swing.JTextField();
        packagelevel = new javax.swing.JLabel();
        memtabfeesv = new javax.swing.JTextField();
        fees = new javax.swing.JLabel();
        memtabfacilityv = new javax.swing.JTextField();
        paytab = new javax.swing.JPanel();
        lastdateofpayment = new javax.swing.JLabel();
        paytabmodev = new javax.swing.JTextField();
        modeofpayment = new javax.swing.JLabel();
        showpayment = new javax.swing.JButton();
        paytabstatusv = new javax.swing.JTextField();
        status = new javax.swing.JLabel();
        paytabamountv = new javax.swing.JTextField();
        amount = new javax.swing.JLabel();
        paytablastdatev = new javax.swing.JTextField();
        equiptab = new javax.swing.JPanel();
        equiptablevalidityv = new javax.swing.JTextField();
        validity = new javax.swing.JLabel();
        equiptabrentdatev = new javax.swing.JTextField();
        rentaldate = new javax.swing.JLabel();
        showequipment = new javax.swing.JButton();
        equiptabtypev = new javax.swing.JTextField();
        equipname = new javax.swing.JLabel();
        equiptabrentv = new javax.swing.JTextField();
        equipname1 = new javax.swing.JLabel();
        proftab = new javax.swing.JPanel();
        showprofile = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        proftabnamev = new javax.swing.JTextField();
        proftabagev = new javax.swing.JTextField();
        proftabgenderv = new javax.swing.JTextField();
        proftabheightv = new javax.swing.JTextField();
        proftabweightv = new javax.swing.JTextField();
        proftabcontactv = new javax.swing.JTextField();
        proftabemailv = new javax.swing.JTextField();
        proftabaddressv = new javax.swing.JTextField();
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

        facility.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        facility.setText("Facility");

        memtabdatev.setEditable(false);
        memtabdatev.setBackground(new java.awt.Color(255, 255, 153));

        dateofmem.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        dateofmem.setText("Date Of Membership");

        memtabdeadlinev.setEditable(false);
        memtabdeadlinev.setBackground(new java.awt.Color(255, 255, 153));

        memdeadline.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        memdeadline.setText("Membership Deadline");

        showmembership.setText("Show");
        showmembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showmembershipActionPerformed(evt);
            }
        });

        memtabpackagev.setEditable(false);
        memtabpackagev.setBackground(new java.awt.Color(255, 255, 153));

        packagelevel.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        packagelevel.setText("Package Level");

        memtabfeesv.setEditable(false);
        memtabfeesv.setBackground(new java.awt.Color(255, 255, 153));

        fees.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        fees.setText("Fees");

        memtabfacilityv.setEditable(false);
        memtabfacilityv.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout memtabLayout = new javax.swing.GroupLayout(memtab);
        memtab.setLayout(memtabLayout);
        memtabLayout.setHorizontalGroup(
            memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memtabLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(packagelevel)
                    .addComponent(facility)
                    .addComponent(fees)
                    .addComponent(dateofmem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memdeadline, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addGap(101, 101, 101)
                .addGroup(memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(memtabdeadlinev, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(memtabdatev, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(memtabfeesv, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(memtabpackagev, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(memtabfacilityv))
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memtabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showmembership)
                .addGap(92, 92, 92))
        );
        memtabLayout.setVerticalGroup(
            memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memtabLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packagelevel)
                    .addComponent(memtabpackagev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fees)
                    .addComponent(memtabfeesv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facility)
                    .addComponent(memtabfacilityv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateofmem)
                    .addComponent(memtabdatev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(memtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memdeadline)
                    .addComponent(memtabdeadlinev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(showmembership)
                .addGap(65, 65, 65))
        );

        tabs.addTab("My Membership", memtab);

        lastdateofpayment.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        lastdateofpayment.setText("Last Date Of Payment");

        paytabmodev.setEditable(false);
        paytabmodev.setBackground(new java.awt.Color(255, 255, 153));

        modeofpayment.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        modeofpayment.setText("Mode Of Payment");

        showpayment.setText("Show");
        showpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpaymentActionPerformed(evt);
            }
        });

        paytabstatusv.setEditable(false);
        paytabstatusv.setBackground(new java.awt.Color(255, 255, 153));

        status.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        status.setText("Status");

        paytabamountv.setEditable(false);
        paytabamountv.setBackground(new java.awt.Color(255, 255, 153));

        amount.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        amount.setText("Amount");

        paytablastdatev.setEditable(false);
        paytablastdatev.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout paytabLayout = new javax.swing.GroupLayout(paytab);
        paytab.setLayout(paytabLayout);
        paytabLayout.setHorizontalGroup(
            paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paytabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showpayment)
                .addGap(112, 112, 112))
            .addGroup(paytabLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status)
                    .addComponent(lastdateofpayment)
                    .addComponent(amount)
                    .addComponent(modeofpayment))
                .addGap(96, 96, 96)
                .addGroup(paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paytabmodev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(paytabamountv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(paytabstatusv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paytablastdatev))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        paytabLayout.setVerticalGroup(
            paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paytabLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status)
                    .addComponent(paytabstatusv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount)
                    .addComponent(paytabamountv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastdateofpayment)
                    .addComponent(paytablastdatev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(paytabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paytabmodev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeofpayment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(showpayment)
                .addGap(78, 78, 78))
        );

        tabs.addTab("My Payment", paytab);

        equiptablevalidityv.setEditable(false);
        equiptablevalidityv.setBackground(new java.awt.Color(255, 255, 153));

        validity.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        validity.setText("Validity");

        equiptabrentdatev.setEditable(false);
        equiptabrentdatev.setBackground(new java.awt.Color(255, 255, 153));

        rentaldate.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        rentaldate.setText("Rental Date");

        showequipment.setText("Show");
        showequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showequipmentActionPerformed(evt);
            }
        });

        equiptabtypev.setEditable(false);
        equiptabtypev.setBackground(new java.awt.Color(255, 255, 153));

        equipname.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        equipname.setText("Equipment Type");

        equiptabrentv.setEditable(false);
        equiptabrentv.setBackground(new java.awt.Color(255, 255, 153));

        equipname1.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        equipname1.setText("Rent");

        javax.swing.GroupLayout equiptabLayout = new javax.swing.GroupLayout(equiptab);
        equiptab.setLayout(equiptabLayout);
        equiptabLayout.setHorizontalGroup(
            equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equiptabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showequipment)
                .addGap(100, 100, 100))
            .addGroup(equiptabLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(equiptabLayout.createSequentialGroup()
                        .addGroup(equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rentaldate)
                            .addComponent(validity, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(218, 218, 218)
                        .addGroup(equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equiptablevalidityv, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(equiptabrentdatev, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                    .addGroup(equiptabLayout.createSequentialGroup()
                        .addGroup(equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equipname)
                            .addComponent(equipname1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205)
                        .addGroup(equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equiptabrentv)
                            .addComponent(equiptabtypev, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        equiptabLayout.setVerticalGroup(
            equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equiptabLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipname)
                    .addComponent(equiptabtypev, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipname1)
                    .addComponent(equiptabrentv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validity)
                    .addComponent(equiptablevalidityv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(equiptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentaldate)
                    .addComponent(equiptabrentdatev, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(showequipment)
                .addGap(88, 88, 88))
        );

        tabs.addTab("My Equipment", equiptab);

        showprofile.setText("Show");
        showprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showprofileActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        name.setText("Name");

        age.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        age.setText("Age");

        gender.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        gender.setText("Gender");

        height.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        height.setText("Height");

        weight.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        weight.setText("Weight");

        contact.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        contact.setText("Contact");

        email.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        email.setText("Email");

        address.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        address.setText("Address");

        proftabnamev.setEditable(false);
        proftabnamev.setBackground(new java.awt.Color(255, 255, 153));

        proftabagev.setEditable(false);
        proftabagev.setBackground(new java.awt.Color(255, 255, 153));

        proftabgenderv.setEditable(false);
        proftabgenderv.setBackground(new java.awt.Color(255, 255, 153));

        proftabheightv.setEditable(false);
        proftabheightv.setBackground(new java.awt.Color(255, 255, 153));

        proftabweightv.setEditable(false);
        proftabweightv.setBackground(new java.awt.Color(255, 255, 153));

        proftabcontactv.setEditable(false);
        proftabcontactv.setBackground(new java.awt.Color(255, 255, 153));

        proftabemailv.setEditable(false);
        proftabemailv.setBackground(new java.awt.Color(255, 255, 153));

        proftabaddressv.setEditable(false);
        proftabaddressv.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout proftabLayout = new javax.swing.GroupLayout(proftab);
        proftab.setLayout(proftabLayout);
        proftabLayout.setHorizontalGroup(
            proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proftabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showprofile)
                .addGap(100, 100, 100))
            .addGroup(proftabLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(proftabLayout.createSequentialGroup()
                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(proftabweightv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(proftabLayout.createSequentialGroup()
                            .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(address)
                                .addComponent(email)
                                .addComponent(contact))
                            .addGap(142, 142, 142)
                            .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(proftabcontactv, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proftabaddressv, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proftabemailv, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(proftabLayout.createSequentialGroup()
                        .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name)
                            .addComponent(gender)
                            .addComponent(age))
                        .addGap(148, 148, 148)
                        .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proftabLayout.createSequentialGroup()
                                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(proftabnamev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(proftabagev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(proftabgenderv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addComponent(proftabheightv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(541, Short.MAX_VALUE))
        );
        proftabLayout.setVerticalGroup(
            proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proftabLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
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
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(height)
                    .addComponent(proftabheightv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight)
                    .addComponent(proftabweightv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact)
                    .addComponent(proftabcontactv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(proftabemailv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(proftabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address)
                    .addComponent(proftabaddressv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(showprofile)
                .addGap(37, 37, 37))
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
                .addGap(104, 104, 104)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout)
                    .addComponent(moto))
                .addContainerGap(26, Short.MAX_VALUE))
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

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
        homebackground = new javax.swing.JLabel();
        memtab = new javax.swing.JPanel();
        formmembership = new javax.swing.JPanel();
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
        membackground = new javax.swing.JLabel();
        paytab = new javax.swing.JPanel();
        formpayment = new javax.swing.JPanel();
        paytabstatusv = new javax.swing.JTextField();
        paytabamountv = new javax.swing.JTextField();
        paytablastdatev = new javax.swing.JTextField();
        paytabmodev = new javax.swing.JTextField();
        status = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        lastdateofpayment = new javax.swing.JLabel();
        modeofpayment = new javax.swing.JLabel();
        showpayment = new javax.swing.JButton();
        paybackground = new javax.swing.JLabel();
        equiptab = new javax.swing.JPanel();
        formequipment = new javax.swing.JPanel();
        equiptabnamev = new javax.swing.JTextField();
        equiptabrentv = new javax.swing.JTextField();
        equiptablevalidityv = new javax.swing.JTextField();
        equiptabrentdatev = new javax.swing.JTextField();
        equipname = new javax.swing.JLabel();
        equipname1 = new javax.swing.JLabel();
        validity = new javax.swing.JLabel();
        rentaldate = new javax.swing.JLabel();
        showequipment = new javax.swing.JButton();
        equipbackground = new javax.swing.JLabel();
        hireequipment = new javax.swing.JButton();
        classtab = new javax.swing.JPanel();
        classbackground = new javax.swing.JLabel();
        formclass = new javax.swing.JPanel();
        classtabtitlev = new javax.swing.JTextField();
        classtabdatev = new javax.swing.JTextField();
        classtabtimingsv = new javax.swing.JTextField();
        classtabcostv = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        timings = new javax.swing.JLabel();
        cost = new javax.swing.JLabel();
        classtabprereqv = new javax.swing.JTextField();
        classtabroomnov = new javax.swing.JTextField();
        prerequisite = new javax.swing.JLabel();
        roomno = new javax.swing.JLabel();
        showclasses = new javax.swing.JButton();
        signupdate = new javax.swing.JLabel();
        classtabsignupdatev = new javax.swing.JTextField();
        joinclass = new javax.swing.JButton();
        viewclass = new javax.swing.JButton();
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
        profbackground = new javax.swing.JLabel();
        changepassword = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        gymnametitle = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        moto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.setFont(new java.awt.Font("Segoe Print", 1, 17)); // NOI18N

        hometab.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        hometab.setLayout(null);

        homecontent.setFont(new java.awt.Font("Bookman Old Style", 3, 26)); // NOI18N
        homecontent.setForeground(new java.awt.Color(255, 255, 255));
        homecontent.setText("WELCOME TO POWER GYM PORTAL");
        hometab.add(homecontent);
        homecontent.setBounds(320, 50, 490, 80);

        homebackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg3.jpg")); // NOI18N
        hometab.add(homebackground);
        homebackground.setBounds(10, 40, 1090, 500);

        tabs.addTab("Home", hometab);

        memtab.setLayout(null);

        formmembership.setBackground(new java.awt.Color(222, 231, 231));

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

        javax.swing.GroupLayout formmembershipLayout = new javax.swing.GroupLayout(formmembership);
        formmembership.setLayout(formmembershipLayout);
        formmembershipLayout.setHorizontalGroup(
            formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formmembershipLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formmembershipLayout.createSequentialGroup()
                        .addGroup(formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formmembershipLayout.createSequentialGroup()
                                .addGroup(formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(packagelevel)
                                    .addComponent(facility)
                                    .addComponent(fees))
                                .addGap(166, 166, 166))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formmembershipLayout.createSequentialGroup()
                                .addComponent(dateofmem, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addGroup(formmembershipLayout.createSequentialGroup()
                                .addComponent(memdeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(memtabdeadlinev)
                            .addComponent(memtabdatev)
                            .addComponent(memtabfeesv)
                            .addComponent(memtabpackagev)
                            .addComponent(memtabfacilityv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formmembershipLayout.createSequentialGroup()
                        .addComponent(showmembership)
                        .addGap(241, 241, 241)))
                .addGap(46, 46, 46))
        );
        formmembershipLayout.setVerticalGroup(
            formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formmembershipLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formmembershipLayout.createSequentialGroup()
                        .addGroup(formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formmembershipLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fees)
                                    .addComponent(memtabfeesv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(packagelevel))
                        .addGap(34, 34, 34)
                        .addGroup(formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(facility)
                            .addComponent(memtabfacilityv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateofmem)
                            .addComponent(memtabdatev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(formmembershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(memdeadline)
                            .addComponent(memtabdeadlinev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(memtabpackagev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(showmembership)
                .addGap(44, 44, 44))
        );

        memtab.add(formmembership);
        formmembership.setBounds(22, 75, 603, 390);

        membackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg8.jpg")); // NOI18N
        memtab.add(membackground);
        membackground.setBounds(670, 100, 400, 320);

        tabs.addTab("My Membership", memtab);

        paytab.setLayout(null);

        formpayment.setBackground(new java.awt.Color(222, 231, 231));

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

        javax.swing.GroupLayout formpaymentLayout = new javax.swing.GroupLayout(formpayment);
        formpayment.setLayout(formpaymentLayout);
        formpaymentLayout.setHorizontalGroup(
            formpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formpaymentLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(formpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status)
                    .addComponent(lastdateofpayment)
                    .addComponent(amount)
                    .addComponent(modeofpayment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(formpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paytabmodev, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paytabamountv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paytabstatusv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paytablastdatev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(formpaymentLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(showpayment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formpaymentLayout.setVerticalGroup(
            formpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formpaymentLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(formpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formpaymentLayout.createSequentialGroup()
                        .addComponent(status)
                        .addGap(31, 31, 31)
                        .addComponent(amount)
                        .addGap(32, 32, 32)
                        .addComponent(lastdateofpayment)
                        .addGap(30, 30, 30)
                        .addComponent(modeofpayment))
                    .addGroup(formpaymentLayout.createSequentialGroup()
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

        paytab.add(formpayment);
        formpayment.setBounds(28, 100, 592, 334);

        paybackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg9.png")); // NOI18N
        paytab.add(paybackground);
        paybackground.setBounds(660, 120, 400, 280);

        tabs.addTab("My Payment", paytab);

        equiptab.setLayout(null);

        formequipment.setBackground(new java.awt.Color(222, 231, 231));

        equiptabnamev.setEditable(false);
        equiptabnamev.setBackground(new java.awt.Color(172, 241, 227));

        equiptabrentv.setEditable(false);
        equiptabrentv.setBackground(new java.awt.Color(172, 241, 227));

        equiptablevalidityv.setEditable(false);
        equiptablevalidityv.setBackground(new java.awt.Color(172, 241, 227));

        equiptabrentdatev.setEditable(false);
        equiptabrentdatev.setBackground(new java.awt.Color(172, 241, 227));

        equipname.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        equipname.setText("Equipment Name");

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

        javax.swing.GroupLayout formequipmentLayout = new javax.swing.GroupLayout(formequipment);
        formequipment.setLayout(formequipmentLayout);
        formequipmentLayout.setHorizontalGroup(
            formequipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formequipmentLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(formequipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rentaldate)
                    .addComponent(validity, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipname)
                    .addComponent(equipname1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(formequipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(equiptablevalidityv)
                    .addComponent(equiptabrentdatev)
                    .addGroup(formequipmentLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(formequipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equiptabrentv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equiptabnamev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formequipmentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showequipment)
                .addGap(269, 269, 269))
        );
        formequipmentLayout.setVerticalGroup(
            formequipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formequipmentLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(formequipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formequipmentLayout.createSequentialGroup()
                        .addComponent(equipname)
                        .addGap(31, 31, 31)
                        .addComponent(equipname1)
                        .addGap(34, 34, 34)
                        .addComponent(validity)
                        .addGap(37, 37, 37)
                        .addComponent(rentaldate))
                    .addGroup(formequipmentLayout.createSequentialGroup()
                        .addComponent(equiptabnamev, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        equiptab.add(formequipment);
        formequipment.setBounds(31, 85, 608, 383);

        equipbackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg14.jpg")); // NOI18N
        equiptab.add(equipbackground);
        equipbackground.setBounds(680, 90, 380, 300);

        hireequipment.setBackground(new java.awt.Color(204, 204, 255));
        hireequipment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hireequipment.setText("Hire Equipment");
        hireequipment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hireequipment.setOpaque(false);
        hireequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireequipmentActionPerformed(evt);
            }
        });
        equiptab.add(hireequipment);
        hireequipment.setBounds(750, 420, 221, 63);

        tabs.addTab("My Equipment", equiptab);

        classbackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg16.jpg")); // NOI18N

        formclass.setBackground(new java.awt.Color(222, 231, 231));

        classtabtitlev.setEditable(false);
        classtabtitlev.setBackground(new java.awt.Color(172, 241, 227));

        classtabdatev.setEditable(false);
        classtabdatev.setBackground(new java.awt.Color(172, 241, 227));

        classtabtimingsv.setEditable(false);
        classtabtimingsv.setBackground(new java.awt.Color(172, 241, 227));

        classtabcostv.setEditable(false);
        classtabcostv.setBackground(new java.awt.Color(172, 241, 227));

        title.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        title.setText("Title");

        date.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        date.setText("Date");

        timings.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        timings.setText("Timings");

        cost.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        cost.setText("Cost");

        classtabprereqv.setEditable(false);
        classtabprereqv.setBackground(new java.awt.Color(172, 241, 227));

        classtabroomnov.setEditable(false);
        classtabroomnov.setBackground(new java.awt.Color(172, 241, 227));

        prerequisite.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        prerequisite.setText("Pre-requisite");

        roomno.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        roomno.setText("Room No");

        showclasses.setText("Show");
        showclasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showclassesActionPerformed(evt);
            }
        });

        signupdate.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        signupdate.setText("SignUp Date");

        classtabsignupdatev.setEditable(false);
        classtabsignupdatev.setBackground(new java.awt.Color(172, 241, 227));

        javax.swing.GroupLayout formclassLayout = new javax.swing.GroupLayout(formclass);
        formclass.setLayout(formclassLayout);
        formclassLayout.setHorizontalGroup(
            formclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formclassLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(formclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formclassLayout.createSequentialGroup()
                        .addComponent(roomno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(classtabroomnov, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formclassLayout.createSequentialGroup()
                        .addComponent(prerequisite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(classtabprereqv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formclassLayout.createSequentialGroup()
                        .addGroup(formclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addComponent(timings)
                            .addComponent(date)
                            .addComponent(cost))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(classtabcostv, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classtabdatev, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classtabtitlev, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classtabtimingsv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(formclassLayout.createSequentialGroup()
                        .addComponent(signupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(classtabsignupdatev, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addGroup(formclassLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(showclasses)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formclassLayout.setVerticalGroup(
            formclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formclassLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(formclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formclassLayout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(18, 18, 18)
                        .addComponent(date)
                        .addGap(18, 18, 18)
                        .addComponent(timings)
                        .addGap(18, 18, 18)
                        .addComponent(cost))
                    .addGroup(formclassLayout.createSequentialGroup()
                        .addComponent(classtabtitlev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(classtabdatev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(classtabtimingsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(classtabcostv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(formclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prerequisite, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classtabprereqv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomno)
                    .addComponent(classtabroomnov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupdate)
                    .addComponent(classtabsignupdatev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(showclasses)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        joinclass.setBackground(new java.awt.Color(204, 204, 255));
        joinclass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        joinclass.setText("Join new class");
        joinclass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        joinclass.setOpaque(false);
        joinclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinclassActionPerformed(evt);
            }
        });

        viewclass.setBackground(new java.awt.Color(204, 204, 255));
        viewclass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewclass.setText("View Class");
        viewclass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewclass.setOpaque(false);
        viewclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewclassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout classtabLayout = new javax.swing.GroupLayout(classtab);
        classtab.setLayout(classtabLayout);
        classtabLayout.setHorizontalGroup(
            classtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classtabLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(formclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(classtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(classtabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(classbackground, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(classtabLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(classtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewclass, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(joinclass, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        classtabLayout.setVerticalGroup(
            classtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classtabLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(classbackground, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(joinclass, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(viewclass, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classtabLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(formclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        tabs.addTab("My Classes", classtab);

        proftab.setLayout(null);

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
                .addGap(0, 0, Short.MAX_VALUE)
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

        proftab.add(jPanel2);
        jPanel2.setBounds(22, 40, 640, 480);

        profbackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\bg4.png")); // NOI18N
        proftab.add(profbackground);
        profbackground.setBounds(690, 30, 400, 390);

        changepassword.setBackground(new java.awt.Color(204, 204, 255));
        changepassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        changepassword.setText("Change password");
        changepassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        changepassword.setOpaque(false);
        changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswordActionPerformed(evt);
            }
        });
        proftab.add(changepassword);
        changepassword.setBounds(780, 450, 221, 63);

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
        Login w=new Login();
        w.setVisible(true);
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
                proftabagev.setText(rs.getString(3)+" years");
                proftabcontactv.setText(rs.getString(4));
                proftabemailv.setText(rs.getString(5));
                proftabaddressv.setText(rs.getString(6));
                if("F".equals(rs.getString(7))){
                    proftabgenderv.setText("Female");
                }
                else
                {
                    proftabgenderv.setText("Male");
                }
                proftabheightv.setText(rs.getString(8)+" cms");
                proftabweightv.setText(rs.getString(9)+" kgs");
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
                paytabamountv.setText(rs.getString(3)+" INR");
                paytablastdatev.setText(rs.getString(4)+" (yyyy-mm-dd)");
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
                memtabdatev.setText(rs.getString(11)+" (yyyy-mm-dd)");
                memtabdeadlinev.setText(rs.getString(12)+" months");
                id =rs.getString(10);
                }
            pst1.setString(1,id);
            rs1=pst1.executeQuery();
            if(rs1.next()){
                memtabfeesv.setText(rs1.getString(2)+" INR");
                memtabpackagev.setText(rs1.getString(3)+" level");
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
                equiptablevalidityv.setText(rs.getString(3)+" months");
                equiptabrentdatev.setText(rs.getString(4)+" (yyyy-mm-dd)");
                id =rs.getString(2);
                }
            pst1.setString(1,id);
            rs1=pst1.executeQuery();
            if(rs1.next()){
                equiptabnamev.setText(rs1.getString(5));
                equiptabrentv.setText(rs1.getString(7)+" INR");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_showequipmentActionPerformed

    private void showclassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showclassesActionPerformed
        conn=MysqlConnect.ConnectDB();
        String Sql="Select * from signup where CID=(Select CID from customer where CName=?)";
        String Sql1="Select * from class where CLID=?";
        try{
            String id=null;
            pst=conn.prepareStatement(Sql);
            pst1=conn.prepareStatement(Sql1);
            pst.setString(1,thisuser);
            rs=pst.executeQuery();
            if(rs.next()){
                classtabsignupdatev.setText(rs.getString(3)+" (yyyy-mm-dd)");
                id =rs.getString(2);
                }
            pst1.setString(1,id);
            rs1=pst1.executeQuery();
            if(rs1.next()){
                classtabcostv.setText(rs1.getString(5)+" INR");
                classtabdatev.setText(rs1.getString(3)+" (yyyy-mm-dd)");
                classtabprereqv.setText(rs1.getString(6));
                classtabroomnov.setText(rs1.getString(7));
                classtabtimingsv.setText(rs1.getString(2));
                classtabtitlev.setText(rs1.getString(4));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_showclassesActionPerformed

    private void joinclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinclassActionPerformed
        JoinNewClass w=new JoinNewClass();
        w.setVisible(true);
    }//GEN-LAST:event_joinclassActionPerformed

    private void hireequipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireequipmentActionPerformed
        HireEquipment w=new HireEquipment();
        w.setVisible(true);
    }//GEN-LAST:event_hireequipmentActionPerformed

    private void changepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswordActionPerformed
        ChangePassword w=new ChangePassword();
        w.setVisible(true);
    }//GEN-LAST:event_changepasswordActionPerformed

    private void viewclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewclassActionPerformed
        ViewClass w=new ViewClass();
        w.setVisible(true);
    }//GEN-LAST:event_viewclassActionPerformed

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
    private javax.swing.JButton changepassword;
    private javax.swing.JLabel classbackground;
    private javax.swing.JPanel classtab;
    private javax.swing.JTextField classtabcostv;
    private javax.swing.JTextField classtabdatev;
    private javax.swing.JTextField classtabprereqv;
    private javax.swing.JTextField classtabroomnov;
    private javax.swing.JTextField classtabsignupdatev;
    private javax.swing.JTextField classtabtimingsv;
    private javax.swing.JTextField classtabtitlev;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel cost;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dateofmem;
    private javax.swing.JLabel email;
    private javax.swing.JLabel equipbackground;
    private javax.swing.JLabel equipname;
    private javax.swing.JLabel equipname1;
    private javax.swing.JPanel equiptab;
    private javax.swing.JTextField equiptablevalidityv;
    private javax.swing.JTextField equiptabnamev;
    private javax.swing.JTextField equiptabrentdatev;
    private javax.swing.JTextField equiptabrentv;
    private javax.swing.JLabel facility;
    private javax.swing.JLabel fees;
    private javax.swing.JPanel formclass;
    private javax.swing.JPanel formequipment;
    private javax.swing.JPanel formmembership;
    private javax.swing.JPanel formpayment;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel gymnametitle;
    private javax.swing.JPanel header;
    private javax.swing.JLabel height;
    private javax.swing.JButton hireequipment;
    private javax.swing.JLabel homebackground;
    private javax.swing.JLabel homecontent;
    private javax.swing.JPanel hometab;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton joinclass;
    private javax.swing.JLabel lastdateofpayment;
    private javax.swing.JButton logout;
    private javax.swing.JLabel membackground;
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
    private javax.swing.JLabel paybackground;
    private javax.swing.JPanel paytab;
    private javax.swing.JTextField paytabamountv;
    private javax.swing.JTextField paytablastdatev;
    private javax.swing.JTextField paytabmodev;
    private javax.swing.JTextField paytabstatusv;
    private javax.swing.JLabel prerequisite;
    private javax.swing.JLabel profbackground;
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
    private javax.swing.JLabel roomno;
    private javax.swing.JButton showclasses;
    private javax.swing.JButton showequipment;
    private javax.swing.JButton showmembership;
    private javax.swing.JButton showpayment;
    private javax.swing.JButton showprofile;
    private javax.swing.JLabel signupdate;
    private javax.swing.JLabel status;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JLabel timings;
    private javax.swing.JLabel title;
    private javax.swing.JLabel validity;
    private javax.swing.JButton viewclass;
    private javax.swing.JLabel weight;
    // End of variables declaration//GEN-END:variables
}

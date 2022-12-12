package ui.commonFunctions;

import businessFramework.Environment;
import businessFramework.commonFunctions.SendNotificationMessage;
import businessFramework.commonFunctions.DOBValidation;
import businessFramework.commonFunctions.EmailFieldValidation;
import businessFramework.commonFunctions.IntegerFieldValidation;
import businessFramework.commonFunctions.PasswordValidation;
import businessFramework.commonFunctions.MobileNoValidation;
import businessFramework.commonFunctions.StringValidation;
import businessFramework.commonFunctions.Validations;
import businessFramework.enterprises.Enterprises;
import businessFramework.enterprises.HealthOnboardEnterprises;
import businessFramework.enterprises.HospitalEnterprises;
import businessFramework.enterprises.UniversityEnterprises;
import businessFramework.network.Network;
import businessFramework.organizations.DoctorOrganizations;
import businessFramework.organizations.CaseOrganizations;
import businessFramework.organizations.Organizations;
import businessFramework.organizations.ManagerOrganizations;
import businessFramework.organizations.HelperOrganizations;
import businessFramework.person.Case;
import businessFramework.person.Person;
import businessFramework.person.PersonDirectory;
import businessFramework.person.Helper;
import businessFramework.roles.DoctorRole;
import businessFramework.roles.CaseRole;
import businessFramework.roles.HelperRole;
import businessFramework.userAccount.User;
import businessFramework.requestPipeline.ManagerRequest;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jhalaksurve
 */
public class RegistrationWorkAreaPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private Environment ecoSystem; 
    private Enterprises enterprises;
    private Organizations organizations;
    
    /**
     * Creates new form RegistrationWorkAreaPanel
     */
    public RegistrationWorkAreaPanel(JPanel userProcessContainer, Environment ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       this.ecoSystem = ecoSystem;
       
       helpSeekerPane.setVisible(false);
         
        addInputVerifiers();
        
        populateCountryComboBox();
        volNetworkCombo.setVisible(false);
        volNetwork.setVisible(false);
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(210,240,114);
         Color c2 = new Color(210,240,114);
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
      private void addInputVerifiers() {
          
        InputVerifier stringValidation = new StringValidation();
        firstNameField.setInputVerifier(stringValidation);
        lastNameField.setInputVerifier(stringValidation);
        addressField1.setInputVerifier(stringValidation);
        addressField2.setInputVerifier(stringValidation);
        townField.setInputVerifier(stringValidation);
        occupationField.setInputVerifier(stringValidation);
        addressField1.setInputVerifier(stringValidation);
        addressField2.setInputVerifier(stringValidation);
        userNameJTxtField.setInputVerifier(stringValidation);
        
        
        InputVerifier passwordValidation = new PasswordValidation();
        passwordField.setInputVerifier(passwordValidation);
        confirmPasswordField.setInputVerifier(passwordValidation);
        
        InputVerifier dobValidtion = new DOBValidation();
        DobField.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new IntegerFieldValidation();
        zipCodeField.setInputVerifier(numberValidation);
        
        InputVerifier emailValidtion = new EmailFieldValidation();
        emailIDField.setInputVerifier(emailValidtion);
     
         InputVerifier phnumberValidation = new MobileNoValidation();
        phoneNumberField.setInputVerifier(phnumberValidation);
      
    }
    
    private void populateCountryComboBox(){
        countryComboBox.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Network does not exist! Please create new networks.");  
         return;        
        }
        countryComboBox.addItem("Please select a country");
        String networkVal = "";   
        HashSet<String> hs = new HashSet();
           
        for(Network network : ecoSystem.getNetworkList()){
           if(!network.getCountry().equals(networkVal))
           {
               hs.add(network.getCountry());
           }
        }
        for(String s : hs)
        {
         countryComboBox.addItem(s);
        }
        }
    
         private void populateNetworkComboBox()
         {
        
        helpSeekerNetworkCombo.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Network does not exist! Sorry for inconvenience.");  
         return;        
        }
        helpSeekerNetworkCombo.addItem("Please select a network");
           
        for(Network network : ecoSystem.getNetworkList()){
             helpSeekerNetworkCombo.addItem(network);
         }

        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        addressField2 = new javax.swing.JTextField();
        DobField = new javax.swing.JFormattedTextField();
        addressField1 = new javax.swing.JTextField();
        emailID1 = new javax.swing.JLabel();
        town = new javax.swing.JLabel();
        emailIDField1 = new javax.swing.JTextField();
        townField = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        zipCodeField = new javax.swing.JTextField();
        occupation = new javax.swing.JLabel();
        occupationField = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        createProfileButton = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        address2 = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JLabel();
        address1 = new javax.swing.JLabel();
        isHelpSeeker = new javax.swing.JRadioButton();
        isHelper = new javax.swing.JRadioButton();
        helpSeekerPane = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        userNameJTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        helpSeekerNw = new javax.swing.JLabel();
        helpSeekerNetworkCombo = new javax.swing.JComboBox();
        manageEnt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        countryComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox();
        isDoctorRadioBtn = new javax.swing.JRadioButton();
        volNetwork = new javax.swing.JLabel();
        volNetworkCombo = new javax.swing.JComboBox();

        emailID1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        emailID1.setText("Confirm Email Address:");

        town.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        town.setText("Town/City: ");

        zipCode.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        zipCode.setText("Zip Code:");

        occupation.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        occupation.setText("Occupation:");

        emailID.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        emailID.setText("Email Address:");

        firstName.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        firstName.setText("First Name:");

        phoneNumber.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        phoneNumber.setText("Phone Number:");

        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        createProfileButton.setBackground(new java.awt.Color(0, 153, 153));
        createProfileButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        createProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        createProfileButton.setText("Register");
        createProfileButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProfileButtonActionPerformed(evt);
            }
        });

        LastName.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        LastName.setText("Last Name:");

        address2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        address2.setText("Address Line2 : ");

        dateOfBirth.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");

        address1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        address1.setText("Address Line1 : ");

        buttonGroup1.add(isHelpSeeker);
        isHelpSeeker.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        isHelpSeeker.setText("I Need Help");
        isHelpSeeker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isHelpSeekerActionPerformed(evt);
            }
        });

        buttonGroup1.add(isHelper);
        isHelper.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        isHelper.setText("I am a Helper");
        isHelper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isHelperActionPerformed(evt);
            }
        });

        helpSeekerPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel7.setText("Create User Account:");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setText("Confirm Password :");

        helpSeekerNw.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        helpSeekerNw.setText("Please Select the Closest City :");

        helpSeekerNetworkCombo.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        helpSeekerNetworkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpSeekerNetworkComboActionPerformed(evt);
            }
        });

        helpSeekerPane.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(passwordField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(userNameJTxtField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(confirmPasswordField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(helpSeekerNw, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(helpSeekerNetworkCombo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout helpSeekerPaneLayout = new javax.swing.GroupLayout(helpSeekerPane);
        helpSeekerPane.setLayout(helpSeekerPaneLayout);
        helpSeekerPaneLayout.setHorizontalGroup(
            helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpSeekerPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, helpSeekerPaneLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(helpSeekerPaneLayout.createSequentialGroup()
                        .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(helpSeekerNw, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(35, 35, 35)
                        .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameJTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helpSeekerNetworkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );
        helpSeekerPaneLayout.setVerticalGroup(
            helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpSeekerPaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helpSeekerNw)
                    .addComponent(helpSeekerNetworkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        manageEnt.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        manageEnt.setText("Welcome to Health Onboard ");

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("Gender:");

        genderComboBox.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Country:");

        countryComboBox.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        countryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setText("State:");

        stateComboBox.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        stateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboBoxActionPerformed(evt);
            }
        });

        buttonGroup1.add(isDoctorRadioBtn);
        isDoctorRadioBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        isDoctorRadioBtn.setText("I am a Doctor");
        isDoctorRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isDoctorRadioBtnActionPerformed(evt);
            }
        });

        volNetwork.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        volNetwork.setText("Please Select the Closest City");

        volNetworkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volNetworkComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(isHelpSeeker)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(isHelper)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(isDoctorRadioBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 367, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lastNameField)
                                        .addComponent(DobField)
                                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(emailIDField)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(volNetworkCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailIDField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(zipCodeField)
                                            .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(addressField2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(addressField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(occupation)
                                .addComponent(emailID1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(volNetwork)
                                    .addGap(212, 212, 212))
                                .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(address1)
                                        .addComponent(town))
                                    .addGap(288, 288, 288))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(114, 114, 114))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(phoneNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(helpSeekerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(createProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageEnt)
                .addGap(354, 354, 354))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(manageEnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isDoctorRadioBtn)
                    .addComponent(isHelper)
                    .addComponent(isHelpSeeker))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phoneNumber)
                                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LastName)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateOfBirth)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(helpSeekerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstName))
                        .addGap(10, 10, 10)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address1))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(town))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(occupation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailIDField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailID1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(volNetworkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volNetwork))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProfileButtonActionPerformed

        try
        {
         if(countryComboBox.getSelectedIndex()<1 || stateComboBox.getSelectedIndex()<1)
         {
        JOptionPane.showMessageDialog(null, "Please Enter valid data for country and state ","warning", JOptionPane.WARNING_MESSAGE);
              return;             
         }
         if(genderComboBox.getSelectedIndex()<1 )
         {
        JOptionPane.showMessageDialog(null, "Please Enter valid gender ","warning", JOptionPane.WARNING_MESSAGE);
              return;             
         }
         
         Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(DobField.getText()) ;
            // Calculate age using dob
            int age = Validations.ageCalculation(dateOfBirthVal);
            
            String phoneNumber = phoneNumberField.getText();
            String firstName =   firstNameField.getText();
            String lastName = lastNameField.getText();
            String address1 = addressField1.getText();
            String address2 = addressField2.getText();
            String town = townField.getText();
            String zipCode = zipCodeField.getText();
            String emailId = emailIDField.getText();
            String confirmEmail = emailIDField1.getText();
            String occupation = occupationField.getText();
            String gender = (String)genderComboBox.getSelectedItem();
            String country = (String)countryComboBox.getSelectedItem();
            String state = (String)stateComboBox.getSelectedItem();
            
            if(firstName != null && !firstName.isEmpty() &&
                lastName!= null && !lastName.isEmpty() &&
                address1!=null && !address1.isEmpty() &&
                    address2!=null && !address2.isEmpty() &&
                town!=null && !town.isEmpty() &&
                occupation!=null && !occupation.isEmpty() &&
                emailId!=null && !emailId.isEmpty() &&
                confirmEmail!=null && !confirmEmail.isEmpty() &&
                zipCode != null && !zipCode.isEmpty() &&
                gender!=null && !gender.isEmpty() && age > 0 && !phoneNumber.isEmpty()
                    &&  country!=null && !country.isEmpty() 
                    &&  state!=null && !state.isEmpty() 
           )
            {
                if(buttonGroup1.getSelection()==null)
                {
             JOptionPane.showMessageDialog(null, "Please select radio button to know if you are a helper, a doctor or need help ","warning", JOptionPane.WARNING_MESSAGE);
              return;       
                }

                if(!(confirmEmail.equals(emailId)))
                {
                    JOptionPane.showMessageDialog(null, "Email does not match. Please Enter valid email id","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
          
                  Person person = null;
              if(isHelpSeeker.isSelected())
                {
                 if(passwordField.getPassword().length ==0 || confirmPasswordField.getPassword().length == 0 ||
                        userNameJTxtField.getText().trim().isEmpty() || helpSeekerNetworkCombo.getSelectedIndex()<1
                            )
                    {
                        JOptionPane.showMessageDialog(null, " Please Enter data in all fields","warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
               
                 
                  if(helpSeekerNetworkCombo.getSelectedIndex()<1)
                    {
                    JOptionPane.showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                    return;     
                    }
                  if(age<50 || age==0 || age > 120)
                  {
                 JOptionPane.showMessageDialog(null, "Your age does not qualify as help seeker","warning", JOptionPane.WARNING_MESSAGE);
                    return;      
                  }
                    String userName = userNameJTxtField.getText();
                    String password = String.valueOf(passwordField.getPassword());
                    String confirmPassword =String.valueOf(confirmPasswordField.getPassword());
               
                    Network caseNw = (Network)helpSeekerNetworkCombo.getSelectedItem();
                      if(!(password.equals(confirmPassword)))
                    {
                        JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid a Password","warning", JOptionPane.WARNING_MESSAGE);
                        organizations.getPersonDirectory().getCustomerLsit().remove(person);
                        return;
                    }
                    
                    getEnterprise(caseNw);
                     if(enterprises == null)
                    {
                  JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+caseNw.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    } 
                    getOrganization("Case",enterprises);
                    
                    if(organizations == null)
                    {
                  JOptionPane.showMessageDialog(null, "HelpSeeker Organization does not exist for the enterprise! "+enterprises.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    } 
                 
                    person = organizations.getPersonDirectory().addCustomer();
                    person.setCase(true);
 
                    for(Enterprises e : caseNw.getEnterprisesDirectory().getEnterprisesList())
                    {
                     for(User ua : e.getUserDirectory().getUserList())
                    {
                        if(ua.getName().equals(userName))
                        {
                         JOptionPane.showMessageDialog(null, "User Name already exist! Please Enter valid user name.","warning", JOptionPane.WARNING_MESSAGE);
                         return;  
                        }
                        else
                        {
                        for(Organizations o : e.getOrganizationsDirectory().getOrganizationsList())
                        {  
                         for(User ua1 : o.getUserDirectory().getUserList())
                            {  
                            if(ua1.getName().equals(userName))
                            {
                             JOptionPane.showMessageDialog(null, "User Name already exist! Please Enter valid user name.","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    if(!organizations.getUserDirectory().checkUniqueName(userName))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exist! Please Enter valid user name.","warning", JOptionPane.WARNING_MESSAGE);
                        organizations.getPersonDirectory().getCustomerLsit().remove((Case)person);
                        return;
                    }
                    // To get help seeker org
                    
                    User user = organizations.getUserDirectory().addUser(userName, password, person, new CaseRole());
                    user.setPerson(person);
                   user.setNetwork((Network)caseNw);
                  
                    // Send Req to Supervisor for approval       
                    ManagerRequest request = new ManagerRequest();
                    request.setReqMessage(ManagerRequest.REQUEST_APPROVAL);
                    request.setSenderDetails(user);
                    request.setStatus(ManagerRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());
                    
                   // For Supervisor  
                  for(Enterprises e : caseNw.getEnterprisesDirectory().getEnterprisesList())
                  {
                      if(e instanceof HealthOnboardEnterprises)
                      {
                       for(Organizations organizations : e.getOrganizationsDirectory().getOrganizationsList())
                       {
                      if (organizations instanceof ManagerOrganizations ){
                                this.organizations = organizations;
                                this.personDirectory = organizations.getPersonDirectory();
                      }
                      }
                      
                      }
                  }
                  
                    if (organizations!=null){
                        organizations.getRequestPipeline().getRequestList().add(request);
                        user.getRequestPipeline().getRequestList().add(request);
                        user.setEnabled(false);
                    }
                }
                else if(isHelper.isSelected())
                {
                    if(age<10 || age==0 || age>45)
                  {
                 JOptionPane.showMessageDialog(null, "Your age does not qualify as Helper","warning", JOptionPane.WARNING_MESSAGE);
                    return;      
                  }
                    if(volNetworkCombo.getSelectedIndex()<1)
                    {
                    JOptionPane.showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                    return;     
                    }
                     Network volNetwork = (Network)volNetworkCombo.getSelectedItem();
                    getEnterprise(volNetwork);
                    
                    if(enterprises==null)
                    {
                   JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! " +volNetwork.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    }
                    getOrganization("Helper",enterprises);
                  if(organizations==null)
                    {
                   JOptionPane.showMessageDialog(null, "Helper Organization does not exist for the enterprise! " +enterprises.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    }
                  
                  person = organizations.getPersonDirectory().addHelper();
                  person.setHelper(true);
               
                   String userName = SendNotificationMessage.generateUserName(lastNameField.getText());
                    if(!organizations.getUserDirectory().checkUniqueName(userName))
                    {
                        userName = SendNotificationMessage.generateUserName(lastNameField.getText());
                    }
                    String password = SendNotificationMessage.generateUserPassword(firstNameField.getText());
                    String emailMsg = buildEmailTxtMsg(userName, password);
                    
                    boolean emailSent = SendNotificationMessage.sendMailNotification(emailMsg, emailIDField.getText(),userName, password);
                    if(!emailSent)
                    {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Email address! ","warning", JOptionPane.WARNING_MESSAGE);
                    organizations.getPersonDirectory().getHelperList().remove((Helper)person);
                    return;         
                    }
                   
                    User user = organizations.getUserDirectory().addUser(userName,password , person, new HelperRole());
                    user.setPerson(person);
                    user.setNetwork(volNetwork);
                    
                    ManagerRequest request = new ManagerRequest();
                    request.setReqMessage(ManagerRequest.REQUEST_APPROVAL);
                    request.setSenderDetails(user);
                    request.setStatus(ManagerRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());
                    
                   // For Supervisor  
                  for(Enterprises e : volNetwork.getEnterprisesDirectory().getEnterprisesList())
                  {
                      if(e instanceof HealthOnboardEnterprises)
                      {
                       for(Organizations organizations : e.getOrganizationsDirectory().getOrganizationsList())
                       {
                      if (organizations instanceof ManagerOrganizations ){
                                this.organizations = organizations;
                                this.personDirectory = organizations.getPersonDirectory();
                      }
                      }
                      
                      }
                  }
                  
                    if (organizations!=null){
                        organizations.getRequestPipeline().getRequestList().add(request);
                        user.getRequestPipeline().getRequestList().add(request);
                        user.setEnabled(false);
                    }
                }
                if(isDoctorRadioBtn.isSelected() )
                {
                  if(age<20 || age==0)
                  {
                 JOptionPane.showMessageDialog(null, "Your age does not qualify as Dcotor","warning", JOptionPane.WARNING_MESSAGE);
                    return;      
                  }
                     if(passwordField.getPassword().length ==0 || confirmPasswordField.getPassword().length == 0 ||
                        userNameJTxtField.getText().trim().isEmpty() || helpSeekerNetworkCombo.getSelectedIndex()<1
                           )
                    {
                        JOptionPane.showMessageDialog(null, " Please Enter data in all fields","warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                     String userName = userNameJTxtField.getText();
                    String password = String.valueOf(passwordField.getPassword());
                    String confirmPassword =String.valueOf(confirmPasswordField.getPassword());
                   
                    Network docNw = (Network)helpSeekerNetworkCombo.getSelectedItem();
                    
                    
                     if(!(password.equals(confirmPassword)))
                    {
                        JOptionPane.showMessageDialog(null, "Password does not match. Please Enter valid Password","warning", JOptionPane.WARNING_MESSAGE);
                        organizations.getPersonDirectory().getPersonList().remove(person);
                        return;
                    }
                    
                    getEnterprise(docNw);
                    if(enterprises==null)
                    {
                     JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+docNw.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    } 
                    getOrganization("Doctor",enterprises);
                    if(organizations==null)
                    {
                     JOptionPane.showMessageDialog(null, "Doctor Organization does not exist for the enterprise! "+enterprises.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    } 
                  person = organizations.getPersonDirectory().addPerson();
                   
                    for(Enterprises e : docNw.getEnterprisesDirectory().getEnterprisesList())
                    {
                     for(User ua : e.getUserDirectory().getUserList())
                    {
                        if(ua.getName().equals(userName))
                        {
                         JOptionPane.showMessageDialog(null, "User Name already exists! Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                         return;  
                        }
                        else
                        {
                        for(Organizations o : e.getOrganizationsDirectory().getOrganizationsList())
                        {  
                         for(User ua1 : o.getUserDirectory().getUserList())
                            {  
                            if(ua1.getName().equals(userName))
                            {
                             JOptionPane.showMessageDialog(null, "User Name already exists! Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    if(!organizations.getUserDirectory().checkUniqueName(userName))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exists! Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                        organizations.getPersonDirectory().getPersonList().remove(person);
                        return;
                    }
                    // To get Doctor org
                    
                    User user = organizations.getUserDirectory().addUser(userName, password, person, new DoctorRole());
                    user.setPerson(person);
                    user.setNetwork(docNw);
                  
                // Request to Supervisor       
                    ManagerRequest request = new ManagerRequest();
                    request.setReqMessage(ManagerRequest.REQUEST_APPROVAL);
                    request.setSenderDetails(user);
                    request.setStatus(ManagerRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());
                    
                     // For Supervisor  
                  for(Enterprises e : docNw.getEnterprisesDirectory().getEnterprisesList())
                  {
                      if(e instanceof HealthOnboardEnterprises)
                      {
                       for(Organizations organizations : e.getOrganizationsDirectory().getOrganizationsList())
                       {
                      if (organizations instanceof ManagerOrganizations ){
                                this.organizations = organizations;
                                this.personDirectory = organizations.getPersonDirectory();
                      }
                      }
                      
                      }
                  }
                     if (organizations!=null){
                        organizations.getRequestPipeline().getRequestList().add(request);
                        user.getRequestPipeline().getRequestList().add(request);
                       user.setEnabled(false);
                    }
                }
                
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setAddress2(address2);
                person.setAddress1(address1);
                person.setTown(town);
                person.setZipCode(zipCode);
                person.setOccupation(occupation);
                person.setEmailId(emailId);
                person.setDob(dateOfBirthVal);
                person.setPhoneNumber(phoneNumber);
                person.setGender(gender);
                person.setCountry(country);
                person.setState(state);
                person.setName();
                person.setAge(age);
                
               
                JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
                resetFields();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
            }
        }
        
        catch(NumberFormatException npe)
        {
            JOptionPane.showMessageDialog(null, "Please Enter valid Number ! ");
        return;
        }
        catch(ParseException npe)
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
           return;
        }
        catch(NullPointerException e )
        {
        JOptionPane.showMessageDialog(null, "Organization does not exist! ");  
          return;
        }
        catch(Exception e )
        {
        JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");  
          return;
        }
    }//GEN-LAST:event_createProfileButtonActionPerformed
    public void resetFields()
    {
     userNameJTxtField.setText("");
     passwordField.setText("");
     confirmPasswordField.setText("");
    firstNameField.setText("");
    lastNameField.setText("");
    DobField.setText("");
    addressField1.setText("");
    addressField2.setText("");
    townField.setText("");
    zipCodeField.setText("");
    occupationField.setText("");
    emailIDField.setText("");
    emailIDField1.setText("");
    phoneNumberField.setText("");
    isHelpSeeker.setSelected(false);
    isHelper.setSelected(false);
    isDoctorRadioBtn.setSelected(false);
     
    }
    
    public void getEnterprise(Network network)
    {
          try
                {
                 for (Network n : ecoSystem.getNetworkList())
                    {
                    if(n.getCity().equals(network.getCity()))   
                    {  
                   for(Enterprises e : n.getEnterprisesDirectory().getEnterprisesList())
                      {
                           if(e instanceof UniversityEnterprises && isHelper.isSelected())
                           {
                             this.enterprises = e;
                             network = n;
                            }
                           else if(e instanceof HealthOnboardEnterprises && isHelpSeeker.isSelected())
                           {
                             this.enterprises = e;
                              network = n;
                            }
                            else if(e instanceof HospitalEnterprises && isDoctorRadioBtn.isSelected())
                           {
                             this.enterprises = e;
                              network = n;
                           }
                      }
                    }
                    }
                }
                catch(Exception e)
                {
                 JOptionPane.showMessageDialog(null, "Please create Enterprise","warning", JOptionPane.WARNING_MESSAGE);
                    return;    
                }
    }
    
    public String buildEmailTxtMsg(String usrNm, String pwd)
    {
      StringBuilder emailMsgTxt = new StringBuilder();
        emailMsgTxt.append("Your account has been created and awaiting approval from manager. Please find username and password to login into our application.");
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("username : ".concat(usrNm));
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("password : ".concat(pwd));
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("Thank You,");
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("HealthOnboard");
        
        return emailMsgTxt.toString();
    }
    
    public void getOrganization(String orgVal, Enterprises e){
     
        try
        {
     for (Organizations organization : e.getOrganizationsDirectory().getOrganizationsList()){
      
       if(orgVal.equals("Helper") && organization instanceof HelperOrganizations)
        {
              this.organizations = organization;
              this.personDirectory = organization.getPersonDirectory();
        
        }     
     else if(orgVal.equals("Case") && organization instanceof CaseOrganizations)
             {
               this.organizations = organization;
               this.personDirectory = organization.getPersonDirectory();
             }  
       
       else if(orgVal.equals("Doctor") && organization instanceof DoctorOrganizations)
             {
               this.organizations = organization;
               this.personDirectory = organization.getPersonDirectory();
             } 
             }
        }
        catch(Exception ex)
        {
         return;     
        }
    }
    

    private void isHelpSeekerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isHelpSeekerActionPerformed

        helpSeekerPane.setVisible(true);
        volNetworkCombo.setVisible(false);
        volNetwork.setVisible(false);
        populateNetworkComboBox();
        
    }//GEN-LAST:event_isHelpSeekerActionPerformed

    private void isHelperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isHelperActionPerformed
        helpSeekerPane.setVisible(false);
        volNetworkCombo.setVisible(true);
        volNetwork.setVisible(true);
        populateVolNetworkComboBox();
    }//GEN-LAST:event_isHelperActionPerformed
    
    
    private void populateVolNetworkComboBox()
         {
         volNetworkCombo.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");  
         return;        
        }
        volNetworkCombo.addItem("Please select a Network");
           
        for(Network network : ecoSystem.getNetworkList()){
             volNetworkCombo.addItem(network);
         }

        }
    
    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void countryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBoxActionPerformed
        
        stateComboBox.removeAllItems();
       
        
      if(countryComboBox.getSelectedIndex()>0)
      {
          stateComboBox.addItem("Please select a State");
         HashSet<String> hsstateVal = new HashSet<>();
        for (Network network : ecoSystem.getNetworkList())
        {
          if(network.getCountry().equals(countryComboBox.getSelectedItem()))
          {
           hsstateVal.add(network.getState());
          }
        }
        for(String s1 : hsstateVal)
        {
        stateComboBox.addItem(s1);
        }
       }
         
    }//GEN-LAST:event_countryComboBoxActionPerformed

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed

    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void helpSeekerNetworkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpSeekerNetworkComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpSeekerNetworkComboActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void isDoctorRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isDoctorRadioBtnActionPerformed
       helpSeekerPane.setVisible(true);
       volNetworkCombo.setVisible(false);
        volNetwork.setVisible(false);
        populateNetworkComboBox();
    }//GEN-LAST:event_isDoctorRadioBtnActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void volNetworkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volNetworkComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volNetworkComboActionPerformed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DobField;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel address1;
    private javax.swing.JLabel address2;
    private javax.swing.JTextField addressField1;
    private javax.swing.JTextField addressField2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JComboBox countryComboBox;
    private javax.swing.JButton createProfileButton;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel emailID1;
    private javax.swing.JTextField emailIDField;
    private javax.swing.JTextField emailIDField1;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JComboBox helpSeekerNetworkCombo;
    private javax.swing.JLabel helpSeekerNw;
    private javax.swing.JLayeredPane helpSeekerPane;
    private javax.swing.JRadioButton isDoctorRadioBtn;
    private javax.swing.JRadioButton isHelpSeeker;
    private javax.swing.JRadioButton isHelper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel occupation;
    private javax.swing.JTextField occupationField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JComboBox stateComboBox;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townField;
    private javax.swing.JTextField userNameJTxtField;
    private javax.swing.JLabel volNetwork;
    private javax.swing.JComboBox volNetworkCombo;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}

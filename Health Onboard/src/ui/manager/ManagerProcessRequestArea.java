package ui.manager;

import businessFramework.Environment;
import businessFramework.commonFunctions.PinLocation;
import businessFramework.commonFunctions.SendNotificationMessage;
import businessFramework.network.Network;
import businessFramework.person.Helper;
import businessFramework.roles.Roles;
import businessFramework.requestPipeline.ManagerRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patil
 */
public class ManagerProcessRequestArea extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private ManagerRequest request;
    private  Environment environment;
    /**
     * Creates new form SupervisorWorkRequestAreaJPanel
     */
    public ManagerProcessRequestArea(JPanel userProcessContainer, ManagerRequest request, Environment environment) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.environment = environment;
        resultComboBox.removeAllItems();
        resultComboBox.addItem(ManagerRequest.REQUEST_APPROVED);
        resultComboBox.addItem(ManagerRequest.REQUEST_REJECT);
        
        populateNetworkComboBox();
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
    
    private void populateNetworkComboBox(){
        
        assignNetworkCombo.removeAllItems();
         if(environment.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Please create networks.");  
         return;        
        }
        assignNetworkCombo.addItem("Please assign a Network");
        HashSet<String> hs = new HashSet();
           
        for(Network network : environment.getNetworkList())
        {
             assignNetworkCombo.addItem(network);
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

        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resultComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        commentsJTextField = new javax.swing.JTextField();
        assignNetworkCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        backJButton.setBackground(new java.awt.Color(0, 153, 153));
        backJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setBackground(new java.awt.Color(0, 153, 153));
        submitJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit ");
        submitJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("Request Result :");

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel7.setText("Process Manager Work Request");

        resultComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Add comments : ");

        assignNetworkCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        assignNetworkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignNetworkComboActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Assign Location :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(assignNetworkCombo, 0, 163, Short.MAX_VALUE)
                                    .addComponent(commentsJTextField)
                                    .addComponent(resultComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(submitJButton)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(commentsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(assignNetworkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(submitJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagerWorkArea managerWorkArea = (ManagerWorkArea) component;
        managerWorkArea.populateWorkRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(resultComboBox.getSelectedIndex()<0 || commentsJTextField.getText().trim().isEmpty() ||
                assignNetworkCombo.getSelectedIndex()<1)
        {
        JOptionPane.showMessageDialog(null, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
        Network net = (Network)assignNetworkCombo.getSelectedItem();
      
        if((request.getSenderDetails().getRole().toString()).equalsIgnoreCase("VolunteerRole"))
        {
        Helper volunteer = (Helper)request.getSenderDetails().getPerson();
        
        String[] longlat = PinLocation.getPinLocationForHelper(net.getCity());
        volunteer.setLongitude(longlat[0]);
        volunteer.setLatitiude(longlat[1]);
        }
        
        request.setStatus(ManagerRequest.REQUEST_COMPLETED);
        request.setResolveDate(new Date());
        request.setTestResult((String)resultComboBox.getSelectedItem());
        request.setComments(commentsJTextField.getText());
        request.getSenderDetails().setNetwork(net);
        
        if(request.getTestResult().equals(ManagerRequest.REQUEST_APPROVED))
        {
            request.getSenderDetails().setEnabled(true);
           
            String emailId = request.getSenderDetails().getPerson().getEmailId();
            String userName = request.getSenderDetails().getName();
            String password = request.getSenderDetails().getPwd();
            
        StringBuilder emailMsgTxt = new StringBuilder();
        emailMsgTxt.append("Your account is enabled. Please find username and password");
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("username : ".concat(userName));
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("password : ".concat(password));
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("Thank You,");
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("HeartOnboard");
            
             boolean emailSent = SendNotificationMessage.sendMailNotification(emailMsgTxt.toString(),emailId,userName, password);
                    if(!emailSent)
                   {
                   JOptionPane.showMessageDialog(null, "Unable to send email,Please Try again! ","warning", JOptionPane.WARNING_MESSAGE);
                    return;         
                    }
        }
         JOptionPane.showMessageDialog(null, "Request has been processed successfully", "success", JOptionPane.PLAIN_MESSAGE);
       commentsJTextField.setText("");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void assignNetworkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignNetworkComboActionPerformed
        
    }//GEN-LAST:event_assignNetworkComboActionPerformed
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox assignNetworkCombo;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField commentsJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox resultComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}

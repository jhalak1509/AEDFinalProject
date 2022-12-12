package ui.cases;

import businessFramework.Environment;
import businessFramework.enterprises.Enterprises;
import businessFramework.person.Case;
import businessFramework.requestPipeline.Request;
import businessFramework.sensors.VitalSign;
import businessFramework.userAccount.User;
import businessFramework.requestPipeline.SensorRequest;
import businessFramework.requestPipeline.SendDataToDoctorRequest;
import businessFramework.requestPipeline.RequestPipeline;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import ui.sensors.ManageCaseProfile;

/**
 *
 * @author jhalaksurve
 */
public class CaseWorkArea extends javax.swing.JPanel {

     private JPanel userProcessContainer;
    private Enterprises enterprises;
      private User user;  
      private Environment ecoSystem;
      private Case person;
    private static int count = 0;
     private static boolean patientCond = false;
    /**
     * Creates new form HelpSeekerWorkAreaJPanel
     */
    public CaseWorkArea(JPanel userProcessContainer, Enterprises enterprises , User user, Environment ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprises = enterprises; 
        this.user = user;
        this.ecoSystem = ecoSystem;
        setBackground(new Color(182,201,233));
       
       
        person  = (Case)user.getPerson();
        alertsPanel.setVisible(false);
      
         populateAlerts();
         alertsPanel.revalidate();
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
//        Color c2 = Color.white;
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }

    public void populateAlerts()
    {
       int count = 0;
       if(person.isShareVital() && person.isHasSensor()) 
       {
    //    System.out.println("person.getVitalSignList()"+person.getVitalSignList().toString());
        if(!(person.getVitalSignList().isEmpty()))
        {
        for(VitalSign vitalSign : person.getVitalSignList())
        {
        String patientCondition = person.patientCondition(person.getAge(), vitalSign);
        if(patientCondition.equals("ABNORMAL"))
        {
            count++;
        }
        }
         if(count>2)
        {
            JOptionPane.showMessageDialog(null, "You have an alert ! ", "Alerts", JOptionPane.PLAIN_MESSAGE);
            patientCond = true;
            count = 0;
        }
        }
       }
       
        displayAlerts();
    }
    
   
    public void displayAlerts()
    {
      alertsPanel.removeAll();
      alertsPanel.revalidate();
       alertsPanel.setLayout(new GridLayout(10, 1,10,10));
       JTextArea textArea;
       JTextField txtField;
       StringBuilder sb ;
       int count = 0;
       int pos = 0;
         boolean flag = false;
            if(patientCond)
            {
            txtField = new JTextField("Alert Message From Heart Help!");   
            txtField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            txtField.setVisible(true);
            txtField.setEditable(false);
            textArea = new JTextArea("Vital Signs tracked last two time show that you are not feeling well, Do you need some help!");
            textArea.setVisible(true);
            textArea.setEditable(false);
            alertsPanel.add(txtField,pos);
            alertsPanel.add(textArea,++pos);
            ++pos;
            flag = true;
            patientCond = false;
            }
       
       if(!(user.getRequestPipeline().getRequestList().isEmpty()))
       {
       for(Request request : user.getRequestPipeline().getRequestList())
        {
            if(request.getReqMessage().equalsIgnoreCase("Vital Sign Data") && request.getStatusOfRequest().equalsIgnoreCase("Completed"))
            {
            if(count<5)
            {
            SendDataToDoctorRequest dataToDoctorWorkRequest = (SendDataToDoctorRequest)request;
            txtField = new JTextField(" Message From Doctor: "+dataToDoctorWorkRequest.getReceiverDetails().getPerson().getName());
            txtField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            txtField.setVisible(true);
            txtField.setEditable(false);
            
            textArea = new JTextArea(dataToDoctorWorkRequest.getNewMedication());
            textArea.setVisible(true);
            textArea.setEditable(false);
            count++;
             
           
            txtField.setEditable(false);
            textArea.setEditable(false);
            alertsPanel.add(txtField,pos);
            alertsPanel.add(textArea,++pos);
            ++pos;
            flag = true;
            }

            }
            if(request.getReqMessage().equalsIgnoreCase("Need Sensor Device") && request.getStatusOfRequest().equalsIgnoreCase("Completed"))
            {
            if(count<5)
            {
             SensorRequest needSensorDeviceWorkRequest = (SensorRequest)request;
             sb= new StringBuilder();
             sb.append("RequestResult: ");
             sb.append(needSensorDeviceWorkRequest.getSponsorshipRequestOutcome());
             sb.append(System.lineSeparator());
             sb.append("Comments From Donor: ");
             sb.append(needSensorDeviceWorkRequest.getComments());
            txtField = new JTextField(" Message From Donor: "+needSensorDeviceWorkRequest.getReceiverDetails().getPerson().getName());
            txtField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            txtField.setVisible(true);
            txtField.setEditable(false);
            textArea = new JTextArea(sb.toString());
            textArea.setVisible(true);
            textArea.setEditable(false);
            count++;
             
           
            txtField.setEditable(false);
            textArea.setEditable(false);
            alertsPanel.add(txtField,pos);
            alertsPanel.add(textArea,++pos);
            ++pos;
            flag = true;
            }

            }
        }
       }

        if(flag)
        {
        alertsPanel.revalidate();
        alertsPanel.setVisible(true);
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

        manageHelpSeekerProfile = new javax.swing.JButton();
        writeTestimonialForVolBtn = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        alertsPanel = new javax.swing.JPanel();
        manageHelpFromHelper = new javax.swing.JButton();

        manageHelpSeekerProfile.setBackground(new java.awt.Color(0, 153, 153));
        manageHelpSeekerProfile.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        manageHelpSeekerProfile.setForeground(new java.awt.Color(255, 255, 255));
        manageHelpSeekerProfile.setText("Manage Profile and Vital Signs");
        manageHelpSeekerProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageHelpSeekerProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHelpSeekerProfileActionPerformed(evt);
            }
        });

        writeTestimonialForVolBtn.setBackground(new java.awt.Color(0, 153, 153));
        writeTestimonialForVolBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        writeTestimonialForVolBtn.setForeground(new java.awt.Color(255, 255, 255));
        writeTestimonialForVolBtn.setText("Write Testimonial for Helper");
        writeTestimonialForVolBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        writeTestimonialForVolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeTestimonialForVolBtnActionPerformed(evt);
            }
        });

        manageEnt.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        manageEnt.setText("Help Seeker Work Area");

        alertsPanel.setBackground(new java.awt.Color(153, 204, 0));

        javax.swing.GroupLayout alertsPanelLayout = new javax.swing.GroupLayout(alertsPanel);
        alertsPanel.setLayout(alertsPanelLayout);
        alertsPanelLayout.setHorizontalGroup(
            alertsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        alertsPanelLayout.setVerticalGroup(
            alertsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        manageHelpFromHelper.setBackground(new java.awt.Color(0, 153, 153));
        manageHelpFromHelper.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        manageHelpFromHelper.setForeground(new java.awt.Color(255, 255, 255));
        manageHelpFromHelper.setText("Manage Help From Helper");
        manageHelpFromHelper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageHelpFromHelper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHelpFromHelperActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(manageEnt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageHelpSeekerProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageHelpFromHelper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(writeTestimonialForVolBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 102, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(alertsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(manageEnt)
                        .addGap(121, 121, 121)
                        .addComponent(manageHelpSeekerProfile)
                        .addGap(18, 18, 18)
                        .addComponent(writeTestimonialForVolBtn)
                        .addGap(18, 18, 18)
                        .addComponent(manageHelpFromHelper)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageHelpSeekerProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHelpSeekerProfileActionPerformed
        ManageCaseProfile manageCaseProfile = new ManageCaseProfile(userProcessContainer, user, enterprises, ecoSystem);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ManageHelpSeekerProfileJPanel", manageCaseProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_manageHelpSeekerProfileActionPerformed

    private void writeTestimonialForVolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeTestimonialForVolBtnActionPerformed

        WriteReviewForHelper writeReviewForHelper = new WriteReviewForHelper(userProcessContainer, user);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WriteTestimonialForVolJPanel", writeReviewForHelper);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_writeTestimonialForVolBtnActionPerformed

    private void manageHelpFromHelperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHelpFromHelperActionPerformed
        ManageHelpFromHelper manageHelpFromHelper = new ManageHelpFromHelper(userProcessContainer, user, ecoSystem, enterprises);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageHelpFromHelper", manageHelpFromHelper);
        layout.next(userProcessContainer);       
    }//GEN-LAST:event_manageHelpFromHelperActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alertsPanel;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton manageHelpFromHelper;
    private javax.swing.JButton manageHelpSeekerProfile;
    private javax.swing.JButton writeTestimonialForVolBtn;
    // End of variables declaration//GEN-END:variables


}

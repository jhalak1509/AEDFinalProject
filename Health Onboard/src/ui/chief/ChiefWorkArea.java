package ui.chief;

import businessFramework.Environment;
import businessFramework.enterprises.Enterprises;
import businessFramework.network.Network;
import businessFramework.organizations.CaseOrganizations;
import businessFramework.organizations.ChiefOrganizations;
import businessFramework.organizations.Organizations;
import businessFramework.person.Case;
import businessFramework.userAccount.User;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhalaksurve
 */
public class ChiefWorkArea extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Environment environment;
    private User user;
    private ChiefOrganizations chielOrganizations;
    private HashMap<String,Integer> communitydetailsmap;
 //   private HelpSeekerOrganization helpSeekerOrg;

    /**
     * Creates new form SupervisorWorkAreaJPanel
     */
    public ChiefWorkArea(JPanel userProcessContainer, User user, Organizations organizations, Environment environment ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.environment = environment;
        this.user = user;
        this.chielOrganizations = (ChiefOrganizations)organizations;
        
        populateWorkRequestTable();
        
        
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
    
    public void populateWorkRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel)communityHealthTable.getModel();
        model.setRowCount(0);
        
        try
        {
        communitydetailsmap = getHelpSeekerData();
        }
        catch(NullPointerException npe)
        {
        npe.printStackTrace();
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        }
         if(communitydetailsmap.isEmpty() || communitydetailsmap == null)
         {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;      
         }
    
         Object[] rowData = new Object[4];
         rowData[0] = communitydetailsmap.get("TotalNoOfSeniorPeople");
         rowData[1] = communitydetailsmap.get("AverageAge");
         rowData[2] = communitydetailsmap.get("SeniorswithheartProblem");
         rowData[3] = communitydetailsmap.get("SeniorswithNoheartProblem");
         
         model.addRow(rowData);
    }
    
    public CaseOrganizations getCaseOrg()
    {
        CaseOrganizations caseOrg = null;
        
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(user.getNetwork()))
         {
          for(Enterprises enterprises : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprises.getEnterprisesType().equals(Enterprises.EnterprisesType.HealthOnboard))
            {
            for(Organizations organizations : enterprises.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organizations instanceof CaseOrganizations)
             {
              caseOrg = (CaseOrganizations)organizations; 
             }
            }
            }
          }
         }
        }
        return caseOrg;
    }
    
    public HashMap<String,Integer> getHelpSeekerData()
    {
        int seniorCardiacProb = 0;
        int seniorNoCardiacProb = 0;
        int avgAge = 0;
        int seniorsWithSensorDevice = 0;
        int seniorsShareVitalInfo = 0;
        int seniorsSendDataToDoctor = 0;
        int seniorsWithNoSensorDevice = 0;
        
        CaseOrganizations caseOrganizations = getCaseOrg();
        if(caseOrganizations == null)
        {
        JOptionPane.showMessageDialog(null, " Help Seeker Organization does not exist!","warning", JOptionPane.WARNING_MESSAGE);
        return null;     
        }
        if(caseOrganizations.getPersonDirectory().getCustomerLsit().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Help Seekers Registered!","warning", JOptionPane.WARNING_MESSAGE);
        return null; 
        }
        int totalSeniors = caseOrganizations.getPersonDirectory().getCustomerLsit().size();
      HashMap<String,Integer> seniorHeartPatientMap = new HashMap<>();
       for(Case cases : caseOrganizations.getPersonDirectory().getCustomerLsit())
          {
           if(cases.isHasCardiacProb())     
           {
            seniorCardiacProb ++;  
           } 
           if(!cases.isHasCardiacProb())
           {
            seniorNoCardiacProb ++;   
           }
           if(cases.isHasSensor())
           {
            seniorsWithSensorDevice ++;   
           } 
           if(!cases.isHasSensor())
           {
            seniorsWithNoSensorDevice++;   
           }
           if(cases.isSendDataToDoctor())
           {
            seniorsSendDataToDoctor ++;   
           } 
           if(cases.isShareVital())
           {
            seniorsShareVitalInfo ++;   
           } 
           avgAge+=cases.getAge();
          } 
        
               
       seniorHeartPatientMap.put("SeniorswithheartProblem", seniorCardiacProb);
       seniorHeartPatientMap.put("SeniorswithNoheartProblem", seniorNoCardiacProb);
       seniorHeartPatientMap.put("TotalNoOfSeniorPeople", totalSeniors);
       seniorHeartPatientMap.put("AverageAge", avgAge/totalSeniors);
       seniorHeartPatientMap.put("seniorsSendDataToDoctor",seniorsSendDataToDoctor);
       seniorHeartPatientMap.put("seniorsShareVitalInfo",seniorsShareVitalInfo);
       seniorHeartPatientMap.put("seniorsWithSensorDevice",seniorsWithSensorDevice);
       seniorHeartPatientMap.put("seniorsWithNoSensorDevice",seniorsWithNoSensorDevice);
       
       return seniorHeartPatientMap;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        viewDetailedRprtMayorBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        communityHealthTable = new javax.swing.JTable();

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel6.setText("Chief Dashboard");

        viewDetailedRprtMayorBtn.setBackground(new java.awt.Color(0, 153, 153));
        viewDetailedRprtMayorBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        viewDetailedRprtMayorBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewDetailedRprtMayorBtn.setText("View Detailed Report");
        viewDetailedRprtMayorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailedRprtMayorBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel7.setText("Community Health Report:");

        communityHealthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Senior People", "Average age ", "Seniors with Heart problem", "Seniors with no health problems"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(communityHealthTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewDetailedRprtMayorBtn)))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(viewDetailedRprtMayorBtn)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailedRprtMayorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailedRprtMayorBtnActionPerformed
          if(communitydetailsmap.isEmpty() || communitydetailsmap == null)
         {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;      
         }
        ViewDetailedReportChief viewDetailedReportChief = new ViewDetailedReportChief(userProcessContainer, communitydetailsmap);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewDetailedReportChief", viewDetailedReportChief);
        layout.next(userProcessContainer);       
    }//GEN-LAST:event_viewDetailedRprtMayorBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable communityHealthTable;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewDetailedRprtMayorBtn;
    // End of variables declaration//GEN-END:variables
}

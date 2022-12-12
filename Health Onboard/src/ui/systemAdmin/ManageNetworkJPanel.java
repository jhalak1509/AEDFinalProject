/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;


import business.EcoSystem;
import business.networkpkg.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinaykumargudooru
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateNetworkTable();
        populateComboBox();
       
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(153,197,85);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }

    private void populateNetworkTable() {
        
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[3];
            row[0] = network.getCountry();
            row[1] = network.getState();
            row[2] = network;
            
            model.addRow(row);
        }
    }
    
    private void populateComboBox()
    {
        countryComboBox.removeAllItems();
        countryComboBox.addItem("Please select a country");
        countryComboBox.addItem("United States");
        countryComboBox.addItem("India");
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        countryComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        statesComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cityComboBox = new javax.swing.JComboBox();
        country = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        deleteNetwork = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(182, 201, 233));

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country", "State", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
            networkJTable.getColumnModel().getColumn(1).setResizable(false);
            networkJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel4.setText("View Network List:");

        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        countryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBoxActionPerformed(evt);
            }
        });

        submitJButton.setText("Add");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        statesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        statesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statesComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel2.setText("Add New Network");

        cityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboBoxActionPerformed(evt);
            }
        });

        country.setText("Country: ");

        state.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        state.setText("State:");

        city.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        city.setText("City:");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(state)
                            .addComponent(country)
                            .addComponent(city))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countryComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country)
                    .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state)
                    .addComponent(statesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city)
                    .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(submitJButton)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(countryComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(submitJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(statesComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cityComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(country, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(state, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(city, javax.swing.JLayeredPane.DEFAULT_LAYER);

        deleteNetwork.setText("Delete");
        deleteNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNetworkActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel5.setText("Manage Networks:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(deleteNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLayeredPane1)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteNetwork)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        if(countryComboBox.getSelectedIndex()<1 || statesComboBox.getSelectedIndex()<0 ||
                cityComboBox.getSelectedIndex() <0)
        {
            JOptionPane.showMessageDialog(null, "Please select all the values", "warning",JOptionPane.WARNING_MESSAGE);
            return;
           }
        else
        {
        
        String country = (String)countryComboBox.getSelectedItem();
        String state = (String)statesComboBox.getSelectedItem();
        String city = (String)cityComboBox.getSelectedItem();
        if(!system.getNetworkList().isEmpty())
        {
         for(Network network : system.getNetworkList())
         {
             if(city.equals(network.getCity()))
             {
            JOptionPane.showMessageDialog(null, "Network already exists! ", "warning",JOptionPane.WARNING_MESSAGE);
            return;      
             }
         }
        }
       
        Network network = system.addNetwork();
      
        network.setCountry(country);
        network.setState(state);
        network.setCity(city);

        populateNetworkTable();
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populatenetworkJTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void countryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBoxActionPerformed
        statesComboBox.removeAllItems();
        cityComboBox.removeAllItems();
        if(countryComboBox.getSelectedItem() == "United States")
        {
         statesComboBox.addItem("Massachusetts");
         statesComboBox.addItem("Tennessee");
         }
        else if(countryComboBox.getSelectedItem() == "India")
        {
        statesComboBox.addItem("Andhra Pradesh");
        statesComboBox.addItem("Telangana");    
        }
    }//GEN-LAST:event_countryComboBoxActionPerformed

    private void statesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statesComboBoxActionPerformed
        cityComboBox.removeAllItems();
        if(statesComboBox.getSelectedItem() == "Massachusetts")
        {
         cityComboBox.addItem("Boston");
         cityComboBox.addItem("Roxbury");
         cityComboBox.addItem("Somerville");
         }
        else if(statesComboBox.getSelectedItem() == "Tennessee")
        {
        cityComboBox.addItem("Memphis");
        cityComboBox.addItem("GermanTown");    
        }
        else if(statesComboBox.getSelectedItem() == "Andhra Pradesh")
        {
         cityComboBox.addItem("Vijayawada");
        }
        else if(statesComboBox.getSelectedItem() == "Telangana")
        {
        cityComboBox.addItem("Nalgonda");
        cityComboBox.addItem("Karimnagar");    
        }
    }//GEN-LAST:event_statesComboBoxActionPerformed

    private void cityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityComboBoxActionPerformed

    private void deleteNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNetworkActionPerformed
        
        int selectedRow = networkJTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the row ", "warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                Network network = (Network)networkJTable.getValueAt(selectedRow, 2);
                system.deleteNetwork(network);
                populateNetworkTable();
               
            }
        }
        else
            {
                JOptionPane.showMessageDialog(this, "Please select a row", "warning",JOptionPane.PLAIN_MESSAGE);
            }
    }//GEN-LAST:event_deleteNetworkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel city;
    private javax.swing.JComboBox cityComboBox;
    private javax.swing.JLabel country;
    private javax.swing.JComboBox countryComboBox;
    private javax.swing.JButton deleteNetwork;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkJTable;
    private javax.swing.JLabel state;
    private javax.swing.JComboBox statesComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}

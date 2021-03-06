/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofmeth.mco3.gui;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sofmeth.mco3.gui.SourceCodeFrame;
import sofmeth.mco3.gui.DRLFrame;
import sofmeth.mco3.gui.PPSFrame;
import sofmeth.mco3.gui.PIPFrame;
import sofmeth.mco3.gui.SETFrame;
import sofmeth.mco3.gui.SPTFrame;
import sofmeth.mco3.gui.TPTFrame;
import sofmeth.mco3.gui.TRLFrame;
import sofmeth.mco3.gui.TRTFrame;
/**
 *
 * @author owner
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    //private MainMenu mainMenu = new MainMenu();
    //private final CardLayout cl = new CardLayout();
    private SourceCodeFrame sourceCodeFrame;
    private DRLFrame drlFrame;
    private TRLFrame trlFrame;
    private PPSFrame ppsFrame;
    private PIPFrame pipFrame;
    private SETFrame sestFrame;
    private SPTFrame sptFrame;
    private TPTFrame tptFrame;
    private TRTFrame trtFrame;
    private float comboValue;
    boolean complete = false;
    public MainMenu() {
        //menuPanel.setLayout(cl);
        initComponents();
        addListener_menu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ppsButton = new javax.swing.JButton();
        tptButton = new javax.swing.JButton();
        trtButton = new javax.swing.JButton();
        sptButton = new javax.swing.JButton();
        pipButton = new javax.swing.JButton();
        trlButton = new javax.swing.JButton();
        sestButton = new javax.swing.JButton();
        drlButton = new javax.swing.JButton();
        scButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pspCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        profField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        langField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Form Builder");

        ppsButton.setText("Project Plan Summary");

        tptButton.setText("Task Planning Template");

        trtButton.setText("Test Report Template");

        sptButton.setText("Schedule Planning Template");

        pipButton.setText("Process Improvement Plan");

        trlButton.setText("Time Recording Log");

        sestButton.setText("Size Estimating Template");

        drlButton.setText("Defect Recording Log");

        scButton.setText("Source Code");
        scButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("PSP Level");

        pspCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.1", "1", "1.1" }));
        pspCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pspComboActionPerformed(evt);
            }
        });

        jLabel3.setText("Name of student:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Name of Professor:");

        jLabel5.setText("Date:");

        jLabel6.setText("Section:");

        jLabel7.setText("Language:");

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(scButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pspCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(trtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ppsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103)
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(profField))
                                    .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateField))
                                    .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(langField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(profField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(langField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pspCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppsButton)
                    .addComponent(tptButton))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trtButton)
                    .addComponent(sptButton))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pipButton)
                    .addComponent(trlButton))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drlButton)
                    .addComponent(sestButton))
                .addGap(32, 32, 32)
                .addComponent(scButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scButtonActionPerformed

    private void pspComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pspComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pspComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    private void addListener_menu(){
        scButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                if((!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    sourceCodeFrame = new SourceCodeFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
                }
<<<<<<< HEAD
=======
=======
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                sourceCodeFrame = new SourceCodeFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
                
>>>>>>> origin/master
>>>>>>> origin/master
            }
        });
        
        drlButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                if((!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    drlFrame = new DRLFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
                }
<<<<<<< HEAD
=======
=======
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                drlFrame = new DRLFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
                
>>>>>>> origin/master
>>>>>>> origin/master
            }
        });
        
        trlButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                if((!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    trlFrame = new TRLFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());    
                }
<<<<<<< HEAD
=======
=======
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                trlFrame = new TRLFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
>>>>>>> origin/master
>>>>>>> origin/master
            }
        });
        
        pipButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                if((!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    pipFrame = new PIPFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
                }
                
<<<<<<< HEAD
=======
=======
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                pipFrame = new PIPFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
>>>>>>> origin/master
>>>>>>> origin/master
            }
        });
        
        ppsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                if((!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    ppsFrame = new PPSFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());    
                }
<<<<<<< HEAD
=======
=======
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                ppsFrame = new PPSFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
>>>>>>> origin/master
>>>>>>> origin/master
            }
        });
        
        sestButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                if((!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    sestFrame = new SETFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
                }
                
<<<<<<< HEAD
=======
=======
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                sestFrame = new SETFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
>>>>>>> origin/master
>>>>>>> origin/master
            }
        });
        
        sptButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                if((!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    sptFrame = new SPTFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());    
                }
                
<<<<<<< HEAD
=======
=======
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                sptFrame = new SPTFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
>>>>>>> origin/master
>>>>>>> origin/master
            }
        });
        
        tptButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                if((!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    tptFrame = new TPTFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());    
                }
                
<<<<<<< HEAD
=======
=======
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                tptFrame = new TPTFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
>>>>>>> origin/master
>>>>>>> origin/master
            }
        });
        
        trtButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                if((!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    trtFrame = new TRTFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());    
                }
<<<<<<< HEAD
=======
=======
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                trtFrame = new TRTFrame(comboValue, nameField.getText(), profField.getText(), dateField.getText(), langField.getText());
>>>>>>> origin/master
>>>>>>> origin/master
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateField;
    private javax.swing.JButton drlButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField langField;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton pipButton;
    private javax.swing.JButton ppsButton;
    private javax.swing.JTextField profField;
    private javax.swing.JComboBox<String> pspCombo;
    private javax.swing.JButton scButton;
    private javax.swing.JButton sestButton;
    private javax.swing.JButton sptButton;
    private javax.swing.JButton tptButton;
    private javax.swing.JButton trlButton;
    private javax.swing.JButton trtButton;
    // End of variables declaration//GEN-END:variables
}

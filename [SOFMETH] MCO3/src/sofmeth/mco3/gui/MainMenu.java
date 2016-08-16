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

        jLabel2.setText("PSP Level");

        pspCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.1", "1", "1.1" }));

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pipButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trtButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ppsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addGap(96, 96, 96)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sptButton, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(tptButton, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(trlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(drlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pspCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(scButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pspCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(scButton)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                sourceCodeFrame = new SourceCodeFrame(comboValue);
                
            }
        });
        
        drlButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                drlFrame = new DRLFrame(comboValue);
                
            }
        });
        
        trlButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                trlFrame = new TRLFrame(comboValue);
            }
        });
        
        pipButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                pipFrame = new PIPFrame(comboValue);
            }
        });
        
        ppsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                ppsFrame = new PPSFrame(comboValue);
            }
        });
        
        sestButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                sestFrame = new SETFrame(comboValue);
            }
        });
        
        sptButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                sptFrame = new SPTFrame(comboValue);
            }
        });
        
        tptButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                tptFrame = new TPTFrame(comboValue);
            }
        });
        
        trtButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                trtFrame = new TRTFrame(comboValue);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drlButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton pipButton;
    private javax.swing.JButton ppsButton;
    private javax.swing.JComboBox<String> pspCombo;
    private javax.swing.JButton scButton;
    private javax.swing.JButton sestButton;
    private javax.swing.JButton sptButton;
    private javax.swing.JButton tptButton;
    private javax.swing.JButton trlButton;
    private javax.swing.JButton trtButton;
    // End of variables declaration//GEN-END:variables
}

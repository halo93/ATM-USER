/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import efiect.DisplayClose;
import efiect.DisplayOpen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Kiet
 */
public class UsersHelp extends javax.swing.JDialog {

    public UsersHelp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        ServerTurn cc = new ServerTurn();
        cc.TurningT(this);
        setSize(0, 0);
        addLabel();
        new Thread(new DisplayClose(this, 1024, 734)).start();
    }
    Timer thoigian;
    Integer second;

    public void timeclose() {
        second = 2;
        thoigian = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                second = second - 1;
                if (second == 0) {
                    dispose();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbwithdraw = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbtransfer = new javax.swing.JLabel();
        lbbalance = new javax.swing.JLabel();
        lbpinchange = new javax.swing.JLabel();
        lbactivities = new javax.swing.JLabel();
        lbaboutus = new javax.swing.JLabel();
        lblogout = new javax.swing.JLabel();
        lbdeposit = new javax.swing.JLabel();
        lbcontact = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbwithdraw.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbwithdraw.setText("WITHDRAWAL");
        getContentPane().add(lbwithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 680, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        jLabel2.setText("IT IS OUR PLEASURE TO HELP AND SERVE YOU.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        lbtransfer.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbtransfer.setText("TRANSFERS");
        getContentPane().add(lbtransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 700, -1));

        lbbalance.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbbalance.setText("BALANCE INQUIRY");
        getContentPane().add(lbbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 820, -1));

        lbpinchange.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbpinchange.setText("PIN CHANGE");
        getContentPane().add(lbpinchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 730, -1));

        lbactivities.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbactivities.setText("RECENT ACTIVITIES");
        getContentPane().add(lbactivities, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 790, -1));

        lbaboutus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbaboutus.setText("ABOUT US");
        getContentPane().add(lbaboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 890, -1));

        lblogout.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblogout.setText("LOG OUT");
        getContentPane().add(lblogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 730, -1));

        lbdeposit.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbdeposit.setText("deposit");
        getContentPane().add(lbdeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 900, 90));

        lbcontact.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbcontact.setText("If you have other questions, please contact us through our websites, agendas, or emails addresses. Thank you!");
        getContentPane().add(lbcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 880, 50));

        jLabel4.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel4.setText("Established by Team 2 ACCP1207B-CNC APTECH");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, 280, 80));

        bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help  background.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-48, 0, 1120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        if (evt.getClickCount() == 1) {
            this.dispose();

            timeclose();
            thoigian.start();
            this.setSize(1024, 734);
            new Thread(new DisplayOpen(this, 0, 0)).start();
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbaboutus;
    private javax.swing.JLabel lbactivities;
    private javax.swing.JLabel lbbalance;
    private javax.swing.JLabel lbcontact;
    private javax.swing.JLabel lbdeposit;
    private javax.swing.JLabel lblogout;
    private javax.swing.JLabel lbpinchange;
    private javax.swing.JLabel lbtransfer;
    private javax.swing.JLabel lbwithdraw;
    // End of variables declaration//GEN-END:variables

    public void addLabel() {
        lbaboutus.setText("<html><b>INSTRUCTION: </b> This button provides you some information about what you might want to know and how to use ATM</html>");
        lbactivities.setText("<html><b>RECENT ACTIVITIES:</b> This part shows you 10 most recent activities each of WITHDRAWAL and TRANSFER.</html>");
        lbbalance.setText("<html><b>BALANCE INQUIRY:</b> This button shows you your current amount of money you have in your account.</html>");
        lblogout.setText("<html><b>LOGOUT:</b> Log you out.</html>");
        lbpinchange.setText("<html><b>PIN CHANGE:</b> You can change your account password in this portion.</html>");
        lbtransfer.setText("<html><b>TRANSFERS:</b> Transfer your money from your account to other available accounts.</html>");
        lbwithdraw.setText("<html><b>WITHDRAWAL:</b> You can withdraw your money which is available in your account.</html>");
        lbdeposit.setText("<html>We are sorry for the lack of DEPOSIT feature in ATM System because of some particular accurance and security reasons. "
                + "<br>If you are willing to deposit your money into some accounts, "
                + "please contact directly your hosts, the banks, to complete your transaction.</html>");

        lbcontact.setText("<html>If you have other questions or opinions, please contact us through our websites, agencies, or emails addresses. "
                + "You are welcomed to "
                + "contributionally collaborate with us. Feel free! Thank you!</html>");
    }
}

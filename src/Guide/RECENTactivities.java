/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import efiect.DisplayClose;
import java.awt.Image;

/**
 *
 * @author Kiet
 */
public class RECENTactivities extends javax.swing.JDialog {

    static String accountID = null;

    public RECENTactivities(java.awt.Frame parent, boolean modal, String stringkey) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        ServerTurn cc = new ServerTurn();
        cc.TurningT(this);
        setSize(0, 0);
        new Thread(new DisplayClose(this, 1024, 734)).start();
        this.accountID = stringkey;
        Image icon = getToolkit().getImage(getClass().getResource("/images/bankicon.png"));
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        withdrewbn = new javax.swing.JButton();
        transferedbn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrewbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/withdrawal.png"))); // NOI18N
        withdrewbn.setBorderPainted(false);
        withdrewbn.setContentAreaFilled(false);
        withdrewbn.setDefaultCapable(false);
        withdrewbn.setFocusPainted(false);
        withdrewbn.setFocusable(false);
        withdrewbn.setRequestFocusEnabled(false);
        withdrewbn.setRolloverEnabled(false);
        withdrewbn.setVerifyInputWhenFocusTarget(false);
        withdrewbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrewbnMouseClicked(evt);
            }
        });
        getContentPane().add(withdrewbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 280, 80));

        transferedbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transfers.png"))); // NOI18N
        transferedbn.setBorderPainted(false);
        transferedbn.setContentAreaFilled(false);
        transferedbn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        transferedbn.setDefaultCapable(false);
        transferedbn.setFocusPainted(false);
        transferedbn.setFocusable(false);
        transferedbn.setRequestFocusEnabled(false);
        transferedbn.setRolloverEnabled(false);
        transferedbn.setVerifyInputWhenFocusTarget(false);
        transferedbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferedbnMouseClicked(evt);
            }
        });
        getContentPane().add(transferedbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 280, 80));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Please select your transaction history!");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 460, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deposit.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 280, 80));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setDefaultCapable(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.setRolloverEnabled(false);
        jButton2.setVerifyInputWhenFocusTarget(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 280, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgpanel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrewbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrewbnMouseClicked

        if (evt.getClickCount() == 1) {
            new WithdrawInfoShow(null, true, accountID).setVisible(true);
        }
    }//GEN-LAST:event_withdrewbnMouseClicked

    private void transferedbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferedbnMouseClicked
        if (evt.getClickCount() == 1) {
            new TransferInfoShow(null, true, accountID).setVisible(true);
        }

    }//GEN-LAST:event_transferedbnMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        if (evt.getClickCount() == 1) {
            new Showdeposit(null, true, accountID).setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton transferedbn;
    private javax.swing.JButton withdrewbn;
    // End of variables declaration//GEN-END:variables
}

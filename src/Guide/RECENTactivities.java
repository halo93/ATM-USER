/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import efiect.DisplayClose;
import java.awt.Image;
import javax.swing.ImageIcon;

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

        withdrawbn = new javax.swing.JButton();
        transferedbn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        depositbn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrawbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/withdrawal.png"))); // NOI18N
        withdrawbn.setBorderPainted(false);
        withdrawbn.setContentAreaFilled(false);
        withdrawbn.setDefaultCapable(false);
        withdrawbn.setFocusPainted(false);
        withdrawbn.setFocusable(false);
        withdrawbn.setRequestFocusEnabled(false);
        withdrawbn.setRolloverEnabled(false);
        withdrawbn.setVerifyInputWhenFocusTarget(false);
        withdrawbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawbnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                withdrawbnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                withdrawbnMouseExited(evt);
            }
        });
        getContentPane().add(withdrawbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 250, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transferedbnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transferedbnMouseExited(evt);
            }
        });
        getContentPane().add(transferedbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 250, 80));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please select your transaction history!");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 460, -1));

        depositbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deposit.png"))); // NOI18N
        depositbn.setBorderPainted(false);
        depositbn.setContentAreaFilled(false);
        depositbn.setFocusPainted(false);
        depositbn.setFocusable(false);
        depositbn.setRequestFocusEnabled(false);
        depositbn.setRolloverEnabled(false);
        depositbn.setVerifyInputWhenFocusTarget(false);
        depositbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositbnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depositbnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depositbnMouseExited(evt);
            }
        });
        getContentPane().add(depositbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 250, 80));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setDefaultCapable(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.setRolloverEnabled(false);
        jButton2.setVerifyInputWhenFocusTarget(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 250, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgpanel.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawbnMouseClicked

        if (evt.getClickCount() == 1) {
            new WithdrawInfoShow(null, true, accountID).setVisible(true);
        }
    }//GEN-LAST:event_withdrawbnMouseClicked

    private void transferedbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferedbnMouseClicked
        if (evt.getClickCount() == 1) {
            new TransferInfoShow(null, true, accountID).setVisible(true);
        }

    }//GEN-LAST:event_transferedbnMouseClicked

    private void depositbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositbnMouseClicked

        if (evt.getClickCount() == 1) {
            new Showdeposit(null, true, accountID).setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_depositbnMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void withdrawbnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawbnMouseEntered
        // TODO add your handling code here:
        withdrawbn.setIcon(new ImageIcon("src/images/withdrawal1.png"));
    }//GEN-LAST:event_withdrawbnMouseEntered

    private void withdrawbnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawbnMouseExited
        // TODO add your handling code here:
        withdrawbn.setIcon(new ImageIcon("src/images/withdrawal.png"));
    }//GEN-LAST:event_withdrawbnMouseExited

    private void transferedbnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferedbnMouseEntered
        // TODO add your handling code here:
        transferedbn.setIcon(new ImageIcon("src/images/transfers1.png"));
    }//GEN-LAST:event_transferedbnMouseEntered

    private void transferedbnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferedbnMouseExited
        // TODO add your handling code here:
        transferedbn.setIcon(new ImageIcon("src/images/transfers.png"));
    }//GEN-LAST:event_transferedbnMouseExited

    private void depositbnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositbnMouseEntered
        // TODO add your handling code here:
        depositbn.setIcon(new ImageIcon("src/images/deposit1.png"));
    }//GEN-LAST:event_depositbnMouseEntered

    private void depositbnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositbnMouseExited
        // TODO add your handling code here:
        depositbn.setIcon(new ImageIcon("src/images/deposit.png"));
    }//GEN-LAST:event_depositbnMouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setIcon(new ImageIcon("src/images/cancel1.png"));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setIcon(new ImageIcon("src/images/cancel.png"));
    }//GEN-LAST:event_jButton2MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositbn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton transferedbn;
    private javax.swing.JButton withdrawbn;
    // End of variables declaration//GEN-END:variables
}

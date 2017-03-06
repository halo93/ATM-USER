/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import Connections.Connect;
import efiect.DisplayClose;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import javax.swing.Timer;

/**
 *
 * @author DMX
 */
public class withdrawsuccessfully extends javax.swing.JDialog {

    static String AccountIDb;
    static float Moneywithdraw;

    public withdrawsuccessfully(java.awt.Frame parent, boolean modal, String accountID, float moneywithdraw) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        this.setSize(0, 0);
        new Thread(new DisplayClose(this, 1024, 734)).start();
        this.AccountIDb=accountID;
        this.Moneywithdraw=moneywithdraw;
        this.jLabel3.setText("Your money withdrawn: "+Moneywithdraw);
         loaddetail();
    }
    Timer time;
    Integer second;

    public void timeclose() {

        second = 2;

        time = new Timer(1000, new ActionListener() {

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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbbalance = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 280, 80));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel2.setText("You have withdrawn your money. Here is the transaction details:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        lbbalance.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbbalance.setText("Your balance");
        getContentPane().add(lbbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Your money withdraw");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgpanel.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (evt.getClickCount() == 1) {

            timeclose();
            time.start();
            this.setSize(1024, 734);
            new Thread(new DisplayClose(this, 0, 0)).start();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbbalance;
    // End of variables declaration//GEN-END:variables

public void loaddetail() {

        try {

            Connect.connectDatabase();
            CallableStatement ct = Connect.connectDatabase().prepareCall("{call AccountShow(?)}");
            ct.setString(1, AccountIDb);
            ResultSet rt = ct.executeQuery();
            while (rt.next()) {
                lbbalance.setText("Your account balance is: " + rt.getString("AccountBalance"));
            }


        } catch (Exception en) {
            en.printStackTrace();
        }
    }
}

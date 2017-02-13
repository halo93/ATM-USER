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
 * @author Ngo Luan
 */
public class transfersuccessfully extends javax.swing.JDialog {

    /**
     * Creates new form transfersuccessfully
     */
    static String AccountIDb;
    static String accountreceived;
    static float moneyt;

    public transfersuccessfully(java.awt.Frame parent, boolean modal, String AccountID, String AccountReceived, float money) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        this.setSize(0, 0);
        new Thread(new DisplayClose(this, 1024, 734)).start();
        this.AccountIDb = AccountID;
        this.accountreceived = AccountReceived;
        this.moneyt = money;
        this.lbaccountID.setText("Benefactor account: " + AccountIDb);
        this.lbaccreceived.setText("Beneficiary account: " + accountreceived);
        this.lbmoney.setText("Amount of money transfered: " + moneyt);
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
        lbaccreceived = new javax.swing.JLabel();
        lbmoney = new javax.swing.JLabel();
        lbaccountID = new javax.swing.JLabel();
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
        jLabel2.setText("You have successfully transfered your money! Here is the transaction details:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lbbalance.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbbalance.setText("Account Balance: ");
        getContentPane().add(lbbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        lbaccreceived.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbaccreceived.setText("account received");
        getContentPane().add(lbaccreceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        lbmoney.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbmoney.setText("Amount of money transfered:");
        getContentPane().add(lbmoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        lbaccountID.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbaccountID.setText("jLabel1");
        getContentPane().add(lbaccountID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

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
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /*
//         * Set the Nimbus look and feel
//         */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /*
//         * If Nimbus (introduced in Java SE 6) is not available, stay with the
//         * default look and feel. For details see
//         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(transfersuccessfully.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(transfersuccessfully.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(transfersuccessfully.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(transfersuccessfully.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /*
//         * Create and display the dialog
//         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                transfersuccessfully dialog = new transfersuccessfully(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbaccountID;
    private javax.swing.JLabel lbaccreceived;
    private javax.swing.JLabel lbbalance;
    private javax.swing.JLabel lbmoney;
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

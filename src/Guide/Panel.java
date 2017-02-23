/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import Connections.Connect;
import static Guide.User_Login.accountID;
import efiect.DisplayClose;
import efiect.DisplayOpen;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author ASUSF
 */
public class Panel extends javax.swing.JFrame implements Runnable {

    static String accountID;

    public Panel(String stringkey) {
        setUndecorated(true);
        initComponents();
        ServerTurn cc = new ServerTurn();
        cc.TurningS(this);
        setSize(0, 0);
        new Thread(new DisplayClose(this, 1024, 734)).start();
        this.accountID = stringkey;
        new Thread(this).start();
        greetingguest();
        Image icon = getToolkit().getImage(getClass().getResource("/images/bankicon.png"));
        setIconImage(icon);
    }
public void greetingguest() {
        try {
            Connect.connectDatabase();
            CallableStatement call = Connect.connectDatabase().prepareCall("{call Login_Account}");
            ResultSet rt = call.executeQuery();
            while (rt.next()) {
                if (accountID.equals(rt.getString("AccountID").toString())) {
                    if (rt.getString("Gender").toString().equals("Male")) {
                        Greetinglb.setText("<html>Have a nice day, Mr. <font color = '#1FBED6'>" + rt.getString("Fullname").toString() + "</font> !</html>");
                        Greetinglb.setSize(50, 400);
                        String gname = rt.getString("Fullname").toString();
                    } else {
                        Greetinglb.setText("<html>Have a nice day, Ms.(Mrs.) <font color = '#00FF00'>" + rt.getString("Fullname").toString() + "</font> !</html>");
                    Greetinglb.setSize(50, 400);
                    
                    }
                };
            }
        } catch (Exception ex) {
            Logger.getLogger(User_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void run() {
        try {
            while (true) {
                if (lbtransaction.getText() == null) {
                    lbtransaction.setText("Select Your Transaction!");
                } else {
                    lbtransaction.setText(null);
                }
                Thread.sleep(800);
            }
        } catch (InterruptedException ex) {
        }
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
                    System.exit(0);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbtransaction = new javax.swing.JLabel();
        butwith = new javax.swing.JButton();
        butbalance = new javax.swing.JButton();
        butpin = new javax.swing.JButton();
        butlogout = new javax.swing.JButton();
        buttrans = new javax.swing.JButton();
        butclose = new javax.swing.JButton();
        butminimax = new javax.swing.JButton();
        buthistory = new javax.swing.JButton();
        Greetinglb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbtransaction.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbtransaction.setText("Select your transaction.");
        getContentPane().add(lbtransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 510, 50));

        butwith.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/withdrawal.png"))); // NOI18N
        butwith.setBorderPainted(false);
        butwith.setContentAreaFilled(false);
        butwith.setDefaultCapable(false);
        butwith.setFocusPainted(false);
        butwith.setFocusable(false);
        butwith.setRequestFocusEnabled(false);
        butwith.setRolloverEnabled(false);
        butwith.setVerifyInputWhenFocusTarget(false);
        butwith.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butwithMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butwithMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butwithMouseExited(evt);
            }
        });
        butwith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butwithActionPerformed(evt);
            }
        });
        getContentPane().add(butwith, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 280, 80));

        butbalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/balance.png"))); // NOI18N
        butbalance.setBorderPainted(false);
        butbalance.setContentAreaFilled(false);
        butbalance.setDefaultCapable(false);
        butbalance.setFocusPainted(false);
        butbalance.setFocusable(false);
        butbalance.setRequestFocusEnabled(false);
        butbalance.setRolloverEnabled(false);
        butbalance.setVerifyInputWhenFocusTarget(false);
        butbalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butbalanceMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butbalanceMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butbalanceMouseEntered(evt);
            }
        });
        butbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butbalanceActionPerformed(evt);
            }
        });
        getContentPane().add(butbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 280, 80));

        butpin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pinchange.png"))); // NOI18N
        butpin.setBorderPainted(false);
        butpin.setContentAreaFilled(false);
        butpin.setDefaultCapable(false);
        butpin.setFocusPainted(false);
        butpin.setFocusable(false);
        butpin.setRequestFocusEnabled(false);
        butpin.setRolloverEnabled(false);
        butpin.setVerifyInputWhenFocusTarget(false);
        butpin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butpinMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butpinMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butpinMouseEntered(evt);
            }
        });
        getContentPane().add(butpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 280, 80));

        butlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        butlogout.setBorderPainted(false);
        butlogout.setContentAreaFilled(false);
        butlogout.setDefaultCapable(false);
        butlogout.setFocusPainted(false);
        butlogout.setFocusable(false);
        butlogout.setRequestFocusEnabled(false);
        butlogout.setRolloverEnabled(false);
        butlogout.setVerifyInputWhenFocusTarget(false);
        butlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butlogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butlogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butlogoutMouseExited(evt);
            }
        });
        getContentPane().add(butlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 280, 80));

        buttrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transfers.png"))); // NOI18N
        buttrans.setBorderPainted(false);
        buttrans.setContentAreaFilled(false);
        buttrans.setDefaultCapable(false);
        buttrans.setFocusPainted(false);
        buttrans.setFocusable(false);
        buttrans.setRequestFocusEnabled(false);
        buttrans.setRolloverEnabled(false);
        buttrans.setVerifyInputWhenFocusTarget(false);
        buttrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttransMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttransMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttransMouseClicked(evt);
            }
        });
        getContentPane().add(buttrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 280, 80));

        butclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close1.png"))); // NOI18N
        butclose.setBorderPainted(false);
        butclose.setContentAreaFilled(false);
        butclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butclose.setDefaultCapable(false);
        butclose.setFocusPainted(false);
        butclose.setFocusable(false);
        butclose.setRequestFocusEnabled(false);
        butclose.setRolloverEnabled(false);
        butclose.setVerifyInputWhenFocusTarget(false);
        butclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butcloseMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butcloseMouseClicked(evt);
            }
        });
        getContentPane().add(butclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 18, 18));

        butminimax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min1.png"))); // NOI18N
        butminimax.setBorderPainted(false);
        butminimax.setContentAreaFilled(false);
        butminimax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butminimax.setDefaultCapable(false);
        butminimax.setFocusPainted(false);
        butminimax.setFocusable(false);
        butminimax.setRequestFocusEnabled(false);
        butminimax.setRolloverEnabled(false);
        butminimax.setVerifyInputWhenFocusTarget(false);
        butminimax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butminimaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butminimaxMouseExited(evt);
            }
        });
        butminimax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butminimaxActionPerformed(evt);
            }
        });
        getContentPane().add(butminimax, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 25, 17, 10));

        buthistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recent.png"))); // NOI18N
        buthistory.setBorderPainted(false);
        buthistory.setContentAreaFilled(false);
        buthistory.setDefaultCapable(false);
        buthistory.setFocusPainted(false);
        buthistory.setFocusable(false);
        buthistory.setRequestFocusEnabled(false);
        buthistory.setRolloverEnabled(false);
        buthistory.setVerifyInputWhenFocusTarget(false);
        buthistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buthistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buthistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buthistoryMouseExited(evt);
            }
        });
        buthistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buthistoryActionPerformed(evt);
            }
        });
        getContentPane().add(buthistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 280, 80));

        Greetinglb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Greetinglb, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -20, 1024, 734));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 134, 340, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butbalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butbalanceActionPerformed

    private void butcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcloseMouseClicked
        if (evt.getClickCount() == 1) {
            timeclose();
            thoigian.start();
            this.setSize(1024, 734);
            new Thread(new DisplayOpen(this, 0, 0)).start();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_butcloseMouseClicked

    private void butminimaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butminimaxActionPerformed

        setState(Frame.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_butminimaxActionPerformed

    private void butwithMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butwithMouseEntered


        butwith.setIcon(new ImageIcon("src/images/withdrawal1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butwithMouseEntered

    private void butwithMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butwithMouseExited

        butwith.setIcon(new ImageIcon("src/images/withdrawal.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butwithMouseExited

    private void buttransMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttransMouseEntered

        buttrans.setIcon(new ImageIcon("src/images/transfers1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_buttransMouseEntered

    private void buttransMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttransMouseExited
        buttrans.setIcon(new ImageIcon("src/images/transfers.png"));


        // TODO add your handling code here:
    }//GEN-LAST:event_buttransMouseExited

    private void butbalanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butbalanceMouseExited

        butbalance.setIcon(new ImageIcon("src/images/balance.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butbalanceMouseExited

    private void butbalanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butbalanceMouseEntered

        butbalance.setIcon(new ImageIcon("src/images/balance1.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_butbalanceMouseEntered

    private void butpinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butpinMouseEntered

        butpin.setIcon(new ImageIcon("src/images/pinchange1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butpinMouseEntered

    private void butpinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butpinMouseExited
        butpin.setIcon(new ImageIcon("src/images/pinchange.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_butpinMouseExited

    private void butlogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butlogoutMouseEntered

        butlogout.setIcon(new ImageIcon("src/images/logout1.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_butlogoutMouseEntered

    private void butlogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butlogoutMouseExited
        butlogout.setIcon(new ImageIcon("src/images/logout.png"));
    }//GEN-LAST:event_butlogoutMouseExited

    private void butwithMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butwithMouseClicked
        if (evt.getClickCount() == 1) {
            new WITHDRAW(this, true, accountID).setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_butwithMouseClicked

    private void butminimaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butminimaxMouseEntered

        butminimax.setIcon(new ImageIcon("src/images/min2.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butminimaxMouseEntered

    private void butminimaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butminimaxMouseExited

        butminimax.setIcon(new ImageIcon("src/images/min1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butminimaxMouseExited

    private void butcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcloseMouseEntered

        butclose.setIcon(new ImageIcon("src/images/close2.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butcloseMouseEntered

    private void butcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcloseMouseExited
        butclose.setIcon(new ImageIcon("src/images/close1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butcloseMouseExited

    private void butlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butlogoutMouseClicked
        if (evt.getClickCount() == 1) {
            this.dispose();
            new EnterNumberCard().setVisible(true);
        }

    }//GEN-LAST:event_butlogoutMouseClicked

    private void buttransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttransMouseClicked
        if (evt.getClickCount() == 1) {
            new TRANSFERframe(this, true, accountID).setVisible(true);
        }

    }//GEN-LAST:event_buttransMouseClicked

    private void butbalanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butbalanceMouseClicked
        if (evt.getClickCount() == 1) {
            new ShowBalance(this, true, accountID).setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_butbalanceMouseClicked

    private void butpinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butpinMouseClicked
        if (evt.getClickCount() == 1) {
            this.dispose();
            new ChangePIN(this, true, accountID).setVisible(true);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_butpinMouseClicked

    private void buthistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buthistoryActionPerformed
    }//GEN-LAST:event_buthistoryActionPerformed

    private void buthistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buthistoryMouseClicked

        if (evt.getClickCount() == 1) {
            new RECENTactivities(this, true, accountID).setVisible(true);
        }

    }//GEN-LAST:event_buthistoryMouseClicked

    private void butwithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butwithActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butwithActionPerformed

    private void buthistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buthistoryMouseEntered
        // TODO add your handling code here:
        buthistory.setIcon(new ImageIcon("src/images/recent1.png"));
    }//GEN-LAST:event_buthistoryMouseEntered

    private void buthistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buthistoryMouseExited
        // TODO add your handling code here:
        buthistory.setIcon(new ImageIcon("src/images/recent.png"));
    }//GEN-LAST:event_buthistoryMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Greetinglb;
    private javax.swing.JButton butbalance;
    private javax.swing.JButton butclose;
    private javax.swing.JButton buthistory;
    private javax.swing.JButton butlogout;
    private javax.swing.JButton butminimax;
    private javax.swing.JButton butpin;
    private javax.swing.JButton buttrans;
    private javax.swing.JButton butwith;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbtransaction;
    // End of variables declaration//GEN-END:variables
}

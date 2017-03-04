package Guide;

import Connections.Connect;
import efiect.DisplayClose;
import efiect.DisplayOpen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author DMX
 */
public class ShowBalance extends javax.swing.JDialog {

    static String accountID;

    public ShowBalance(java.awt.Frame parent, boolean modal, String stringkey) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        ServerTurn cc = new ServerTurn();
        cc.TurningT(this);
        setSize(0, 0);
        new Thread(new DisplayClose(this, 1024, 734)).start();
        this.accountID = stringkey;
        BalanceLoading();
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

        lbbalance = new javax.swing.JLabel();
        lbgreeting = new javax.swing.JLabel();
        butcancel = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbbalance.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        lbbalance.setText("YOUR BALANCE IS:");
        getContentPane().add(lbbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        lbgreeting.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        lbgreeting.setText("GREETINGS!");
        getContentPane().add(lbgreeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        butcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        butcancel.setBorderPainted(false);
        butcancel.setContentAreaFilled(false);
        butcancel.setDefaultCapable(false);
        butcancel.setFocusPainted(false);
        butcancel.setFocusable(false);
        butcancel.setRequestFocusEnabled(false);
        butcancel.setRolloverEnabled(false);
        butcancel.setVerifyInputWhenFocusTarget(false);
        butcancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butcancelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butcancelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butcancelMouseEntered(evt);
            }
        });
        getContentPane().add(butcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 280, 80));

        bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgpanel.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 734));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butcancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcancelMouseClicked
        if (evt.getClickCount() == 1) {
            timeclose();
            thoigian.start();
            this.setSize(1024, 734);
            new Thread(new DisplayOpen(this, 0, 0)).start();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_butcancelMouseClicked

    private void butcancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcancelMouseEntered
        butcancel.setIcon(new ImageIcon("src/images/cancel1.png"));

    }//GEN-LAST:event_butcancelMouseEntered

    private void butcancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcancelMouseExited
        butcancel.setIcon(new ImageIcon("src/images/cancel.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butcancelMouseExited
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton butcancel;
    private javax.swing.JLabel lbbalance;
    private javax.swing.JLabel lbgreeting;
    // End of variables declaration//GEN-END:variables

    public void BalanceLoading() {
        try {
            Connect.connectDatabase();
            CallableStatement cat = Connect.connectDatabase().prepareCall("{call AccountShow(?)}");
            cat.setString(1, accountID);
            ResultSet rs = cat.executeQuery();
            while (rs.next()) {
                lbbalance.setText("<html>YOUR BALANCE IS: <b>" + rs.getString("AccountBalance") + "</b>$</html>");
            }
        } catch (Exception ex) {
        }
    }
}

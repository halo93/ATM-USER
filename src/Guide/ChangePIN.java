/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import Connections.Connect;
import Encryption.encryptionMD5;
import efiect.DisplayClose;
import efiect.DisplayOpen;
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
 * @author Ngo Luan
 */
public class ChangePIN extends javax.swing.JDialog {

    static String accountID;
    static String PIN;

    public ChangePIN(java.awt.Frame parent, boolean modal, String stringkey) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setSize(0, 0);
        new Thread(new DisplayClose(this, 1024, 734)).start();
         ServerTurn cc = new ServerTurn();
        cc.TurningT(this);
        Image icon = getToolkit().getImage(getClass().getResource("/images/bankicon.png"));
        setIconImage(icon);
        re0.setVisible(false);
        re1.setVisible(false);
        re2.setVisible(false);
        re3.setVisible(false);
        re4.setVisible(false);
        re5.setVisible(false);
        re6.setVisible(false);
        re7.setVisible(false);
        re8.setVisible(false);
        re9.setVisible(false);
        backspacere.setVisible(false);

        am0.setVisible(false);
        am1.setVisible(false);
        am2.setVisible(false);
        am3.setVisible(false);
        am4.setVisible(false);
        am5.setVisible(false);
        am6.setVisible(false);
        am7.setVisible(false);
        am8.setVisible(false);
        am9.setVisible(false);
        backspaceam.setVisible(false);
        this.accountID = stringkey;
        getPIN();

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
                    new User_Login(accountID).setVisible(true);
                }
            }
        });
    }

    public void timec() {
        second = 2;
        thoigian = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                second = second - 1;
                if (second == 0) {
                    dispose();
                    new Panel(accountID).setVisible(true);
                }
            }
        });
    }

    public void getPIN() {
        try {
            Connect.connectDatabase();
            CallableStatement call = Connect.connectDatabase().prepareCall("{call AccountShow(?)}");
            call.setString(1, accountID);
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                PIN = rs.getString("PIN");

            }

        } catch (Exception ex) {
            Logger.getLogger(ChangePIN.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butcancel = new javax.swing.JButton();
        butchange = new javax.swing.JButton();
        txtpinold = new javax.swing.JPasswordField();
        txtnewpin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtconfirm = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        but0 = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        re1 = new javax.swing.JButton();
        re2 = new javax.swing.JButton();
        re3 = new javax.swing.JButton();
        re4 = new javax.swing.JButton();
        re5 = new javax.swing.JButton();
        re6 = new javax.swing.JButton();
        re7 = new javax.swing.JButton();
        re8 = new javax.swing.JButton();
        re9 = new javax.swing.JButton();
        re0 = new javax.swing.JButton();
        backspacere = new javax.swing.JButton();
        am1 = new javax.swing.JButton();
        am2 = new javax.swing.JButton();
        am3 = new javax.swing.JButton();
        am4 = new javax.swing.JButton();
        am5 = new javax.swing.JButton();
        am6 = new javax.swing.JButton();
        am7 = new javax.swing.JButton();
        am8 = new javax.swing.JButton();
        am9 = new javax.swing.JButton();
        am0 = new javax.swing.JButton();
        backspaceam = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(butcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 250, 80));

        butchange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changePIN.png"))); // NOI18N
        butchange.setBorderPainted(false);
        butchange.setContentAreaFilled(false);
        butchange.setDefaultCapable(false);
        butchange.setFocusPainted(false);
        butchange.setFocusable(false);
        butchange.setRequestFocusEnabled(false);
        butchange.setRolloverEnabled(false);
        butchange.setVerifyInputWhenFocusTarget(false);
        butchange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butchangeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butchangeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butchangeMouseEntered(evt);
            }
        });
        getContentPane().add(butchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 250, 80));

        txtpinold.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtpinold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpinoldMouseClicked(evt);
            }
        });
        txtpinold.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpinoldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpinoldKeyTyped(evt);
            }
        });
        getContentPane().add(txtpinold, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 250, 40));

        txtnewpin.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtnewpin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnewpinMouseClicked(evt);
            }
        });
        txtnewpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnewpinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnewpinKeyTyped(evt);
            }
        });
        getContentPane().add(txtnewpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 250, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Old PIN :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New PIN :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        txtconfirm.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtconfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtconfirmMouseClicked(evt);
            }
        });
        txtconfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtconfirmKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtconfirmKeyTyped(evt);
            }
        });
        getContentPane().add(txtconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 250, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirm PIN :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        lb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 380, 30));

        lb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 380, 30));

        lb3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 360, 30));

        lb4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb4.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 370, 30));

        but1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        but1.setBorderPainted(false);
        but1.setContentAreaFilled(false);
        but1.setDefaultCapable(false);
        but1.setFocusPainted(false);
        but1.setFocusable(false);
        but1.setRequestFocusEnabled(false);
        but1.setRolloverEnabled(false);
        but1.setVerifyInputWhenFocusTarget(false);
        but1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but1MouseEntered(evt);
            }
        });
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });
        getContentPane().add(but1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 80, 80));

        but2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        but2.setBorderPainted(false);
        but2.setContentAreaFilled(false);
        but2.setDefaultCapable(false);
        but2.setFocusPainted(false);
        but2.setFocusable(false);
        but2.setRequestFocusEnabled(false);
        but2.setRolloverEnabled(false);
        but2.setVerifyInputWhenFocusTarget(false);
        but2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but2MouseEntered(evt);
            }
        });
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });
        getContentPane().add(but2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 80, 80));

        but3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        but3.setBorderPainted(false);
        but3.setContentAreaFilled(false);
        but3.setDefaultCapable(false);
        but3.setFocusPainted(false);
        but3.setFocusable(false);
        but3.setRequestFocusEnabled(false);
        but3.setRolloverEnabled(false);
        but3.setVerifyInputWhenFocusTarget(false);
        but3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but3MouseEntered(evt);
            }
        });
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });
        getContentPane().add(but3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 80, 80));

        but6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6.png"))); // NOI18N
        but6.setBorderPainted(false);
        but6.setContentAreaFilled(false);
        but6.setDefaultCapable(false);
        but6.setFocusPainted(false);
        but6.setFocusable(false);
        but6.setRequestFocusEnabled(false);
        but6.setRolloverEnabled(false);
        but6.setVerifyInputWhenFocusTarget(false);
        but6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but6MouseEntered(evt);
            }
        });
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });
        getContentPane().add(but6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 80, 80));

        but5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.png"))); // NOI18N
        but5.setBorderPainted(false);
        but5.setContentAreaFilled(false);
        but5.setDefaultCapable(false);
        but5.setFocusPainted(false);
        but5.setFocusable(false);
        but5.setRequestFocusEnabled(false);
        but5.setRolloverEnabled(false);
        but5.setVerifyInputWhenFocusTarget(false);
        but5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but5MouseEntered(evt);
            }
        });
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });
        getContentPane().add(but5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 80, 80));

        but4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.png"))); // NOI18N
        but4.setBorderPainted(false);
        but4.setContentAreaFilled(false);
        but4.setDefaultCapable(false);
        but4.setFocusPainted(false);
        but4.setFocusable(false);
        but4.setRequestFocusEnabled(false);
        but4.setRolloverEnabled(false);
        but4.setVerifyInputWhenFocusTarget(false);
        but4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but4MouseEntered(evt);
            }
        });
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });
        getContentPane().add(but4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 80, 80));

        but7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png"))); // NOI18N
        but7.setBorderPainted(false);
        but7.setContentAreaFilled(false);
        but7.setDefaultCapable(false);
        but7.setFocusPainted(false);
        but7.setFocusable(false);
        but7.setRequestFocusEnabled(false);
        but7.setRolloverEnabled(false);
        but7.setVerifyInputWhenFocusTarget(false);
        but7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but7MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but7MouseEntered(evt);
            }
        });
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });
        getContentPane().add(but7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 80, 80));

        but8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.png"))); // NOI18N
        but8.setBorderPainted(false);
        but8.setContentAreaFilled(false);
        but8.setDefaultCapable(false);
        but8.setFocusPainted(false);
        but8.setFocusable(false);
        but8.setRequestFocusEnabled(false);
        but8.setRolloverEnabled(false);
        but8.setVerifyInputWhenFocusTarget(false);
        but8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but8MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but8MouseEntered(evt);
            }
        });
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });
        getContentPane().add(but8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 80, 80));

        but9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.png"))); // NOI18N
        but9.setBorderPainted(false);
        but9.setContentAreaFilled(false);
        but9.setDefaultCapable(false);
        but9.setFocusPainted(false);
        but9.setFocusable(false);
        but9.setRequestFocusEnabled(false);
        but9.setRolloverEnabled(false);
        but9.setVerifyInputWhenFocusTarget(false);
        but9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but9MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but9MouseEntered(evt);
            }
        });
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });
        getContentPane().add(but9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 80, 80));

        but0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png"))); // NOI18N
        but0.setToolTipText("");
        but0.setBorderPainted(false);
        but0.setContentAreaFilled(false);
        but0.setDefaultCapable(false);
        but0.setFocusPainted(false);
        but0.setFocusable(false);
        but0.setRequestFocusEnabled(false);
        but0.setRolloverEnabled(false);
        but0.setVerifyInputWhenFocusTarget(false);
        but0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but0MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but0MouseEntered(evt);
            }
        });
        but0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but0ActionPerformed(evt);
            }
        });
        getContentPane().add(but0, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 80, 80));

        backspace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backspace.png"))); // NOI18N
        backspace.setBorderPainted(false);
        backspace.setContentAreaFilled(false);
        backspace.setDefaultCapable(false);
        backspace.setFocusPainted(false);
        backspace.setFocusable(false);
        backspace.setRequestFocusEnabled(false);
        backspace.setRolloverEnabled(false);
        backspace.setVerifyInputWhenFocusTarget(false);
        backspace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backspaceMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backspaceMouseEntered(evt);
            }
        });
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });
        getContentPane().add(backspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 170, 80));

        re1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        re1.setBorderPainted(false);
        re1.setContentAreaFilled(false);
        re1.setDefaultCapable(false);
        re1.setFocusPainted(false);
        re1.setFocusable(false);
        re1.setRequestFocusEnabled(false);
        re1.setRolloverEnabled(false);
        re1.setVerifyInputWhenFocusTarget(false);
        re1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                re1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                re1MouseEntered(evt);
            }
        });
        re1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re1ActionPerformed(evt);
            }
        });
        getContentPane().add(re1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 80, 80));

        re2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        re2.setBorderPainted(false);
        re2.setContentAreaFilled(false);
        re2.setDefaultCapable(false);
        re2.setFocusPainted(false);
        re2.setFocusable(false);
        re2.setRequestFocusEnabled(false);
        re2.setRolloverEnabled(false);
        re2.setVerifyInputWhenFocusTarget(false);
        re2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                re2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                re2MouseEntered(evt);
            }
        });
        re2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re2ActionPerformed(evt);
            }
        });
        getContentPane().add(re2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 80, 80));

        re3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        re3.setBorderPainted(false);
        re3.setContentAreaFilled(false);
        re3.setDefaultCapable(false);
        re3.setFocusPainted(false);
        re3.setFocusable(false);
        re3.setRequestFocusEnabled(false);
        re3.setRolloverEnabled(false);
        re3.setVerifyInputWhenFocusTarget(false);
        re3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                re3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                re3MouseEntered(evt);
            }
        });
        re3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re3ActionPerformed(evt);
            }
        });
        getContentPane().add(re3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 80, 80));

        re4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.png"))); // NOI18N
        re4.setBorderPainted(false);
        re4.setContentAreaFilled(false);
        re4.setDefaultCapable(false);
        re4.setFocusPainted(false);
        re4.setFocusable(false);
        re4.setRequestFocusEnabled(false);
        re4.setRolloverEnabled(false);
        re4.setVerifyInputWhenFocusTarget(false);
        re4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                re4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                re4MouseEntered(evt);
            }
        });
        re4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re4ActionPerformed(evt);
            }
        });
        getContentPane().add(re4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 80, 80));

        re5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.png"))); // NOI18N
        re5.setBorderPainted(false);
        re5.setContentAreaFilled(false);
        re5.setDefaultCapable(false);
        re5.setFocusPainted(false);
        re5.setFocusable(false);
        re5.setRequestFocusEnabled(false);
        re5.setRolloverEnabled(false);
        re5.setVerifyInputWhenFocusTarget(false);
        re5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                re5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                re5MouseEntered(evt);
            }
        });
        re5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re5ActionPerformed(evt);
            }
        });
        getContentPane().add(re5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 80, 80));

        re6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6.png"))); // NOI18N
        re6.setBorderPainted(false);
        re6.setContentAreaFilled(false);
        re6.setDefaultCapable(false);
        re6.setFocusPainted(false);
        re6.setFocusable(false);
        re6.setRequestFocusEnabled(false);
        re6.setRolloverEnabled(false);
        re6.setVerifyInputWhenFocusTarget(false);
        re6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                re6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                re6MouseEntered(evt);
            }
        });
        re6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re6ActionPerformed(evt);
            }
        });
        getContentPane().add(re6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 80, 80));

        re7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png"))); // NOI18N
        re7.setBorderPainted(false);
        re7.setContentAreaFilled(false);
        re7.setDefaultCapable(false);
        re7.setFocusPainted(false);
        re7.setFocusable(false);
        re7.setRequestFocusEnabled(false);
        re7.setRolloverEnabled(false);
        re7.setVerifyInputWhenFocusTarget(false);
        re7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                re7MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                re7MouseEntered(evt);
            }
        });
        re7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re7ActionPerformed(evt);
            }
        });
        getContentPane().add(re7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 80, 80));

        re8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.png"))); // NOI18N
        re8.setBorderPainted(false);
        re8.setContentAreaFilled(false);
        re8.setDefaultCapable(false);
        re8.setFocusPainted(false);
        re8.setFocusable(false);
        re8.setRequestFocusEnabled(false);
        re8.setRolloverEnabled(false);
        re8.setVerifyInputWhenFocusTarget(false);
        re8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                re8MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                re8MouseEntered(evt);
            }
        });
        re8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re8ActionPerformed(evt);
            }
        });
        getContentPane().add(re8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 80, 80));

        re9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.png"))); // NOI18N
        re9.setBorderPainted(false);
        re9.setContentAreaFilled(false);
        re9.setDefaultCapable(false);
        re9.setFocusPainted(false);
        re9.setFocusable(false);
        re9.setRequestFocusEnabled(false);
        re9.setRolloverEnabled(false);
        re9.setVerifyInputWhenFocusTarget(false);
        re9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                re9MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                re9MouseEntered(evt);
            }
        });
        re9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re9ActionPerformed(evt);
            }
        });
        getContentPane().add(re9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 80, 80));

        re0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png"))); // NOI18N
        re0.setToolTipText("");
        re0.setBorderPainted(false);
        re0.setContentAreaFilled(false);
        re0.setDefaultCapable(false);
        re0.setFocusPainted(false);
        re0.setFocusable(false);
        re0.setRequestFocusEnabled(false);
        re0.setRolloverEnabled(false);
        re0.setVerifyInputWhenFocusTarget(false);
        re0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                re0MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                re0MouseEntered(evt);
            }
        });
        re0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re0ActionPerformed(evt);
            }
        });
        getContentPane().add(re0, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 80, 80));

        backspacere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backspace.png"))); // NOI18N
        backspacere.setBorderPainted(false);
        backspacere.setContentAreaFilled(false);
        backspacere.setDefaultCapable(false);
        backspacere.setFocusPainted(false);
        backspacere.setFocusable(false);
        backspacere.setRequestFocusEnabled(false);
        backspacere.setRolloverEnabled(false);
        backspacere.setVerifyInputWhenFocusTarget(false);
        backspacere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backspacereMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backspacereMouseEntered(evt);
            }
        });
        backspacere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspacereActionPerformed(evt);
            }
        });
        getContentPane().add(backspacere, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 170, 80));

        am1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        am1.setBorderPainted(false);
        am1.setContentAreaFilled(false);
        am1.setDefaultCapable(false);
        am1.setFocusPainted(false);
        am1.setFocusable(false);
        am1.setRequestFocusEnabled(false);
        am1.setRolloverEnabled(false);
        am1.setVerifyInputWhenFocusTarget(false);
        am1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am1MouseEntered(evt);
            }
        });
        am1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am1ActionPerformed(evt);
            }
        });
        getContentPane().add(am1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 80, 80));

        am2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        am2.setBorderPainted(false);
        am2.setContentAreaFilled(false);
        am2.setDefaultCapable(false);
        am2.setFocusPainted(false);
        am2.setFocusable(false);
        am2.setRequestFocusEnabled(false);
        am2.setRolloverEnabled(false);
        am2.setVerifyInputWhenFocusTarget(false);
        am2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am2MouseEntered(evt);
            }
        });
        am2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am2ActionPerformed(evt);
            }
        });
        getContentPane().add(am2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 80, 80));

        am3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        am3.setBorderPainted(false);
        am3.setContentAreaFilled(false);
        am3.setDefaultCapable(false);
        am3.setFocusPainted(false);
        am3.setFocusable(false);
        am3.setRequestFocusEnabled(false);
        am3.setRolloverEnabled(false);
        am3.setVerifyInputWhenFocusTarget(false);
        am3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am3MouseEntered(evt);
            }
        });
        am3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am3ActionPerformed(evt);
            }
        });
        getContentPane().add(am3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 80, 80));

        am4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.png"))); // NOI18N
        am4.setBorderPainted(false);
        am4.setContentAreaFilled(false);
        am4.setDefaultCapable(false);
        am4.setFocusPainted(false);
        am4.setFocusable(false);
        am4.setRequestFocusEnabled(false);
        am4.setRolloverEnabled(false);
        am4.setVerifyInputWhenFocusTarget(false);
        am4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am4MouseEntered(evt);
            }
        });
        am4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am4ActionPerformed(evt);
            }
        });
        getContentPane().add(am4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 80, 80));

        am5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.png"))); // NOI18N
        am5.setBorderPainted(false);
        am5.setContentAreaFilled(false);
        am5.setDefaultCapable(false);
        am5.setFocusPainted(false);
        am5.setFocusable(false);
        am5.setRequestFocusEnabled(false);
        am5.setRolloverEnabled(false);
        am5.setVerifyInputWhenFocusTarget(false);
        am5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am5MouseEntered(evt);
            }
        });
        am5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am5ActionPerformed(evt);
            }
        });
        getContentPane().add(am5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 80, 80));

        am6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6.png"))); // NOI18N
        am6.setBorderPainted(false);
        am6.setContentAreaFilled(false);
        am6.setDefaultCapable(false);
        am6.setFocusPainted(false);
        am6.setFocusable(false);
        am6.setRequestFocusEnabled(false);
        am6.setRolloverEnabled(false);
        am6.setVerifyInputWhenFocusTarget(false);
        am6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am6MouseEntered(evt);
            }
        });
        am6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am6ActionPerformed(evt);
            }
        });
        getContentPane().add(am6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 80, 80));

        am7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png"))); // NOI18N
        am7.setBorderPainted(false);
        am7.setContentAreaFilled(false);
        am7.setDefaultCapable(false);
        am7.setFocusPainted(false);
        am7.setFocusable(false);
        am7.setRequestFocusEnabled(false);
        am7.setRolloverEnabled(false);
        am7.setVerifyInputWhenFocusTarget(false);
        am7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am7MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am7MouseEntered(evt);
            }
        });
        am7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am7ActionPerformed(evt);
            }
        });
        getContentPane().add(am7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 80, 80));

        am8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.png"))); // NOI18N
        am8.setBorderPainted(false);
        am8.setContentAreaFilled(false);
        am8.setDefaultCapable(false);
        am8.setFocusPainted(false);
        am8.setFocusable(false);
        am8.setRequestFocusEnabled(false);
        am8.setRolloverEnabled(false);
        am8.setVerifyInputWhenFocusTarget(false);
        am8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am8MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am8MouseEntered(evt);
            }
        });
        am8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am8ActionPerformed(evt);
            }
        });
        getContentPane().add(am8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 80, 80));

        am9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.png"))); // NOI18N
        am9.setBorderPainted(false);
        am9.setContentAreaFilled(false);
        am9.setDefaultCapable(false);
        am9.setFocusPainted(false);
        am9.setFocusable(false);
        am9.setRequestFocusEnabled(false);
        am9.setRolloverEnabled(false);
        am9.setVerifyInputWhenFocusTarget(false);
        am9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am9MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am9MouseEntered(evt);
            }
        });
        am9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am9ActionPerformed(evt);
            }
        });
        getContentPane().add(am9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 80, 80));

        am0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png"))); // NOI18N
        am0.setToolTipText("");
        am0.setBorderPainted(false);
        am0.setContentAreaFilled(false);
        am0.setDefaultCapable(false);
        am0.setFocusPainted(false);
        am0.setFocusable(false);
        am0.setRequestFocusEnabled(false);
        am0.setRolloverEnabled(false);
        am0.setVerifyInputWhenFocusTarget(false);
        am0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am0MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am0MouseEntered(evt);
            }
        });
        am0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am0ActionPerformed(evt);
            }
        });
        getContentPane().add(am0, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 80, 80));

        backspaceam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backspace.png"))); // NOI18N
        backspaceam.setBorderPainted(false);
        backspaceam.setContentAreaFilled(false);
        backspaceam.setDefaultCapable(false);
        backspaceam.setFocusPainted(false);
        backspaceam.setFocusable(false);
        backspaceam.setRequestFocusEnabled(false);
        backspaceam.setRolloverEnabled(false);
        backspaceam.setVerifyInputWhenFocusTarget(false);
        backspaceam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backspaceamMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backspaceamMouseEntered(evt);
            }
        });
        backspaceam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceamActionPerformed(evt);
            }
        });
        getContentPane().add(backspaceam, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 170, 80));

        bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgpanel.gif"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 734));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butchangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butchangeMouseEntered
        butchange.setIcon(new ImageIcon("src/images/changePIN1.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_butchangeMouseEntered

    private void butchangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butchangeMouseExited
        butchange.setIcon(new ImageIcon("src/images/changePIN.png"));


        // TODO add your handling code here:
    }//GEN-LAST:event_butchangeMouseExited

    private void txtpinoldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpinoldKeyPressed
        //                 NUMERIC ENTER NUMBER
        String aa = new String(txtpinold.getPassword());
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtpinold.setEditable(true);
        } else if (evt.getKeyCode() == 8) {
            txtpinold.setText(aa);
            txtpinold.setEditable(true);
        } else {
            txtpinold.setEditable(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtpinoldKeyPressed

    private void txtpinoldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpinoldKeyTyped
        if (evt.getSource().equals(txtpinold)) {
            if (new String(txtpinold.getPassword()).length() > 3) {
                evt.setKeyChar('\n');
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtpinoldKeyTyped

    private void txtnewpinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewpinKeyPressed

        String aa = new String(txtnewpin.getPassword());
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtnewpin.setEditable(true);
        } else if (evt.getKeyCode() == 8) {
            txtnewpin.setText(aa);
            txtnewpin.setEditable(true);
        } else {
            txtnewpin.setEditable(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewpinKeyPressed

    private void txtnewpinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewpinKeyTyped
        if (evt.getSource().equals(txtnewpin)) {
            if (new String(txtnewpin.getPassword()).length() > 3) {
                evt.setKeyChar('\n');
            }
        }          // TODO add your handling code here:
    }//GEN-LAST:event_txtnewpinKeyTyped

    private void txtconfirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfirmKeyPressed
        String aa = new String(txtconfirm.getPassword());
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtconfirm.setEditable(true);
        } else if (evt.getKeyCode() == 8) {
            txtconfirm.setText(aa);
            txtconfirm.setEditable(true);
        } else {
            txtconfirm.setEditable(false);
        }
    }//GEN-LAST:event_txtconfirmKeyPressed

    private void txtconfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfirmKeyTyped
        if (evt.getSource().equals(txtconfirm)) {
            if (new String(txtconfirm.getPassword()).length() > 3) {
                evt.setKeyChar('\n');
            }
        }
    }//GEN-LAST:event_txtconfirmKeyTyped

    private void butcancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcancelMouseClicked
        if (evt.getClickCount() == 1) {
            timec();
            thoigian.start();
            this.setSize(1024, 734);
            new Thread(new DisplayOpen(this, 0, 0)).start();
        }
    }//GEN-LAST:event_butcancelMouseClicked

    private void butcancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcancelMouseEntered
        butcancel.setIcon(new ImageIcon("src/images/cancel1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butcancelMouseEntered

    private void butcancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcancelMouseExited
        butcancel.setIcon(new ImageIcon("src/images/cancel.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butcancelMouseExited
    boolean check() {

        if (String.valueOf(txtpinold.getPassword()).equals("")) {
            lb1.setText("Old PIN  is not empty.");
            return false;
        } else {
            lb1.setText("");
        }
        if (String.valueOf(txtnewpin.getPassword()).equals("")) {
            lb2.setText("New PIN  is not empty.");
            return false;
        } else {
            lb2.setText("");
        }
        if (String.valueOf(txtconfirm.getPassword()).equals("")) {
            lb3.setText("Confirm PIN is not empty.");
            return false;
        } else {
            lb3.setText("");
        }
        encryptionMD5 MD5 = new encryptionMD5();
        String passold = MD5.encryptMD5(new String(this.txtpinold.getPassword()));
        String passwordnew = MD5.encryptMD5(new String(this.txtnewpin.getPassword()));
        String passwordcon = MD5.encryptMD5(new String(this.txtconfirm.getPassword()));


        if (!passold.equals(PIN)) {
            lb1.setText("Old PIN is incorrect!");
            return false;
        } else {
            lb1.setText("");
        }
        if (passwordnew.equals(passold)) {
            lb2.setText("Can't be the same Old PIN!");
            return false;
        } else {
            lb2.setText("");
        }
        if (!passwordcon.equals(passwordnew)) {
            lb3.setText("Must have the same new PIN!");
            return false;
        } else {
            lb3.setText("");
        }
        return true;

    }
    private void butchangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butchangeMouseClicked
        encryptionMD5 MD5 = new encryptionMD5();
        if (evt.getClickCount() == 1) {
            if (check()) {
                try {
                    Connect.connectDatabase();
                    CallableStatement call = Connect.connectDatabase().prepareCall("{call changePIN(?,?)}");
                    call.setString(1, this.accountID);
                    call.setString(2, MD5.encryptMD5(new String(this.txtconfirm.getPassword())));
                    int rowAffectted = call.executeUpdate();
                    if (rowAffectted > 0) {
                        lb4.setText("successfully!");
                        timeclose();
                        thoigian.start();
                        this.setSize(1024, 734);
                        new Thread(new DisplayOpen(this, 0, 0)).start();
                    } else {
                        lb4.setText("Unsuccessfully!");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_butchangeMouseClicked

    private void but1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseExited

        but1.setIcon(new ImageIcon("src/images/1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but1MouseExited

    private void but1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseEntered

        but1.setIcon(new ImageIcon("src/images/11.png"));
    }//GEN-LAST:event_but1MouseEntered

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        String aa = new String(this.txtpinold.getPassword());
        if (evt.getID() == 1001) {
            txtpinold.setText(aa + "1");
        }
        if (aa.length() == 4) {
            txtpinold.setText(aa + "");
        }
    }//GEN-LAST:event_but1ActionPerformed

    private void but2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but2MouseExited

        but2.setIcon(new ImageIcon("src/images/2.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but2MouseExited

    private void but2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but2MouseEntered
        but2.setIcon(new ImageIcon("src/images/21.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but2MouseEntered

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed

        String aa = new String(this.txtpinold.getPassword());
        if (evt.getID() == 1001) {

            txtpinold.setText(aa + "2");
        }
        if (aa.length() == 4) {
            txtpinold.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but2ActionPerformed

    private void but3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but3MouseExited

        but3.setIcon(new ImageIcon("src/images/3.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but3MouseExited

    private void but3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but3MouseEntered
        but3.setIcon(new ImageIcon("src/images/31.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but3MouseEntered

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed

        String aa = new String(this.txtpinold.getPassword());
        if (evt.getID() == 1001) {

            txtpinold.setText(aa + "3");
        }
        if (aa.length() == 4) {
            txtpinold.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but3ActionPerformed

    private void but6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but6MouseExited
        but6.setIcon(new ImageIcon("src/images/6.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but6MouseExited

    private void but6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but6MouseEntered

        but6.setIcon(new ImageIcon("src/images/61.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but6MouseEntered

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed

        String aa = new String(this.txtpinold.getPassword());
        if (evt.getID() == 1001) {

            txtpinold.setText(aa + "6");
        }
        if (aa.length() == 4) {
            txtpinold.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but6ActionPerformed

    private void but5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but5MouseExited
        but5.setIcon(new ImageIcon("src/images/5.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but5MouseExited

    private void but5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but5MouseEntered

        but5.setIcon(new ImageIcon("src/images/51.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but5MouseEntered

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
        String aa = new String(this.txtpinold.getPassword());
        if (evt.getID() == 1001) {

            txtpinold.setText(aa + "5");
        }
        if (aa.length() == 4) {
            txtpinold.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but5ActionPerformed

    private void but4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but4MouseExited

        but4.setIcon(new ImageIcon("src/images/4.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but4MouseExited

    private void but4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but4MouseEntered

        but4.setIcon(new ImageIcon("src/images/41.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but4MouseEntered

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed

        String aa = new String(this.txtpinold.getPassword());
        if (evt.getID() == 1001) {

            txtpinold.setText(aa + "4");
        }
        if (aa.length() == 4) {
            txtpinold.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but4ActionPerformed

    private void but7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but7MouseExited
        but7.setIcon(new ImageIcon("src/images/7.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but7MouseExited

    private void but7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but7MouseEntered
        but7.setIcon(new ImageIcon("src/images/71.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but7MouseEntered

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed

        String aa = new String(this.txtpinold.getPassword());
        if (evt.getID() == 1001) {

            txtpinold.setText(aa + "7");
        }
        if (aa.length() == 4) {
            txtpinold.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but7ActionPerformed

    private void but8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but8MouseExited

        but8.setIcon(new ImageIcon("src/images/8.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but8MouseExited

    private void but8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but8MouseEntered

        but8.setIcon(new ImageIcon("src/images/81.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but8MouseEntered

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed

        String aa = new String(this.txtpinold.getPassword());
        if (evt.getID() == 1001) {

            txtpinold.setText(aa + "8");
        }

        if (aa.length() == 4) {
            txtpinold.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but8ActionPerformed

    private void but9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but9MouseExited
        but9.setIcon(new ImageIcon("src/images/9.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but9MouseExited

    private void but9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but9MouseEntered
        but9.setIcon(new ImageIcon("src/images/91.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but9MouseEntered

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed

        String aa = new String(this.txtpinold.getPassword());
        if (evt.getID() == 1001) {

            txtpinold.setText(aa + "9");
        }


        if (aa.length() == 4) {
            txtpinold.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but9ActionPerformed

    private void but0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but0MouseExited
        but0.setIcon(new ImageIcon("src/images/0.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but0MouseExited

    private void but0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but0MouseEntered

        but0.setIcon(new ImageIcon("src/images/01.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but0MouseEntered

    private void but0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but0ActionPerformed

        String aa = new String(this.txtpinold.getPassword());
        if (evt.getID() == 1001) {

            txtpinold.setText(aa + "0");
        }

        if (aa.length() == 4) {
            txtpinold.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but0ActionPerformed

    private void backspaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceMouseExited

        backspace.setIcon(new ImageIcon("src/images/backspace.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_backspaceMouseExited

    private void backspaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceMouseEntered

        backspace.setIcon(new ImageIcon("src/images/backspace1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_backspaceMouseEntered

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed

        txtpinold.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_backspaceActionPerformed

    private void re1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re1MouseExited
        re1.setIcon(new ImageIcon("src/images/1.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re1MouseExited

    private void re1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re1MouseEntered
        re1.setIcon(new ImageIcon("src/images/11.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re1MouseEntered

    private void re1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re1ActionPerformed
        String aa = new String(this.txtnewpin.getPassword());
        if (evt.getID() == 1001) {
            txtnewpin.setText(aa + "1");
        }
        if (aa.length() == 4) {
            txtnewpin.setText(aa + "");
        }      // TODO add your handling code here:
    }//GEN-LAST:event_re1ActionPerformed

    private void re2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re2MouseExited
        re2.setIcon(new ImageIcon("src/images/2.png"));         // TODO add your handling code here:
    }//GEN-LAST:event_re2MouseExited

    private void re2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re2MouseEntered
        re2.setIcon(new ImageIcon("src/images/21.png"));         // TODO add your handling code here:
    }//GEN-LAST:event_re2MouseEntered

    private void re2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re2ActionPerformed
        String aa = new String(this.txtnewpin.getPassword());
        if (evt.getID() == 1001) {
            txtnewpin.setText(aa + "2");
        }
        if (aa.length() == 4) {
            txtnewpin.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_re2ActionPerformed

    private void re3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re3MouseExited
        re3.setIcon(new ImageIcon("src/images/3.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re3MouseExited

    private void re3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re3MouseEntered
        re3.setIcon(new ImageIcon("src/images/31.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re3MouseEntered

    private void re3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re3ActionPerformed
        String aa = new String(this.txtnewpin.getPassword());
        if (evt.getID() == 1001) {
            txtnewpin.setText(aa + "3");
        }
        if (aa.length() == 4) {
            txtnewpin.setText(aa + "");
        }     // TODO add your handling code here:
    }//GEN-LAST:event_re3ActionPerformed

    private void re4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re4MouseExited
        re4.setIcon(new ImageIcon("src/images/4.png"));       // TODO add your handling code here:
    }//GEN-LAST:event_re4MouseExited

    private void re4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re4MouseEntered
        re4.setIcon(new ImageIcon("src/images/41.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re4MouseEntered

    private void re4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re4ActionPerformed
        String aa = new String(this.txtnewpin.getPassword());
        if (evt.getID() == 1001) {
            txtnewpin.setText(aa + "4");
        }
        if (aa.length() == 4) {
            txtnewpin.setText(aa + "");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_re4ActionPerformed

    private void re5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re5MouseExited
        re5.setIcon(new ImageIcon("src/images/5.png"));         // TODO add your handling code here:
    }//GEN-LAST:event_re5MouseExited

    private void re5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re5MouseEntered
        re5.setIcon(new ImageIcon("src/images/51.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re5MouseEntered

    private void re5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re5ActionPerformed
        String aa = new String(this.txtnewpin.getPassword());
        if (evt.getID() == 1001) {
            txtnewpin.setText(aa + "5");
        }
        if (aa.length() == 4) {
            txtnewpin.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_re5ActionPerformed

    private void re6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re6MouseExited
        re6.setIcon(new ImageIcon("src/images/6.png"));
    }//GEN-LAST:event_re6MouseExited

    private void re6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re6MouseEntered
        re6.setIcon(new ImageIcon("src/images/61.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_re6MouseEntered

    private void re6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re6ActionPerformed
        String aa = new String(this.txtnewpin.getPassword());
        if (evt.getID() == 1001) {
            txtnewpin.setText(aa + "6");
        }
        if (aa.length() == 4) {
            txtnewpin.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_re6ActionPerformed

    private void re7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re7MouseExited
        re7.setIcon(new ImageIcon("src/images/7.png"));     // TODO add your handling code here:
    }//GEN-LAST:event_re7MouseExited

    private void re7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re7MouseEntered
        re7.setIcon(new ImageIcon("src/images/71.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re7MouseEntered

    private void re7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re7ActionPerformed
        String aa = new String(this.txtnewpin.getPassword());
        if (evt.getID() == 1001) {
            txtnewpin.setText(aa + "7");
        }
        if (aa.length() == 4) {
            txtnewpin.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_re7ActionPerformed

    private void re8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re8MouseExited
        re8.setIcon(new ImageIcon("src/images/8.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re8MouseExited

    private void re8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re8MouseEntered
        re8.setIcon(new ImageIcon("src/images/81.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_re8MouseEntered

    private void re8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re8ActionPerformed
        String aa = new String(this.txtnewpin.getPassword());
        if (evt.getID() == 1001) {
            txtnewpin.setText(aa + "8");
        }
        if (aa.length() == 4) {
            txtnewpin.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_re8ActionPerformed

    private void re9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re9MouseExited
        re9.setIcon(new ImageIcon("src/images/9.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re9MouseExited

    private void re9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re9MouseEntered
        re9.setIcon(new ImageIcon("src/images/91.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re9MouseEntered

    private void re9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re9ActionPerformed
        String aa = new String(this.txtnewpin.getPassword());
        if (evt.getID() == 1001) {
            txtnewpin.setText(aa + "9");
        }
        if (aa.length() == 4) {
            txtnewpin.setText(aa + "");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_re9ActionPerformed

    private void re0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re0MouseExited
        re0.setIcon(new ImageIcon("src/images/0.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re0MouseExited

    private void re0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re0MouseEntered
        re0.setIcon(new ImageIcon("src/images/01.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re0MouseEntered

    private void re0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re0ActionPerformed
        String aa = new String(this.txtnewpin.getPassword());
        if (evt.getID() == 1001) {
            txtnewpin.setText(aa + "0");
        }
        if (aa.length() == 4) {
            txtnewpin.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_re0ActionPerformed

    private void am1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am1MouseExited
        am1.setIcon(new ImageIcon("src/images/1.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am1MouseExited

    private void am1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am1MouseEntered
        am1.setIcon(new ImageIcon("src/images/11.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_am1MouseEntered

    private void am1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am1ActionPerformed
        String aa = new String(this.txtconfirm.getPassword());
        if (evt.getID() == 1001) {
            txtconfirm.setText(aa + "1");
        }
        if (aa.length() == 4) {
            txtconfirm.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_am1ActionPerformed

    private void am2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am2MouseExited
        am2.setIcon(new ImageIcon("src/images/2.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am2MouseExited

    private void am2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am2MouseEntered
        am2.setIcon(new ImageIcon("src/images/21.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am2MouseEntered

    private void am2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am2ActionPerformed
        String aa = new String(this.txtconfirm.getPassword());
        if (evt.getID() == 1001) {
            txtconfirm.setText(aa + "2");
        }
        if (aa.length() == 4) {
            txtconfirm.setText(aa + "");
        }          // TODO add your handling code here:
    }//GEN-LAST:event_am2ActionPerformed

    private void am3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am3MouseExited
        am3.setIcon(new ImageIcon("src/images/3.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am3MouseExited

    private void am3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am3MouseEntered
        am3.setIcon(new ImageIcon("src/images/31.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am3MouseEntered

    private void am3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am3ActionPerformed
        String aa = new String(this.txtconfirm.getPassword());
        if (evt.getID() == 1001) {
            txtconfirm.setText(aa + "3");
        }
        if (aa.length() == 4) {
            txtconfirm.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_am3ActionPerformed

    private void am4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am4MouseExited
        am4.setIcon(new ImageIcon("src/images/4.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am4MouseExited

    private void am4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am4MouseEntered
        am4.setIcon(new ImageIcon("src/images/41.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am4MouseEntered

    private void am4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am4ActionPerformed
        String aa = new String(this.txtconfirm.getPassword());
        if (evt.getID() == 1001) {
            txtconfirm.setText(aa + "4");
        }
        if (aa.length() == 4) {
            txtconfirm.setText(aa + "");
        }          // TODO add your handling code here:
    }//GEN-LAST:event_am4ActionPerformed

    private void am5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am5MouseExited
        am5.setIcon(new ImageIcon("src/images/5.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am5MouseExited

    private void am5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am5MouseEntered
        am5.setIcon(new ImageIcon("src/images/51.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am5MouseEntered

    private void am5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am5ActionPerformed
        String aa = new String(this.txtconfirm.getPassword());
        if (evt.getID() == 1001) {
            txtconfirm.setText(aa + "5");
        }
        if (aa.length() == 4) {
            txtconfirm.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_am5ActionPerformed

    private void am6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am6MouseExited
        am6.setIcon(new ImageIcon("src/images/6.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am6MouseExited

    private void am6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am6MouseEntered
        am6.setIcon(new ImageIcon("src/images/61.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am6MouseEntered

    private void am6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am6ActionPerformed
        String aa = new String(this.txtconfirm.getPassword());
        if (evt.getID() == 1001) {
            txtconfirm.setText(aa + "6");
        }
        if (aa.length() == 4) {
            txtconfirm.setText(aa + "");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_am6ActionPerformed

    private void am7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am7MouseExited
        am7.setIcon(new ImageIcon("src/images/7.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am7MouseExited

    private void am7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am7MouseEntered
        am7.setIcon(new ImageIcon("src/images/71.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am7MouseEntered

    private void am7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am7ActionPerformed
        String aa = new String(this.txtconfirm.getPassword());
        if (evt.getID() == 1001) {
            txtconfirm.setText(aa + "7");
        }
        if (aa.length() == 4) {
            txtconfirm.setText(aa + "");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_am7ActionPerformed

    private void am8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am8MouseExited
        am8.setIcon(new ImageIcon("src/images/8.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am8MouseExited

    private void am8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am8MouseEntered
        am8.setIcon(new ImageIcon("src/images/81.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am8MouseEntered

    private void am8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am8ActionPerformed
        String aa = new String(this.txtconfirm.getPassword());
        if (evt.getID() == 1001) {
            txtconfirm.setText(aa + "8");
        }
        if (aa.length() == 4) {
            txtconfirm.setText(aa + "");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_am8ActionPerformed

    private void am9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am9MouseExited
        am9.setIcon(new ImageIcon("src/images/9.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am9MouseExited

    private void am9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am9MouseEntered
        am9.setIcon(new ImageIcon("src/images/91.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am9MouseEntered

    private void am9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am9ActionPerformed
        String aa = new String(this.txtconfirm.getPassword());
        if (evt.getID() == 1001) {
            txtconfirm.setText(aa + "9");
        }
        if (aa.length() == 4) {
            txtconfirm.setText(aa + "");
        }          // TODO add your handling code here:
    }//GEN-LAST:event_am9ActionPerformed

    private void am0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am0MouseExited
        am0.setIcon(new ImageIcon("src/images/0.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am0MouseExited

    private void am0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am0MouseEntered
        am0.setIcon(new ImageIcon("src/images/01.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am0MouseEntered

    private void am0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am0ActionPerformed
        String aa = new String(this.txtconfirm.getPassword());
        if (evt.getID() == 1001) {
            txtconfirm.setText(aa + "0");
        }
        if (aa.length() == 4) {
            txtconfirm.setText(aa + "");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_am0ActionPerformed

    private void txtpinoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpinoldMouseClicked
        but0.setVisible(true);
        but1.setVisible(true);
        but2.setVisible(true);
        but3.setVisible(true);
        but4.setVisible(true);
        but5.setVisible(true);
        but6.setVisible(true);
        but7.setVisible(true);
        but8.setVisible(true);
        but9.setVisible(true);
        backspace.setVisible(true);

        am0.setVisible(false);
        am1.setVisible(false);
        am2.setVisible(false);
        am3.setVisible(false);
        am4.setVisible(false);
        am5.setVisible(false);
        am6.setVisible(false);
        am7.setVisible(false);
        am8.setVisible(false);
        am9.setVisible(false);
        backspaceam.setVisible(false);

        re0.setVisible(false);
        re1.setVisible(false);
        re2.setVisible(false);
        re3.setVisible(false);
        re4.setVisible(false);
        re5.setVisible(false);
        re6.setVisible(false);
        re7.setVisible(false);
        re8.setVisible(false);
        re9.setVisible(false);
        backspacere.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_txtpinoldMouseClicked

    private void txtnewpinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnewpinMouseClicked
        but0.setVisible(false);
        but1.setVisible(false);
        but2.setVisible(false);
        but3.setVisible(false);
        but4.setVisible(false);
        but5.setVisible(false);
        but6.setVisible(false);
        but7.setVisible(false);
        but8.setVisible(false);
        but9.setVisible(false);
        backspace.setVisible(false);

        am0.setVisible(false);
        am1.setVisible(false);
        am2.setVisible(false);
        am3.setVisible(false);
        am4.setVisible(false);
        am5.setVisible(false);
        am6.setVisible(false);
        am7.setVisible(false);
        am8.setVisible(false);
        am9.setVisible(false);
        backspaceam.setVisible(false);

        re0.setVisible(true);
        re1.setVisible(true);
        re2.setVisible(true);
        re3.setVisible(true);
        re4.setVisible(true);
        re5.setVisible(true);
        re6.setVisible(true);
        re7.setVisible(true);
        re8.setVisible(true);
        re9.setVisible(true);
        backspacere.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewpinMouseClicked

    private void txtconfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtconfirmMouseClicked
        but0.setVisible(false);
        but1.setVisible(false);
        but2.setVisible(false);
        but3.setVisible(false);
        but4.setVisible(false);
        but5.setVisible(false);
        but6.setVisible(false);
        but7.setVisible(false);
        but8.setVisible(false);
        but9.setVisible(false);
        backspace.setVisible(false);

        re0.setVisible(false);
        re1.setVisible(false);
        re2.setVisible(false);
        re3.setVisible(false);
        re4.setVisible(false);
        re5.setVisible(false);
        re6.setVisible(false);
        re7.setVisible(false);
        re8.setVisible(false);
        re9.setVisible(false);
        backspacere.setVisible(false);
        am0.setVisible(true);
        am1.setVisible(true);
        am2.setVisible(true);
        am3.setVisible(true);
        am4.setVisible(true);
        am5.setVisible(true);
        am6.setVisible(true);
        am7.setVisible(true);
        am8.setVisible(true);
        am9.setVisible(true);
        backspaceam.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmMouseClicked

    private void backspaceamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceamActionPerformed

        txtconfirm.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_backspaceamActionPerformed

    private void backspaceamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceamMouseEntered
        backspaceam.setIcon(new ImageIcon("src/images/backspace1.png"));           // TODO add your handling code here:
    }//GEN-LAST:event_backspaceamMouseEntered

    private void backspaceamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceamMouseExited
        backspaceam.setIcon(new ImageIcon("src/images/backspace.png"));     // TODO add your handling code here:
    }//GEN-LAST:event_backspaceamMouseExited

    private void backspacereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspacereActionPerformed
        txtnewpin.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_backspacereActionPerformed

    private void backspacereMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspacereMouseEntered
        backspacere.setIcon(new ImageIcon("src/images/backspace1.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_backspacereMouseEntered

    private void backspacereMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspacereMouseExited
        backspacere.setIcon(new ImageIcon("src/images/backspace.png"));      // TODO add your handling code here:
    }//GEN-LAST:event_backspacereMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton am0;
    private javax.swing.JButton am1;
    private javax.swing.JButton am2;
    private javax.swing.JButton am3;
    private javax.swing.JButton am4;
    private javax.swing.JButton am5;
    private javax.swing.JButton am6;
    private javax.swing.JButton am7;
    private javax.swing.JButton am8;
    private javax.swing.JButton am9;
    private javax.swing.JButton backspace;
    private javax.swing.JButton backspaceam;
    private javax.swing.JButton backspacere;
    private javax.swing.JLabel bg;
    private javax.swing.JButton but0;
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JButton butcancel;
    private javax.swing.JButton butchange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JButton re0;
    private javax.swing.JButton re1;
    private javax.swing.JButton re2;
    private javax.swing.JButton re3;
    private javax.swing.JButton re4;
    private javax.swing.JButton re5;
    private javax.swing.JButton re6;
    private javax.swing.JButton re7;
    private javax.swing.JButton re8;
    private javax.swing.JButton re9;
    private javax.swing.JPasswordField txtconfirm;
    private javax.swing.JPasswordField txtnewpin;
    private javax.swing.JPasswordField txtpinold;
    // End of variables declaration//GEN-END:variables
}

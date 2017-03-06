/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import Connections.Connect;
import efiect.DisplayClose;
import efiect.DisplayOpen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author DMX
 */
public class TRANSFERframe extends javax.swing.JDialog {

    static String accountID;
    boolean check_account = false;

    public TRANSFERframe(java.awt.Frame parent, boolean modal, String stringkey) {
        super(parent, modal);

        setUndecorated(true);
        initComponents();
        ServerTurn cc = new ServerTurn();
        cc.TurningT(this);
        this.accountID = stringkey;
        setSize(0, 0);
        new Thread(new DisplayClose(this, 1024, 734)).start();

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
    }
    String cr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    String cg = new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());
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

        jLabel2 = new javax.swing.JLabel();
        txtmoneytrans = new javax.swing.JTextField();
        txtaccount2 = new javax.swing.JTextField();
        butcancel = new javax.swing.JButton();
        txtaccount1 = new javax.swing.JTextField();
        lbinputmoney = new javax.swing.JLabel();
        transferbn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbcheckaccount = new javax.swing.JLabel();
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please input the beneficiary account No.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 333, -1));

        txtmoneytrans.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtmoneytrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmoneytransMouseClicked(evt);
            }
        });
        txtmoneytrans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmoneytransKeyPressed(evt);
            }
        });
        getContentPane().add(txtmoneytrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 300, 30));

        txtaccount2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtaccount2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaccount2MouseClicked(evt);
            }
        });
        txtaccount2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaccount2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaccount2KeyTyped(evt);
            }
        });
        getContentPane().add(txtaccount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 300, 30));

        butcancel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butcancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butcancelMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butcancelMouseClicked(evt);
            }
        });
        getContentPane().add(butcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 250, 80));

        txtaccount1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtaccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaccount1MouseClicked(evt);
            }
        });
        txtaccount1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaccount1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaccount1KeyTyped(evt);
            }
        });
        getContentPane().add(txtaccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 300, -1));

        lbinputmoney.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbinputmoney.setForeground(new java.awt.Color(255, 255, 255));
        lbinputmoney.setText("Please input the amount of money you want to transfer");
        getContentPane().add(lbinputmoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 20));

        transferbn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        transferbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transfers.png"))); // NOI18N
        transferbn.setBorderPainted(false);
        transferbn.setContentAreaFilled(false);
        transferbn.setDefaultCapable(false);
        transferbn.setFocusPainted(false);
        transferbn.setFocusable(false);
        transferbn.setRequestFocusEnabled(false);
        transferbn.setRolloverEnabled(false);
        transferbn.setVerifyInputWhenFocusTarget(false);
        transferbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transferbnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transferbnMouseExited(evt);
            }
        });
        transferbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferbnActionPerformed(evt);
            }
        });
        getContentPane().add(transferbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 250, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Please re-input the following account No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 337, -1));
        getContentPane().add(lbcheckaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am1MouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am2MouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am3MouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am4MouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am5MouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am6MouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am7MouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am8MouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am9MouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                am0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                am0MouseExited(evt);
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
        bg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bgKeyPressed(evt);
            }
        });
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 734));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transferbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferbnActionPerformed

        if (txtaccount1.getText().equals("") || txtaccount2.getText().equals("") || txtmoneytrans.getText().equals("")) {


            lbcheckaccount.setText("<html><font color = 'red'>None of those fields should be blank!</font></html>");
        } else {
            lbcheckaccount.setText(null);
            key1 = txtaccount1.getText().charAt(0) + "" + txtaccount1.getText().charAt(1) + "" + txtaccount1.getText().charAt(2) + "" + txtaccount1.getText().charAt(3);

            key2 = txtaccount1.getText().charAt(5) + "" + txtaccount1.getText().charAt(6) + "" + txtaccount1.getText().charAt(7) + "" + txtaccount1.getText().charAt(8);

            key3 = txtaccount1.getText().charAt(10) + "" + txtaccount1.getText().charAt(11) + "" + txtaccount1.getText().charAt(12) + "" + txtaccount1.getText().charAt(13);
            String stringkey = key1 + key2 + key3;
            try {
                Connect.connectDatabase();
                CallableStatement cat = Connect.connectDatabase().prepareCall("{call Show_Account}");
                ResultSet rst = cat.executeQuery();
                while (rst.next()) {
                    if (stringkey.equals(rst.getString("AccountID"))) {
                        checkinputaccount();
                        check_account = true;
                        break;
                    }
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }

        }if (check_account == false) {
                    JOptionPane.showMessageDialog(this, "The Beneficiary account you input does not exist");
                }
    }//GEN-LAST:event_transferbnActionPerformed

    private void butcancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcancelMouseClicked
        if (evt.getClickCount() == 1) {
            timeclose();
            thoigian.start();
            this.setSize(1024, 734);
            new Thread(new DisplayOpen(this, 0, 0)).start();
        }
    }//GEN-LAST:event_butcancelMouseClicked

    private void butcancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcancelMouseEntered
        butcancel.setIcon(new ImageIcon("src/images/cancel1.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_butcancelMouseEntered

    private void butcancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcancelMouseExited
        butcancel.setIcon(new ImageIcon("src/images/cancel.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butcancelMouseExited

    private void transferbnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferbnMouseEntered
        transferbn.setIcon(new ImageIcon("src/images/transfers1.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_transferbnMouseEntered

    private void transferbnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferbnMouseExited
        transferbn.setIcon(new ImageIcon("src/images/transfers.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_transferbnMouseExited

    private void txtaccount1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaccount1KeyPressed
        String aa = this.txtaccount1.getText();
        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtaccount1.setEditable(true);
        } else if (evt.getKeyCode() == 8) {
            txtaccount1.setText(aa);
            txtaccount1.setEditable(true);
        } else {
            txtaccount1.setEditable(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccount1KeyPressed

    private void txtaccount2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaccount2KeyPressed


        String aa = this.txtaccount2.getText();
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtaccount2.setEditable(true);
        } else if (evt.getKeyCode() == 8) {
            txtaccount2.setText(aa);
            txtaccount2.setEditable(true);
        } else {
            txtaccount2.setEditable(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccount2KeyPressed

    private void txtmoneytransKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmoneytransKeyPressed
        String aa = this.txtmoneytrans.getText();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtmoneytrans.setEditable(true);
        } else if (evt.getKeyCode() == 8) {
            txtmoneytrans.setText(aa);
            txtmoneytrans.setEditable(true);
        } else {
            txtmoneytrans.setEditable(false);
        }
    }//GEN-LAST:event_txtmoneytransKeyPressed

    private void but1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseExited

        but1.setIcon(new ImageIcon("src/images/1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but1MouseExited

    private void but1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseEntered

        but1.setIcon(new ImageIcon("src/images/11.png"));
    }//GEN-LAST:event_but1MouseEntered

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        String aa = this.txtaccount1.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount1.setText(aa + "1");
        }
        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount1.setText(aa + "");
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

        String aa = this.txtaccount1.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {

            txtaccount1.setText(aa + "2");
        }
        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount1.setText(aa + "");
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

        String aa = this.txtaccount1.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {

            txtaccount1.setText(aa + "3");
        }
        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount1.setText(aa + "");
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

        String aa = this.txtaccount1.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {

            txtaccount1.setText(aa + "6");
        }
        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount1.setText(aa + "");
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
        String aa = this.txtaccount1.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {

            txtaccount1.setText(aa + "5");
        }
        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount1.setText(aa + "");
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

        String aa = this.txtaccount1.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {

            txtaccount1.setText(aa + "4");
        }
        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount1.setText(aa + "");
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

        String aa = this.txtaccount1.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {

            txtaccount1.setText(aa + "7");
        }
        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount1.setText(aa + "");
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

        String aa = this.txtaccount1.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {

            txtaccount1.setText(aa + "8");
        }

        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount1.setText(aa + "");
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

        String aa = this.txtaccount1.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {

            txtaccount1.setText(aa + "9");
        }

        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount1.setText(aa + "");
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

        String aa = this.txtaccount1.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {

            txtaccount1.setText(aa + "0");
        }
        if (aa.length() == 4) {
            txtaccount1.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount1.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount1.setText(aa + "");
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

        txtaccount1.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_backspaceActionPerformed

    private void txtaccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaccount1MouseClicked

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
        backspacere.setVisible(false);

    }//GEN-LAST:event_txtaccount1MouseClicked

    private void txtaccount2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaccount2MouseClicked


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


    }//GEN-LAST:event_txtaccount2MouseClicked

    private void re1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re1MouseExited
        re1.setIcon(new ImageIcon("src/images/1.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re1MouseExited

    private void re1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re1MouseEntered
        re1.setIcon(new ImageIcon("src/images/11.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re1MouseEntered

    private void re1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re1ActionPerformed
        String aa = this.txtaccount2.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount2.setText(aa + "1");
        }
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount2.setText(aa + "");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_re1ActionPerformed

    private void re2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re2MouseExited
        re2.setIcon(new ImageIcon("src/images/2.png"));         // TODO add your handling code here:
    }//GEN-LAST:event_re2MouseExited

    private void re2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re2MouseEntered
        re2.setIcon(new ImageIcon("src/images/21.png"));         // TODO add your handling code here:
    }//GEN-LAST:event_re2MouseEntered

    private void re2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re2ActionPerformed
        String aa = this.txtaccount2.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount2.setText(aa + "2");
        }
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount2.setText(aa + "");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_re2ActionPerformed

    private void re3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re3MouseExited
        re3.setIcon(new ImageIcon("src/images/3.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re3MouseExited

    private void re3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re3MouseEntered
        re3.setIcon(new ImageIcon("src/images/31.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re3MouseEntered

    private void re3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re3ActionPerformed
        String aa = this.txtaccount2.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount2.setText(aa + "3");
        }
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount2.setText(aa + "");
        }      // TODO add your handling code here:
    }//GEN-LAST:event_re3ActionPerformed

    private void re4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re4MouseExited
        re4.setIcon(new ImageIcon("src/images/4.png"));       // TODO add your handling code here:
    }//GEN-LAST:event_re4MouseExited

    private void re4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re4MouseEntered
        re4.setIcon(new ImageIcon("src/images/41.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re4MouseEntered

    private void re4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re4ActionPerformed
        String aa = this.txtaccount2.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount2.setText(aa + "4");
        }
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount2.setText(aa + "");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_re4ActionPerformed

    private void re5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re5MouseExited
        re5.setIcon(new ImageIcon("src/images/5.png"));         // TODO add your handling code here:
    }//GEN-LAST:event_re5MouseExited

    private void re5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re5MouseEntered
        re5.setIcon(new ImageIcon("src/images/51.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re5MouseEntered

    private void re5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re5ActionPerformed
        String aa = this.txtaccount2.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount2.setText(aa + "5");
        }
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount2.setText(aa + "");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_re5ActionPerformed

    private void re6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re6MouseExited
        re6.setIcon(new ImageIcon("src/images/6.png"));
    }//GEN-LAST:event_re6MouseExited

    private void re6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re6MouseEntered
        re6.setIcon(new ImageIcon("src/images/61.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_re6MouseEntered

    private void re6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re6ActionPerformed
        String aa = this.txtaccount2.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount2.setText(aa + "6");
        }
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount2.setText(aa + "");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_re6ActionPerformed

    private void re7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re7MouseExited
        re7.setIcon(new ImageIcon("src/images/7.png"));     // TODO add your handling code here:
    }//GEN-LAST:event_re7MouseExited

    private void re7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re7MouseEntered
        re7.setIcon(new ImageIcon("src/images/71.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_re7MouseEntered

    private void re7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re7ActionPerformed
        String aa = this.txtaccount2.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount2.setText(aa + "7");
        }
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount2.setText(aa + "");
        }      // TODO add your handling code here:
    }//GEN-LAST:event_re7ActionPerformed

    private void re8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re8MouseExited
        re8.setIcon(new ImageIcon("src/images/8.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re8MouseExited

    private void re8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re8MouseEntered
        re8.setIcon(new ImageIcon("src/images/81.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_re8MouseEntered

    private void re8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re8ActionPerformed
        String aa = this.txtaccount2.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount2.setText(aa + "8");
        }
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount2.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_re8ActionPerformed

    private void re9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re9MouseExited
        re9.setIcon(new ImageIcon("src/images/9.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re9MouseExited

    private void re9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re9MouseEntered
        re9.setIcon(new ImageIcon("src/images/91.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re9MouseEntered

    private void re9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re9ActionPerformed
        String aa = this.txtaccount2.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount2.setText(aa + "9");
        }
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount2.setText(aa + "");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_re9ActionPerformed

    private void re0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re0MouseExited
        re0.setIcon(new ImageIcon("src/images/0.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re0MouseExited

    private void re0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re0MouseEntered
        re0.setIcon(new ImageIcon("src/images/01.png"));          // TODO add your handling code here:
    }//GEN-LAST:event_re0MouseEntered

    private void re0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re0ActionPerformed
        String aa = this.txtaccount2.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtaccount2.setText(aa + "0");
        }
        if (aa.length() == 4) {
            txtaccount2.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtaccount2.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtaccount2.setText(aa + "");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_re0ActionPerformed

    private void backspacereMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspacereMouseExited
        backspacere.setIcon(new ImageIcon("src/images/backspace.png"));      // TODO add your handling code here:
    }//GEN-LAST:event_backspacereMouseExited

    private void backspacereMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspacereMouseEntered
        backspacere.setIcon(new ImageIcon("src/images/backspace1.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_backspacereMouseEntered

    private void backspacereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspacereActionPerformed

        txtaccount2.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_backspacereActionPerformed

    private void txtmoneytransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmoneytransMouseClicked

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
        backspaceam.setVisible(true);



        // TODO add your handling code here:
    }//GEN-LAST:event_txtmoneytransMouseClicked

    private void am1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am1MouseExited
        am1.setIcon(new ImageIcon("src/images/1.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am1MouseExited

    private void am1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am1MouseEntered
        am1.setIcon(new ImageIcon("src/images/11.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_am1MouseEntered

    private void am1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am1ActionPerformed
        String aa = this.txtmoneytrans.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtmoneytrans.setText(aa + "1");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_am1ActionPerformed

    private void am2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am2MouseExited
        am2.setIcon(new ImageIcon("src/images/2.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am2MouseExited

    private void am2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am2MouseEntered
        am2.setIcon(new ImageIcon("src/images/21.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am2MouseEntered

    private void am2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am2ActionPerformed
        String aa = this.txtmoneytrans.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtmoneytrans.setText(aa + "2");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_am2ActionPerformed

    private void am3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am3MouseExited
        am3.setIcon(new ImageIcon("src/images/3.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am3MouseExited

    private void am3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am3MouseEntered
        am3.setIcon(new ImageIcon("src/images/31.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am3MouseEntered

    private void am3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am3ActionPerformed
        String aa = this.txtmoneytrans.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtmoneytrans.setText(aa + "3");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_am3ActionPerformed

    private void am4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am4MouseExited
        am4.setIcon(new ImageIcon("src/images/4.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am4MouseExited

    private void am4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am4MouseEntered
        am4.setIcon(new ImageIcon("src/images/41.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am4MouseEntered

    private void am4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am4ActionPerformed
        String aa = this.txtmoneytrans.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtmoneytrans.setText(aa + "4");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_am4ActionPerformed

    private void am5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am5MouseExited
        am5.setIcon(new ImageIcon("src/images/5.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am5MouseExited

    private void am5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am5MouseEntered
        am5.setIcon(new ImageIcon("src/images/51.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am5MouseEntered

    private void am5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am5ActionPerformed
        String aa = this.txtmoneytrans.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtmoneytrans.setText(aa + "5");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_am5ActionPerformed

    private void am6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am6MouseExited
        am6.setIcon(new ImageIcon("src/images/6.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am6MouseExited

    private void am6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am6MouseEntered
        am6.setIcon(new ImageIcon("src/images/61.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am6MouseEntered

    private void am6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am6ActionPerformed
        String aa = this.txtmoneytrans.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtmoneytrans.setText(aa + "6");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_am6ActionPerformed

    private void am7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am7MouseExited
        am7.setIcon(new ImageIcon("src/images/7.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am7MouseExited

    private void am7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am7MouseEntered
        am7.setIcon(new ImageIcon("src/images/71.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am7MouseEntered

    private void am7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am7ActionPerformed
        String aa = this.txtmoneytrans.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtmoneytrans.setText(aa + "7");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_am7ActionPerformed

    private void am8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am8MouseExited
        am8.setIcon(new ImageIcon("src/images/8.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am8MouseExited

    private void am8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am8MouseEntered
        am8.setIcon(new ImageIcon("src/images/81.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am8MouseEntered

    private void am8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am8ActionPerformed
        String aa = this.txtmoneytrans.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtmoneytrans.setText(aa + "8");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_am8ActionPerformed

    private void am9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am9MouseExited
        am9.setIcon(new ImageIcon("src/images/9.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am9MouseExited

    private void am9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am9MouseEntered
        am9.setIcon(new ImageIcon("src/images/91.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am9MouseEntered

    private void am9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am9ActionPerformed
        String aa = this.txtmoneytrans.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtmoneytrans.setText(aa + "9");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_am9ActionPerformed

    private void am0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am0MouseExited
        am0.setIcon(new ImageIcon("src/images/0.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am0MouseExited

    private void am0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am0MouseEntered
        am0.setIcon(new ImageIcon("src/images/01.png"));        // TODO add your handling code here:
    }//GEN-LAST:event_am0MouseEntered

    private void am0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am0ActionPerformed
        String aa = this.txtmoneytrans.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            txtmoneytrans.setText(aa + "0");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_am0ActionPerformed

    private void backspaceamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceamMouseExited
        backspaceam.setIcon(new ImageIcon("src/images/backspace.png"));     // TODO add your handling code here:
    }//GEN-LAST:event_backspaceamMouseExited

    private void backspaceamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceamMouseEntered
        backspaceam.setIcon(new ImageIcon("src/images/backspace1.png"));           // TODO add your handling code here:
    }//GEN-LAST:event_backspaceamMouseEntered

    private void backspaceamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceamActionPerformed

        txtmoneytrans.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_backspaceamActionPerformed

    private void bgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bgKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bgKeyPressed

    private void txtaccount1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaccount1KeyTyped
        if (evt.getSource().equals(txtaccount1)) {
            if (txtaccount1.getText().length() > 13) {
                evt.setKeyChar('\n');
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccount1KeyTyped

    private void txtaccount2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaccount2KeyTyped
        if (evt.getSource().equals(txtaccount2)) {
            if (txtaccount2.getText().length() > 13) {
                evt.setKeyChar('\n');
            }
        }       // TODO add your handling code here:
    }//GEN-LAST:event_txtaccount2KeyTyped
    String key1;
    String key2;
    String key3;
    String key12;
    String key13;
    String key14;

    public void checkinputaccount() {

        key1 = txtaccount1.getText().charAt(0) + "" + txtaccount1.getText().charAt(1) + "" + txtaccount1.getText().charAt(2) + "" + txtaccount1.getText().charAt(3);

        key2 = txtaccount1.getText().charAt(5) + "" + txtaccount1.getText().charAt(6) + "" + txtaccount1.getText().charAt(7) + "" + txtaccount1.getText().charAt(8);

        key3 = txtaccount1.getText().charAt(10) + "" + txtaccount1.getText().charAt(11) + "" + txtaccount1.getText().charAt(12) + "" + txtaccount1.getText().charAt(13);
        String stringkey = key1 + key2 + key3;
        System.out.println(stringkey);
        key12 = txtaccount2.getText().charAt(0) + "" + txtaccount2.getText().charAt(1) + "" + txtaccount2.getText().charAt(2) + "" + txtaccount2.getText().charAt(3);

        key13 = txtaccount2.getText().charAt(5) + "" + txtaccount2.getText().charAt(6) + "" + txtaccount2.getText().charAt(7) + "" + txtaccount2.getText().charAt(8);

        key14 = txtaccount2.getText().charAt(10) + "" + txtaccount2.getText().charAt(11) + "" + txtaccount2.getText().charAt(12) + "" + txtaccount2.getText().charAt(13);
        String string2 = key12 + key13 + key14;


        if (!stringkey.equals(string2) || stringkey.equals(accountID)) {
            lbcheckaccount.setText("<html><font color = 'red'>Account Numbers you just input do not match AND you cannot transfer money to your own account  Please check again!</font></html>");

        } else {
            lbcheckaccount.setText(null);
            Limit();
        }

    }

    public void confirmaction() {
        key12 = txtaccount2.getText().charAt(0) + "" + txtaccount2.getText().charAt(1) + "" + txtaccount2.getText().charAt(2) + "" + txtaccount2.getText().charAt(3);

        key13 = txtaccount2.getText().charAt(5) + "" + txtaccount2.getText().charAt(6) + "" + txtaccount2.getText().charAt(7) + "" + txtaccount2.getText().charAt(8);

        key14 = txtaccount2.getText().charAt(10) + "" + txtaccount2.getText().charAt(11) + "" + txtaccount2.getText().charAt(12) + "" + txtaccount2.getText().charAt(13);
        String string2 = key12 + key13 + key14;
        int answer = JOptionPane.showConfirmDialog(null, "Are you sure you to continue?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (answer == JOptionPane.YES_OPTION) {
            System.out.println("YES");
            AddTransfer();
            TransferMoney();
            this.dispose();
            new transfersuccessfully(null, true, accountID, string2, Float.parseFloat(this.txtmoneytrans.getText())).setVisible(true);
        } else if (answer == JOptionPane.NO_OPTION) {
        }
    }
    Date de = new Date();

    public void AddTransfer() {
        key1 = txtaccount1.getText().charAt(0) + "" + txtaccount1.getText().charAt(1) + "" + txtaccount1.getText().charAt(2) + "" + txtaccount1.getText().charAt(3);

        key2 = txtaccount1.getText().charAt(5) + "" + txtaccount1.getText().charAt(6) + "" + txtaccount1.getText().charAt(7) + "" + txtaccount1.getText().charAt(8);

        key3 = txtaccount1.getText().charAt(10) + "" + txtaccount1.getText().charAt(11) + "" + txtaccount1.getText().charAt(12) + "" + txtaccount1.getText().charAt(13);
        String stringkey = key1 + key2 + key3;
        key12 = txtaccount2.getText().charAt(0) + "" + txtaccount2.getText().charAt(1) + "" + txtaccount2.getText().charAt(2) + "" + txtaccount2.getText().charAt(3);

        key13 = txtaccount2.getText().charAt(5) + "" + txtaccount2.getText().charAt(6) + "" + txtaccount2.getText().charAt(7) + "" + txtaccount2.getText().charAt(8);

        key14 = txtaccount2.getText().charAt(10) + "" + txtaccount2.getText().charAt(11) + "" + txtaccount2.getText().charAt(12) + "" + txtaccount2.getText().charAt(13);
        String string2 = key12 + key13 + key14;
        try {
            Connect.connectDatabase();
            CallableStatement cat = Connect.connectDatabase().prepareCall("{call Show_Account}");
            ResultSet rst = cat.executeQuery();
            CallableStatement trc = Connect.connectDatabase().prepareCall("{call InsertTRANSFERS(?,?,?,?,?,?)}");
            CallableStatement trcr = Connect.connectDatabase().prepareCall("{call InsertTRANSFERSreceived(?,?,?,?,?,?)}");
            CallableStatement calt = Connect.connectDatabase().prepareCall("{call ShowLimitSetting}");
            calt.setMaxRows(1);
            ResultSet reset = calt.executeQuery();
            while (reset.next()) {
                trc.setString(1, cr);
                trc.setString(2, accountID);
                trc.setString(3, stringkey);
                trc.setFloat(4, Float.parseFloat(this.txtmoneytrans.getText()));
                trc.setFloat(5, reset.getFloat("TransactionFee") + reset.getFloat("FeeCountedOnTurn"));
                trc.setFloat(6, Float.parseFloat(this.txtmoneytrans.getText()) - reset.getFloat("TransactionFee") * Float.parseFloat(this.txtmoneytrans.getText()) - reset.getFloat("FeeCountedOnTurn"));

                trcr.setString(1, cr);
                trcr.setString(2, accountID);
                trcr.setString(3, string2);
                trcr.setFloat(4, Float.parseFloat(this.txtmoneytrans.getText()));
                trcr.setFloat(5, reset.getFloat("TransactionFee") + reset.getFloat("FeeCountedOnTurn"));
                trcr.setFloat(6, Float.parseFloat(this.txtmoneytrans.getText()) - reset.getFloat("TransactionFee") * Float.parseFloat(this.txtmoneytrans.getText()) - reset.getFloat("FeeCountedOnTurn"));
            }

            int rowEffected = trc.executeUpdate();
            int row2Effected = trcr.executeUpdate();

            while (rst.next()) {
                CallableStatement clt = Connect.connectDatabase().prepareCall("{call InsertREPORTS(?,?,?,?,?,?,?,?)}");
                clt.setString(1, "");
                clt.setString(2, rst.getString("AccountID").toString());
                clt.setString(3, rst.getString("Fullname").toString());
                clt.setString(4, "TRANSFERED");
                clt.setFloat(5, Float.parseFloat(txtmoneytrans.getText().toString()));
                clt.setString(6, accountID);
                clt.setFloat(7, rst.getFloat("AccountBalance"));
                clt.setString(8, cr);
                clt.executeUpdate();
            }

            System.out.println("TC");
            if (rowEffected > 0) {
                JOptionPane.showMessageDialog(this, "Update Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Update Unsuccessfully");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void TransferMoney() {
        try {
            Connect.connectDatabase();
            CallableStatement cat = Connect.connectDatabase().prepareCall("{call Show_Account}");
            ResultSet rst = cat.executeQuery();
            CallableStatement ct = Connect.connectDatabase().prepareCall("{call TRANSFERmoney(?,?)}");
            CallableStatement calt = Connect.connectDatabase().prepareCall("{call ShowLimitSetting}");
            calt.setMaxRows(1);
            ResultSet reset = calt.executeQuery();

            while (reset.next()) {
                while (rst.next()) {

                    if (accountID.equals(rst.getString("AccountID").toString())) {
                        ct.setString(1, accountID);
                        ct.setFloat(2, rst.getFloat("AccountBalance") - Float.parseFloat(this.txtmoneytrans.getText()) - Float.parseFloat(this.txtmoneytrans.getText()) * reset.getFloat("TransactionFee") - reset.getFloat("FeeCountedOnTurn"));
                        ct.executeUpdate();
                        System.out.println("aaa");
                    }
                    key1 = txtaccount1.getText().charAt(0) + "" + txtaccount1.getText().charAt(1) + "" + txtaccount1.getText().charAt(2) + "" + txtaccount1.getText().charAt(3);

                    key2 = txtaccount1.getText().charAt(5) + "" + txtaccount1.getText().charAt(6) + "" + txtaccount1.getText().charAt(7) + "" + txtaccount1.getText().charAt(8);

                    key3 = txtaccount1.getText().charAt(10) + "" + txtaccount1.getText().charAt(11) + "" + txtaccount1.getText().charAt(12) + "" + txtaccount1.getText().charAt(13);
                    String stringkey = key1 + key2 + key3;
                    if (stringkey.equals(rst.getString("AccountID").toString())) {
                        ct.setString(1, stringkey);
                        ct.setFloat(2, rst.getFloat("AccountBalance") + Float.parseFloat(this.txtmoneytrans.getText()));
                        int ine = ct.executeUpdate();
                        System.out.println("bbb");
                    }
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public void Limit() {
        System.out.println("TC3");
        try {
            Connect.connectDatabase();
            CallableStatement cat = Connect.connectDatabase().prepareCall("{call Show_Account}");
            ResultSet rst = cat.executeQuery();
            CallableStatement calt = Connect.connectDatabase().prepareCall("{call ShowLimitSetting}");
            calt.setMaxRows(1);
            ResultSet reset = calt.executeQuery();
            CallableStatement cast = null;
            CallableStatement cs = null;
            while (reset.next()) {
                String stg = reset.getString("TurnValue").toString();

                switch (stg) {
                    case "per Day":
                        cs = Connect.connectDatabase().prepareCall("{call SumLimitDay2(?)}");
                        cs.setString(1, cr);
                        cast = Connect.connectDatabase().prepareCall("{call showTRANSFERday(?,?)}");
                        break;
                    case "per Week":
                        cs = null;
                        break;
                    case "per Month":
                        cs = Connect.connectDatabase().prepareCall("{call SumLimitMonth2(?)}");
                        cs.setString(1, cr);
                        cast = Connect.connectDatabase().prepareCall("{call showTRANSFERmonth(?,?)}");
                        break;
                    case "per Year":
                        cs = Connect.connectDatabase().prepareCall("{call SumLimitYear2(?)}");
                        cs.setString(1, cr);
                        cast = Connect.connectDatabase().prepareCall("{call showTRANSFERyear(?,?)}");
                        break;
                }
                cast.setString(1, accountID);
                cast.setString(2, cg);
                ResultSet rset = cast.executeQuery();
                while (rset.next()) {
                    ResultSet rt = cs.executeQuery();
                    while (rst.next()) {
                        if (rst.getString("AccountID").equals(accountID)) {
                            if (rset.getInt(1) < reset.getInt("NumberOfTurn")
                                    && Float.parseFloat(txtmoneytrans.getText()) <= reset.getFloat("MaxMoney")
                                    && Float.parseFloat(txtmoneytrans.getText()) >= reset.getFloat("MinMoney")) {
                                while (rt.next()) {
                                    if (rt.getFloat(1) + Float.parseFloat(
                                            txtmoneytrans.getText()) <= reset.getFloat("TotalOnTurnValue")) {
                                        if (rst.getFloat("AccountBalance") >= Float.parseFloat(txtmoneytrans.getText()) + reset.getFloat("FeeCountedOnTurn") + reset.getFloat("TransactionFee") * Float.parseFloat(txtmoneytrans.getText())) {
                                            confirmaction();
                                        } else {
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "So sorry! You cannot withdraw over " + reset.getFloat("TotalOnTurnValue") + " dollars " + stg.toLowerCase() + "! Please try again on the following day. Thank you!");
                                        this.dispose();
                                    }

                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "So sorry! Your transaction might be stopped due to some of the following restrictions:"
                                        + "\nYou cannot transfer over " + reset.getInt("NumberOfTurn") + " times " + stg.toLowerCase() + "! "
                                        + "\nYou cannot transfer over " + (int) reset.getFloat("MaxMoney") + ""
                                        + "\nYou might transfer at least " + (int) reset.getFloat("MinMoney") + ". It cannot be lower."
                                        + "\nPlease try again on the following day. Thank you!");
                                this.dispose();
                            }
                        }
                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbcheckaccount;
    private javax.swing.JLabel lbinputmoney;
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
    private javax.swing.JButton transferbn;
    private javax.swing.JTextField txtaccount1;
    private javax.swing.JTextField txtaccount2;
    private javax.swing.JTextField txtmoneytrans;
    // End of variables declaration//GEN-END:variables
}

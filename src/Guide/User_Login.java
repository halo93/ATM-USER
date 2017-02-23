package Guide;

import Connections.Connect;

import Encryption.encryptionMD5;
import efiect.DisplayClose;
import efiect.DisplayOpen;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class User_Login extends javax.swing.JFrame implements Runnable {

    static String accountID;

    public User_Login(String stringkey) {
        setUndecorated(true);
        initComponents();
        ServerTurn cc = new ServerTurn();
        cc.TurningS(this);
        this.setSize(0, 0);
        new Thread(new DisplayClose(this, 1024, 734)).start();
        this.accountID = stringkey;
        
        Image icon = getToolkit().getImage(getClass().getResource("/images/bankicon.png"));
        setIconImage(icon);
//        ServerTurn sn = new ServerTurn();
//        sn.TurningS(this);
        new Thread(this).start();
    }

    public void run() {
        try {
            while (true) {
                if (lbpress.getText() == null) {
                    lbpress.setText("Press ENTER to continute!");
                } else {
                    lbpress.setText(null);
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

    public void timeopen() {

        second = 2;

        thoigian = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                second = second - 1;
                if (second == 0) {
                    dispose();
                    new EnterNumberCard().setVisible(true);

                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtpin = new javax.swing.JPasswordField();
        butminimize = new javax.swing.JButton();
        butexit = new javax.swing.JButton();
        lbpress = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lberror = new javax.swing.JLabel();
        butback = new javax.swing.JButton();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        butclear = new javax.swing.JButton();
        but0 = new javax.swing.JButton();
        butenter = new javax.swing.JButton();
        backround = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpin.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpinActionPerformed(evt);
            }
        });
        txtpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpinKeyTyped(evt);
            }
        });
        getContentPane().add(txtpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 260, 50));

        butminimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min1.png"))); // NOI18N
        butminimize.setToolTipText("Minimize");
        butminimize.setBorderPainted(false);
        butminimize.setContentAreaFilled(false);
        butminimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butminimize.setDefaultCapable(false);
        butminimize.setFocusPainted(false);
        butminimize.setFocusable(false);
        butminimize.setRequestFocusEnabled(false);
        butminimize.setRolloverEnabled(false);
        butminimize.setVerifyInputWhenFocusTarget(false);
        butminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butminimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butminimizeMouseExited(evt);
            }
        });
        butminimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butminimizeActionPerformed(evt);
            }
        });
        getContentPane().add(butminimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 17, 18, 8));

        butexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close1.png"))); // NOI18N
        butexit.setToolTipText("Close");
        butexit.setBorderPainted(false);
        butexit.setContentAreaFilled(false);
        butexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butexit.setDefaultCapable(false);
        butexit.setFocusPainted(false);
        butexit.setFocusable(false);
        butexit.setRequestFocusEnabled(false);
        butexit.setRolloverEnabled(false);
        butexit.setVerifyInputWhenFocusTarget(false);
        butexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butexitMouseExited(evt);
            }
        });
        getContentPane().add(butexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 20, 20));

        lbpress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbpress.setForeground(new java.awt.Color(255, 255, 255));
        lbpress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 330, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PIN NUMBER :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 270, 30));

        lberror.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lberror.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lberror, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 350, 27));

        butback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        butback.setBorderPainted(false);
        butback.setContentAreaFilled(false);
        butback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butback.setDefaultCapable(false);
        butback.setFocusPainted(false);
        butback.setFocusable(false);
        butback.setRequestFocusEnabled(false);
        butback.setRolloverEnabled(false);
        butback.setVerifyInputWhenFocusTarget(false);
        butback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butbackMouseExited(evt);
            }
        });
        getContentPane().add(butback, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 250, 80));

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
        getContentPane().add(but1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 80, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but2MouseExited(evt);
            }
        });
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });
        getContentPane().add(but2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 80, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but3MouseExited(evt);
            }
        });
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });
        getContentPane().add(but3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 80, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but4MouseExited(evt);
            }
        });
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });
        getContentPane().add(but4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 80, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but5MouseExited(evt);
            }
        });
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });
        getContentPane().add(but5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 80, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but6MouseExited(evt);
            }
        });
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });
        getContentPane().add(but6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 80, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but7MouseExited(evt);
            }
        });
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });
        getContentPane().add(but7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 80, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but8MouseExited(evt);
            }
        });
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });
        getContentPane().add(but8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 80, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but9MouseExited(evt);
            }
        });
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });
        getContentPane().add(but9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 80, 80));

        butclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backspace.png"))); // NOI18N
        butclear.setBorderPainted(false);
        butclear.setContentAreaFilled(false);
        butclear.setDefaultCapable(false);
        butclear.setFocusPainted(false);
        butclear.setFocusable(false);
        butclear.setRequestFocusEnabled(false);
        butclear.setRolloverEnabled(false);
        butclear.setVerifyInputWhenFocusTarget(false);
        butclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butclearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butclearMouseExited(evt);
            }
        });
        butclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butclearActionPerformed(evt);
            }
        });
        getContentPane().add(butclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 250, 80));

        but0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png"))); // NOI18N
        but0.setBorderPainted(false);
        but0.setContentAreaFilled(false);
        but0.setDefaultCapable(false);
        but0.setFocusPainted(false);
        but0.setFocusable(false);
        but0.setRequestFocusEnabled(false);
        but0.setRolloverEnabled(false);
        but0.setVerifyInputWhenFocusTarget(false);
        but0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but0MouseExited(evt);
            }
        });
        but0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but0ActionPerformed(evt);
            }
        });
        getContentPane().add(but0, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 80, 80));

        butenter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enter.png"))); // NOI18N
        butenter.setToolTipText("");
        butenter.setBorderPainted(false);
        butenter.setContentAreaFilled(false);
        butenter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butenter.setDefaultCapable(false);
        butenter.setFocusPainted(false);
        butenter.setFocusable(false);
        butenter.setRequestFocusEnabled(false);
        butenter.setRolloverEnabled(false);
        butenter.setVerifyInputWhenFocusTarget(false);
        butenter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butenterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butenterMouseExited(evt);
            }
        });
        butenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butenterActionPerformed(evt);
            }
        });
        getContentPane().add(butenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 250, 80));

        backround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(backround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpinActionPerformed
        String charac = new String(this.txtpin.getPassword());
        if (charac.length() < 4) {
            lberror.setText("you must enter the full 4-digit");
        } else {
            lberror.setText("");
            checkingtologin();
        }
    }//GEN-LAST:event_txtpinActionPerformed

    private void txtpinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpinKeyPressed
        //                 NUMERIC ENTER NUMBER
        String aa = new String(txtpin.getPassword());
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtpin.setEditable(true);
        } else if (evt.getKeyCode() == 8) {
            txtpin.setText(aa);
            txtpin.setEditable(true);
        } else {
            txtpin.setEditable(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpinKeyPressed

    private void txtpinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpinKeyTyped

        if (evt.getSource().equals(txtpin)) {
            if (new String(txtpin.getPassword()).length() > 3) {
                evt.setKeyChar('\n');
            }
        }
    }//GEN-LAST:event_txtpinKeyTyped

    private void butminimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butminimizeMouseEntered

        butminimize.setIcon(new ImageIcon("src/images/min2.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butminimizeMouseEntered

    private void butminimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butminimizeMouseExited

        butminimize.setIcon(new ImageIcon("src/images/min1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butminimizeMouseExited

    private void butminimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butminimizeActionPerformed

        setState(Frame.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_butminimizeActionPerformed

    private void butexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butexitMouseEntered

        butexit.setIcon(new ImageIcon("src/images/close2.png"));
    }//GEN-LAST:event_butexitMouseEntered

    private void butexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butexitMouseExited
        butexit.setIcon(new ImageIcon("src/images/close1.png"));

    }//GEN-LAST:event_butexitMouseExited

    private void butexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butexitMouseClicked

        if (evt.getClickCount() == 1) {
            timeclose();
            thoigian.start();
            this.setSize(1024, 734);
            new Thread(new DisplayOpen(this, 0, 0)).start();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_butexitMouseClicked

    private void butbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butbackMouseEntered
        butback.setIcon(new ImageIcon("src/images/back1.png"));

    }//GEN-LAST:event_butbackMouseEntered

    private void butbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butbackMouseExited
        butback.setIcon(new ImageIcon("src/images/back.png"));

    }//GEN-LAST:event_butbackMouseExited

    private void butbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butbackMouseClicked

        if (evt.getClickCount() == 1) {

            timeopen();
            thoigian.start();
            this.setSize(1024, 734);
            new Thread(new DisplayOpen(this, 0, 0)).start();

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_butbackMouseClicked

    private void butenterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butenterMouseEntered

        butenter.setIcon(new ImageIcon("src/images/enter1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butenterMouseEntered

    private void butenterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butenterMouseExited
        butenter.setIcon(new ImageIcon("src/images/enter.png"));


        // TODO add your handling code here:
    }//GEN-LAST:event_butenterMouseExited

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed

        String aa = new String(this.txtpin.getPassword());
        if (evt.getID() == 1001) {

            txtpin.setText(aa + "1");
        }

        if (aa.length() == 4) {
            txtpin.setText(aa + "");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed

        String aa = new String(this.txtpin.getPassword());
        if (evt.getID() == 1001) {

            txtpin.setText(aa + "2");
        }
        if (aa.length() == 4) {
            txtpin.setText(aa + "");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed

        String aa = new String(this.txtpin.getPassword());
        if (evt.getID() == 1001) {

            txtpin.setText(aa + "3");
        }

        if (aa.length() == 4) {
            txtpin.setText(aa + "");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        String aa = new String(this.txtpin.getPassword());
        if (evt.getID() == 1001) {

            txtpin.setText(aa + "4");
        }

        if (aa.length() == 4) {
            txtpin.setText(aa + "");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed

        String aa = new String(this.txtpin.getPassword());
        if (evt.getID() == 1001) {

            txtpin.setText(aa + "5");
        }

        if (aa.length() == 4) {
            txtpin.setText(aa + "");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed

        String aa = new String(this.txtpin.getPassword());
        if (evt.getID() == 1001) {

            txtpin.setText(aa + "6");
        }


        if (aa.length() == 4) {
            txtpin.setText(aa + "");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed

        String aa = new String(this.txtpin.getPassword());
        if (evt.getID() == 1001) {

            txtpin.setText(aa + "7");
        }


        if (aa.length() == 4) {
            txtpin.setText(aa + "");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed

        String aa = new String(this.txtpin.getPassword());
        if (evt.getID() == 1001) {

            txtpin.setText(aa + "8");
        }


        if (aa.length() == 4) {
            txtpin.setText(aa + "");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        String aa = new String(this.txtpin.getPassword());
        if (evt.getID() == 1001) {

            txtpin.setText(aa + "9");
        }


        if (aa.length() == 4) {
            txtpin.setText(aa + "");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_but9ActionPerformed

    private void but0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but0ActionPerformed

        String aa = new String(this.txtpin.getPassword());
        if (evt.getID() == 1001) {

            txtpin.setText(aa + "0");
        }
        if (aa.length() == 4) {
            txtpin.setText(aa + "");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_but0ActionPerformed

    private void butclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butclearActionPerformed

        txtpin.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_butclearActionPerformed

    private void butenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butenterActionPerformed
        txtpinActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_butenterActionPerformed

    private void but1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseEntered
        but1.setIcon(new ImageIcon("src/images/11.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but1MouseEntered

    private void but1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseExited
        but1.setIcon(new ImageIcon("src/images/1.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but1MouseExited

    private void but2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but2MouseEntered

        but2.setIcon(new ImageIcon("src/images/21.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but2MouseEntered

    private void but2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but2MouseExited
        but2.setIcon(new ImageIcon("src/images/2.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but2MouseExited

    private void but3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but3MouseEntered

        but3.setIcon(new ImageIcon("src/images/31.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but3MouseEntered

    private void but3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but3MouseExited
        but3.setIcon(new ImageIcon("src/images/3.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but3MouseExited

    private void but4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but4MouseEntered

        but4.setIcon(new ImageIcon("src/images/41.png"));
    }//GEN-LAST:event_but4MouseEntered

    private void but4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but4MouseExited

        but4.setIcon(new ImageIcon("src/images/4.png"));
    }//GEN-LAST:event_but4MouseExited

    private void but5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but5MouseEntered

        but5.setIcon(new ImageIcon("src/images/51.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but5MouseEntered

    private void but5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but5MouseExited

        but5.setIcon(new ImageIcon("src/images/5.png"));
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_but5MouseExited

    private void but6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but6MouseEntered

        but6.setIcon(new ImageIcon("src/images/61.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but6MouseEntered

    private void but6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but6MouseExited

        but6.setIcon(new ImageIcon("src/images/6.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but6MouseExited

    private void but7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but7MouseEntered

        but7.setIcon(new ImageIcon("src/images/71.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but7MouseEntered

    private void but7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but7MouseExited

        but7.setIcon(new ImageIcon("src/images/7.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but7MouseExited

    private void but8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but8MouseEntered

        but8.setIcon(new ImageIcon("src/images/81.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but8MouseEntered

    private void but8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but8MouseExited

        but8.setIcon(new ImageIcon("src/images/8.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but8MouseExited

    private void but9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but9MouseEntered

        but9.setIcon(new ImageIcon("src/images/91.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but9MouseEntered

    private void but9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but9MouseExited
        but9.setIcon(new ImageIcon("src/images/9.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but9MouseExited

    private void but0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but0MouseEntered

        but0.setIcon(new ImageIcon("src/images/01.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but0MouseEntered

    private void but0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but0MouseExited
        but0.setIcon(new ImageIcon("src/images/0.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but0MouseExited

    private void butclearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butclearMouseEntered

        butclear.setIcon(new ImageIcon("src/images/backspace1.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_butclearMouseEntered

    private void butclearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butclearMouseExited
        butclear.setIcon(new ImageIcon("src/images/backspace.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butclearMouseExited
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backround;
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
    private javax.swing.JButton butback;
    private javax.swing.JButton butclear;
    private javax.swing.JButton butenter;
    private javax.swing.JButton butexit;
    private javax.swing.JButton butminimize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lberror;
    private javax.swing.JLabel lbpress;
    private javax.swing.JPasswordField txtpin;
    // End of variables declaration//GEN-END:variables

    

    public void checkingtologin() {
        encryptionMD5 e5 = new encryptionMD5();
        try {
            Connect.connectDatabase();
            CallableStatement call = Connect.connectDatabase().prepareCall("{call Login_Account}");

            ResultSet rt = call.executeQuery();
            boolean flag = false;
            while (rt.next()) {

                String status = rt.getString("Account_Status");
                if (!status.equals("Activated")) {
                    dispose();
                    new Bolock(this, flag, accountID).setVisible(true);
                    break;
                }
                if (accountID.equals(rt.getString("AccountID")) && e5.encryptMD5(new String(txtpin.getPassword())).equals(rt.getString("PIN").toString())) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                lberror.setText("");
                new Panel(accountID).setVisible(true);
                this.dispose();
            } else {
                lberror.setText("Incorrect PIN code!");
            }


        } catch (Exception ex) {
            Logger.getLogger(User_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

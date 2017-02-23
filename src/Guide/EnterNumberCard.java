package Guide;

import Connections.Connect;
import Connections.SplashConnect;
import efiect.DisplayClose;
import efiect.DisplayOpen;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class EnterNumberCard extends javax.swing.JFrame implements Runnable {

    String key1;
    String key2;
    String key3;

    public EnterNumberCard() {
        setUndecorated(true);
        initComponents();

        this.setSize(0, 0);
        new Thread(new DisplayClose(this, 1024, 734)).start();

        //server
        ServerTurn sn = new ServerTurn();
        sn.TurningS(this);
        Image icon = getToolkit().getImage(getClass().getResource("/images/bankicon.png"));
        setIconImage(icon);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butexit = new javax.swing.JButton();
        butminimize = new javax.swing.JButton();
        lberror = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbpress = new javax.swing.JLabel();
        txtcard = new javax.swing.JTextField();
        butenter = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        but0 = new javax.swing.JButton();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butexitMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butexitMouseClicked(evt);
            }
        });
        getContentPane().add(butexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 20, 20));

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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butminimizeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butminimizeMouseEntered(evt);
            }
        });
        butminimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butminimizeActionPerformed(evt);
            }
        });
        getContentPane().add(butminimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 18, 8));

        lberror.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lberror.setForeground(new java.awt.Color(255, 0, 0));
        lberror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lberror, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 540, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NUMBER CARD:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 340, 80));

        lbpress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbpress.setForeground(new java.awt.Color(255, 255, 255));
        lbpress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 320, 40));

        txtcard.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txtcard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtcardMouseReleased(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcardMousePressed(evt);
            }
        });
        txtcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcardActionPerformed(evt);
            }
        });
        txtcard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcardKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcardKeyTyped(evt);
            }
        });
        getContentPane().add(txtcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 340, 80));

        butenter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enter.png"))); // NOI18N
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
        getContentPane().add(butenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 250, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backspaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backspaceMouseExited(evt);
            }
        });
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });
        getContentPane().add(backspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 250, 80));

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
        getContentPane().add(but0, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 650, 80, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but1MouseExited(evt);
            }
        });
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });
        getContentPane().add(but1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 80, 80));

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
        getContentPane().add(but2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 80, 80));

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
        getContentPane().add(but3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 80, 80));

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
        getContentPane().add(but4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 80, 80));

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
        getContentPane().add(but5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 80, 80));

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
        getContentPane().add(but6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 80, 80));

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
        getContentPane().add(but7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 80, 80));

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
        getContentPane().add(but8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 80, 80));

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
        getContentPane().add(but9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 80, 80));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 734));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcardKeyPressed

        String aa = this.txtcard.getText();
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }
//                 NUMERIC ENTER NUMBER
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtcard.setEditable(true);
        } else if (evt.getKeyCode() == 8) {
            txtcard.setText(aa);
            txtcard.setEditable(true);
        } else {
            txtcard.setEditable(false);
        }
    }//GEN-LAST:event_txtcardKeyPressed

    private void txtcardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcardKeyTyped
        if (evt.getSource().equals(txtcard)) {
            if (txtcard.getText().length() > 13) {
                evt.setKeyChar('\n');
            }
        }
    }//GEN-LAST:event_txtcardKeyTyped

    private void txtcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcardActionPerformed

        checkingAccountID();
    }//GEN-LAST:event_txtcardActionPerformed

    private void txtcardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcardMouseReleased

        String aa = this.txtcard.getText();
        txtcard.setText(aa);
    }//GEN-LAST:event_txtcardMouseReleased

    private void txtcardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcardMousePressed
        String aa = this.txtcard.getText();
        txtcard.setText(aa);
    }//GEN-LAST:event_txtcardMousePressed

    private void butexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butexitMouseEntered
        butexit.setIcon(new ImageIcon("src/images/close2.png"));
    }//GEN-LAST:event_butexitMouseEntered

    private void butexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butexitMouseExited
        butexit.setIcon(new ImageIcon("src/images/close1.png"));
    }//GEN-LAST:event_butexitMouseExited

    private void butminimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butminimizeActionPerformed

        setState(Frame.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_butminimizeActionPerformed

    private void butminimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butminimizeMouseEntered

        butminimize.setIcon(new ImageIcon("src/images/min2.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butminimizeMouseEntered

    private void butminimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butminimizeMouseExited

        butminimize.setIcon(new ImageIcon("src/images/min1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butminimizeMouseExited

    private void butexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butexitMouseClicked
        if (evt.getClickCount() == 1) {
            timeclose();
            thoigian.start();
            this.setSize(1024, 734);
            new Thread(new DisplayOpen(this, 0, 0)).start();
        }

    }//GEN-LAST:event_butexitMouseClicked

    private void but1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseEntered

        but1.setIcon(new ImageIcon("src/images/11.png"));

    }//GEN-LAST:event_but1MouseEntered

    private void but1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseExited

        but1.setIcon(new ImageIcon("src/images/1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but1MouseExited

    private void but0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but0MouseEntered

        but0.setIcon(new ImageIcon("src/images/01.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but0MouseEntered

    private void but0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but0MouseExited
        but0.setIcon(new ImageIcon("src/images/0.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but0MouseExited

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
        // TODO add your handling code here:
    }//GEN-LAST:event_but4MouseEntered

    private void but4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but4MouseExited

        but4.setIcon(new ImageIcon("src/images/4.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but4MouseExited

    private void but5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but5MouseEntered

        but5.setIcon(new ImageIcon("src/images/51.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but5MouseEntered

    private void but5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but5MouseExited
        but5.setIcon(new ImageIcon("src/images/5.png"));
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

    private void backspaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceMouseEntered

        backspace.setIcon(new ImageIcon("src/images/backspace1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_backspaceMouseEntered

    private void backspaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceMouseExited

        backspace.setIcon(new ImageIcon("src/images/backspace.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_backspaceMouseExited

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        String aa = this.txtcard.getText();
        if (evt.getID() == 1001) {

            txtcard.setText(aa + "1");
        }
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtcard.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed

        String aa = this.txtcard.getText();
        if (evt.getID() == 1001) {

            txtcard.setText(aa + "2");
        }
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtcard.setText(aa + "");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed

        String aa = this.txtcard.getText();
        if (evt.getID() == 1001) {

            txtcard.setText(aa + "3");
        }
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtcard.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed

        String aa = this.txtcard.getText();
        if (evt.getID() == 1001) {

            txtcard.setText(aa + "4");
        }
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtcard.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
        String aa = this.txtcard.getText();
        if (evt.getID() == 1001) {

            txtcard.setText(aa + "5");
        }
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtcard.setText(aa + "");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed

        String aa = this.txtcard.getText();
        if (evt.getID() == 1001) {

            txtcard.setText(aa + "6");
        }
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtcard.setText(aa + "");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed

        String aa = this.txtcard.getText();
        if (evt.getID() == 1001) {

            txtcard.setText(aa + "7");
        }
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtcard.setText(aa + "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed

        String aa = this.txtcard.getText();
        if (evt.getID() == 1001) {

            txtcard.setText(aa + "8");
        }
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtcard.setText(aa + "");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed

        String aa = this.txtcard.getText();
        if (evt.getID() == 1001) {

            txtcard.setText(aa + "9");
        }
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtcard.setText(aa + "");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_but9ActionPerformed

    private void but0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but0ActionPerformed

        String aa = this.txtcard.getText();
        if (evt.getID() == 1001) {

            txtcard.setText(aa + "0");
        }
        if (aa.length() == 4) {
            txtcard.setText(aa + "-");
        }
        if (aa.length() == 9) {
            txtcard.setText(aa + "-");
        }

        if (aa.length() == 14) {
            txtcard.setText(aa + "");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_but0ActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed

        txtcard.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_backspaceActionPerformed

    private void butenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butenterActionPerformed
        checkingAccountID();
        // TODO add your handling code here:
    }//GEN-LAST:event_butenterActionPerformed

    private void butenterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butenterMouseEntered

        butenter.setIcon(new ImageIcon("src/images/enter1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butenterMouseEntered

    private void butenterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butenterMouseExited

        butenter.setIcon(new ImageIcon("src/images/enter.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_butenterMouseExited

    public static void main(String[] args) {
        /*
         * Set the Windows look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnterNumberCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterNumberCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterNumberCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterNumberCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                SplashConnect aaa = new SplashConnect();
                aaa.showSplash();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton backspace;
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
    private javax.swing.JButton butenter;
    private javax.swing.JButton butexit;
    private javax.swing.JButton butminimize;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lberror;
    private javax.swing.JLabel lbpress;
    private javax.swing.JTextField txtcard;
    // End of variables declaration//GEN-END:variables

    public void checkingAccountID() {
        try {
            Connect.connectDatabase();
            CallableStatement ct = Connect.connectDatabase().prepareCall("{call Login_Account}");
            ResultSet ret = ct.executeQuery();

            while (ret.next()) {
                String charac = this.txtcard.getText();
                if (charac.length() < 14) {
                    lberror.setText("You must enter the full 12-digit");
                } else {
                    lberror.setText("");
                    key1 = txtcard.getText().charAt(0) + "" + txtcard.getText().charAt(1) + "" + txtcard.getText().charAt(2) + "" + txtcard.getText().charAt(3);

                    key2 = txtcard.getText().charAt(5) + "" + txtcard.getText().charAt(6) + "" + txtcard.getText().charAt(7) + "" + txtcard.getText().charAt(8);

                    key3 = txtcard.getText().charAt(10) + "" + txtcard.getText().charAt(11) + "" + txtcard.getText().charAt(12) + "" + txtcard.getText().charAt(13);
                    String stringkey = key1 + key2 + key3;
                    if (stringkey.equals(ret.getString("AccountID").toString())) {
                        new User_Login(stringkey).setVisible(true);
                        this.dispose();
                    } else {
                        lberror.setText("Your Account number might be wrong. Please check again!");
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(EnterNumberCard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

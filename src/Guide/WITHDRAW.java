/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import Connections.Connect;
import efiect.DisplayClose;
import efiect.DisplayOpen;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author DMX
 */
public class WITHDRAW extends javax.swing.JDialog {
    
    String cr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    String cg = new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());
    static String accountID;
    Calendar cld = Calendar.getInstance();
    int rowcount = 0;
    int a = 0;
    
    public WITHDRAW(java.awt.Frame parent, boolean modal, String stringkey) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        ServerTurn cc = new ServerTurn();
        cc.TurningT(this);
        setSize(0, 0);
        new Thread(new DisplayClose(this, 1024, 734)).start();
        Image icon = getToolkit().getImage(getClass().getResource("/images/bankicon.png"));
        setIconImage(icon);
        this.accountID = stringkey;
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

        withdrawbn = new javax.swing.JButton();
        txtwithdraw = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        butcancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but0 = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrawbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok.png"))); // NOI18N
        withdrawbn.setBorderPainted(false);
        withdrawbn.setContentAreaFilled(false);
        withdrawbn.setDefaultCapable(false);
        withdrawbn.setFocusPainted(false);
        withdrawbn.setFocusable(false);
        withdrawbn.setRequestFocusEnabled(false);
        withdrawbn.setVerifyInputWhenFocusTarget(false);
        withdrawbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                withdrawbnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                withdrawbnMouseExited(evt);
            }
        });
        withdrawbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawbnActionPerformed(evt);
            }
        });
        getContentPane().add(withdrawbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 250, 80));

        txtwithdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtwithdraw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtwithdrawKeyPressed(evt);
            }
        });
        getContentPane().add(txtwithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 260, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PLEASE INPUT THE AMOUNT OF MONEY YOU WANT TO WITHDRAW");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 630, -1));

        butcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        butcancel.setBorderPainted(false);
        butcancel.setContentAreaFilled(false);
        butcancel.setDefaultCapable(false);
        butcancel.setFocusPainted(false);
        butcancel.setFocusable(false);
        butcancel.setRequestFocusEnabled(false);
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
        getContentPane().add(butcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 250, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MONEY:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("$");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        but1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        but1.setBorderPainted(false);
        but1.setContentAreaFilled(false);
        but1.setDefaultCapable(false);
        but1.setFocusPainted(false);
        but1.setFocusable(false);
        but1.setRequestFocusEnabled(false);
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
        getContentPane().add(but1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 80, 80));

        but2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        but2.setBorderPainted(false);
        but2.setContentAreaFilled(false);
        but2.setDefaultCapable(false);
        but2.setFocusPainted(false);
        but2.setFocusable(false);
        but2.setRequestFocusEnabled(false);
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
        getContentPane().add(but2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 80, 80));

        but3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        but3.setBorderPainted(false);
        but3.setContentAreaFilled(false);
        but3.setDefaultCapable(false);
        but3.setFocusPainted(false);
        but3.setFocusable(false);
        but3.setRequestFocusEnabled(false);
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
        getContentPane().add(but3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 80, 80));

        but6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6.png"))); // NOI18N
        but6.setBorderPainted(false);
        but6.setContentAreaFilled(false);
        but6.setDefaultCapable(false);
        but6.setFocusPainted(false);
        but6.setFocusable(false);
        but6.setRequestFocusEnabled(false);
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
        getContentPane().add(but6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 80, 80));

        but5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.png"))); // NOI18N
        but5.setBorderPainted(false);
        but5.setContentAreaFilled(false);
        but5.setDefaultCapable(false);
        but5.setFocusPainted(false);
        but5.setFocusable(false);
        but5.setRequestFocusEnabled(false);
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
        getContentPane().add(but5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 80, 80));

        but4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.png"))); // NOI18N
        but4.setBorderPainted(false);
        but4.setContentAreaFilled(false);
        but4.setDefaultCapable(false);
        but4.setFocusPainted(false);
        but4.setFocusable(false);
        but4.setRequestFocusEnabled(false);
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
        getContentPane().add(but4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 80, 80));

        but7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png"))); // NOI18N
        but7.setBorderPainted(false);
        but7.setContentAreaFilled(false);
        but7.setDefaultCapable(false);
        but7.setFocusPainted(false);
        but7.setFocusable(false);
        but7.setRequestFocusEnabled(false);
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
        getContentPane().add(but7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 80, 80));

        but9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.png"))); // NOI18N
        but9.setBorderPainted(false);
        but9.setContentAreaFilled(false);
        but9.setDefaultCapable(false);
        but9.setFocusPainted(false);
        but9.setFocusable(false);
        but9.setRequestFocusEnabled(false);
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
        getContentPane().add(but9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 80, 80));

        but8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.png"))); // NOI18N
        but8.setBorderPainted(false);
        but8.setContentAreaFilled(false);
        but8.setDefaultCapable(false);
        but8.setFocusPainted(false);
        but8.setFocusable(false);
        but8.setRequestFocusEnabled(false);
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
        getContentPane().add(but8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 80, 80));

        but0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png"))); // NOI18N
        but0.setToolTipText("");
        but0.setBorderPainted(false);
        but0.setContentAreaFilled(false);
        but0.setDefaultCapable(false);
        but0.setFocusPainted(false);
        but0.setFocusable(false);
        but0.setRequestFocusEnabled(false);
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
        getContentPane().add(but0, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 80, 80));

        backspace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backspace.png"))); // NOI18N
        backspace.setBorderPainted(false);
        backspace.setContentAreaFilled(false);
        backspace.setDefaultCapable(false);
        backspace.setFocusPainted(false);
        backspace.setFocusable(false);
        backspace.setRequestFocusEnabled(false);
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
        getContentPane().add(backspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 170, 80));

        bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgpanel.gif"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 734));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawbnActionPerformed
        // TODO add your handling code here:
        if(txtwithdraw.getText().equals("")){
            JOptionPane.showMessageDialog(this, "You ought to input the amount of money!");}
         else {
      Limit();
        System.out.println("limit");
        }
    }//GEN-LAST:event_withdrawbnActionPerformed
    
    private void butcancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butcancelMouseClicked
        if (evt.getClickCount() == 1) {
            timeclose();
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
    
    private void withdrawbnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawbnMouseEntered
        withdrawbn.setIcon(new ImageIcon("src/images/ok1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawbnMouseEntered
    
    private void withdrawbnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawbnMouseExited
        withdrawbn.setIcon(new ImageIcon("src/images/ok.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawbnMouseExited
    
    private void txtwithdrawKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwithdrawKeyPressed
        String aa = this.txtwithdraw.getText();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtwithdraw.setEditable(true);
        } else if (evt.getKeyCode() == 8) {
            txtwithdraw.setText(aa);
            txtwithdraw.setEditable(true);
        } else {
            txtwithdraw.setEditable(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtwithdrawKeyPressed
    
    private void but1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseExited
        
        but1.setIcon(new ImageIcon("src/images/1.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but1MouseExited
    
    private void but1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseEntered
        
        but1.setIcon(new ImageIcon("src/images/11.png"));
    }//GEN-LAST:event_but1MouseEntered
    
    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        String aa = this.txtwithdraw.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            
            txtwithdraw.setText(aa + "1");
            
        }
        // TODO add your handling code here:
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
        
        String aa = this.txtwithdraw.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            
            txtwithdraw.setText(aa + "2");
        }
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
        
        String aa = this.txtwithdraw.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            
            txtwithdraw.setText(aa + "3");
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
        
        String aa = this.txtwithdraw.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            
            txtwithdraw.setText(aa + "6");
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
        String aa = this.txtwithdraw.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            
            txtwithdraw.setText(aa + "5");
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
        
        String aa = this.txtwithdraw.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            
            txtwithdraw.setText(aa + "4");
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
        
        String aa = this.txtwithdraw.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            
            txtwithdraw.setText(aa + "7");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_but7ActionPerformed
    
    private void but9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but9MouseExited
        but9.setIcon(new ImageIcon("src/images/9.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but9MouseExited
    
    private void but9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but9MouseEntered
        but9.setIcon(new ImageIcon("src/images/91.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but9MouseEntered
    
    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        
        String aa = this.txtwithdraw.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            
            txtwithdraw.setText(aa + "9");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_but9ActionPerformed
    
    private void but8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but8MouseExited
        
        but8.setIcon(new ImageIcon("src/images/8.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but8MouseExited
    
    private void but8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but8MouseEntered
        
        but8.setIcon(new ImageIcon("src/images/81.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but8MouseEntered
    
    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
        
        String aa = this.txtwithdraw.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            
            txtwithdraw.setText(aa + "8");
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_but8ActionPerformed
    
    private void but0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but0MouseExited
        but0.setIcon(new ImageIcon("src/images/0.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_but0MouseExited
    
    private void but0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but0MouseEntered
        
        but0.setIcon(new ImageIcon("src/images/01.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_but0MouseEntered
    
    private void but0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but0ActionPerformed
        
        String aa = this.txtwithdraw.getText();
        if (evt.getID() == ActionEvent.ACTION_PERFORMED) {
            
            txtwithdraw.setText(aa + "0");
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
        
        txtwithdraw.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_backspaceActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backspace;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtwithdraw;
    private javax.swing.JButton withdrawbn;
    // End of variables declaration//GEN-END:variables

    public void Limit() {
        System.out.println("trong limit ()");
        try {
            
            Connect.connectDatabase();
            CallableStatement cat = Connect.connectDatabase().prepareCall("{call Show_Account}");
            ResultSet rst = cat.executeQuery();
            CallableStatement calt = Connect.connectDatabase().prepareCall("{call ShowLimitSetting}");
            calt.setMaxRows(1);
            ResultSet reset = calt.executeQuery();
            CallableStatement cast = null;
            CallableStatement cs = null;
            System.out.println("trong try connection");
            while (reset.next()) {
                System.out.println("trong reset");
                String stg = reset.getString("TurnValue").toString();
                switch (stg) {
                    case "per Day":
                        cs = Connect.connectDatabase().prepareCall("{call SumLimitDay(?)}");
                        cs.setString(1, cr);
                        cast = Connect.connectDatabase().prepareCall("{call showWITHDRAWday(?,?)}");
                        break;
                    case "per Week":
                        cs = null;
                        break;
                    case "per Month":
                        cs = Connect.connectDatabase().prepareCall("{call SumLimitMonth(?)}");
                        cs.setString(1, cr);
                        cast = Connect.connectDatabase().prepareCall("{call showWITHDRAWmonth(?,?)}");
                        break;
                    case "per Year":
                        cs = Connect.connectDatabase().prepareCall("{call SumLimitYear(?)}");
                        cs.setString(1, cr);
                        cast = Connect.connectDatabase().prepareCall("{call showWITHDRAWyear(?,?)}");
                        break;
                }
                cast.setString(1, accountID);
                cast.setString(2, cg);
                ResultSet rset = cast.executeQuery();
                while (rset.next()) {
                    ResultSet rt = cs.executeQuery();
                    System.out.println("trong file rset");
                    while (rst.next()) {
                        System.out.println(rst.getString("AccountID"));
                        System.out.println(accountID);
                        if (rst.getString("AccountID").equals(accountID)) {
                            System.out.println("trong accountID & rst");
                            if (rset.getInt(1) <= reset.getInt("NumberOfTurn")
                                    && Float.parseFloat(txtwithdraw.getText()) <= reset.getFloat("MaxMoney")
                                    && Float.parseFloat(txtwithdraw.getText()) >= reset.getFloat("MinMoney")) {
                                while (rt.next()) {
                                    if (rt.getFloat(1) + Float.parseFloat(
                                            txtwithdraw.getText()) <= reset.getFloat("TotalOnTurnValue")) {
                                       if(rst.getFloat("AccountBalance")>=Float.parseFloat(txtwithdraw.getText())+reset.getFloat("FeeCountedOnTurn")+reset.getFloat("TransactionFee")*Float.parseFloat(txtwithdraw.getText())){
                                        AddWithdraw();
                                        WithdrawtMoney();
                                        this.dispose();
                                        new withdrawsuccessfully(null, true,accountID,Float.parseFloat(txtwithdraw.getText())).setVisible(true);
                                       } else {
                                       JOptionPane.showMessageDialog(this, "Sorry! You don't have enough money in your account to withdraw.");
                                       }
                                        
                                    } else {
                                        JOptionPane.showMessageDialog(this, "So sorry! You cannot withdraw over " + reset.getFloat("TotalOnTurnValue") + " dollars " + stg.toLowerCase() + "! Please try again on the following day. Thank you!");
                                        this.dispose();
                                    }
                                    
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "So sorry! Your transaction might be stopped due to some of the following restrictions:"
                                        + "\n-You cannot withdraw over " + reset.getInt("NumberOfTurn") + " times " + stg.toLowerCase() + "! "
                                        + "\n-You cannot withdraw over " + (int) reset.getFloat("MaxMoney") + ""
                                        + "\n-You might withdraw at least " + (int) reset.getFloat("MinMoney") + ""
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
    
    public void AddWithdraw() {
        try {
            System.out.println(" thu hien rut tien");
            Connect.connectDatabase();
            CallableStatement cat = Connect.connectDatabase().prepareCall("{call Show_Account}");
            ResultSet rst = cat.executeQuery();
            CallableStatement trc = Connect.connectDatabase().prepareCall("{call InsertWITHDRAW(?,?,?,?,?)}");
            System.out.println("TC1");
            CallableStatement calt = Connect.connectDatabase().prepareCall("{call ShowLimitSetting}");
            calt.setMaxRows(1);
            ResultSet reset = calt.executeQuery();
            while (reset.next()) {
                while (rst.next()) {
                    if (accountID.equals(rst.getString("AccountID").toString())) {
                        
                        trc.setString(1, cr);
                        trc.setString(2, accountID);
                        trc.setFloat(3, Float.parseFloat(this.txtwithdraw.getText()));
                        trc.setFloat(4, reset.getFloat("TransactionFee") + reset.getFloat("FeeCountedOnTurn"));
                        trc.setFloat(5, Float.parseFloat(this.txtwithdraw.getText()) - reset.getFloat("TransactionFee") * Float.parseFloat(this.txtwithdraw.getText()) - reset.getFloat("FeeCountedOnTurn"));
                        
                        trc.executeUpdate();
                        
                        CallableStatement clt = Connect.connectDatabase().prepareCall("{call InsertREPORTS(?,?,?,?,?,?,?,?)}");
                        clt.setString(1, "");
                        clt.setString(2, rst.getString("AccountID").toString());
                        clt.setString(3, rst.getString("Fullname").toString());
                        clt.setString(4, "WITHDREW");
                        clt.setFloat(5, Float.parseFloat(txtwithdraw.getText().toString()));
                        clt.setString(6, accountID);
                        clt.setFloat(7, rst.getFloat("AccountBalance"));
                        clt.setString(8, cr);
                        clt.executeUpdate();
                        System.out.println("TC");
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void WithdrawtMoney() {
        try {
            Connect.connectDatabase();
            CallableStatement cat = Connect.connectDatabase().prepareCall("{call Show_Account}");
            ResultSet rst = cat.executeQuery();
            CallableStatement ct = Connect.connectDatabase().prepareCall("{call DepositIntoAccount(?,?)}");
            CallableStatement calt = Connect.connectDatabase().prepareCall("{call ShowLimitSetting}");
            calt.setMaxRows(1);
            ResultSet reset = calt.executeQuery();
            while (reset.next()) {
                while (rst.next()) {
                    
                    if (accountID.toString().equals(rst.getString("AccountID").toString())) {
                        ct.setString(1, accountID);
                        ct.setFloat(2, rst.getFloat("AccountBalance") - Float.parseFloat(this.txtwithdraw.getText()) - Float.parseFloat(this.txtwithdraw.getText()) * reset.getFloat("TransactionFee") - reset.getFloat("FeeCountedOnTurn"));
                        int in = ct.executeUpdate();
                    }
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}

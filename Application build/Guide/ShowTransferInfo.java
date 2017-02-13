/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import Connections.Connect;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kiet
 */
public class ShowTransferInfo extends javax.swing.JFrame {

    /**
     * Creates new form ShowTransferInfo
     */
    DefaultTableModel mod = new DefaultTableModel();

    public ShowTransferInfo(String stringkey) {

        initComponents();
        ServerTurn cc = new ServerTurn();
        cc.TurningS(this);
        this.TransferInfo.setModel(mod);

        addCol();
        LoadingDeposit();
        TransferInfo.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TransferInfo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TransferInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TransferInfo);

        jLabel1.setText("10 CURRENT TRANSFER ACTIVITIES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TransferInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void addCol() {
        mod.addColumn("Transfer Date");
        mod.addColumn("Benefactor Account");
        mod.addColumn("Beneficiary Account");
        mod.addColumn("Amount of money");
        mod.addColumn("Fee");
        mod.addColumn("Total");
        mod.addColumn("Note");

        TransferInfo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TransferInfo.getColumnModel().getColumn(0).setPreferredWidth(90);
        TransferInfo.getColumnModel().getColumn(1).setPreferredWidth(120);
        TransferInfo.getColumnModel().getColumn(2).setPreferredWidth(120);
        TransferInfo.getColumnModel().getColumn(3).setPreferredWidth(150);
        TransferInfo.getColumnModel().getColumn(4).setPreferredWidth(65);
        TransferInfo.getColumnModel().getColumn(5).setPreferredWidth(120);
        TransferInfo.getColumnModel().getColumn(6).setPreferredWidth(130);

    }

    public void LoadingDeposit() {
        try {
            Connect.connectDatabase();
            CallableStatement cat = Connect.connectDatabase().prepareCall("{call TRANSFERSshow}");
            cat.setMaxRows(10);
            ResultSet result = cat.executeQuery();
            while (result.next()) {
                Vector data = new Vector();
                data.add(result.getDate("TransactionDate").toString());
                data.add(result.getString("AccountSendNo").toString());
                data.add(result.getString("AccountReceiveNo"));
                data.add(result.getFloat("MoneyTransfered"));
                data.add(result.getFloat("TransactionFee"));
                data.add(result.getFloat("Total"));
                data.add(result.getString("Note").toString());
                mod.addRow(data);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

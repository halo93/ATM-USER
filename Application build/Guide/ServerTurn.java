/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import java.awt.Dialog;
import java.awt.Frame;
import java.io.IOException;
import java.net.ServerSocket;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.omg.CORBA.Request;
import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;

/**
 *
 * @author Administrator
 */
public class ServerTurn {

    public void TurningS(JFrame jf) {
        try {
            ServerInterface sif = (ServerInterface)Naming.lookup("rmi://localhost:1202/atm");
            sif.Turning("rmi://localhost:1202/atm");
        } catch (Exception E) {
//            E.printStackTrace();
            JOptionPane.showMessageDialog(null, "Oops! Sorry for this inconvenience! The system is waiting for recover. Please try again later!");
            System.exit(0);
        }
    }
        public void TurningT(Dialog jf) {
        try {
            ServerInterface sif = (ServerInterface)Naming.lookup("rmi://localhost:1202/atm");
            sif.Turning("rmi://localhost:1202/atm");
        } catch (Exception E) {
//            E.printStackTrace();
            JOptionPane.showMessageDialog(null, "Oops! Sorry for this inconvenience! The system is waiting for recover. Please try again later!");
            System.exit(0);
        }
    }
}

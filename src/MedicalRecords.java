/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;

/**
 *
 * @author Tonye
 */
public class MedicalRecords {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MedicalRecordsMain mainx = new MedicalRecordsMain();
        mainx.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainx.setVisible(false);
        mainx.jFrame1.setLocationRelativeTo(mainx);
        mainx.jFrame1.setSize(251, 160);
        mainx.jFrame1.setVisible(true);
        }

}

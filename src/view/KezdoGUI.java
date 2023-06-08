package view;
import javax.swing.*;

public class KezdoGUI {

    public static int kezdoGUI() {
        String kerdes = "Üdvözöllek! Ha GUI-n szeretnéd folytatni? (yes), ha konzolon (no)";
        int gomb = JOptionPane.showConfirmDialog(null,kerdes,"Kérlek válassz",JOptionPane.YES_NO_OPTION);
        if(gomb == JOptionPane.YES_OPTION) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

package view;
import javax.swing.*;
import control.EmberController;

public class GUIKiir {
    EmberController emberController;
    public GUIKiir(EmberController embercontroller) {
        this.emberController = embercontroller;
    }

    public void guikiir() {
        String emberAdatok = emberController.toString();
        JOptionPane.showMessageDialog(null,emberAdatok,"ember adatainak megjelenítése:",JOptionPane.INFORMATION_MESSAGE);
    }
}

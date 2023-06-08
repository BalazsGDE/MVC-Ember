package view;

import control.EmberController;

import javax.swing.*;

public class GUIBeker {
    private EmberController emberController;
    private String bekertNev;
    private String bekertKor;
    private int gomb;

    public GUIBeker(EmberController embercontroller ) {
        this.emberController = embercontroller;
    }

    public int guiBekeres() {
        while (true) {
            try {
                bekertNev = JOptionPane.showInputDialog(null, "Nev: ", "Nevbekeres", JOptionPane.QUESTION_MESSAGE);
                if (bekertNev.length() == 0) throw new Exception();break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Adj meg egy nevet!", "uzenet cime", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        emberController.setEmberNev(bekertNev);

        while (true) {
            try {
                bekertKor = JOptionPane.showInputDialog(null, "Kor: ", "Korbekeres", JOptionPane.QUESTION_MESSAGE);
                if (Integer.parseInt(bekertKor) <= 0) throw new Exception();
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "lehetséges kort adj meg! (pozitív egész számot)", "uzenet cime", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        emberController.setEmberKor(Integer.parseInt(bekertKor));

        gomb = JOptionPane.showConfirmDialog(null, "GUI-n mutassuk a létrehozott ember példányt?", "Adatbekérés", JOptionPane.YES_NO_OPTION);
        if (gomb == JOptionPane.YES_OPTION) {
            return 1;
        } else {
            return 0;
        }
    }
}

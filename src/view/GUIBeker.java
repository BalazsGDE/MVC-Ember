package view;

import control.EmberController;

import javax.swing.*;

public class GUIBeker {
    EmberController emberController;

    public GUIBeker(EmberController embercontroller ) {
        this.emberController = embercontroller;
    }

    public void guiBekeres() {
        String bekertNev;

        bekertNev = JOptionPane.showInputDialog(null, "Nev: ", "Nevbekeres", JOptionPane.QUESTION_MESSAGE);

        emberController.setEmberNev(bekertNev);

        String bekertKor;

        bekertKor = JOptionPane.showInputDialog(null, "Kor: ", "Korbekeres", JOptionPane.QUESTION_MESSAGE);

        emberController.setEmberKor(Integer.parseInt(bekertKor));

    }
}

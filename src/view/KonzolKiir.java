package view;
import control.EmberController;

public class KonzolKiir {
    EmberController emberController;

    public KonzolKiir(EmberController embercontroller) {
        this.emberController = embercontroller;
    }

    public void konzolkiir() {
        String emberAdatok = emberController.toString();
        System.out.println(emberAdatok);
    }

}

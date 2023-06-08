package control;
import control.EmberController;
import model.Ember;
import view.KonzolBeker;
import view.GUIBeker;
import view.KezdoGUI;
import view.GUIKiir;
import view.KonzolKiir;

public class Main {
    public static void main(String[] args) {
        int valasz = KezdoGUI.kezdoGUI();
        if (valasz==1) {
            EmberController control = new EmberController();
            GUIBeker gui = new GUIBeker(control);
            if (gui.guiBekeres()==1) {
                GUIKiir guik = new GUIKiir(control);

                guik.guikiir(); }
            else {
                KonzolKiir konzolk = new KonzolKiir(control);
                konzolk.konzolkiir();
            }
        }

        else {
            EmberController control = new EmberController();
            KonzolBeker konzol = new KonzolBeker(control);
            konzol.KonzolSzoveg("Kérlek add meg az emberpéldány paramétereit!");
            if (konzol.konzolBekeres()==1) {
                KonzolKiir konzolk = new KonzolKiir(control);
                konzolk.konzolkiir(); }
            else {
                GUIKiir guik = new GUIKiir(control);
                guik.guikiir();
            }
        }
    }
}
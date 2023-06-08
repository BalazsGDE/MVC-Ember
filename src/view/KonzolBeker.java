package view;
import control.EmberController;

import java.util.Scanner;

public class KonzolBeker {
    EmberController emberController;
    int bekertKor;
    String bekertNev;
    String guiVagyKonzol;

    public KonzolBeker(EmberController embercontroller) {
        this.emberController = embercontroller;
    }

    public void KonzolSzoveg(String szoveg){
        System.out.println(szoveg);
    }

    public int konzolBekeres() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nev: ");

        bekertNev = sc.nextLine();

        emberController.setEmberNev(bekertNev);

        System.out.println("Kor: ");
        bekertKor = sc.nextInt();

        emberController.setEmberKor(bekertKor);

        System.out.println("Konzolon akarod megjeleníteni az eredményt(i) vagy GUI-n(n): ");
        guiVagyKonzol = sc.next();

        if (guiVagyKonzol.equals("i")){
            sc.close();
            return 1;
        }
        else {
            sc.close();
            return 0;
        }

    }
}

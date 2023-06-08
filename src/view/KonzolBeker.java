package view;
import control.EmberController;

import java.util.Scanner;

public class KonzolBeker {
    private EmberController emberController;
    private int bekertKor;
    private String bekertNev;
    private String guiVagyKonzol;

    public KonzolBeker(EmberController embercontroller) {
        this.emberController = embercontroller;
    }

    public void KonzolSzoveg(String szoveg){
        System.out.println(szoveg);
    }

    public int konzolBekeres() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nev: ");
        while (true) {
            try {
                bekertNev = sc.nextLine();
                if (bekertNev.length() == 0) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Nevet kötelező megadni");
            }
        }


        emberController.setEmberNev(bekertNev);

        System.out.println("Kor: ");
        while (true) {
            try {
                bekertKor = sc.nextInt();
                if (bekertKor <= 0) throw new Exception("Negatív szám");
                break;
            } catch (Exception e) {
                System.out.println("lehetséges kort adj meg! (pozitív egész számot)");
            }
        }

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

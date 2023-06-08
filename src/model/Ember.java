package model;

public class Ember {

    private String nev;
    private int kor;

    public Ember() {
        this.nev=nev;
        this.kor=kor;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public String toString() {
        return "emberpéldány adatai: " + "\n nev:" + nev +
                "\n kor:" + kor;
    }

}

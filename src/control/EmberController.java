package control;
import model.Ember;

public class EmberController {
    Ember ember;

    public EmberController(){
        this.ember=new Ember();
    }

    public String getEmberNev() {
        return ember.getNev();
    }

    public void setEmberNev(String emberNev) {
        ember.setNev(emberNev);
    }

    public int getEmberKor() {
        return ember.getKor();
    }

    public void setEmberKor(int emberKor) {
        ember.setKor(emberKor);
    }

    public String toString() {
        return "emberpéldány adatai: " + "\n nev:" + getEmberNev() +
                "\n kor:" + getEmberKor();
    }

}

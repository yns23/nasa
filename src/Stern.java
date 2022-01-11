import java.util.ArrayList;
import java.util.List;

public class Stern implements Subjekt{

    private List<Beobachter> beobachterListe = new ArrayList<Beobachter>();

    private String aktion;

    @Override
    public void registriereBeobachter(Beobachter beobachter) {
        this.beobachterListe.add(beobachter);
    }

    @Override
    public void abmeldenBeobachter(Beobachter beobachter) {
        this.beobachterListe.remove(beobachter);
        System.out.println("Der Beobachter wurde erfolgreich abgemeldet.");
    }

    @Override
    public void benachrichtigeAlleBeobachter() {
        for (Beobachter beobachter : beobachterListe){
            beobachter.update();
        }
    }

    public String getAktion() {
        return aktion;
    }

    public void setAktion(String aktion) {
        this.aktion = aktion;
        this.benachrichtigeAlleBeobachter();

    }

}

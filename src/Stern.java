import java.util.ArrayList;
import java.util.List;

public class Stern implements Subjekt{

    private List<Beobachter> beobachterListe = new ArrayList<Beobachter>();

    private String aktion;
    private String name = "Stern";

    @Override
    public void registriereBeobachter(Beobachter beobachter) {
        this.beobachterListe.add(beobachter);
    }

    @Override
    public void abmeldenBeobachter(Beobachter beobachter) {
        this.beobachterListe.remove(beobachter);
        System.out.println("Stern: Der Beobachter wurde erfolgreich abgemeldet.");
    }

    @Override
    public void benachrichtigeAlleBeobachter() {
        for (Beobachter beobachter : beobachterListe){
            beobachter.update(this);
        }
    }

    @Override
    public String getAktion() {
        return aktion;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAktion(String aktion) {
        this.aktion = aktion;
        System.out.println("Stern: Hat ein Update erhalten -> " + aktion);
        this.benachrichtigeAlleBeobachter();

    }

}

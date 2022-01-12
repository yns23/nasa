import java.util.ArrayList;
import java.util.List;

public interface Subjekt {
    public abstract void registriereBeobachter(Beobachter beobachter);
    public abstract void abmeldenBeobachter(Beobachter beobachter);
    public abstract void benachrichtigeAlleBeobachter();
    public abstract String getAktion();
    public abstract String getName();
    public abstract void setAktion(String update);




}

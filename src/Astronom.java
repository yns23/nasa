public class Astronom implements Beobachter{


    private String name;
    private Subjekt sub;

    public Astronom(Subjekt sub, String name){
        this.name = name;
        this.sub = sub;
        sub.registriereBeobachter(this);
    }
    @Override
    public void update(Subjekt sub) {
        this.sub = sub;
        System.out.println("Der Astronom " + this.name + " hat ein "+ sub.getName() + " beobachtet: " + sub.getAktion());
    }

    @Override
    public void aendern(String update) {
        System.out.println("ACHTUNG: " + this.name + " meldet ein Update");
        sub.setAktion(update);


    }

    public String getName() {
        return name;
    }

    public void setSub(Subjekt sub) {
        this.sub = sub;
    }
}

public class Astronom implements Beobachter{


    private String name;
    private Stern stern;

    public Astronom(Stern stern, String name){
        this.name = name;
        this.stern = stern;
        stern.registriereBeobachter(this);
    }
    @Override
    public void update() {
        System.out.println("Der Astronom " + this.name + " beobachtet: " + stern.getAktion());
    }

    @Override
    public void aendern(String update) {
        System.out.println("ACHTUNG: " + this.name + " meldet ein Update");
        stern.setAktion(update);


    }

    public String getName() {
        return name;
    }

}

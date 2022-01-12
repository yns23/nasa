public class main {

    public static void main(String[] args) {

        Stern stern = new Stern();

        Astronom alex = new Astronom(stern,"Alex");
        Astronom yunus = new Astronom(stern, "Yunus");
        System.out.println();


        stern.setAktion("Stern leuchtet extrem hell.");
        stern.setAktion("der Stern explodiert.");
        System.out.println();




        yunus.aendern("Der Stern wird zu einem roten Riesen.");
        System.out.println();

        stern.abmeldenBeobachter(alex);
        stern.setAktion("Alex hat die Explosion nicht überlebt.");



        System.out.println();
        System.out.println("Aufgabe 2");


        Subjekt hk1 = new Himmelskoerper().getSubjekt("Planet");
        Subjekt hk2 = new Himmelskoerper().getSubjekt("Stern");

        hk1.registriereBeobachter(yunus);
        hk2.registriereBeobachter(alex);


        hk1.setAktion("Die Erde wurde entdeckt.");
        hk2.setAktion("Der Stern 1230489 wurde entdeckt.");


    }
}

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
    }
}

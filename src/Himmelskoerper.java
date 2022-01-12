public class Himmelskoerper {

    public Subjekt getSubjekt(String subjektTyp) {
        if (subjektTyp == null) {
            return null;
        }
        if (subjektTyp.equalsIgnoreCase("STERN")) {
            return new Stern();

        } else if (subjektTyp.equalsIgnoreCase("PLANET")) {
            return new Planet();
        }


            return null;
    }
}

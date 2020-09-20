package interfacesfonctionnelles;

public class Main {

    public static void main(String[] args) {

        Traitement t1 = (Ressource r) -> r.getStatus();
        Traitement t2 = (Ressource r) -> r.getStatus() ? false : true;
        lancementTraitements(new Ressource(), t1);
    }

    public static void lancementTraitements(Ressource r, Traitement t) {

        if(t.traite(r)) {
            System.out.println("Traitement fait");
        }
        else {
            System.out.println("Traitement en cours");
        }

    }
}

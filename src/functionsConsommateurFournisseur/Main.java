package functionsConsommateurFournisseur;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Exemple de function consommateur : consomme des paramètres mais ne retourne rien
        Consumer consommateur = System.out::println;
      //  consommateur.accept("BgrDr0p");
       // consommateur.accept("Fefe");
        Stream.of("BgrDr0p","ff","dd").forEach(consommateur);

        // ------------------------------------------------

        Stream.of(new Personne(33,"Emmanuel"), new Personne(55,"Xavier"))
                .forEach(p ->affichePerson( () -> p.getAge()));
    }
    // Supplier : function qui retoune quelque chose mais qui ne nécessite pas de paramètre.
    public static void affichePerson(Supplier s ) {
        System.out.println(s.get());

    }
}

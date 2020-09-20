package predicats;



import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // type de fonction qui retourne true ou false
        Predicate<Ressource> ressourceDispo = (Ressource r) -> r.estDisponible();

        Stream.of(new Ressource(true), new Ressource(false), new Ressource(true))
                .filter(ressourceDispo)
                .forEach(System.out::println);


    }
}

package flux;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> List = new ArrayList<>();

        List.add("Madrid");
        List.add("Croatie");
        List.add("Angers");
        List.add("Xavier");

        List.stream()
                .filter(s -> s.startsWith("X"))
                .map(String::toUpperCase) // opération intermédiaire
                .sorted()
                .forEach(System.out::println); //opération terminale


        // Autre méthode

        Stream.of("Thibauld", "Fabien", "Sofiane").forEach(System.out::println);


        // Alimenter directement un array

       Object[]  toArray = Stream.of("Thibauld", "Fabien", "Sofiane").toArray();
        // Classe de flux spécifique :

        IntStream.range(1,100).forEach(System.out::println);


    }
}

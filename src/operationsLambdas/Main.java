package operationsLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Personne> liste = new ArrayList<>();

        liste.add(new Personne("A", 34));
        liste.add(new Personne("B", 14));
        liste.add(new Personne("Z", 4));


        List<Personne> ListeFiltree = liste.stream()
                                            .filter(p -> p.getAge() > 3)
                                            .collect(Collectors.toList());

        ListeFiltree.stream().forEach(System.out::println);


        double AgeMoyen = liste.stream().collect(Collectors.averagingInt(p -> p.getAge()));

        System.out.println("Age moyen : " + AgeMoyen);

        Integer AgeTot = liste.stream().reduce(0, (somme,p ) -> somme += p.getAge(), (s1,s2) -> s1 + s2);

        System.out.println("Age total : " + AgeTot);


    }
}

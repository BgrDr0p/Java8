package lambdas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Lambdas : création d'une fonction a la volée.

        Personne[] personneT = {new Personne(55), new Personne(44), new Personne(12), new Personne(98)};

        // Trier les personnes par age

        // 1ère solution : créer une classe implementant Comparator
        // 2eme solution :  réferencer une méthode existante
        // 3eme solution : créer un lambda


        Arrays.sort(personneT,(p1, p2) -> { return p1.getAge() - p2.getAge();});


        for(Personne personne : personneT) {

            System.out.println(personne.getAge());
        }

    }
}

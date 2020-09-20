package referenceMethods;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Personne moi = new Personne(47);
        Personne autre = new Personne(46);

        Personne[] lesGens = new Personne[2];

        lesGens[0] = moi;
        lesGens[1] = autre;

        // réference de méthodes, on réference la méthode compareAgePersonne de la classe Personne,
        // sans avoir besoin de créer une classe spécifique.
        // équivalent d'adresse de fonction en C++

        Arrays.sort(lesGens, Personne::compareAgePersonne);


            for(Personne p : lesGens) {

                System.out.println(p.getAge());
            }




    }
}

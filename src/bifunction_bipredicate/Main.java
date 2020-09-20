package bifunction_bipredicate;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {

        // Bifunction : function qui prend 2 paramètre en entrée et venir faire un retour

        BiFunction<String, String, Integer> longueurTotaleDes2Chaines = (s1, s2) -> { return s1.length() + s2.length(); };

        System.out.println(longueurTotaleDes2Chaines.apply("Diisobutylphénoxyéthoxyéthyldiméthylbenzylammonium", "Aminométhylpyrimidinylhydroxyéthylméthythiazolium"));


        BiPredicate<String, String> estplusGrande = (s1, s2) -> { return s1.length() > s2.length(); };

        System.out.println(estplusGrande.test("EAFO?APZOKPO", "OEPOKFEFEZADZADAEFEFEODKPZ"));
    }
}

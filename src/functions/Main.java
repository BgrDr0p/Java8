package functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Integer, Double> celsuisVersFahrenheit = x -> (double) (x*9/5+32);

        System.out.println(celsuisVersFahrenheit.apply(25));

        Function<List<Integer>, Integer> somme = liste -> {
             int total = 0;
             for(Integer i : liste){
                 total+=i;
             }

             return total;
        };

       Integer value =somme.apply(Arrays.asList(4,56,1,13,3,2222));

       System.out.println("Valeur " + value);
    }
}

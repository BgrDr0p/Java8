package fluxLambdas;

import java.util.stream.Stream;

public class Main {


    public static void main(String[] args)
    {

      Stream<Personne>  s = Stream.of(new Personne(3),new Personne(34), new Personne(4), new Personne(94))
                .sorted((p1, p2) -> {return p1.compareTo(p2);});



      s.forEach(System.out::println);
    }
}

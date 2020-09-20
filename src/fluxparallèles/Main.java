package fluxparallèles;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {

        // nb de thread dans lequel on peut travailler

        ForkJoinPool pool =  ForkJoinPool.commonPool();
        System.out.println(pool.getParallelism());

        Arrays.asList("BgrDr0p", "Table", "BMW","R","fefef", "frfzfez","revreldz", "fefezfzfgkb", "lrmtfpf")
                .parallelStream()
                .forEach(s -> System.out.println(s + " : " + Thread.currentThread().getName()));

    }
}

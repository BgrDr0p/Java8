package interfacesSam;

public class Main {

    public static void main(String[] args) {

    afficheMessage(s -> System.out.println(s));

    }

    public static void afficheMessage(Declencheur dec) {
        dec.declenche("LAMDAS DANS SAM");
    }
}

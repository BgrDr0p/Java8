package fluxLambdas;

public class Personne {

    private int age;

    public Personne(int age) {
        this.age = age;
    }


    public int compareTo(Personne other) {

        return age - other.age;
    }

    @Override
    public String toString() {
        return "Age : " + age;
    }
}

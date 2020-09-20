package referenceMethods;

public class Personne
{


    private int age;

    public Personne (int age) {

        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public static int compareAgePersonne(Personne p1, Personne p2)
    {
        return p1.age - p2.age;

    }
}

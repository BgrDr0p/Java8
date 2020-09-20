package defaultMethodInterface;

import defaultMethodInterface.Personne;

public class PersonnePhysique implements Personne {


    private int AgePersonne;

    @Override
    public int getAge() {

        return AgePersonne;
    }

}

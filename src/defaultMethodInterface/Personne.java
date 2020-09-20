package defaultMethodInterface;

public interface Personne {


    // Plus besoin d'override dans une classe qui implémente cette interface sans avoir l'utilité comme dans la classe
    // defaultMethodInterface.Personne morale
      default int getAge() {return -1;};

}

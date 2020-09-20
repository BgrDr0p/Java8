package predicats;

public class Ressource {



    private boolean estDisponible;

    public Ressource(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }
    public boolean estDisponible() {
        return estDisponible;
    }
}

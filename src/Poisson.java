public class Poisson {

    private String name;
    private double longueur;
    private boolean genre;

    public Poisson(String name, double longueur, boolean genre) {
        this.name = name;
        this.longueur = longueur;
        this.genre = genre;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public boolean isGenre() {
        return genre;
    }

    public void setGenre(boolean genre) {
        this.genre = genre;
    }
}

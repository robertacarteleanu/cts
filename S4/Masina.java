public class Masina {
    private int numarSerie;
    private String nume;

    public Masina(int numarSerie, String nume) {
        this.numarSerie = numarSerie;
        this.nume = nume;
    }

    public int getNumarSerie() {
        return numarSerie;
    }

    public void setNumarSerie(int numarSerie) {
        this.numarSerie = numarSerie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "numarSerie=" + numarSerie +
                ", nume='" + nume + '\'' +
                '}';
    }
}

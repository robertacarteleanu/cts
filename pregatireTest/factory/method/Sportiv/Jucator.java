package pregatireTest.factory.method.Sportiv;

public abstract class Jucator {
    int numar;
    String nume;

    public Jucator(int numar, String nume) {
        this.numar = numar;
        this.nume = nume;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

}

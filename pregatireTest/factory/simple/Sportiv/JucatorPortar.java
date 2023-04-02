package pregatireTest.factory.simple.Sportiv;

public class JucatorPortar extends Jucator{
    public JucatorPortar(int numar, String nume) {
        super(numar, nume);
    }

    @Override
    public String toString() {
        return "JucatorPortar{" +
                "numar=" + numar +
                ", nume='" + nume + '\'' +
                '}';
    }
}

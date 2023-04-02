package pregatireTest.factory.simple.Sportiv;

public class JucatorFundas extends Jucator{
    public JucatorFundas(int numar, String nume) {
        super(numar, nume);
    }

    @Override
    public String toString() {
        return "JucatorFundas{" +
                "numar=" + numar +
                ", nume='" + nume + '\'' +
                '}';
    }
}

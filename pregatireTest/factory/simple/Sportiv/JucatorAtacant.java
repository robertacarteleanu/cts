package pregatireTest.factory.simple.Sportiv;

public class JucatorAtacant extends Jucator{
    public JucatorAtacant(int numar, String nume) {
        super(numar, nume);
    }

    @Override
    public String toString() {
        return "JucatorAtacant{" +
                "numar=" + numar +
                ", nume='" + nume + '\'' +
                '}';
    }
}

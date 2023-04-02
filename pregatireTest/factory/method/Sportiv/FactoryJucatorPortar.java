package pregatireTest.factory.method.Sportiv;

public class FactoryJucatorPortar implements FactoryJucator{
    @Override
    public Jucator createJucator(String nume, int numar) {
        return new JucatorPortar(numar, nume);
    }
}

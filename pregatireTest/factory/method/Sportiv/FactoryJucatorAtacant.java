package pregatireTest.factory.method.Sportiv;

public class FactoryJucatorAtacant implements FactoryJucator{
    @Override
    public Jucator createJucator(String nume, int numar) {
        return new JucatorAtacant(numar, nume);
    }
}

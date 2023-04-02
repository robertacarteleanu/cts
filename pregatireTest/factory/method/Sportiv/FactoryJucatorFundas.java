package pregatireTest.factory.method.Sportiv;

public class FactoryJucatorFundas implements FactoryJucator{
    @Override
    public Jucator createJucator(String nume, int numar) {
        return new JucatorFundas(numar, nume);
    }
}

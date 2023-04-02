package pregatireTest.factory.method.Restaurant;

public class FactorySupaCiuperci implements FactorySupa{

    @Override
    public Supa creazaSupa(String denumire, float pret) {
        return new SupaCiuperci(denumire, pret);
    }
}

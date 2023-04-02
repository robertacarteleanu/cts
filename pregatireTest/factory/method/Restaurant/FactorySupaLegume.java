package pregatireTest.factory.method.Restaurant;

public class FactorySupaLegume implements FactorySupa{

    @Override
    public Supa creazaSupa(String denumire, float pret) {
        return new SupaLegume(denumire,pret);
    }
}

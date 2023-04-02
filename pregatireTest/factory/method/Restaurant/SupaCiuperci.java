package pregatireTest.factory.method.Restaurant;

public class SupaCiuperci extends Supa{

    public SupaCiuperci(String denumire, float pret) {
        super(denumire, pret);
    }
    @Override
    public String toString() {
        return "Supa{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}

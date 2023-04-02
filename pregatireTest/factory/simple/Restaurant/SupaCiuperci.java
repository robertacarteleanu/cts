package pregatireTest.factory.simple.Restaurant;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(String denumire, Double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        return "SupaCiuperci{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}

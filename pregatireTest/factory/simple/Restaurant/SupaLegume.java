package pregatireTest.factory.simple.Restaurant;

public class SupaLegume extends Supa{
    public SupaLegume(String denumire, Double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        return "SupaLegume{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}

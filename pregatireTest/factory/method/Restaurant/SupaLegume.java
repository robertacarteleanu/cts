package pregatireTest.factory.method.Restaurant;

public class SupaLegume extends Supa{

    public SupaLegume(String denumire, float pret) {
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

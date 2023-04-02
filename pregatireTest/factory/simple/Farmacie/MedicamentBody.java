package pregatireTest.factory.simple.Farmacie;

public class MedicamentBody extends Medicament{
    public MedicamentBody(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        return "MedicamentBody{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}

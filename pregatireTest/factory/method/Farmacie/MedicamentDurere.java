package pregatireTest.factory.method.Farmacie;

public class MedicamentDurere extends Medicament {
    public MedicamentDurere(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        return "MedicamentDurere{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}

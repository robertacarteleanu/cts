package pregatireTest.factory.method.Farmacie;

public class MedicamentRaceala extends Medicament {
    public MedicamentRaceala(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        return "MedicamentRaceala{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}

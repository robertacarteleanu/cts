package pregatireTest.factory.simple.Farmacie;

public class MedicamentRaceala extends Medicament{
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

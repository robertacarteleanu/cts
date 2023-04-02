package pregatireTest.factory.method.Farmacie;

public class FactoryMedicamentRaceala implements FactoryMedicament{
    @Override
    public Medicament getMedicament(String nume, double pret) {
        return new MedicamentRaceala(nume, pret);
    }
}

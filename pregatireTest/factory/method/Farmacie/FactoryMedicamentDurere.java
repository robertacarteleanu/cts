package pregatireTest.factory.method.Farmacie;

public class FactoryMedicamentDurere implements FactoryMedicament{
    @Override
    public Medicament getMedicament(String nume, double pret) {
        return new MedicamentDurere(nume, pret);
    }
}

package pregatireTest.factory.method.Farmacie;

public class FactoryMedicamentBody implements FactoryMedicament{
    @Override
    public Medicament getMedicament(String nume, double pret) {
        return new MedicamentBody(nume,pret);
    }
}

package pregatireTest.factory.simple.Farmacie;

public class FactoryFarmacie {
    public Medicament getMedicament(TipMedicament tipMedicament,String nume, double pret) throws Exception{
        switch (tipMedicament){
            case Body :
                return new MedicamentBody(nume,pret);
            case Durere:
                return new MedicamentDurere(nume,pret);
            case Raceala:
                return new MedicamentRaceala(nume,pret);
            default: throw new Exception("nu exista acesti tip de medicament");
        }
    }
}

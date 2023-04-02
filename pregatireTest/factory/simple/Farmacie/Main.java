package pregatireTest.factory.simple.Farmacie;

public class Main {
    public static void main(String[] args) {
        FactoryFarmacie farmacie=new FactoryFarmacie();
        try {
            Medicament medicament= farmacie.getMedicament(TipMedicament.Raceala,"Paracetamol",21.0);
            System.out.println(medicament);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

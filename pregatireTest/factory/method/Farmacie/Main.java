package pregatireTest.factory.method.Farmacie;

public class Main {
    public static void main(String[] args) {
        FactoryMedicamentBody factoryMedicamentBody=new FactoryMedicamentBody();
        Medicament medicament=factoryMedicamentBody.getMedicament("parasinus",18.0);
        System.out.println(medicament);
    }
}

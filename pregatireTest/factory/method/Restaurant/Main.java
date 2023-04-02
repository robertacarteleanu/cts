package pregatireTest.factory.method.Restaurant;

public class Main {
    public static void main(String[] args) {
        FactorySupaCiuperci factorySupaCiuperci=new FactorySupaCiuperci();
        Supa supaLegume= factorySupaCiuperci.creazaSupa("Supa ciuperci",10);
        System.out.println(supaLegume);

    }
}

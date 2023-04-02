package pregatireTest.factory.simple.Sportiv;

public class Main {
    public static void main(String[] args) {
        FactoryJucator factoryJucator=new FactoryJucator();
        Jucator jucator= null;
        try {
            jucator = factoryJucator.getJucator(TipJucator.Atacant,"Hagi Ianis",9);
            System.out.println(jucator);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

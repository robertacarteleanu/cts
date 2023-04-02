package pregatireTest.factory.simple.Restaurant;

public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();

        try {
            Supa supa= factory.createSoup(TipSupa.ciuperci,"supa ciuperci",10.2);
            System.out.println(supa);
//            Supa supa2= factory.createSoup(TipSupa.pui,"supa de pui",11.3);
//            System.out.println(supa2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

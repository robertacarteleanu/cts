package pregatireTest.factory.method.Sportiv;

public class Main {
    public static void main(String[] args) {
        FactoryJucatorAtacant factoryJucatorAtacant=new FactoryJucatorAtacant();
        Jucator jucator=factoryJucatorAtacant.createJucator("Ianis Hagi",8);
        System.out.println(jucator);

    }
}

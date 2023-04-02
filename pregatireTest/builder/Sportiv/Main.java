package pregatireTest.builder.Sportiv;

import pregatireTest.factory.method.Sportiv.FactoryJucatorAtacant;
import pregatireTest.factory.method.Sportiv.Jucator;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=Rezervare.builder().setHasBauturaRacoritoareInclusa(true).setHasMancareInclusa(true).build();
        System.out.println(rezervare);
    }
}

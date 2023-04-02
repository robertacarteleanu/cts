package pregatireTest.factory.method.Sportiv;

import pregatireTest.factory.simple.Sportiv.JucatorAtacant;
import pregatireTest.factory.simple.Sportiv.JucatorFundas;
import pregatireTest.factory.simple.Sportiv.JucatorPortar;
import pregatireTest.factory.simple.Sportiv.*;

public interface FactoryJucator {
    Jucator createJucator(String nume, int numar);

}

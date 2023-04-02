package pregatireTest.prototype.Farmacie;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RetetaGenerator generator=new RetetaGenerator();
        Map<String,Double> cantitati=new HashMap<>();
        cantitati.put("solutie5",18.0);
        IReteta reteta=generator.genereazaReteta("reteta2",cantitati);
        reteta.genereazaReteta();
    }
}

package pregatireTest.prototype.Farmacie;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta{
    Map<String,Double> cantitati=new HashMap<>();
    @Override
    public void setCantitati(Map<String, Double> cantitati) {
        this.cantitati=cantitati;
    }

    @Override
    public void genereazaReteta() {
        System.out.println("Reteta{" +
                "cantitati=" + cantitati +
                '}');
    }


    @Override
    public IReteta clone() {
        Reteta reteta=new Reteta();
        reteta.setCantitati(cantitati);
        return reteta;
    }
}

package pregatireTest.prototype.Farmacie;

import java.util.HashMap;
import java.util.Map;

public class RetetaGenerator {
    Map<String ,IReteta> retete=new HashMap<>();
    public RetetaGenerator(){
        Reteta reteta=new Reteta();
        Map<String,Double> cantitati=new HashMap<>();
        cantitati.put("solutia 1", 2.6);
        cantitati.put("solutia 2", 5.7);
        reteta.setCantitati(cantitati);
        retete.put("reteta1",reteta);
        Reteta reteta2=new Reteta();
        Map<String,Double> cantitati2=new HashMap<>();
        cantitati2.put("solutia 3", 3.3);
        cantitati2.put("solutia 4", 1.9);
        reteta2.setCantitati(cantitati2);
        retete.put("reteta2",reteta2);
    }
    public IReteta genereazaReteta(String tip, Map<String,Double> cantitati){
        if(retete.get(tip)!=null){
            IReteta reteta=retete.get(tip).clone();
            reteta.setCantitati(cantitati);
            return reteta;
        }else return null;
    }

}

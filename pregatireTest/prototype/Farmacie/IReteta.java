package pregatireTest.prototype.Farmacie;

import java.util.Map;

public interface IReteta {

    void setCantitati(Map<String, Double> cantitati);

    void genereazaReteta();
    IReteta clone();
}

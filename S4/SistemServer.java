import java.util.ArrayList;
import java.util.List;

public class SistemServer {
    private int number;
    private String name;
    private static SistemServer instance;
    private List<Masina> masinaList;

    private SistemServer(int number, String name){
        this.number=number;
        this.name=name;
        masinaList=new ArrayList<>();
    }

    public void addMasina(Masina masinaNoua){
        boolean existaMaisina=false;
        for(Masina masina:masinaList){
            if(masinaNoua.getNumarSerie()==masina.getNumarSerie()){
                existaMaisina=true;
            }
        }
        if(existaMaisina==false)
            masinaList.add(masinaNoua);
    }
    public String getMasina(int numar_serie){
        for (Masina masina:masinaList){
            if(masina.getNumarSerie()==numar_serie) {
               return masina.toString();
            }

        }
        return new String("Masina cu numarul de serie "+numar_serie+" nu exista!");
    }
    public static synchronized SistemServer getInstance(int number, String name) {

        if(instance==null){
            instance=new SistemServer(number,name);
        }
        return instance;
    }

}

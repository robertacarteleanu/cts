package pregatireTest.singletone;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private String denumire;
    private List<Articol> articolList;
    private static Magazin instance=null;

    private Magazin( String denumire) {
        this.denumire = denumire;
        this.articolList=new ArrayList<>();
    }

    public List<Articol> getArticolList() {
        return articolList;
    }
    public void addArticol(Articol articolNou){
        boolean isExist=false;
        for(Articol articol: articolList){
            if(articol.getNume().equals(articolNou.getNume())){
                isExist=true;
                break;
            }
        }
        if(isExist==false){
            articolList.add(articolNou);
        }
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", articolList=" + articolList +
                '}';
    }

    public synchronized static Magazin getInstance(String denumire){
        if(instance==null){
            instance=new Magazin( denumire);
        }
        return instance;
    }
}

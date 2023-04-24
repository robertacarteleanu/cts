package facade.ex2;

public class DealerAuto {
    private MasinaFamilie masinaFamilie;
    private MasinaElectrica masinaElectrica;
    private MasinaSport masinaSport;

    public DealerAuto(){
       masinaElectrica=new MasinaElectrica();
       masinaFamilie=new MasinaFamilie();
       masinaSport=new MasinaSport();
    }
    public String descrieMasinaFamilie(){
        return masinaFamilie.descriere();
    }
    public String descrieMasinaElectrica(){
        return masinaElectrica.descriere();
    }
    public String descrieMasinaDeSport(){
        return masinaSport.descriere();
    }

}

package pregatireTest.factory.simple.Restaurant;

public class Factory {
    public Supa createSoup(TipSupa tipSupa,String denumire, double pret) throws Exception{
        switch (tipSupa){
            case legume -> {
                return new SupaLegume(denumire,pret);
            }
            case ciuperci -> {
                return new SupaCiuperci(denumire,pret);
            }
            default -> throw new Exception(" Nu se cunoaste tipul");
        }
    }
}

package pregatireTest.factory.simple.Sportiv;

public class FactoryJucator {
    public Jucator getJucator(TipJucator tipJucator,String nume, int numar) throws Exception{
        switch (tipJucator){
            case Fundas -> {
                return new JucatorFundas(numar,nume);
            }
            case Portar ->
            {
                return new JucatorPortar(numar, nume);
            }
            case Atacant ->
            {
                return new JucatorAtacant(numar, nume);
            }
            default -> throw new Exception("Tipul mentionat nu exista!");
        }
    }
}

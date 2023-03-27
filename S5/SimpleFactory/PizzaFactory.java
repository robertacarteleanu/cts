package SimpleFactory;

public class PizzaFactory {
    public static Pizza createPizza(TipPizza tipPizza) throws Exception{
        switch (tipPizza){
            case cheese: return new CheesePizza();
            case pepperoni: return new PepperoniPizza();
            case vegana:return new PizzaVegana();
            default:
                throw new Exception("Tipul primit nu este corect");
        }
    }
}

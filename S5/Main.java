import AbstractFactory.MacGuiFactory;
import AbstractFactory.WindowsGuiFactory;
import FactoryMethod.CatFactory;
import FactoryMethod.DogFactory;
import FactoryMethod.GascaFactory;
import SimpleFactory.PizzaFactory;
import SimpleFactory.TipPizza;

public class Main {
    public static void main(String[] args) {

        try {
            PizzaFactory.createPizza(TipPizza.cheese).descriere();
            PizzaFactory.createPizza(TipPizza.pepperoni).descriere();
            PizzaFactory.createPizza(TipPizza.pepperoni).descriere();
            PizzaFactory.createPizza(TipPizza.vegana).descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        CatFactory catFactory=new CatFactory();
        catFactory.createAnimal().descriere();

        DogFactory dogFactory=new DogFactory();
        dogFactory.createAnimal().descriere();
        dogFactory.createAnimal().descriere();

        GascaFactory gascaFactory=new GascaFactory();
        gascaFactory.createAnimal().descriere();

        WindowsGuiFactory windowsGuiFactory=new WindowsGuiFactory();
        windowsGuiFactory.createButon().descriere();
        windowsGuiFactory.createMenu().descriere();

        MacGuiFactory macGuiFactory=new MacGuiFactory();
        macGuiFactory.createMenu().descriere();
        macGuiFactory.createButon().descriere();
    }
}
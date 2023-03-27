package AbstractFactory;

public class MacGuiFactory implements GuiFactory{
    @Override
    public Buton createButon() {
        return new MacButon();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}

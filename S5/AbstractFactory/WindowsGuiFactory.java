package AbstractFactory;

public class WindowsGuiFactory implements GuiFactory{
    @Override
    public Buton createButon() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}

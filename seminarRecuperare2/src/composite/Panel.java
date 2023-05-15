package composite;

import java.util.ArrayList;
import java.util.List;

//Componenta compozita
public class Panel implements GestiuneComponente{
    private List<Component> componente=new ArrayList<>();

    @Override
    public void adaugaComponenta(Component component) {
        componente.add(component);
    }

    @Override
    public void eliminaComponenta(Component component) {
        componente.remove(component);
    }

    @Override
    public void render() {
        System.out.println("Se afiseaza panoul");
        for(Component component: componente){
            component.render();
        }
    }
}

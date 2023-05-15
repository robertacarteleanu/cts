import composite.*;
import strategy.BuubleSortStrategy;
import strategy.QuickSortStrategy;
import strategy.SortManager;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //composite
        Component buton1=new Button();
        Component buton2=new Button();
        Component campText=new TextField();

        GestiuneComponente panou=new Panel();
        panou.adaugaComponenta(buton1);
        panou.adaugaComponenta(buton2);
        panou.adaugaComponenta(campText);
        panou.render();
        panou.eliminaComponenta(buton2);
        System.out.println("\nDupa stergere:\n");
        panou.render();
        //strategy
        SortManager sortManager=new SortManager();
        int[] array1={5,2,9,1,3};
        sortManager.setSortingStrategy(new QuickSortStrategy());
        sortManager.sortArray(array1);
        System.out.println(Arrays.toString(array1));
    }
}
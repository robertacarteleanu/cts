package strategy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuubleSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        int n=array.length;
        for (int i = 0; i < n-1; i++)
            for (int j=0; j <n-i-1;j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        System.out.println("Array sorted using Bubble Jort strategy.");
        System.out.println(Arrays.toString(array));
    }
}

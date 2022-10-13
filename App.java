import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int arrayLength = 500;
        ArrayList<Double> arrayList = new ArrayList<>(arrayLength);
        Random random = new Random();
        for (int i = 0, i < arrayLength; i ++) {
            arrayList.add(random.nextDouble(bound: 100));
    }        
        System.out.println(Sort.isSorted(arrayList));
        Sort.mergeSort(arrayList);
        System.out.println(Sort.isSorted(arrayList));
    }
}
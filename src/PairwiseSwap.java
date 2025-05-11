import java.util.ArrayList;
import java.util.List;

public class PairwiseSwap {
    public static void main(String[] args) {
        int N = 10;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        System.out.println("Исходный список: " + list);
        swapPairs(list);
        System.out.println("Список после попарной перестановки: " + list);
    }

    // Метод для попарной перестановки элементов списка
    public static void swapPairs(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            // Меняем местами элементы
            int temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        System.out.println("Исходный список:");
        printList(intList);

        reverse(intList);

        System.out.println("Список после перестановки в обратном порядке:");
        printList(intList);
    }

    public static void reverse(List<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            // Меняем местами элементы
            int temp = intList.get(i);
            intList.set(i, intList.get(n - i));
            intList.set(n - i, temp);
        }
    }

    // Метод для вывода списка на экран
    public static void printList(List<Integer> list) {
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

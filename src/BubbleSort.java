public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {5, 2, 9, 1, 5, 6}; // Пример массива для сортировки

        System.out.println("Исходный массив:");
        printArray(intArray);

        bubbleSort(intArray);

        System.out.println("Отсортированный массив:");
        printArray(intArray);
    }

    public static void bubbleSort(int[] intArray) {
        int n = intArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    // Меняем местами элементы
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }

    // Метод для вывода массива на экран
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

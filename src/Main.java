import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validFileCount = 0; // Счетчик верно указанных файлов

        while (true) { // Бесконечный цикл
            System.out.println("Введите путь к файлу");
            String path = scanner.nextLine(); // Считываем путь к файлу

            if (path.equalsIgnoreCase("exit")) { // Условие выхода из цикла
                System.out.println("Выход из программы.");
                break;
            }

            File file = new File(path); // Создаем объект File для указанного пути
            boolean fileExists = file.exists(); // Проверяем, существует ли файл
            boolean isDirectory = file.isDirectory(); // Проверяем, является ли путь директорией

            // Проверяем условия
            if (!fileExists || isDirectory) {
                System.out.println("Указанный файл не существует или это путь к папке.");
                continue;
            } else {
                // Если файл существует и это не директория
                validFileCount++; // Увеличиваем счетчик
                System.out.println("Путь указан верно. Это файл номер " + validFileCount);
            }
        }

        scanner.close();
    }
}





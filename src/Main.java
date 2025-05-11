import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validFileCount = 0; // Счетчик корректных файлов
        while (true) {
            System.out.print("Введите путь к файлу (или 'exit' для выхода): ");
            String path = scanner.nextLine();

            // Проверка на выход из программы
            if (path.equalsIgnoreCase("exit")) {
                break;
            }
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            // Проверка условий
            if (!fileExists || isDirectory) {
                System.out.println("Указанный путь не существует или это папка, а не файл.");
                continue; // Продолжаем цикл
            }

            // Если путь ведет к существующему файлу
            validFileCount++;
                System.out.println("Путь указан верно. Это файл номер " + validFileCount);
                }
            scanner.close(); // Закрываем сканер
            }
        }




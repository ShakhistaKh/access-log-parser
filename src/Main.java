//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Введите первое число:");
//        System.out.println("Введите второе число:");
//        Scanner input = new Scanner(System.in);
//        int x = input.nextInt();
//        int y = input.nextInt();


       int firstNumber = 5;
       int secondNumber = 10;
       double quotient = (double) firstNumber/secondNumber;
       String str1 = "Сума: ";
       String str2 = "Разность: ";
       String str3 = "Произведение: ";
       String str4 = "Частное: ";
       System.out.println(str1+(firstNumber+secondNumber));
       System.out.println(str2+(firstNumber-secondNumber));
       System.out.println(str3+(firstNumber*secondNumber));
       System.out.println(str4+((double)quotient));
    }
}
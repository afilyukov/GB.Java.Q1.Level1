import java.util.Random;
import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        doTask1();
        while (askForContinue()) {
            doTask1();
        }
    }

    private static void doTask1(){
        int number = generateRandom();
        int tryNumber;
        System.out.println(number );
        System.out.println("Вам необходимо отгадать число от 0 до 9. У Вас есть три попытки");
        System.out.println("Число сгенерировано");
        for (int i = 0; i < 3; i++) {
            System.out.println("Оставшихся попыток: " + (3-i));
            tryNumber = askForNumber();
            if (number == tryNumber) {
                System.out.println("Вы угадали!");
                break;
            } else if (number < tryNumber) {
                System.out.println("Вы не угадали, загаданное число меньше введенного!");
            } else if (number > tryNumber) {
                System.out.println("Вы не угадали, загаданное число больше введенного!");
            }
        }
    }

    private static int generateRandom (){
        Random random = new Random();
        int i = random.nextInt(9);
        return i;
    }

    private static int askForNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scanner.nextInt();
        return i;
    }

    private static boolean askForContinue(){
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i==1) {
            return true;
        } else {
            return false;
        }
    }
}

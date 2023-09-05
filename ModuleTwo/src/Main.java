import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    boolean questOne(){
        int firstNum, secondNumber;
        firstNum = random.nextInt(15);
        secondNumber = random.nextInt(15);

        int sum = firstNum + secondNumber;

        System.out.println("Число: " + sum);

        if (sum >= 10){
            if (sum <= 20){
                System.out.println("true");
                return true;
            }
            System.out.println("false");
            return false;
        } else {
            System.out.println("false");
            return false;
        }
    }

    void questTwo(){
        int firstNum = random.nextInt(100) - 50;

        if (firstNum >= 0){
            System.out.println("Положительное число (magic): " + firstNum);
        } else {
            System.out.println("Отрицательные числа (не magic): " + firstNum);
        }
    }

    boolean questThree(){
        int firstNum = random.nextInt(100) - 50;

        System.out.println("Число: " + firstNum);

        if (firstNum < 0){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    void questFour(){
        try {
            System.out.print("Введите строку, которую надо повторити: ");
            String line = scanner.nextLine();

            System.out.print("А тута сколька раза нада написать её: ");
            int number = scanner.nextInt();

            for (int i = 0; i < number; i++){
                int numberLine = i + 1;
                System.out.println(numberLine + ") " + line);
            }
        } catch (InputMismatchException  e){
            System.out.println("\nА теперь заново инвалид!\n");
            questFour();
        }
    }

    boolean questFive(){
        int year = random.nextInt(10000);

        System.out.println("Число которое придумал бог: " + year);

        int number = year % 4;

        if (number == 0){
            System.out.println("Високосный\ntrue");
            return true;
        } else {
            System.out.println("Не високосный\nfalse");
            return false;
        }
    }

    void questSix(){
        int randomLenghtArray = random.nextInt(20);

        int[] array = new int[randomLenghtArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
        }

        System.out.println("Исходный массив:" + Arrays.toString(array));

        for (int k = 0; k < array.length; k++){
            if (array[k] == 0){
                array[k] = 1;
            } else if (array[k] == 1) {
                array[k] = 0;
            } else {
                System.out.println("Я не знаю, помогите!");
            }
        }

        System.out.println("После преобразования массива:" + Arrays.toString(array));
    }

    void questSeven(){
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        System.out.println("Mассив:" + Arrays.toString(array));
    }

    void questEight(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Исходный массив:" + Arrays.toString(array));

        for (int i = 0;i < array.length; i++){
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }

        System.out.println("После преобразования массива:" + Arrays.toString(array));
    }

    void questNine(){
        List<List<Integer>> array = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            List<Integer> secondArray = new ArrayList<>();
            for (int k = 0; k < 10; k++){
                secondArray.add(random.nextInt(10));
            }
            array.add(secondArray);
        }

        for (List<Integer> integers : array){
            System.out.println(integers);
        }

        System.out.println();

        for (int i = 0; i < array.size(); i++){
            for (int k = 0; k <= array.get(i).size(); k++){
                if (i == k){
                    array.get(i).set(k, 1);
                }
            }
        }

        for (List<Integer> integers : array){
            System.out.println(integers);
        }
    }

    void questTen(){
        int len, initialValue;
        len = random.nextInt(20);
        initialValue = random.nextInt(19);

        int array[] = new int[len];

        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }

        System.out.println("Массив: " + Arrays.toString(array));
    }

    void run(){
        questOne();
        System.out.println();
        questTwo();
        System.out.println();
        questThree();
        System.out.println();
        questFour();
        System.out.println();
        questFive();
        System.out.println();
        questSix();
        System.out.println();
        questSeven();
        System.out.println();
        questEight();
        System.out.println();
        questNine();
        System.out.println();
        questTen();
    }
}
package exercise1;

import java.util.Scanner;

public class MyNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        String number1 = input.nextLine();
        System.out.println("Podaj drugą liczbę");
        String number2 = input.nextLine();

        Integer integer1 = Integer.valueOf(number1);
        Integer integer2 = Integer.valueOf(number2);

        int i1 = integer1;
        int i2 = integer2;

        System.out.println(i1 + " + " + i2 + " = " + (i1 + i2));

    }
}

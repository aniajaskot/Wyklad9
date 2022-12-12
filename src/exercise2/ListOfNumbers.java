package exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers {
    public static void main(String[] args) {
        List<Double> list = createList(5);

        printReversedList(list);

        sumEvenElements(list);

        multiplyOddElements(list);

        printMaxElement(list);
    }

    private static void printMaxElement(List<Double> list) {
        double max = Double.MIN_VALUE;
        for(Double element : list){
            if(max < element){
                max = element;
            }
        }
        System.out.println(max);
    }

    private static void multiplyOddElements(List<Double> list) {
        double multi = 1;
        for(int i = 1; i< list.size(); i+=2){
            multi *= list.get(i);
        }
        System.out.println(multi);
    }

    private static void sumEvenElements(List<Double> list) {
        double sum =0;
        for (int i = 0; i < list.size(); i+=2){
            sum += list.get(i);
        }
        System.out.println(sum);
    }

    private static void printReversedList(List<Double> list) {
        for(int i = list.size()-1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }

    private static List<Double> createList(int size) {
        Scanner input = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            System.out.println("Podaj liczbe");
            list.add(input.nextDouble());
        }
        return list;
    }
}

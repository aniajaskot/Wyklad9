package exercise3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Podaj napis");
            String next = input.nextLine();
            set.add(next);
        }

        System.out.println("Liczba unikalnych napisów " + set.size());
        for(String element : set){
            System.out.println(element);
        }
    }
}

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ar[] = new int[15];
        Random random = new Random();
        int result=0;
        int minimum = 20;
        int maximum = -20;
        for (int i=0; i <15; i++){
            result = ((int)(Math.random()*41)-20);
            ar[i]=result;
            System.out.println (ar[i]);
            maximum = Math.max(maximum, ar[i]);
            minimum = Math.min(minimum, ar[i]);
        }

        System.out.println ("Максимальный элемент: " + maximum);
        System.out.println ("Минимальный элемент: " + minimum);
        System.out.println ("Наибольший элемент по модулю: " + Math.max(Math.abs(maximum),Math.abs(minimum)));


    }
}
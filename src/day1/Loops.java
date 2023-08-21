package day1;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {




        for (int i = 0; i <=20 ; i++) {
            System.out.println("United Kingdom " + i);
        }

        System.out.println("------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1~5: ");

        int num =  input.nextInt();

        while (num >5 || num < 1) {
            System.out.println("Invalid entry, insert a number between 1~5: ");
            num = input.nextInt();
        }

        System.out.println("You have selected: "+num);




    }
}

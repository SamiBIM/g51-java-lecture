package se.lexicon.sami;

import java.util.Date;
import java.util.Scanner;

public class Currencyconverter2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Currency converter app");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");
        int user = input.nextInt();
        Date now = new Date();


        while (user != 0) {


            if (user == 1){
                System.out.println("Please enter amount in SEK");
            double SEK = input.nextInt();
            double USD = SEK * 0.09524683;
                System.out.println("The Kronor amount of " + SEK + " = " + USD + " USD "+ now);
            break;
            }

        else if (user == 2){
                System.out.println("Please enter amount in USD");
            double USD = input.nextInt();
            double SEK = USD * 10.499152;
                System.out.println("The USD amount of " + USD + " = " + SEK + " Kronor "+ now);
                break;
        }
            else if (user == 3) {
                System.out.println("Please enter amount in SEK");
                double SEK = input.nextInt();
                double Euro = SEK * 0.088680857;
                System.out.println("The Kronor amount of " + SEK + " = " + Euro + " Euro "+ now);
                break;
            }
            else if (user == 4) {
                System.out.println("Please enter amount in Euro");
                double Euro = input.nextInt();
                double SEK = Euro * 11.275824;
                System.out.println("The Euro amount of " + Euro + " = " + SEK + " kronor "+ now);
                break;
            }
        else {
                System.out.println("Invalid entry");
                break;
            }

        }

    }
}
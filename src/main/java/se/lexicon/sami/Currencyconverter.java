package se.lexicon.sami;


import java.util.Scanner;

public class Currencyconverter {

    public static void main(String[] args) {
        double sek = 1000;
        double exchangeRate = 0.095279858;
        System.out.println("The kronor amount:" + sek + " = " +sek * exchangeRate+" USD ");
    }
}
       /* displayMenu();
        Scanner scanner = new Scanner(System.in);
        double conversion = scanner.nextInt();
        int choice = scanner.nextInt();
        System.out.println("Enter the amount");
        double amount = scanner.nextDouble();

//for converting currencies
        switch (conversion){

            case 1:
                SEK to USD(amount);
                  break;
            case 2:
                USD to SEK(amount);
                break;
            case 3:
                SEK to Euro(amount);
                break;
            case 4:
                Euro to SEK(amount);
                break;
            default:
                System.out.println("Invalid entry, Please choose from the listed operations");
        }
        //System.out.println(conversion);





    }

    public static void displayMenu() {
        System.out.println("Select a currency");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");


    }

    public static void main(double.amt) {

    }


    }
*/
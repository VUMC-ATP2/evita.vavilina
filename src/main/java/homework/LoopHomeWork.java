package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        System.out.println("\n----- Task 1 -----");
        int inputSum = 0;
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter an integer number separated with 'Enter': ");

        while (inputSum <= 100){
            int number = numbers.nextInt();
            inputSum += number;
        }
        System.out.printf("Ready! The sum is %d!", inputSum);
//------------------------------------------------------------------------------------
        System.out.println("\n----- Task 2 -----");
        Scanner number = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int numberToCheck = number.nextInt();

        if (numberToCheck % 2 == 0){
            System.out.printf("Number '%d' is a prime number!", numberToCheck);
        } else {
            System.out.printf("Number '%d' is not a prime number!", numberToCheck);
        }
//------------------------------------------------------------------------------------
        System.out.println("\n----- Task 3 -----");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] stringArray = {"January", "February", "March", "April", "May"};
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};

        int sizeIntArray = intArray.length;
        int sizeStringArray = stringArray.length;
        int sizeCharArray = charArray.length;

        System.out.println("\n----- Task 3 (a. while) -----");
        int i = 0;
        while (i < sizeIntArray) {
            System.out.println(intArray[i]);
            i++;
        }
        i = 0;
        while (i < sizeStringArray) {
            System.out.println(stringArray[i]);
            i++;
        }
        i = 0;
        while (i < sizeCharArray) {
            System.out.println(charArray[i]);
            i++;
        }

        System.out.println("\n----- Task 3 (b. do while) -----");
        i = 0;
        do {
            System.out.println(intArray[i]);
            i++;
        } while (i < sizeIntArray);
        i = 0;
        do {
            System.out.println(stringArray[i]);
            i++;
        } while (i < sizeStringArray);
        i = 0;
        do {
            System.out.println(charArray[i]);
            i++;
        } while (i < sizeCharArray);

        System.out.println("\n----- Task 3 (c. for) -----");
        for (i = 0; i < sizeIntArray; i++) {
            System.out.println(intArray[i]);
        }
        for (i = 0; i < sizeStringArray; i++) {
            System.out.println(stringArray[i]);
        }
        for (i = 0; i < sizeCharArray; i++) {
            System.out.println(charArray[i]);
        }

        System.out.println("\n----- Task 3 (d. for each) -----");
        for (int j : intArray){
            System.out.println(j);
        }
        for (String j : stringArray){
            System.out.println(j);
        }
        for (char j : charArray){
            System.out.println(j);
        }
//------------------------------------------------------------------------------------
        System.out.println("\n----- Task 4 -----");
        int[] bigArray = new int[100];
        int j = 0;
        i = 0;

        while (i < bigArray.length) {
            if (j % 2 == 0) {
                bigArray[i] = j;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(bigArray));
//------------------------------------------------------------------------------------
        System.out.println("\n----- Task 5 -----");
        Scanner parameter = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int product = parameter.nextInt();

        for (int l = product-1; l > 0; l--) {
            product *= l;
        }
        System.out.printf("Factorial is %d", product);
//------------------------------------------------------------------------------------
        System.out.println("\n----- Task 6 -----");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter PIN (4 digits): ");
        final int correctPin = 1234;
        int  pinTries = 0;

        while (pinTries < 4) {
            pinTries++;
            int pin = userInput.nextInt();
            if (pin == correctPin) {
                System.out.println("PIN accepted, welcome back!");
                break;
            } else if (pinTries == 3) {
                System.out.println("Sorry, but you are blocked!");
            } else {
                System.out.printf("Wrong PIN, try again!\nNumber of tries left: %d\n", (3-pinTries));
            }
        }
    }
}

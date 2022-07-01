package homeworkTwo;

import java.util.Scanner;
import java.lang.Math;

public class HomeWorkTwo {
    public static void main(String[] args) {

        System.out.println("\n----- Task 1 -----");
        int x = 6;
        System.out.printf("x > 0: %b\n", x > 0);
        System.out.printf("x < 0: %b\n", x < 0);
        System.out.printf("5 < x <= 10: %b\n", 5 < x && x <= 10);
        System.out.printf("5 !>= x && x < 10: %b\n", !(5 >= x) && (x < 10));
        System.out.printf("0 = x || x = 10: %b\n", (0 == x) || (x == 10));
        System.out.printf("x*x > 10: %b\n", (x * x > 10));

        System.out.println("\n----- Task 2 -----");
        Scanner months = new Scanner(System.in);
        System.out.println("Enter a month number 1-12: ");
        int month = months.nextInt();
        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Not a month number!";
        };
        System.out.println(monthString);

        System.out.println("\n----- Task 3 -----");
        Scanner numbers = new Scanner(System.in);
        System.out.println("The biggest number!\nEnter three numbers separated with 'Enter': ");
        int numberOne = numbers.nextInt();
        int numberTwo = numbers.nextInt();
        int numberThree = numbers.nextInt();
        int biggestNumber;

        if (Math.max(numberOne, numberTwo) > numberThree) {
            biggestNumber = Math.max(numberOne, numberTwo);
        } else {
            biggestNumber = numberThree;
        }
        System.out.printf("The biggest number is: %d", biggestNumber);

        System.out.println("\n----- Task 4 -----");
        Scanner colorIn = new Scanner(System.in);
        System.out.println("Traffic lights!\nEnter color (Green, Yellow, Red): ");
        String color = colorIn.next();

        if (color.equals("Green")) {
            System.out.println("Walk");
        } else if (color.equals("Yellow") || color.equals("Red")) {
            System.out.println("Wait");
        } else {
            System.out.println("Traffic lights out of order! Look to your right and left! Pass the street if it is safe!");
        }

        System.out.println("\n----- Task 5 -----");
        for (int i = 0; i < 3; i++) {
            printBusinessCard();
        }

        System.out.println("\n----- Task 6 -----");
        printBusinessCardTwo("Spring", "Arrived", "+371 987654", 1999);
        printBusinessCardTwo("Flowers", "Blooming", "+371 987654", 1999);

        System.out.println("\n----- Task 7 -----");
        int sumOfTwo = addTwoNumbers(3, 5);
        System.out.printf("Sum of 3 and 5 is: %d", sumOfTwo);

        System.out.println("\n----- Task 8 -----");
        System.out.printf("Average of 23.5, 33.2 and 5.1 is: %.3f", average(23.5, 33.2, 5.1));
    }

    public static void printBusinessCard() {
        String businessCard = """
                Business Card
                ##################
                Name: Sweet
                Surname: Glory
                Phone: +012 3456789
                Birth year: 2000
                ##################
                """;
        System.out.println(businessCard);
    }

    public static void printBusinessCardTwo(String name, String surname, String phone, int birthYear) {
        String businessCard = """
                Business Card
                ##################
                Name: %s
                Surname: %s
                Phone: %s
                Birth year: %d
                ##################
                """.formatted(name, surname, phone, birthYear);
        System.out.println(businessCard);
    }

    public static int addTwoNumbers(int numberOne, int numberTwo) {
        int sumOfTwo = numberOne + numberTwo;
        return sumOfTwo;
    }

    public static double average(double numberOne, double numberTwo, double numberThree) {
        double average = (numberOne + numberTwo + numberThree) / 3;
        return average;
    }
}
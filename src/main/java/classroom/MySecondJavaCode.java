package classroom;

import java.util.Scanner;

public class MySecondJavaCode {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number 1-7: ");
        int day = scanner.nextInt();
        String dayString = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Dunno";
        };
        System.out.println(dayString);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        boolean even = number % 2 == 0;
        if (even) {
            System.out.printf("%d is even number", number);
        } else {
            System.out.printf("%d is odd number", number);
        }




//        int userAge;
//        System.out.println("Enter your age: ");
//        userAge = scanner.nextInt();
//        if (userAge < 18) {
//            System.out.printf("You are not allowed to take part in elections!");
//        } else {
//            System.out.println("You are mature enough to vote!");
//        }


    }

//    String month = "March";
//    var result = switch(month){
//        case "December" > "Winter";
//        default "Don't know";
//
//    }
}

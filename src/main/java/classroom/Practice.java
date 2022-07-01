package classroom;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number:");
        int inputResult = scanner.nextInt();
        if(inputResult > 0) {
            System.out.println("Number is > 0 which is: " + inputResult);
        }
    }
}

package homework;
import java.util.*;

public class FirstClass {

    public static void main(String[] args) {
        //Country variables
        System.out.println("\n----- Country variables -----");
        String country = "Germany";
        System.out.println("Country: " + country);
        String capital = "Berlin";
        System.out.println("Capital: " + capital);
        String officialLanguage = "German";
        System.out.println("Official language: " + officialLanguage);
        int population = 83190556;
        System.out.println("Population: " + population);
        int area = 357022;
        System.out.println("Area: " + area + " km^2");
        boolean memberOfEuropeanUnion = true;
        System.out.println("Member of European Union: : " + memberOfEuropeanUnion);
        // Getting the symbol of the currency EUR
        Currency eur = Currency.getInstance("EUR");
        String eurSymbol = eur.getSymbol();
        System.out.println("Currency: " + eurSymbol);

        //Concatenation
        System.out.println("\n----- Concatenation -----");
        System.out.println("By size, " + country +
                " Germany is the seventh-largest European country. It covers an area of " + area +
                " km^2 (137847 sq mi).");
        System.out.printf("The capital %s is located in the East of %s.", capital, country);

        //Arithmetic operators
        System.out.println("\n----- Arithmetic operators I -----");
        int x = 3;
        int y = 2;
        int addXY = x + y;
        int subtractXY = addXY - y;
        int multiplyXY = subtractXY * subtractXY;
        int divideXY = multiplyXY / x;
        int modulusXY = divideXY % 2;
        System.out.println("Modulus of " + divideXY + " % 2 is " + modulusXY + ".");

        System.out.println("\n----- Arithmetic operators II -----");
        double a = 3.65;
        double b = 6.35;
        double c = 5.00;
        double add = a + b;
        double subtract = add - c;
        double multiply = subtract * c;
        double divide = multiply / 5;
        double modulus = divide % 3;
        System.out.println("Modulus of " + divide + " % 3 is " + modulus + ".");

        System.out.println("\n----- Arithmetic operators II -----");
        int i = 3;
        double j = 6.35;
        double addIJ = i + j;
        double subtractIJ = addIJ - j;
        double multiplyIJ = subtractIJ * subtractIJ;
        double divideIJ = multiplyIJ / 2;
        double modulusIJ = divideIJ % 2;
        System.out.println("Modulus of " + divideIJ + " % 3 is " + modulusIJ + ".");
    }
}

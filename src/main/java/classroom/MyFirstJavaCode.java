package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {
        byte floorCount = 3;
        System.out.println("My house has " + floorCount + " floors");
        System.out.printf("My house has %d floors\n", floorCount);
        //%d - numbers, %s - string, % - boolean
        short salaryInEur = 1000;
        System.out.println(salaryInEur);
        System.out.println(1222);

        System.out.printf("Average salary for Junior QA Enginerr is: %d\n", salaryInEur);

        int chinaPopulation = 123445567;
        long currentWorldPopulation = 345666666;
        System.out.printf("Current world population: %d. Meanwhile china population: %d", currentWorldPopulation, chinaPopulation);

        // floating numbers
        float myCurrentWeight = 90.9f;
        System.out.println(myCurrentWeight);

        double gasPriceEur = 1.99d;
        System.out.println(gasPriceEur);

        char firstLetterOfMyName = 'E';

        String myName = "Evita";
        System.out.println(myName);

        String mySent = "Hello, my name is Evita. I am a human.";
        String mySecondSent = "I like birds.";
        System.out.println(mySent);
        System.out.println(mySent + mySecondSent);
        System.out.println(mySent + " " + mySecondSent);
        System.out.printf("%s %s\n", mySent, mySecondSent);

        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSummer);
        System.out.println(isSpring);

        if (isSummer){
            System.out.println("Yes, it is Summer");
        }
        else{
            System.out.println("No, it is not Summer");
        }

        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);

        boolean isGreaterThan = a > b;
        System.out.println(isGreaterThan);
    }
}

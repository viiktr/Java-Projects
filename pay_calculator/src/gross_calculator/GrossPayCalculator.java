package gross_calculator;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        //Hours worked
        int hours = 0;
        System.out.println("How many hours did you work? ");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        //Hourly pay rate
        double payRate = 0;
        System.out.println("What is your hourly rate? ");
        payRate = scanner.nextDouble();
        scanner.close();
        //Multiplicating them
        double grosspay = hours*payRate;
        //Final result
        System.out.println("Your gross pay is " + grosspay);
    }
}

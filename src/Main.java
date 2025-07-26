import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello Saif");
        System.out.println("How old are you?");
        byte age = 127;
        String message = "I'm "+ age+" old.";
        System.out.println(message);

        System.out.println("Hello \"Saif\" \thow are \nyou?");
        int[][] myTickets = { {1,2},{17,14}} ;
        System.out.println(Arrays.deepToString((myTickets)));
        final float PI = 3.14F;
        float magicNumber = age / (int)PI;
        System.out.println(PI);
        System.out.println(++age);
        System.out.println(magicNumber);

//        Mortgage Calculator
        System.out.println("Welcome to Mortage Calculator");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        int principalAmt = scan.nextInt();
        int MONTHS = 12;
        int PERCENTAGE = 100;
        System.out.print("Enter Interst Rate: ");
        float interstRate = scan.nextFloat();
        interstRate  = interstRate / MONTHS / PERCENTAGE;
        System.out.print("Enter Period (Years): ");
        int periodYear = scan.nextInt();
        int n = periodYear * MONTHS;

        double total = principalAmt * (interstRate * Math.pow(1+ interstRate,n)) / Math.pow(1+interstRate, n)- 1;
        String result = NumberFormat.getCurrencyInstance().format(total);
        System.out.println("Computed Value is: "+ result);
    }
}
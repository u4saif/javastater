import java.util.Arrays;

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
    }
}
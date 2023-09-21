import java.util.Scanner;
public class MunizTipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How man people are seated? ");
        int tablenumber = scan.nextInt();
        System.out.println(tablenumber + " people? Got it.");
        double billbftip = 0;

        System.out.println("How much tip percent? ");
        double tippercent = scan.nextDouble();
    }
}

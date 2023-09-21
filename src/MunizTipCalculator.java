import java.util.Scanner;
public class MunizTipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How man people are seated? ");
        int tablenumber = scan.nextInt();
        System.out.println(tablenumber + " people? Got it.");
        double billbftip = 0;
        int orderstaken = 0;
        while (orderstaken != tablenumber) {
            System.out.println("How much is what you want?");
            billbftip = billbftip + scan.nextDouble(); //adds to the total amount
            orderstaken ++; //will eventually add up to the anmount of people at the table
        }
        billbftip --;
        System.out.println("Your bill before tip is " + billbftip);
        System.out.println("How much tip percent? ");
        double tippercent = scan.nextDouble();
        double billaftertip = billbftip + (billbftip/100 * tippercent);
        System.out.println("The tip is " + (billbftip/100 * tippercent));
        System.out.println("Your bill after tip is " + billaftertip);
        System.out.println("Heres your complimentary peas");
    }
}

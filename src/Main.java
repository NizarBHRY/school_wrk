import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("|Don't use any symbols when inputting data (No % or $)|");
        System.out.println("-------------------------------");
        System.out.print("Enter your bill amount($): ");
        String in1 = scanner.nextLine();
        System.out.print("Tip percent: ");
        String in2 = scanner.nextLine();
        System.out.print("Number of People: ");
        String in3 = scanner.nextLine();
        System.out.println("");

        //math stuff
        double money = Double.parseDouble(in1);
        int tip = Integer.parseInt(in2);
        int people = Integer.parseInt(in3);
        double total_tip = (double) tip/100 * money;
        double total_bill = money + total_tip;
        double tip_per_person = total_tip/people;
        double total_per_person = (money/people) +tip_per_person;

        //convert to 2 deci place
        total_tip =  ((int) ((total_tip*100) +.5)/100.0);
        total_bill =  ((int) ((total_bill*100) +.5)/100.0);
        tip_per_person =  ((int) ((tip_per_person*100) +.5)/100.0);
        total_per_person =  ((int)((total_per_person*100)+.5) /100.0);

        // printing reciept
        System.out.println("-------------------------------");
        System.out.println("|Total tip amount: $"+ total_tip + "       |");
        System.out.println("-------------------------------");
        System.out.println("|Total bill cost: $"+ total_bill + "      |");
        System.out.println("-------------------------------");
        System.out.println("|Tip per person: $"+ tip_per_person + "        |");
        System.out.println("-------------------------------");
        System.out.println("|Total bill per person: $"+ total_per_person + " |");
        System.out.println("-------------------------------");
    }
}



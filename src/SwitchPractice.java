import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String monthGroup;
        while (true) {
            System.out.println("Enter number of Days: ");
            int dayCount = key.nextInt();
            key.nextLine();


            switch (dayCount) {
                case 30:
                    monthGroup = "September, April, June, and November";
                    break;
                case 31:
                    monthGroup = "January, March, May, July, August, October, and December";
                    break;
                case 28:
                    monthGroup = "February most of the time";
                    break;
                case 29:
                    monthGroup = "Sometimes February";
                    break;
                default:
                    monthGroup = "Learn your Months!!! \tNo Months have " + dayCount + " days!!!";
                    break;

            }
            System.out.println(monthGroup);
            System.out.println("\n\nDo you want to try again : ");
            String answer = key.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("\n\n");
            }
            else {
                System.out.println("GoodBye");
                break;
            }

        }
    }
}

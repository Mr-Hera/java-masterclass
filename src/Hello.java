import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int count = 1;
        int firstRun = 0;
        int min = 0;
        int max = 0;

        Scanner scanner = new Scanner(System.in);

        while(count != 0) {
            System.out.println("Enter any number or a character to exit: ");
            String nextNumber = scanner.nextLine();

            try{
                int number = Integer.parseInt(nextNumber);
                if(firstRun == 0) {
                    min = number;
                    max = number;
                    firstRun++;
                }
                if(number < min) {
                    min = number;
                }
                if(number > max) {
                    max = number;
                }
            } catch(NumberFormatException nfe) {
                System.out.println("Exiting...");
                break;
            }
        }

        System.out.println("Min = " + min + " & Max = " + max);
    }

}
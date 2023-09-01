import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int count = 1;
//        int sum = 0;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);

        while(count <= 5) {
            System.out.println("Enter number #" + count + ": ");
            String nextNumber = scanner.nextLine();
            try{
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                count++;
                sum += number;
            } catch(NumberFormatException nfe) {
                System.out.println("Invalid Number!");
            }
        }

        System.out.println("Sum of the 5 numbers = " + sum);
    }

}
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("> top score & < 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are ture");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is true");
        }

        String makeOfCar = "BMW";
        boolean isDomestic = makeOfCar == "BMW" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country.");
        }

        String s = (isDomestic) ? "This car is domestic." : "This car is not domestic.";

        System.out.println(s);

        double num1 = 20.00;
        double num2 = 80.00;
        double result = (double) (num1 + num2) * 100.00;
        System.out.println("Double result is = " + result);
        double remainder = (double) result % 40.00;
        System.out.println("Double remainder is = " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}

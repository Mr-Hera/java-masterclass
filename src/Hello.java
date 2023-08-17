public class Hello {
    public static void main(String[] args) {
//        For Loop
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(170) ? "" : "NOT ") + "a prime number");

        System.out.println("primeCounter tracked " + primeCounter() + " prime numbers!");
        System.out.println("Sum of numbers that met challenge conditions = " + forChallenge());
    }

    public static boolean isPrime(int wholeNumber) {
        if(wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for(int divisor = 2; divisor < wholeNumber/2; divisor++) {
            if(wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primeCounter() {
        int counter = 0;

        for(int i = 952; i < 1000; i++) {
            boolean pass = isPrime(i);
            if(pass && (counter < 3)) {
                System.out.println(i);
                counter += 1;
            }
        }
        return counter;
    }

    public static int forChallenge() {
        int totalSum = 0;
        int counter = 0;
        for(int num = 1; num <= 1000; num++) {
            if((num % 3 == 0) && (num % 5 == 0) && (counter < 5)) {
                counter += 1;
                totalSum += num;
                System.out.println(totalSum + " has met all conditions!");
            }
        }
        return totalSum;
    }
}
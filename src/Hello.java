public class Hello {
    public static void main(String[] args) {
//        while Loop
        System.out.println("Sum of digits in 1234 => " + sumDigits(1234));
        System.out.println("Sum of digits in -125 => " + sumDigits(-125));
        System.out.println("Sum of digits in 4 => " + sumDigits(4));
        System.out.println("Sum of digits in 32123 => " + sumDigits(32123));
    }

    public static int sumDigits(int number) {
        int total = 0;
        if(number < 0) {
            return -1;
        }
        while (number > 9) {
            total += number % 10;
            number = number / 10;
        }

        total += number;
        return total;
    }
}
public class Hello {

    public static void main(String[] args) {

        System.out.println("6ft 2in = " + convertToCentimeters(6, 2) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        int totalInches = (int) ((feet * 12) + inches);

        return convertToCentimeters(totalInches);
    }

}

public class Hello {
    public static void main(String[] args) {
//        while Loop
        int currentYear = 2023;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name?: ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dob = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dob);
        return "So you're " + age + " years old...";
    }

    public static String getInputFromScanner(int currentYear) {
        return "";
    }

}
public class Hello {
    public static void main(String[] args) {
        int value = 3;
//        switch(value) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was 3-4");
//                break;
//            default:
//                System.out.println("Value was neither!");
//        }

//        switch(value) {
//            case 1 -> System.out.println("Value was 1");
//            case 2 -> System.out.println("Value was 2");
//            case 3, 4, 5 -> {
//                System.out.println("Value was 3, 4 or 5");
//                System.out.println("Value was -> " + value);
//            }
//            default -> System.out.println("Value was none!");
//        }
        int charValue = 4;
        System.out.println(charValue + " = " + getCharacter(charValue));

    }
    public static String getCharacter(int character) {
        return switch(character) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                yield " is a Bad Request!";
            }
        };
    }
}
public class Hello {
    public static void main(String[] args) {
//        while Loop
        int i = 4;
        int evens = 0;
        int odds = 0;

//        while(i <= 20) {
//            i++;
//            if(!isEvenNumber(i)) {
//                odds++;
//                continue;
//            }
//            evens++;
//            System.out.println(i + " is an Even number!");
//            if(evens >= 5) {
//                break;
//            }
//        }
        while(i <= 20) {
            i++;
            if (isEvenNumber(i) && evens < 5) {
                evens++;
                System.out.println(i + " is an Even number!");
                if(!isEvenNumber(i+1)){
                    System.out.println("Odd => " + (i + 1));
                    odds++;
                }
            }
        }
        System.out.println("Total even nums = " + evens);
        System.out.println("Total odd nums = " + odds);
    }

    public static boolean isEvenNumber(int num) {
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }
}
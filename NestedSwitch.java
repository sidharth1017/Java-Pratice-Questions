import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iD = sc.nextInt();
        String name = sc.next();


          //Normal Syntax of Nested Switch Case
//        switch (iD){
//            case 1:
//                System.out.println("Sidharth");
//                break;
//            case 2:
//                System.out.println("Jai");
//                break;
//            case 3:
//                switch (name){
//                    case "Sidharth":
//                        System.out.println("He is FullStack Developer");
//                        break;
//                    case "jai":
//                        System.out.println("He is Graphic Designer");
//                        break;
//                    default:
//                        System.out.println("Enter Correct Name");
//                }
//                break;
//            default:
//                System.out.println("Enter Correct iD");
//        }

        // Enhanced Syntax of nested Switch Cases
        switch (iD) {
            case 1 -> System.out.println("Sidharth");
            case 2 -> System.out.println("Jai");
            case 3 -> {
                System.out.println("iD no 3");
                switch (name) {
                    case "Sidharth" -> System.out.println("He is FullStack Developer");
                    case "jai" -> System.out.println("He is Graphic Designer");
                    default -> System.out.println("Enter Correct Name");
                }
            }
            default -> System.out.println("Enter Correct iD");
        }

    }

}

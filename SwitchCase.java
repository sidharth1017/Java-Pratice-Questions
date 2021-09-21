import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fruit");
        String Fruit = sc.next();

        //Syntax for normal Switch Cases

//        switch(Fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("Its sweet and round fruit");
//                break;
//            case "Kiwi":
//                System.out.println("It's green in colour");
//                break;
//            default:
//                System.out.println("Enter a valid Fruit");
//        }

        //Syntax for Enhanced Switch Cases
        switch (Fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Its sweet and round fruit");
            case "Kiwi" -> System.out.println("It's green in colour");
            default -> System.out.println("Enter a valid Fruit");
        }

    }
}

import java.util.Scanner;

public class Fibo{ //Program for Fibonacci number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // This will take input and give fibonacci number
        int a = 0;
        int b = 1;
        int count = 2;

        while( count <= n ){  // While loop will run till the given input
            int temp = b;     // Initialise a Temporary variable in place of b
            b += a;           // This will add the Number in a to b
            a = temp;         // This will store current index to previous index
            count++;
        }
        System.out.println(b);

    }
}
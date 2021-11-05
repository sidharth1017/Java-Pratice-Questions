public class isArmstrong {
    public static void main(String[] args) {
        System.out.println(armstrong(370));
    }
    static boolean armstrong(int n){
        int real = n;
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == real;
    }
}

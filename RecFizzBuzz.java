import java.util.Scanner;

public class RecFizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int n = input.nextInt();
        recfizzbuzz(n);
    }
    public static void recfizzbuzz(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        String res = "";
        if(n%3==0)res+="Fizz";
        if(n%5==0)res+="Buzz";
        if(res=="")res+=n;
        recfizzbuzz(n-1);
        System.out.println(res);
    }
}

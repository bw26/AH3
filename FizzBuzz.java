import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int n = input.nextInt();
        fizzbuzz(n);
    }
    public static void fizzbuzz(int n){
        for(int i = 1; i<=n;i++){
            String res = "";
            if(i%3==0)res+="Fizz";
            if(i%5==0)res+="Buzz";
            if(res=="")res+=i;
            System.out.println(res);
        }
    }
}

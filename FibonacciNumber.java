import java.util.*;
public class FibonacciNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int i = 1;
        while(i<=n){
            int third = firstNumber+ secondNumber;
            System.out.println(firstNumber);
            firstNumber = secondNumber;
            secondNumber=third;
            i++;
        }
        sc.close();
    }
}
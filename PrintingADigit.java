import java.util.*;
public class PrintingADigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copyOfNum = n;
        int temp = 1;
        while(copyOfNum > 9 ){
            copyOfNum = copyOfNum/10;
            temp = temp*10;
        }
        // System.out.print(temp);
        while(temp != 0){
            int digit = n/temp;
            System.out.println(digit);
            n = n % temp;
            temp = temp/10;
        }
        sc.close();
    }
    
}

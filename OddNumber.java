//WE have to find odd numbers between 1 to 10
import java.util.*;
public class OddNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1 ; i<=number; i = i+2){
            System.out.println(i);
        }
    }
    
}

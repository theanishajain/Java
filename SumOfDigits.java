// import java.util.*;
// public class SumOfDigits{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0; 
//         for(int i = 1 ; i<=n; i++){
//             sum = sum + i;
        
//         }
//         System.out.println(sum);
//     }

// }


//IMPROVED CODE WITH THE HELP OF FORMULA
import java.util.*;
public class SumOfDigits{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum = (n*(n+1))/2;
       System.out.println(sum);
    }
}
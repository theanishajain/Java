
//*****
// ****
//  ***
//   **
//    *
import java.util.*;
public class Pattern3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int row=n; row>=0; row--){
            int nsp = n-row;
            int nst = row;
            for(int i = 1; i<=nsp; i++){
                System.out.print(" ");
            }
            for(int i = 1 ; i <= nst; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

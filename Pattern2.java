import java.util.*;
public class Pattern2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int row=1; row<=n; row++){
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
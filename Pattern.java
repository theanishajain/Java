import java.util.*;

public class Pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("hello world");
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// import java.util.*;
// public class Pattern
// {
// 	public static void main(String[] args) {
// 		System.out.println("Hello World");
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		for(int row=1 ; row<= n; row++){
// 		    int nst=(n+1)-row;
// 		    for(int j=1 ; j<=nst;j++){
// 		    System.out.print("*");
// 		}
// 		System.out.println();
// 	}
// 	sc.close();
// 	}
// }
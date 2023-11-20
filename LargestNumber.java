//Code to find the largest number among three inputs/values
import java.util.*;
public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc .nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a + " is the greatest");

            }
            else
            {
                System.out.println(c + " is the greatesto");
            }

        }
        else if (b>c)
        
        {
            System.out.println(b +" is the greatest");
        }
         else
         {
            System.out.println(c +" is the greatest");
         }

    }
    
}

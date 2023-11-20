import java.util.*;
public class PrintingTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       
       for(int i = 1; i<=10; i++)
       {
        int table = number *i;
        System.out.println(table);
       }
    }
    
}

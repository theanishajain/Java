// import java.util.*;
// public class PrimeNumber {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int flag = 1; // assuming our given number is prime and cannot be factorized by any number 
//         //We do not need to check if the number is divisible by 1 or it's own value
//         for(int i = 2 ; i<=(number-1); i++){
//             if(number%i==0){
//                 flag=0;//if we find a number which can divide our given number then our number is not prime so set flaf as zer0
//                  break;
//             }

//         }
//         if(flag==1){
//             System.out.println("The number is prime " + number);
//         }
//         else{
//             System.out.println("The given number is not prime " + number);
//         }

//     }
    
// }

//To optimize this code we all know that only the half of the number can divide the actual number
//for eg. if the no. is 10 then only till 5 it will be divided
//for eg. if the no. is 70 then only till 35 it can be divided ...36 can never divide 70 


//ONE MORE THING 
// 27    &&      38
// possible factors of 27 are 1* 27 , 27 * 1; 3*9 , 9*3;
// possible factors of 38 are 1* 38 , 38 *1; 2* 19, 19*2, 


//First code we wrote was 2 to n-1
//Second code we wrote was 2 to n/2;
//Third code we are about to write is initializing from 2 but ending on the squt(n)
//to find sqrt of n we will do the squaring on both side
//  i * i <= n; 

import java.util.*;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++)
        {
        int number = sc.nextInt();
        int flag =1;
        for(int j = 2; j*j <= number ; j++){
            if(number%j==0){
            flag = 0;}
         }
        if(flag==1){
            System.out.println("The number is prime " + number);
 
        }
          else{
             System.out.println("The given number is not prime " + number);
         }
        }
          sc.close();

    }
   
}






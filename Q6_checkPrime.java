
// Q : Check whether the entered number is prime or not

import java.util.Scanner;

class Q6_checkPrime{

public static void main(String args[]){

        int num;
        boolean check = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = scan.nextInt();

        for(int i=2; i<=num-1; i++)
        {
            if (num%i==0)
            {
                check = false;
            }
        }
        if(check)
            System.out.println(num + " is a prime number ");
        else
            System.out.println(num + " is not a prime number ");


 }

}


/* OUTPUT 


Enter the number : 99
99 is not a prime number 


Enter the number : 5
5 is a prime number 

*/

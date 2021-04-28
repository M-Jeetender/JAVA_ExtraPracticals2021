
// Q2. Find a factorial of a number

import java.util.Scanner;

 class Q2_Factorial {

    public static void main(String args[]){

    int fact=1,num;

     Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number to find its factorial : ");
    num=scan.nextInt();
       
    for(int i=1;i<=num;i++){
            fact*=i;
        }
System.out.println("Factorial of " + num + " is : " + fact);
       
     }
}

/*

OUTPUT 

C:\Java\Q2_Factorial>java Q2_Factorial
Enter the number to find its factorial : 9
Factorial of 9 is : 362880

*/
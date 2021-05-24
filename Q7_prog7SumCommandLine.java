
/*

Q: To find the sum of any number of integers interactively, enter every number from the
keyboard, whereas the total number of integers is given as a command line argument.

*/

import java.util.Scanner;


class prog7SumCommandLine{
public static void main(String args[]){

int x = Integer.parseInt(args[0]);

       
        int num[] = new int[x];
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<x;i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            num[i] = scan.nextInt();
            sum += num[i];
        }

      for(int print : num)
            System.out.print(print + " + ");
        System.out.println(" = " + sum);


}

}

/* OUTPUT

C:\Java\Q7_prog7SumCommandLine>java prog7SumCommandLine 6
Enter element 1: 3
Enter element 2: 9
Enter element 3: 6
Enter element 4: 12
Enter element 5: 15
Enter element 6: 8
3 + 9 + 6 + 12 + 15 + 8 +  = 53


*/
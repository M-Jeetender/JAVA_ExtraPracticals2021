// Q, To convert decimal to binary number 

import java.util.Scanner;

class Q5_decToBin{


    public static void main(String[] args) {

        int binary[]=new int [20];
        int num, i=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the decimal number to convert it into binary number : ");
        num=scan.nextInt();
        int originalNum = num;
        while(num!=0)
        {
            binary[i]=num%2;
            num/=2;
            i++;
        }

        System.out.print("Binary equivalent of " + originalNum + " is : ");
        for(int j=i-1;j>=0;j--)                    // Prints the binary number
            System.out.print(binary[j]+" ");

    }
}


/* OUTPUT

Enter the decimal number to convert it into binary number : 100
Binary equivalent of 100 is : 1 1 0 0 1 0 0 
Process finished with exit code 0

*/

import java.io.*;

 class Q1_sumOfElements {
    public static void main(String args[])
    { 

   int num,sum=0;
  
   System.out.print("Command line arguments entered are : ");

    // prints the command line argument values
   for(int x=0; x< args.length;x++)
     System.out.print(args[x] + " ");


     System.out.println();

      for(int i=0;i<args.length;i++)
      { num=Integer.parseInt(args[i]);
        sum=sum+num;
      }
     System.out.println("Sum of Elements is : "+sum);
    }  
}


/* 

OUTPUT 


C:\Java\Q1_sumOfElements>java Q1_sumOfElements 3 6 9 12 15 18
Command line arguments entered are : 3 6 9 12 15 18
Sum of Elements is : 63

*/


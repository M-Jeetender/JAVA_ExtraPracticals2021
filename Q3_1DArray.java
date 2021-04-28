// 3. To learn use of single dimensional array by defining the array is dynamically.

import java.util.Scanner;

class Q3_1DArray {
  
   public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter the size of array : ");
    int size = scan.nextInt();

   int array[]= new int[size];

System.out.print("Enter the elements of array : ");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();

        }

    // Adding 5 to each element
     for(int x=0;x<size;x++){
           array[x]=array[x]+5;
        }

System.out.println("After adding 5 in each element: ");
        for(int j=0;j<size;j++){
System.out.print(array[j]+" ");
        }
   }

}


/* 

OUTPUT 

C:\Java\Q3_1DArray>java Q3_1DArray

Enter the size of array : 6
Enter the elements of array : 1 2 3 4 5 6
After adding 5 in each element:
6 7 8 9 10 11


*/
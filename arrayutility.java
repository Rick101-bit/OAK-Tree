import java.util.Scanner;

public class arrayutility {
    public static int[] inputArray(){
         Scanner input = new Scanner(System.in);
         System.out.println("enter the size of array: ");
         int size = input.nextInt();
         int myArray[] = new int [size];
         System.out.println("enter the elements of the array :");
        int i =0;
         for( i= 0;i<size;i++){
            myArray[i] = input.nextInt();

         }
         for(i = 0;i<size;i++){
            System.out.print( myArray[i]);
         }
         
         return myArray ;
         
    }
   
}

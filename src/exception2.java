import java.util.*;
public class exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;

        try
        {
            System.out.println("enter the size of array");
         int n=sc.nextInt();
         int j;
         String A[]= new String[n];
            System.out.println("enter the index u want");
            int b=sc.nextInt();
             A[b] =null;
            System.out.println(A[b].toString());




        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Array size cannot be negative");
        }
        catch ( IndexOutOfBoundsException e)
        {
            System.out.println("Array size have exceeted maximum");
        }
        catch (NullPointerException e)
        {
            System.out.println("null pointer exception is not a very good thing");
        }
    }
}

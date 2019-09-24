import java.util.*;
public class places {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] Array = new String[5];
        System.out.println("Enter the city name");
        for(int i=0;i<5;i++)
        {
            Array[i]=sc.nextLine();
        }
        String [] A = new String[5];


        for(int i=0;i<5;i++)
        {

            A[i]=Array[i].replaceAll("[AEIOUaeiou]","");

        }
        for(int i=0;i<5;i++)
        {   System.out.print("city without vowel:" + i + " ");
            System.out.println(A[i]);
        }

    }
}

import java.util.*;
import java.io.*;


public class StudentMarks {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int A[] =new int[n];
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the marks of " + (i + 1) + " Student :");
                A[i] = sc.nextInt();
                if (A[i] > 100 || A[i] < 0) {
                    throw new Exception("this cannot be marks");
                }
            }
        }
            catch(Exception e)
            {
                System.out.println(e);
            }

    }
}

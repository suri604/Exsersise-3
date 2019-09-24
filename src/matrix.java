import java.sql.SQLOutput;
import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();
        ;
        int A[][]= new int[n][m];
        int B[][] = new int[n][m];
        System.out.println("ENter the first matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                {
                    A[i][j] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                {
                    B[i][j] = sc.nextInt();
                }
            }
        }



        int [][] C =new int[n][m];
        for(int i =0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }




    }
}

import java.util.*;

public class consecutive {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String s = sc.nextLine();
        String [] str = s.split(",");
        int [] A = new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            A[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(A);
        int count =0;
        for(int i=0;i<(str.length-1);i++)
        {
            if((A[i+1]-A[i])!=1);
            {
                count=1;
                break;
            }
        }
        if(count ==0)
        {

            for(int i=0;i<str.length;i++)
            {
                System.out.print(A[i]+",");
            }
            System.out.println("numbers are consecutive:");
        }
        else if(count ==1)
        {
            for(int i=0;i<str.length;i++)
            {
                System.out.print(A[i]+",");
            }
            System.out.println("numbers are not consecutive:");
        }
    }
}

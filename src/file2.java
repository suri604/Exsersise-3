import java.io.*;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the file folder path");
        String path1 = sc.nextLine();
        File folder = new File(path1);
        String [] files = folder.list();
        for(String s:files)
        {
            System.out.print (s);
        }
        System.out.println("\nEnter the file path from athe above folder");
        String path2 = sc.nextLine();
        File fib =new File(path2);
        FileInputStream fin = new FileInputStream(fib);
        byte [] Array = new byte[(int)fib.length()];
        fin.read(Array);
        String s = new String(Array);
        System.out.println(s);

    }
}

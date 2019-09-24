import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class file1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("./name1.text");
        BufferedReader bf = new BufferedReader(fr);
        String s = bf.readLine();
        String b = s.toUpperCase();
        System.out.println(b);
        System.out.print("the length is:");
        System.out.println(b.length());
        bf.close();
    }
}

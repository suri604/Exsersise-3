import java.util.*;
import java.io.*;
public class Frequency {
    public static void main(String[] args) throws Exception {

        File find = new File("/home/cgi/Music/cont.text");
        FileInputStream fin = new FileInputStream(find);
        int ch;
        String str = "";
        while((ch=fin.read())!=-1)
        {
            str = str + ((char)ch);
        }
        String S = str.replaceAll("[,.]","").trim();
        String [] s = S.split(" ");
        for(int i=0;i<s.length;i++)
        {
            s[i]=s[i].trim();
        }
        Map<String,Integer> map = new HashMap<>();
        for(String STR:s)
        {
            Integer n = map.get(STR);
            if(n==null)
                n=1;
            else
                n=n+1;
            map.put(STR,n);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

    }
}

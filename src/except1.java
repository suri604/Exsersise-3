import java.util.*;

public class except1 {
    public static void main(String[] args) {
        int i=10;

        try
        {
            if(i<10)
            {
                throw  new myexception("Error");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("I am here");
        }

    }
}
class myexception extends Exception
{
    myexception(String str)
    {

    }
}
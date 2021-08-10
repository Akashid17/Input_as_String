
import java.lang.*;
import java.io.*;

class Main
{
    public static void main(String args[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        try
        {
            System.out.println("Enter String");
            str = bobj.readLine();
        }
        catch(Exception eobj)
        {}

        System.out.println(str);
    }
}
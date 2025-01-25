import java.lang.*;

public class Unicode
{
    public static void main(String[] args)
    {
        // char ch = 0x03c8;
        // System.out.println(ch);
        
        /*Print all the alphabate in Greek Lang */
        for (char ch = 0x0370; ch <= 0x03FF; ch++)
        {
            System.out.print(ch + " ");
        }
    }
}
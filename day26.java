import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int day   = scan.nextInt();
        int month = scan.nextInt();
        int year  = scan.nextInt();

        int expDay   = scan.nextInt();
        int expMonth = scan.nextInt();
        int expYear  = scan.nextInt();
        
        int fine = 0;
        if(year < expYear)
            fine  = 0;
        else if(year == expYear)
        {
            if(month <= expMonth)
            { 
                if(day <= expDay)
                    fine = 0;
                else
                {
                    fine = 15 * (day - expDay);
                }
            }
            else
            {
                fine = 500 * (month - expMonth);   
            }

        }
        
        else
            fine = 10000;

        System.out.println(fine);
    }
}


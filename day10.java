import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static  void toBinary(int n, StringBuilder str)
    {
        if(n == 1 || n == 0)
        {
            str.insert(str.length(), Integer.toString(n));
            return;
        }
        
        int rem = n % 2;
        toBinary(n / 2, str);
        str.insert(str.length(), Integer.toString(rem));
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        StringBuilder str = new StringBuilder();
        toBinary(n, str);

        int cur = 0;
        int max = 0;

        for(int idx = 0; idx < str.length(); idx++)
        {
            if(str.charAt(idx) == '1')
                cur++;
            else
            {
                if(cur >= max)
                {
                    max = cur;
                }
                cur = 0;
            }
        }

        if(cur > max)
        {
            max = cur;                    
        }

        System.out.println(max);

        scanner.close();
    }
}

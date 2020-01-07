import java.io.*;
import java.util.*;

public class Solution {

    static boolean isPrime(int n)
    {
        if(n < 2)
            return false;

        int sqrRootN = (int)Math.sqrt(n);

        for(int i = 2; i <= sqrRootN; ++i)
        {
            if(n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int i = 0; i < T; ++i)
        {
            int n = scan.nextInt();

            if(isPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}


import java.io.*;
import java.util.*;

public class Solution {

    public static void printOut(String str)
    {
        for(int idx = 0; idx < str.length(); idx = idx + 2)
           System.out.print(str.charAt(idx));

        System.out.print(" ");
        for(int idx = 1; idx < str.length(); idx = idx + 2)
           System.out.print(str.charAt(idx));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T =scan.nextInt();

        for(int i = 0; i < T; i++)
        {
            String str = scan.next();

            printOut(str);
            System.out.println();
        }
    }
}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int d = 0;

        try
        {
            d = Integer.parseInt(S);
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println("Bad String");
        }

        System.out.println(d);
    }
}


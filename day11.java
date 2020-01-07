import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static int maxHourGlassSum(int[][] arr)
    {
        int curSum = -100;
        int maxSum = -100;
        int row = 0;
        int column = 0;

        for(row = 0; row < arr.length - 2; row++)
        {
            for(column = 0; column < arr[row].length - 2; column++)
            {
                curSum = arr[row][column];
                curSum += arr[row][column + 1];
                curSum += arr[row][column + 2];

                curSum += arr[row + 1][column + 1];

                curSum += arr[row + 2][column];
                curSum += arr[row + 2][column + 1];
                curSum += arr[row + 2][column + 2];

                if(curSum > maxSum)
                    maxSum = curSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(maxHourGlassSum(arr));

        scanner.close();
    }
}

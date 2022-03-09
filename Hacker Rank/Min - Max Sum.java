import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    long totalSum = 0;
    for (int index = 0; index < arr.size(); index++ ) {
         
        if ( min > arr.get(index) ) // found a new min
           min = arr.get(index); 
        
        if ( max < arr.get(index) ) // found a new max
            max = arr.get(index);
        
        totalSum += arr.get(index);
    }
    // remove max and minum in the last from total sum
    System.out.format("%d %d", totalSum - max, totalSum - min);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

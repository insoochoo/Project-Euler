import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            long target = sc.nextLong() - 1; // exclusive
            long sum = 0;
            if(target >= 3 && target < 5){
                sum = 3;
            }else if(target >=5 && target < 15){
                sum = (3+(target/3)*(3))*(target/3)/2 + (5+(target/5)*(5))*(target/5)/2;
            }else{
                sum = (3+(target/3)*(3))*(target/3)/2 + (5+(target/5)*(5))*(target/5)/2 - (15+(target/15)*(15))*(target/15)/2;
            }
            System.out.println(sum);
        }
        
    }
}

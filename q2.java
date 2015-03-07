import java.io.*;
import java.util.*;

public class Solution{
    public static class Value{
        long sum;
        int T;
        long N;
        public Value(int T, long N){
            this.T = T;
            this.N = N;
            this.sum = 0;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
              
        Value[] data = new Value[T];
        for(int i = 0; i < T; i++){
            long n = sc.nextLong();
            data[i] = new Value(i, n);
        }
        
        Arrays.sort(data, new Comparator<Value>(){
            public int compare(Value a, Value b){
                return (a.N < b.N) ? -1 : 1;
            }
        });
        
        long a = 1;
        long b = 2;
        long sum = 0;
        for(int i = 0; i < T; i++){
            long n = data[i].N;
            while (b <= n){
                sum += b;
                long temp = a + b;
                a = temp + b;
                b = a + temp;
            }
            data[i].sum = sum;
        }
        
        Arrays.sort(data, new Comparator<Value>(){
            public int compare(Value a, Value b){
                return (a.T < b.T) ? -1 : 1;
            }
        });
        
        for(int i = 0; i < T; i++){
            System.out.println(data[i].sum);
        }
    }   
}

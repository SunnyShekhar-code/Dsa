package Dsa;
import java.util.*;
public class ArrangingTheSheep {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int total=0;
            long [][] arr= new long[n][3]; // count, sum of * index from left  , and sum of . index from left     right can be calculated
            // count 

            for(int i=0;i<n;i++){
                char ch= s.charAt(i);
                
                if(ch=='*'){
                    total++;
                }else if(i>0){
                    arr[i][1]=total;
                }
                if(i>0)arr[i][1]+=arr[i-1][1];
                arr[i][0]=total;
            }

            for(int i=n-2;i>=0;i--){
                arr[i][2]=arr[i+1][2];
                if(s.charAt(i)=='.'){
                    arr[i][2]+=total-arr[i][0];
                }
            }

            long min=Long.MAX_VALUE;

            for(int i=0;i<n;i++){
                min=Math.min(min,arr[i][1]+arr[i][2]);
            }

            System.out.println(min);
        }
    }
    
}

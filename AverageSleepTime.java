import java.util.*;
public class AverageSleepTime{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++) arr[i]= sc.nextInt();
        double sum=0;
        double curr=0;
        for(int i=0;i<n;i++){
            if(i<k) curr+=arr[i];
            else{
                curr-=arr[i-k];
                curr+=arr[i];
            }
            if(i>=k-1) sum+=curr;
        }

        double ans= sum/(n-k+1);
        System.out.println(ans);


    }
}
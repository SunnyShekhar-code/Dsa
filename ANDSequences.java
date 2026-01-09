package Dsa;
import java.util.*;
public class ANDSequences {

    static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]= sc.nextInt();
            int [] and= new int[n];
            for(int i=n-1;i>=0;i--){
                if(i==n-1) and[i]=arr[i];
                else and[i]=arr[i]&and[i+1];
            }
            int cnt=0;
            // int ans=0;
            int ands= arr[0];
            for(int i=0;i<n-1;i++){
                ands=ands & arr[i];
                if(ands==and[i+1]){ 
                  cnt++;
                  // ans+=fact(i+1)*fact(n-i-1);
                  
                }
            }
            int mod=(int)1e9+7;
            int ans=(cnt*(cnt-1)*fact(n-2))%mod;

            System.out.println(ans);

        }
    }
    
}

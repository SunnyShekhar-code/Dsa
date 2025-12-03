import java.util.*;
public class Dances_easy_version {
    public static int helper(int t, int [] brr, int n){
        int l=0;
        int r=n-1;
        int ans=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(t<brr[mid]){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(ans);
        return n-ans;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int m= sc.nextInt();
            int max=0;
            int [] arr= new int [n];
            int [] brr= new int [n];
            arr[0]=m;
            for(int i=1;i<n;i++) arr[i]= sc.nextInt();
            for(int i=0;i<n;i++) brr[i]= sc.nextInt();
            Arrays.sort(arr);
            Arrays.sort(brr);

            // for(int i=0;i<n;i++){
                
            //     int temp= helper(arr[i],brr,n);
            //     int res=Math.min(i+1,temp);
            //     max=Math.max(max,res);
            // }
            // int ans= n-max;
            // System.out.println(ans +" "+max);
            // System.out.println(ans);

            int cnt=0;
            int i=n-1;
            int j=n-1;
            while(i>=0 && j>=0){
                if(arr[i]<brr[j]){
                    cnt++;
                    i--;
                    j--;
                }else if(arr[i]>=brr[j]){
                    i--;
                }
            }
            System.out.println(n-cnt);
        }
    }
    
}

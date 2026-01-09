package Dsa;
import java.util.*;

public class AlyonaandaNarrowFridge {
    static boolean helper(int mid, int [] arr, int n, int h){

        ArrayList<Integer> li= new ArrayList<>();
        for(int i=0;i<=mid;i++){
            li.add(arr[i]);
        }
        Collections.sort(li,(a,b)->b-a);
        int j=0;
        long sum=0;
        while(j<=mid){
            sum+=li.get(j);
            j+=2;
        }

        return h>=sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int l=0;
        int r=n-1;
        int ans=0;


        while(l<=r){

            int mid=l+(r-l)/2;
            if(helper(mid,arr,n,h)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }

        }
        System.out.println(ans+1);

    }

}

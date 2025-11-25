import java.util.*;

public class Binary_Deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] arr = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                total += arr[i];
            }
            if (total < s) {
                System.out.println(-1);
                continue;
            }
            HashMap<Integer, Integer> mp = new HashMap<>();
            mp.put(0, n);
            int sum = 0;
            for (int i = n - 1; i >= 0; i--) {
                sum += arr[i];
                if (!mp.containsKey(sum)) {
                    mp.put(sum, i);
                }
            }

            sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                sum += arr[i];

                int req = total - s;
                if (sum > req)
                    break;
                if (mp.containsKey(req - sum)) {
                    min = Math.min(min, i + 1 + n - mp.get(req - sum));
                }
            }

            if (mp.containsKey(total - s)) {
                min = Math.min(min, n - mp.get(total - s));
            }

            System.out.println(min);

            // int[] prefixsum = new int[n];
            // int sum = 0;

            // for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
            // sum += arr[i];
            // if (i == 0)
            // prefixsum[i] = arr[i];
            // else
            // prefixsum[i] = prefixsum[i - 1] + arr[i];
            // }

            // if(sum< s){
            // System.out.println(-1);
            // continue;
            // }

            // int req=sum-s;

            // int l = 0;
            // int r = n;
            // for(int i=0;i<n;i++){
            // if(prefixsum[i]==req){
            // l=i;
            // break;
            // }
            // }

            // int min=Integer.MAX_VALUE;

            // while(l>=0){

            // int left=prefixsum[l];
            // int middle= prefixsum[r-1]-prefixsum[l];
            // int right= sum-prefixsum[r-1];

            // while(r> l && left+right<=req) {
            // min=Math.min(n-r+l+1,min);
            // r--;
            // }

            // l--;

            // }

            // System.out.println(min);

        }
    }

}

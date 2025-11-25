import java.util.*;
public class BalancedTunnel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     
            int n= sc.nextInt();
            HashMap<Integer,Integer> mp= new HashMap<>();
            for(int i=n;i>0;i--){
                int temp= sc.nextInt();
                mp.put(temp,i);
            }
            int max=0;
            for(int i=n;i>0;i--){
                int temp=sc.nextInt();
                if(mp.get(temp)>i){
                    max=Math.max(max,mp.get(temp)-i);
                }
            }
            System.out.println(max);
        
    }
    
}

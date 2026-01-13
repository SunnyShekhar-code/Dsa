package Dsa;
import java.util.*;
public class Tape {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int k= sc.nextInt();
        int [] arr= new int[n];
        PriorityQueue<Integer> pq= new PriorityQueue<>((i,j)->(arr[j+1]-arr[j])-(arr[i+1]-arr[i]));
        

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++) pq.add(i);

        HashSet<Integer> hs= new HashSet<>();

        for(int i=0;i<k-1;i++){
            hs.add(pq.poll());
        }

        long sum=0;
        int i=0;
        for(int j=0;j<n;j++){
            if(hs.contains(j)){
                sum+=1L*arr[j]-arr[i]+1;
                i=j+1;
            }
        }
        
        sum+=1L*arr[n-1]-arr[i]+1;
        System.out.println(sum);
        
    }

    
}

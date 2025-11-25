import java.util.*;
public class ArrayGame {
  static long findMin(int n, long t, ArrayList<Long> li){
    
    int temp=0;
    int l=0;
    int r=n-1;
    
    while(l<r){
      int mid=l+(r-l)/2;
      if(li.get(mid)==t) return 0;
      if(li.get(mid)<t){
        temp=mid;
        l=mid+1;
      }else{
        r=mid-1;
      }
    }
    
    int left=temp-1;
    int right=temp+1;
    
    long min= t;
    
    if(left>=0) min= Math.min(min,Math.abs(li.get(left)-t));
    if(right<n) min= Math.min(min,Math.abs(li.get(right)-t));
    min=Math.min(Math.abs(li.get(temp)-t),min);
    return min;
    
  }
  
  
  
  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Long> li= new ArrayList<>();
            for(int i=0;i<n;i++){
                long temp= sc.nextLong();
                li.add(temp);
            }
            if(k>2){
                System.out.println(0);
                continue;
            }

            Collections.sort(li);
                long min=Long.MAX_VALUE;
                
                for(int i=0;i<n-1;i++){
                    long diff=Math.abs(li.get(i+1)-li.get(i));
                    // min=Math.min(min,Math.abs(diff));
                    if(diff<min){
                      min=diff;
                      // minidx=i;
                    }
                }
                
              if(k==1){
                System.out.println(Long.min(min,li.get(0)));
                continue;
              }
              
              min=Long.MAX_VALUE;
              for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                  long diff=Math.abs(li.get(i)-li.get(j));
                  long temp= findMin(n,diff,li);
                  
                  min=Math.min(min,temp);
                  
                }
              }
              System.out.println(min);
              
        }
        
    }
    
}

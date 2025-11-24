import java.util.*;
public class ArrayElimination {

    static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int [] freq= new int[32];
            int max=0;
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
                for(int j=0;j<32;j++){
                    if((temp & 1<<j)>0) freq[j]++;
                    max=Math.max(max,freq[j]);
                }
            }
            
            if(max==0){
              for(int i=1;i<=n;i++) System.out.print(i+" ");
              System.out.println();
              continue;
            }
            
            
            
            
            int hcf=max;
            
            for(int i=0;i<32;i++){
                if(freq[i]>0)hcf=gcd(hcf,freq[i]);
            }

            ArrayList<Integer> li=new ArrayList<>();
            for(int i=1;i<=Math.sqrt(hcf);i++){
                if(hcf % i == 0) {
                    li.add(i);
                    if(i < Math.sqrt(hcf))li.add(hcf/i);
                }
            }
            
            Collections.sort(li);

            int m= li.size();
            for(int i=0;i<m;i++)System.out.print(li.get(i)+" ");
            System.out.println();

        }
    }
    
}

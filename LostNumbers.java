package Dsa;
import java.util.*;
public class LostNumbers {

    static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashSet<Integer> hs= new HashSet<>();
        
        hs.add(4);
        hs.add(8);
        hs.add(16);
        hs.add(42);
        hs.add(15);
        hs.add(23);
        
        int [] arr= new int[4];

        for(int i=1;i<3;i++){
            System.out.println("? "+i +" "+(i+1));
            System.out.flush();
            arr[i-1]=sc.nextInt();
        }

        for(int i=4;i<6;i++){
            System.out.println("? "+i +" "+(i+1));
            System.out.flush();
            arr[i-2]=sc.nextInt();
        }

        int [] ans= new int[6];
        
        for(int a:hs){
          int temp=a;
          if(arr[0]%a==0 && arr[1]%a==0 && hs.contains(arr[0]/a) && hs.contains(arr[1]/a)){
            ans[0]=arr[0]/a;
            ans[1]=a;
            ans[2]=arr[1]/a;
            break;
          }
        }
        
        for(int a:hs){
          int temp=a;
          if(arr[2]%a==0 && arr[3]%a==0 && hs.contains(arr[2]/a) && hs.contains(arr[3]/a)){
            ans[3]=arr[2]/a;
            ans[4]=a;
            ans[5]=arr[3]/a;
            break;
          }
        }
        
        

        for(int i=0;i<6;i++){
            if(i==0) System.out.print("! ");
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    
}

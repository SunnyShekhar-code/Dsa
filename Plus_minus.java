import java.util.*;
public class Plus_minus {
  static long gcd(long a, long b){
    if(a==0) return b;
    return gcd(b%a,a);
  }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt();
            long x=sc.nextInt();
            long y=sc.nextInt();
            
            long hcf=gcd(x,y);
            long p=(x*y)/hcf;
            long temp=n/p;

            long r=n-n/x+temp;
            long q =n/y-temp;

            long sum=(n*(n+1))/2- (r*(r+1))/2 - (q*(q+1))/2;
            System.out.println(sum);

        }
    }
}

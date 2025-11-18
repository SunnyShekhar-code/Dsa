import java.util.*;
public class assemblyviamin {
    public static void main(String  [] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m= (n*(n-1))/2;
            int [] arr=new int[m];
            for(int i=0;i<m;i++) arr[i]= sc.nextInt();

            Arrays.sort(arr);
            int [] result=new int[n];
            int step=n-1;
            int k=0;
            int j=0;
            while(step>=1){
                result[k++]= arr[j];
                j+=step;
                step--;
            }

            result[n-1] = arr[m-1];
            for(int i=0;i<n;i++) System.out.print(result[i]+" ");
            System.out.println();
        }
    }
}

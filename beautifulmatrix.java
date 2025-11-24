import java.util.*;
public class beautifulmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int n= sc.nextInt();
                if(n==1){
                    ans=Math.abs(2-i)+Math.abs(2-j);

                }
            }
            sc.nextLine();
        }

        System.out.println(ans);
        sc.close();
        
    }
}

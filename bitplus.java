import java.util.*;
public class bitplus { 
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int x=0;
        for(int i=0;i<n;i++){
            String ch=sc.nextLine().trim().toLowerCase();
            if(ch.equals("x++") || ch.equals("++x")) x++;
            else x--;
        }
        System.out.println(x);
        sc.close();
        // hii
    }
}

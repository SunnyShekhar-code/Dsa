import java.util.*;
public class SimpleStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int n= s.length();
        int [] arr= new int[n];
        Arrays.fill(arr,1);
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)==s.charAt(i+1)){
                arr[i]+=arr[i+1];
            }
        }

        int j=0;
        StringBuilder sb= new StringBuilder();
        while(j<n){
            if(arr[j]>1){
                sb.append(s.charAt(j));
                int temp= (int)s.charAt(j);
                
                if(temp==(int)'z') temp=(int)'a';
                else temp++;
                if(j<n-2 && temp==(int)s.charAt(j+2)){
                  if(temp==(int)'z') temp=(int)'a';
                  else temp++;
                }
               
                char ch=(char)temp;
                sb.append(ch);
                
                j++;
            }else{
                sb.append(s.charAt(j));
            }
            j++;

        }

        
            System.out.println(sb);
       
        
    }
    
}

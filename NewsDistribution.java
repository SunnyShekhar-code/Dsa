package Dsa;
import java.util.*;
public class NewsDistribution {

    static int findParent(int idx, int [] parent){
        if(idx==parent[idx]) return idx;

        return parent[idx]=findParent(parent[idx], parent);
    }

    static void union(int u, int v, int [] parent, int [] size){
        int pu=findParent(u,parent);
        int pv=findParent(v,parent);
        if(pu==pv) return;

        if(size[pu]>=size[pv]){
            size[pu]+=size[pv];
            parent[pv]=pu;
        }else{
            size[pv]+=size[pu];
            parent[pu]=pv;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
  
            int n= sc.nextInt();
            int m=sc.nextInt();
            
            int [] parent= new int[n+1];
            int [] size= new int[n+1];
            for(int i=0;i<=n;i++){
                size[i]=1;
                parent[i]=i;
            }

            for(int i=0;i<m;i++){
                int k=sc.nextInt();
                int prev=-1;
                for(int j=0;j<k;j++){
                    int temp=sc.nextInt();
                    if(prev!=-1) union(temp,prev,parent,size);
                    prev=temp;
                }
            }

            for(int i=1;i<=n;i++)System.out.print(size[findParent(i, parent)]+" ");
            System.out.println();
        
        
    }
    
}

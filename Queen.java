import java.util.*;
public class Queen {
    static void dfs(int root,ArrayList<ArrayList<Integer>> adj,int [] value,ArrayList<Integer> li){

        boolean flag=false;
        if(value[root]==1) flag=true;
        for(int a: adj.get(root)){
            if(a==0) flag=false;
            dfs(a,adj,value,li);
        }
        if(flag) li.add(root);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] value= new int[n+1];
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());

        int root=0;

        for(int i=1;i<=n;i++){
            int parent=sc.nextInt();
            int val=sc.nextInt();
            if(parent==-1) root=i;
            else adj.get(parent).add(i);
            value[i]=val;
        }


        ArrayList<Integer> li= new ArrayList<>();

        dfs(root,adj,value,li);


        Collections.sort(li);

        int m= li.size();
        for(int i=0;i<m;i++)System.out.print(li.get(i)+" ");
        System.out.println();

    }
    
}

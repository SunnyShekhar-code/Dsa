package Dsa;
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Alian Dictionaary Problem");
        
        ArrayList<String> li= new ArrayList<>(Arrays.asList("hrn", "hrf", "er", "enn", "rfnn"));
        // ArrayList<String> li= new ArrayList<>(Arrays.asList("hr", "hrf", "hrfe"));

        int n = li.size();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            adj.add(new ArrayList<>());
        }

        HashSet<Character> hs = new HashSet<>();
        int[] indegree = new int[26];
        
        for (int i = 0; i < n - 1; i++) {
            String s1 = li.get(i);
            String s2 = li.get(i +1);
            for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    adj.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                    hs.add(s1.charAt(j));
                    hs.add(s2.charAt(j));
                    indegree[s2.charAt(j) - 'a']++;
                    break;
                }
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            if (hs.contains((char) (i + 'a')) && indegree[i] == 0) {
                q.add(i);
            }
        }

        String result = "";
        while (q.size() > 0) {
            int temp = q.remove();
            for (int a : adj.get(temp)) {
                indegree[a]--; 
                if (indegree[a] == 0) {
                    q.add(a);
                }
            }
            result += (char) (temp + 'a');
        }
        
        String ans = (result.length() == hs.size()) ? result : "";
        System.out.println("Dictionary Order is : "+ans);
    }
}
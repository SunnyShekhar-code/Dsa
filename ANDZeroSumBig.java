import java.util.*;

public class ANDZeroSumBig {

    static int fact(int n) {
        int prod = 1;
        for (int i = 2; i <= n; i++) {
            prod = prod * i;
        }
        if(prod==0) return 1;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int r = (int) Math.pow(2, k) - 1;
            int[] freq = new int[32];

            for (int i = 0; i <= r; i++) {
                for (int j = 0; j < 32; j++) {
                    if ((i & (1 << j)) == 0)
                        freq[j]++;
                }
            }

            long sum = 0;
            for (int i = 0; i <= r; i++) {
                int one = 0;
                int temp = 1;
                for (int j = 0; j < 32; j++) {
                    if ((i & (1 << j)) > 0) {
                        temp *= freq[j];
                        one++;
                    }
                }

                // temp*= (r+1) C (n-one);

                int comb = temp * fact(r + 1) / (fact(n - one) * fact(r + 1 - n + one));
                sum += comb;
            }

            System.out.println(sum);

        }

    }
}

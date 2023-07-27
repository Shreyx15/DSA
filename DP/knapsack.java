package com.company.DP;


public class knapsack {

    public static void main(String[] args) {
        int val[] = { 11, 21, 31, 33, 43, 54, 55, 65 };
        int wt[] = { 1, 11, 21, 23, 33, 43, 45, 55 };
        int W = 110;
        int n = val.length;
        knapSack(W, wt, val, n);

    }
    static void knapSack(int W, int wt[],
                        int val[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= W; w++)
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w]
                            = Math.max(val[i - 1]
                                    + K[i - 1][w - wt[i - 1]],
                            K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }


        int res = K[n][W];
        System.out.println(res);
        int weight = W;
        for (int j = n; j > 0 && res > 0 ; j--) {
            if(K[j - 1][weight] == K[j - 1][weight]) {
                continue;
            } else {
                System.out.print(wt[j - 1] + " ");
                res = res - val[j - 1];
                weight = weight - wt[j - 1];
            }
        }
    }

}

class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        for(int i = 0; i <= m; i++){
            dp[i][0] = i;
        }
        for(int i = 0 ; i <= n; i++){
            dp[0][i] = i;
        }
        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                if(w1[i-1] == w2[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1; 
                }
            }
        }

        for(int i = 0; i < m+1; i++){
            for(int j = 0; j < n+1; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[m][n];

    }
}
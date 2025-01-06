class Solution {
    public int climbStairs(int n) {
         if (n <= 1) {
            return n; // Base case: There is only one way to climb 0 or 1 step
        }
        
        int[] dp = new int[n + 1]; // Create an array to store the number of ways to climb each step
        
        // Base cases
        dp[0] = 1; // There is only one way to climb 0 step (by not climbing)
        dp[1] = 1; // There is only one way to climb 1 step (by taking one step)
        
        // Fill the DP table iteratively
        for (int i = 2; i <= n; i++) {
            // The number of ways to climb the current step (i) is the sum of the ways to climb the previous two steps
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        // Return the number of ways to climb the nth step
        return dp[n];
    }
}
class Solution {
    public int missingNumber(int[] nums) {
       int num = 0,num1 = 0;
       int n = nums.length;
       for(int i=0;i<n;i++){
       num ^= nums[i];
       num1 ^= i+1;
    }
    return num ^num1;
    }
}
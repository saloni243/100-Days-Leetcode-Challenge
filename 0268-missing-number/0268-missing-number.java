class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+nums[i];
        }

        int summation = 0;
        summation = n*(n+1)/2;
        
        return summation - sum;

    }
}

class Solution {

    public int sumD(int[] nums  , int div){
        int n = nums.length;
        int sum=0;
        for(int i =0 ;i<n;i++){
            sum+=Math.ceil((double)nums[i] / div);
        }
        return sum;

    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = 0;

        for(int num : nums){
          high =   Math.max(high , num);
        }

        while(low<= high){
            int mid =low+ (high-low)/2;
            if(sumD(nums,mid) <= threshold){
                high = mid -1;
            }else{

                low = mid+1;
            }


        }

        return low;

    
    }
}
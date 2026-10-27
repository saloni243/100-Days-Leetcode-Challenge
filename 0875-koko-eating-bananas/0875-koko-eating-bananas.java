class Solution {

    public int totalHr(int[] piles, int hours){
        int n = piles.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += Math.ceil((double)piles[i]/hours);
            
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
       int low = 1;
       int high =0;
       int ans =Integer.MAX_VALUE;
       for(int num : piles){
        high = Math.max(num , high);
       }

       while(low<=high){

        int mid = (low+high)/2;
        int totalhr1 = totalHr(piles , mid);

        if(totalhr1 <= h){
            ans = mid;
            high = mid-1;
        }else{
            low = mid+1;
        }
       }

       return ans;

    }
}

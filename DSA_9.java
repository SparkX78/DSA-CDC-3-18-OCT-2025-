public class DSA_9 {
    public static int MaxSubSum(int[] nums){
        int cur_sum = 0;
        int max_sofar = 0;
        for(int i = 1; i < nums.length; i++){
            cur_sum = Math.max(nums[i], nums[i] + cur_sum);
            max_sofar = Math.max(cur_sum, max_sofar);
        }
        return max_sofar;
    }
    public static void main(String args[]){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubSum(nums));
    }
}

public class DSA_12 {
    public static int MaxProductSub(int[] nums){
        int cur_prodt = nums[0];
        int max_prodsofar = nums[0];
        int cur_min = nums[0];
        for(int i =1; i< nums.length; i++ ){
            int temp = cur_prodt;
            cur_prodt = Math.max(nums[i],Math.max(nums[i]*cur_prodt, nums[i]* cur_min));
            cur_min = Math.min(nums[i], Math.min(nums[i]*temp, nums[i]* cur_min));
            max_prodsofar = Math.max(cur_prodt, max_prodsofar);
        }
        return max_prodsofar;
    }
    public static void main(String args[]){
        int[] nums = {-4,3,-2,};
        System.out.println(MaxProductSub(nums));
    }
}

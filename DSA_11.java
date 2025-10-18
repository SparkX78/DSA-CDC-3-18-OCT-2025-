import java.util.*;
public class DSA_11 {
    public static int MaxVote(int[] nums){
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            int freq = map.getOrDefault(num, 0)+1;
            map.put(num, freq);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > n/2 ){
                return entry.getKey();


            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(MaxVote(nums));
    }
}

import java.util.*;

public class DSA_10 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultset = new HashSet<>();
        for(int num: nums1){
            set.add(num);
        }
        for(int num: nums2){
            if(set.contains(num)){
                resultset.add(num);
            }
        }
        int[] result = new int[resultset.size()];
        int k = 0;
        for(int num: resultset){
            result[k++] = num;

        }
        return result;
    }
    public static void main(String args[]){
        int[] nums1 = {20,12,13,15,19};
        int[] nums2 = {13,17,19};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }


}

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int compliment = target - nums[i];
            
            if(hm.containsKey(compliment)){
                int [] arr = {hm.get(compliment) , i};
                return arr;
            }
            else{
                hm.put(nums[i] , i);
            }
        }

    return new int [0];

    }
}
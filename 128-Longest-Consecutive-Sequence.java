import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums){
            set.add(val);
        }

        int max = 0;
        for(int val : set){
            if(!set.contains(val - 1)){
                int curr = val;
                int count = 1;

                while(set.contains(curr + 1)){
                curr++;
                count++;
                }
                if(count > max){
                    max = count;
                }
            }
        }

        return max;

    }
}
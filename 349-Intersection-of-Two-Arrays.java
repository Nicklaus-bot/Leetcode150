import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int val : nums1){
            hm.put(val , 1);
        }

        HashSet<Integer> res = new HashSet<>();

        for(int val : nums2){
            if(hm.containsKey(val)){
                res.add(val);
            }
        }

        int [] arr = new int [res.size()];

        int i = 0;
        for(int val : res){
            arr[i] = val;
            i++;
        }

        return arr;


    }
}
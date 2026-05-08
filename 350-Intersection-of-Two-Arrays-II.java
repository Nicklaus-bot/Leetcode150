import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int val : nums1){
            if(hm.containsKey(val)){
                int freq = hm.get(val);
                freq += 1;
                hm.put(val , freq);
            }
            else{
                hm.put(val , 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int val : nums2){
            if(hm.containsKey(val)){
                int freq = hm.get(val);
                freq -= 1;
                if(freq > 0){
                    hm.put(val , freq);
                }
                else{
                    hm.remove(val);
                }
                list.add(val);
            }
        }

        int [] res = new int [list.size()];
        for(int i=0 ; i<res.length ; i++){
            res[i] = list.get(i);
        }

        return res;

    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int k = digits.length - 1;
        int sum = digits[k] + 1;
        digits[k] = sum%10;
        int c = sum/10;
        k--;

        while(k>=0){
            if(c > 0){
                int s = digits[k] + c;
                digits[k] = s%10;
                c = s/10;
                k--;
            }
            else{
                break;
            }
        }

        if(c > 0){
            int [] res = new int [digits.length + 1];
            res[0] = c;
            for(int i=1 ; i<res.length ; i++){
                res[i] = digits[i-1];
            }
            return res;
        }

        else{
            return digits;
        }


    }
}
class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);

            if(c >= 'a' && c <= 'z'){
                list.add(c);
            }
            else if(c >= 'A' && c <= 'Z'){
                char ch = (char)('a' - 'A' + c);
                list.add(ch);
            }
            else if(c >= '0' && c <= '9'){
                list.add(c);
            }
        }

        int a = 0;
        int b = list.size() - 1;
        
        while(a <= b){
            if(list.get(a) == list.get(b)){
                a++;
                b--;
            }
            else{
                return false;
            }
        }

        return true;

    }
}
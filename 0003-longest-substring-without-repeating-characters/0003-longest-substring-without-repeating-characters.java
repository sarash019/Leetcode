class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxx  = 0;
        int left = 0;
        char[] ch = s.toCharArray();
        for(int right = 0; right < n; right++){
            if(!set.contains(ch[right])){
                set.add(ch[right]);
                maxx = Math.max(maxx, right-left+1);
            }else{
                while(set.contains(ch[right])){
                    set.remove(ch[left]);
                    left+=1;
                }
                set.add(ch[right]);
            }
        }
        return maxx;
    }
}
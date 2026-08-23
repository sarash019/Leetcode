class Solution {
    public String reversePrefix(String s, int k) {
        if(k == 1)  return s;

        char[] ch = s.toCharArray();

        int frt = 0;
        int end = k-1;
        while(frt < end){
            char temp = ch[end];
            ch[end] = ch[frt];
            ch[frt] = temp;

            end--;
            frt++;
        }

        // System.out.println(ch);

        String str = new String(ch);

        return str;
    }
}
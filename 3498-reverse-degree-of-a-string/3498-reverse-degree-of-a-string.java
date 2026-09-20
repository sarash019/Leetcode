class Solution {
    public int reverseDegree(String s) {
        char[] ch = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int pos = ((int)ch[i]) - 96;
            System.out.print(pos + " ");
            sum += (27-pos) * (i+1);
        }
        return sum;
    }
}
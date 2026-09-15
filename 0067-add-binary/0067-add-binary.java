class Solution {
    public String addBinary(String c, String d) {
        char[] a = c.toCharArray();
        char[] b = d.toCharArray();
        int m = c.length()-1;
        int n = d.length()-1;
        int carry = 0;
        List<String> digs = new ArrayList<>();
        while(m >= 0 || n >= 0 || carry != 0){
            if(m >= 0){
                carry += a[m--] - '0';
            }
            if(n >= 0){
                carry += b[n--] - '0';
            }
            digs.add(String.valueOf(carry % 2));
            carry /= 2;
        }
        Collections.reverse(digs);
        return String.join("", digs);
    }
}
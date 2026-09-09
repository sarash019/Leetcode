class Solution {
    public long countCommas(long n) {
        if(n < 1000)  return 0;
        // long copy = n;
        // int digits = 0;
        // while(copy != 0){
        //     int rem = copy%10;
        //     digits++;
        //     copy = copy/10;
        // }
        // if(digits < 7){
        //     return n - 999;
        // }
        // if(digits < 10){
        //     return n-999 + 2*(n-999999);
        // }
        // if(digits < 13){
        //     return n-999 + 2*(n-999999) + 3*(n-999999999);
        // }
        // if(digits < 16){
        //     return n-999 + 2*(n-999999) + 3*(n-999999999) + (long)4*(n-999999999999);
        // }
        long commas = 0;
        long start = 1000;
        while(n >= start){
            commas += n - start+1;
            start *= 1000;
        }
        return commas;
    }
}
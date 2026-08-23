class Solution {
    public boolean sumGame(String num) {

        char[] ch = num.toCharArray();
        int leftS = 0;
        int rightS = 0;
        int left = 0;
        int right = 0;

        int l = ch.length;

        for(var i = 0; i < l/2; i++){
            if(ch[i] == '?'){
                left++;
            }else{
                leftS += ch[i] - '0';
            }
        }

        for(var i = l/2; i < l; i++){
            if(ch[i] == '?'){
                right++;
            }else{
                rightS += ch[i] - '0';
            }
        }

        if( (left+right)%2 != 0){
            return true;
        }

        if(left + right == 0){
            return leftS != rightS;
        }

        if(left == right){
            return leftS != rightS;
        }

        return 2 * (leftS - rightS) != 9 * (right - left);


    }
}
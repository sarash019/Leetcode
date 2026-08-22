class Solution {
    public int[] productExceptSelf(int[] nums) {
       
       int countzero=0;
       int product=1;
       int index=-1;
       for( int i=0;i<nums.length;i++)
       {
         if(countzero==0 && nums[i]==0)
         {
            countzero=1;
            index=i;
         }
         else if(nums[i]==0)
         {
            countzero=2;
            break;
         }
         else
         {
            product=product*nums[i];
         }
       }
       int[] ans=new int[nums.length];

       if(countzero==2)
       {
        return ans;
       }
       if(countzero==1)
       {
        ans[index]=product;
        return ans;
       }
       for( int i=0;i<nums.length;i++)
       {
        ans[i]=product/nums[i];
       }
       return ans;

    }
}
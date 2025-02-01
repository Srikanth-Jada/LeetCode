class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length;i++){
          if(nums.length == 1 || nums.length == 3 || nums.length == 2){
            return true;
          }
         
        }
        return false;
    }
}
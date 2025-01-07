class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res=new int[2];
       Set<Integer> s = new HashSet<>();
       for(int i=0;i<nums.length;i++){
        s.add(nums[i]);
       }
       for(int i=0;i<nums.length;i++){
        int x=target-nums[i];
        if(s.contains(x)){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==x){
                    res[0]=i;
                    res[1]=j;
                    break;
                    
                }
            }
        }
       }
       return res;
    }
}
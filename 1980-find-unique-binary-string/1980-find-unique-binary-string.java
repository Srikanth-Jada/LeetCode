import java.util.*;
class Solution {
    public String findDifferentBinaryString(String[] nums) {
       StringBuilder str = new StringBuilder();
       StringBuilder str1 = new StringBuilder();

       for(int i=0;i<=nums.length-1;i++){
        str.append(nums[i]);
       // System.out.println(str.toString() + " s");
         if( str.charAt(i) == '0' ){
         str1.append('1');
         //System.out.println(str1.toString());
         }
         else{
            str1.append('0');
            //System.out.println(str1.toString());

         }
         str.setLength(0); 
       }
       return str1.toString();
    }
}
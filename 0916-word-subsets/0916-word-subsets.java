class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        List<String> l1  = new ArrayList<>();
        for(int i=0;i<words1.length;i++){
             boolean isSubset = true;
            for(int j=0;j<words2.length;j++){
             char[] chArray = words2[j].toCharArray();
                for (char ch : chArray) {
                  
                    if (!words1[i].contains(String.valueOf(ch))) {
                        isSubset = false;
                        break;
                    }
                }

                if (!isSubset) {
                    break;
                }
            }

            if (isSubset) {
                l1.add(words1[i]);
            }
        }

        return l1;
                  
    }
}
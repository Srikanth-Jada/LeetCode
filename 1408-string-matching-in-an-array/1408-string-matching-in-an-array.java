class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> li=new ArrayList<>();
        int n=words.length;
        int len[]=new int[n];
        for(int i=0;i<n;i++){
            len[i]=words[i].length();
        }
        Arrays.sort(words, (a,b)->Integer.compare(a.length(), b.length()));
        for(String str:words){
            System.out.println(str);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(words[j].contains(words[i])){
                    if(!li.contains(words[i])){
                        li.add(words[i]);
                    }
                }
            }
        }
        return li;
    }
}
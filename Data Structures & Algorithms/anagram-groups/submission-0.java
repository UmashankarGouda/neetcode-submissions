class Solution {
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!hmap.containsKey(ch)){
                return false;
            }
            hmap.put(ch,hmap.get(ch)-1);
            if(hmap.get(ch)==0){
                hmap.remove(ch);
            }
        }
        return hmap.isEmpty();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean visited[] = new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            if(visited[i]){
                continue;
            }
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(!visited[j] && isAnagram(strs[i],strs[j])){
                    group.add(strs[j]);
                    visited[j]=true;
                }
            }
            ans.add(group);
        }
        return ans;
    }


}

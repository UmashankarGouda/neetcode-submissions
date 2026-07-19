
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap = new HashMap<>();

        for(String word : strs){
            char ch[] = word.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            hmap.putIfAbsent(s,new ArrayList<>());
            hmap.get(s).add(word);
        }
        return new ArrayList<>(hmap.values());
    }

    
}
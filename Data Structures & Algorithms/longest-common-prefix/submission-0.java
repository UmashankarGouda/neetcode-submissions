class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                ans.append(strs[0].charAt(i));
            }
            else{
                return ans.toString();
            }
        }
        return ans.toString();
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int ans[] = new int[2];
        for (int i=0; i< nums.length;i++){
            int rem = target-nums[i];
            if(hmap.containsKey(rem)){
                
                ans[1]=i;
                ans[0]=hmap.get(rem);
                return ans;
            }
            hmap.put(nums[i],i);
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}
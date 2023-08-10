//TLE
//brute force
//Time: O(N * N * N * log3); Space: O(N)
public List<List<Integer>> threeSum_brute(int[] nums) {
    Set<List<Integer>> resultSet = new HashSet();
    for (int i = 0; i < nums.length - 2; i++)
        for (int j= i + 1; j < nums.length - 1; j++)
             for (int k = j + 1 ; k < nums.length; k++)
                 if (0 == nums[i] + nums[j] + nums[k]) {
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    Collections.sort(list);
                    resultSet.add(list);
                }
    return new ArrayList<>(resultSet);
}



//Time = O(n log n)
//Space = O(n) for output list

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length && nums[i] <= 0; i++){
            if(i==0 || nums[i] != nums[i-1]){
                twoSumII(nums, i, list);
            }
        }
        return list;
    }
    public void twoSumII(int[] nums, int i, List<List<Integer>> list){
        int low = i+1, high = nums.length-1;
        while(low<high){
            int sum = nums[i] + nums[low] + nums[high];
            if(sum==0){
                list.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
                while(low < high && nums[low]==nums[low-1]){
                    low++;
                }
            }else if(sum>0){
                high--;
            }else{
                low++;
            }
        }
    }
}


//if ask for index number then use a map to store the index number of nums
//HashMap



class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> list = new ArrayList();
        helper(candidates, target, list, new ArrayList<>(), 0);
        return list;
    }
    public void helper(int[] arr, int target, List<List<Integer>> FinalList, List<Integer> list, int index){
        if(target < 0){
            return;
        }
        if(target==0 && index==arr.length){
            FinalList.add( new ArrayList<>(list));
            return;
        }
        if(index == arr.length){
            return;
        }
        list.add(arr[index]);
        helper(arr, target-arr[index], FinalList, list, index);
        list.remove(list.size()-1);
        helper(arr, target, FinalList, list, index+1);
    }
}


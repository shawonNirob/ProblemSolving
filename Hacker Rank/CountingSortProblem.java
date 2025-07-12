    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        List<Integer> result = new ArrayList<>(Collections.nCopies(100, 0));
        
        for(int i=0; i<arr.size(); i++){
            int index = arr.get(i);
            result.set(index, (result.get(index)+1));
        }
        
        return result;
    }

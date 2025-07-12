public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(0).size(); j++){
                if(i==j) leftSum += arr.get(i).get(j);
                if((i+j) == (arr.size() - 1)) rightSum += arr.get(i).get(j);
            }
        }
        
        return Math.abs(leftSum - rightSum);
    }

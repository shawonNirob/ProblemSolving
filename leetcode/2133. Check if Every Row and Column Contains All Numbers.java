class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(set1.contains(matrix[i][j])){
                    return false;
                }
                set1.add(matrix[i][j]);
                if(set2.contains(matrix[j][i])){
                    return false;
                }
                set2.add(matrix[j][i]);
            }
            set1.clear();
            set2.clear();

        }
        return true;
    }
}


//O(N) space
class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] arr = preorder.split(",");
        int slot=1;
        for(String index : arr){
            if(--slot<0) return false;
            if(!index.equals("#")){
                slot += 2;
            }
        }
        return slot == 0;
    }
}

// O(1) space
class Solution {
    public boolean isValidSerialization(String preorder) {
        int slot=1;
        int n = preorder.length();
        for(int i=0; i<n; i++){
            if(preorder.charAt(i) == ',') i++;
            if(--slot < 0) return false;
            if(preorder.charAt(i) != '#'){
                slot += 2;
            }
            while(i<n && preorder.charAt(i) != ',') i++;
        }
        return slot == 0;
    }
}

//


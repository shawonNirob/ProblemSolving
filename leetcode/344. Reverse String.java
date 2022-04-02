
//Two Pointer
class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        
        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}

//Recursion
class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right = s.length-1;
        recursive(s, left, right);
    }
    public void recursive(char[] s, int left, int right){
        if(left>=right) return;
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        recursive(s, left+1, right-1);
    }
}

//using Stack
class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length; i++){
            stack.push(s[i]);
        }
        for(int i=0; i<s.length; i++){
            s[i] = stack.pop();
        }
    }
}

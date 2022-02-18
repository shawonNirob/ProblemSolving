package dataStructure.linkedList;

public class SwapNodesInPairs {
        public int isSameAfterReversals(int num) {
            int count = 2, r, sum = 0;
            int number = num;
            while (count > 0) {

                sum=0;
                while (num > 0) {
                    r = num % 10;
                    sum = sum*10+r;
                    num=num/10;
                }
                num=sum;
                count--;
            }
            if (number == num) {
                return number;
            }
            return num;
        }

    public static void main(String[] args) {
            SwapNodesInPairs cal = new SwapNodesInPairs();
        System.out.println(cal.isSameAfterReversals(1800));

    }
}

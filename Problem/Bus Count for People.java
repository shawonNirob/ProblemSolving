package solveProbelm;

import sortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class peopleBus {
    public int busCount(int [] people, int [] bus){
        int peopleCount = 0;
        for(int i=0; i<people.length; i++){
            peopleCount = peopleCount +people[i];
        }
        SelectionSort sort = new SelectionSort();
        sort.selectionSort(bus);
        System.out.println(Arrays.toString(bus));
        int busCount=0;
        for(int i=0; i<bus.length; i++) {
            busCount++;
            peopleCount = peopleCount - bus[i];
            if (peopleCount <= 0) {
                break;
            }
        }
        if(peopleCount>0){
            return -1;
        }
        if(peopleCount <=0){
            return busCount;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] people = {5,3,2,3,2};
        int[] bus ={1,2,8,4,3};
        peopleBus cal = new peopleBus();
        int ans = cal.busCount(people,bus);
        System.out.println(ans);
    }
}

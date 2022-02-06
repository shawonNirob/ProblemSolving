package com.one.java.syntax.aayaz;
import java.util.Scanner;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int count=0;
        int mLength = 0, nLength = 0;
        while(mLength<m && nLength<n){
            if(nums1[mLength] <= nums2[nLength]) {
                nums1[count] = nums1[mLength];
            }else {
                nums1[count]=nums2[count];
            }
            count++;
            mLength++;
            nLength++;
        }
        if(mLength>m){
            while (mLength>=m){
                nums1[count]=nums1[mLength];
                mLength++;
            }
        }
        if (nLength>n){
            while (nLength>=n){
                nums1[count] =nums1[nLength];
                nLength++;
            }
        }
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int  m = 3, n = 3;

        Solution sortArray = new Solution();
        sortArray.merge(nums1, m, nums2, n);

        System.out.println("num1[]= "+ nums1);

    }
}

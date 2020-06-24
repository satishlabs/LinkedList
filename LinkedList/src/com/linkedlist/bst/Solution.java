package com.linkedlist.bst;

public class Solution {
		public static void main(String[] args) {
			Solution obj = new Solution();
			int[] a1 = {1,3,1,2};
			int[] a2 = {1,2,3,4};
			int[] a3 = {3,4,5,3,7};
			
			System.out.println(obj.solution(a1));
			System.out.println(obj.solution(a2));
			System.out.println(obj.solution(a3));
		}

		public int solution(int[] array) {
			if(isTreeAestheetic(array)) {
				return 0;
			}
			int patternCount=0;
			for(int i=0;i<array.length;i++) {
				int[] obj1 = copy(array,i);
				if(isTreeAestheetic(obj1)) {
					patternCount++;
				}
			}
			if(patternCount ==0) {
				return -1;
			}else {
				return patternCount;
			}
		}

		private boolean isTreeAestheetic(int[] arr) {
			int newArr = arr.length;
			int insc = 0;
			for(int i=0;i<newArr;i++) {
				if(insc == 0) {
					if(arr[i] < arr[i+1]) {
						insc = 1;
					}else {
						insc = 2;
					}
				}else {
					if(insc == 1) {
						if(i %2 == 1 && arr[i] > arr[i-1]) {
							
						}else if(i%2==0 & arr[i] <arr[i-1]) {
							
						}else {
							return false;
						}
					}else
					{
						if(i%2 == 1 && arr[i] <arr[i-1]) {
							
						}else if(i%2 ==0 && arr[i] > arr[i-1]) {
							
						}else {
							return false;
						}
					}
				}
			}
			return true;
		}

		private int[] copy(int[] array, int index) {
			int arrayLength = array.length;
			int[] newArr = new int[arrayLength -1];
			int temp =0;
			for(int k =0;k<arrayLength;k++ ) {
				if(k != index) {
					newArr[temp++] = array[k];
				}
			}
			return array;
		}
}

package com.ncq.firstAlgo;

import java.util.Arrays;

public class Solution {

	public int solution(int[] A) {
		
		if (A.length == 0) {
			return 0;
		}
		if (A.length == 1) {
			return A[0];
		}
		// Sort the array so the pairs will be together
		Arrays.parallelSort(A);
		for (int i = 0; i < A.length - 2; i += 2) {
			if (A[i] != A[i + 1])
				return A[i];
		}
		return A[A.length - 1];
	}


}

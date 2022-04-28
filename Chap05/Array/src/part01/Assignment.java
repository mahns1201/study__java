package part01;

import java.util.Arrays;

public class Assignment {
	public static void main(String[] args) {
		// 대입 방법 1
		int[] array1 = new int[3]; // 배열 원 값 강제 초기화
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		
		System.out.println(Arrays.toString(array1));
		
		// 대입 방법 2
		int[] array2 = new int[] {1, 2, 3}; // 배열 원 값 강제 초기화 생
		
		System.out.println(Arrays.toString(array2));
		
		// 대입 방법 3
		int[] array3 = {1, 2, 3};
		
		System.out.println(Arrays.toString(array3));
		
		// 대입 방법 4
		int[] array4;
		array4 = new int[] {1, 2, 3}; // [o]
		// array4 = {1, 2, 3}; // [x]
		
		
		System.out.println(Arrays.toString(array4));
	}
}
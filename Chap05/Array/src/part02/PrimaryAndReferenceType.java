package part02;

import java.util.Arrays;

public class PrimaryAndReferenceType {
	public static void main(String[] args) {
		// 기본 자료
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		
		System.out.println(value1); // 3
		System.out.println(value2); // 7
		
		// 참조 자료형
		int[] array1 = {1, 2, 3};
		int[] array2 = array1;
		
		array2[0] = 9;
		
		System.out.println(Arrays.toString(array1)); // [9, 2, 3]
		System.out.println(Arrays.toString(array2)); // [9, 2, 3]
		
	}
}

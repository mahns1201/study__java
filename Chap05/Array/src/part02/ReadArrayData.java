package part02;

import java.util.Arrays;

public class ReadArrayData {
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 5 };
		
		System.out.println(array[0]);
		
		// 배열 전체 출력 (1)
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// 배열 전체 출력 (2)
		for(int k: array) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 배열 전체 출력 (3)
		System.out.println(Arrays.toString(array));
	}
}

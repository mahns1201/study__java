package part03;

public class CreateString {
	public static void main(String[] args) {
		// String 객체 생성 (1)
		String str1 = new String("Create");
		System.out.println(str1);
		
		// String 객체 생성 (2)
		String str2 = "Crerate2";
		System.out.println(str2);
		
		String str3 = str1; // str1, str3이 같은 참조 메모리 주소를 가진다.
		str1 = "Change"; // str1에 다른 값을 대입하면 str1의 참조 메모리값이 바뀌고 힙 메모리에 새로운 값이 생성된다.
		
		System.out.println(str1); // Change
		System.out.println(str3); // Create
	}
}


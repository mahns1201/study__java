package part03;

public class SharingStringObject {
	public static void main(String[] args) {
		String str1 = new String("str1");
		String str2 = "str";
		String str3 = "str";
		String str4 = new String("str4");
		
		System.out.println(str1 == str2); // false
		System.out.println(str2 == str3); // true
		System.out.println(str3 == str4); // false
		System.out.println(str4 == str1); // false
	}
}

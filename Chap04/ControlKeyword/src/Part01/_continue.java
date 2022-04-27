package Part01;

//public class _continue {
//	public static void main(String[] args) {
//		for(int i=0; i < 10; i++) {
//			if (i == 5) {
//				continue;
//			}
//			
//			System.out.println(i);
//		}
//	}
//}

public class _continue {
	public static void main(String[] args) {
		for(int i=0; i < 10; i++) {
			for(int j=0; j < 10; j++) {
				if (j == 3) {
					continue;
				}
				
				System.out.println(i + " " + j);
		    }
	    }
	}
}

//public class _continue {
//	public static void main(String[] args) {
//		out:
//		for(int i=0; i < 10; i++) {
//			for(int j=0; j < 10; j++) {
//				if (j == 3) {
//					continue out;
//				}
//				
//				System.out.println(i + " " + j);
//		    }
//	    }
//	}
//}
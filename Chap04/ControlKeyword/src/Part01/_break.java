package Part01;

//public class _break {
//	public static void main(String[] args) {
//		for(int i=0; i < 10; i++) {
//		    System.out.println(i);
//		    break;
//	    }
//	}
//}

//public class _break {
//	public static void main(String[] args) {
//		for(int i=0; i < 10; i++) {
//			if (i == 5) {
//				break;
//			}
//			
//		    System.out.println(i);
//	    }
//	}
//}

public class _break {
	public static void main(String[] args) {
		for(int i=0; i < 10; i++) {
			for(int j=0; j < 10; j++) {
				if (j == 3) {
					break;
				}
				
				System.out.println(i + " " + j);
		    }
	    }
	}
}
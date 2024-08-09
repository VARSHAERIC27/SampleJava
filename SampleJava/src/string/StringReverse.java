package string;

public class StringReverse {

	public static void main(String[] args) {
		
		String s ="varsha";
		String rev="";
		
		for(int i=5;i>=0;i--) {
	
		rev=(rev+s.charAt(i));
		}
		System.out.println("reverse ="+rev);

	}

}

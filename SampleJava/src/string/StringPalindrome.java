package string;

public class StringPalindrome {

	public static void palindrome(String s) {
		StringBuffer s1 = new StringBuffer(s);
		String out1=(s1.reverse()).toString();
		if(s.equals(out1)) {
			System.out.println("given string  is palindrome");
		}
		else {
			System.out.println("given string is not palindrome");
		}}
		public static void main(String[] args) {
			StringPalindrome.palindrome("malayalam");
			StringPalindrome.palindrome("java");

			
		}
		

}
	




package string;

public class StringMethod {

	public static void main(String[] args) {
		String s1= "VARSHA";
		String s2="varsha";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3=new String("VARSHA");
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		String s4="john";
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s1));
		String s5="Aira Mariam";
		System.out.println(s5.replace("Mariam","theresya"));
	}

}

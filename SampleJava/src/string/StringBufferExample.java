package string;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s1= new StringBuffer("example");
s1.append("english");
System.out.println(s1);
s1.insert(0,"one");
System.out.println(s1);
s1.replace(0, 1,"s");
System.out.println(s1);
s1.delete(1,2);
System.out.println(s1);
s1.reverse();
System.out.println(s1);
s1.reverse();
System.out.println(s1);
System.out.println(s1.capacity());
	}

}

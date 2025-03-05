//replace() and replaceAll() 

package strings;

public class Demo14 {
	public static void main(String[] args) {
		String s= "Alia Ranbir Kapoor";
		String s2 = s.replace('a', 'e');
		System.out.println(s2);
		String s3 = "She sells sea shells on the sea shore";
		System.out.println(s3.replaceAll("sea", "river"));
		System.out.println(s3);
	}

}

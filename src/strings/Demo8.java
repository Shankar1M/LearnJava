// mutable strings, in this strings we can StringBuffer or StringBuilder to create string objects
// to add strings to the existing string we use append() in mutable strings
package strings;

public class Demo8 {
	
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Kod");
		System.out.println(s1);
		s1.append("Nest");
		System.out.println(s1);
	}
	

}

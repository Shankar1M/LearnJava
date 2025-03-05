// mutable strings, in this strings we can StringBuffer or StringBuilder to create string objects
// to add strings to the existing string we use append() in mutable strings
package strings;

public class Demo9 {
	
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Kod");
		System.out.println(s1);
		s1.append("Nest");
		System.out.println(s1);
	}
	
}
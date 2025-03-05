// To check the capacity of StringBuffer or StringBuilder we need to use capacity()
// Initial capacity of StringBuffer or StringBuilder is 16
// If the capacity of filled, then full new capacity would be generated which is always
// equal to: OLD CAPACITY * 2 + 2
//                     16 * 2 + 2
//                    = 34

package strings;

public class Demo11 {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder();
		System.out.println(s1.capacity());
		s1.append("Virat Kohli is a Batsman");
		System.out.println(s1.capacity());
		s1.append("He plays for RCB");
		System.out.println(s1.capacity());
	}

}

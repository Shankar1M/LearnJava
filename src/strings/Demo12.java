package strings;

public class Demo12 {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder();
		System.out.println(s1.capacity());
		s1.ensureCapacity(100);
		System.out.println(s1.capacity());
		StringBuffer s2 = new StringBuffer();
		System.out.println(s2.capacity());
	}

}
package strings;

public class Demo3 {
	public static void main(String[] args) {
		String s1= new String("Omkar");
		System.out.println(s1);
		String s2= new String("Omkar");
		System.out.println(s2);
		if(s1==s2)
			System.out.println("References are equal");
		else
			System.out.println("References are unequal");
		if(s1.equals(s2))
			System.out.println("Strings are equal");	
		else
			System.out.println("Strings are unequal");
	}

}

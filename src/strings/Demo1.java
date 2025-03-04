package strings;

public class Demo1 {
	public static void main(String[] args) {
		String s1= "Omkar";
		System.out.println(s1);
		String s2= "Omkar";
		System.out.println(s2);
		if(s1==s2)
			System.out.println("References are equal");	
		else
			System.out.println("References are unequal");
	}

}

package strings;

public class Demo4 {
	public static void main(String[] args) {
		String s1= "Kodnest";
		System.out.println(s1);
		String s2= "Tech";
		System.out.println(s2);
		String s3 = "Kodnest" + "Tech";
		System.out.println(s3);
		String s4 = "Kodnest" + "Tech";
		System.out.println(s4);
		if(s3==s4)
			System.out.println("References are equal");
		else
			System.out.println("References are unequal");
//		if(s1.equals(s2))
//			System.out.println("Strings are equal");	
//		else
//			System.out.println("Strings are unequal");
	}

}

// use of intern() --> To bring the copy of String from non constant pool to constant pool
//
// and subString()--> Is used to get the string of string example: PrabhakaranGaneshan 
// in this string we want to print only Ganeshan that time we are going to use subString().

	package strings;

	public class Demo7 {
		public static void main(String[] args) {
			String s1= new String("Puneeth");
			System.out.println(s1);
			String s2= s1.intern();
			System.out.println(s2);
			String s3 = "Puneeth";
			System.out.println(s3);
			
			if(s2==s3)
				System.out.println("References are equal");
			else
				System.out.println("References are unequal");
			String s4 = "PrabhakaranGaneshan";
			System.out.println(s4);
			System.out.println(s4.substring(11));
			System.out.println(s4.substring(11,18));

		}

	}

	

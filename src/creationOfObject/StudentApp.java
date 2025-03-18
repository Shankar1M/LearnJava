package creationOfObject;

public class StudentApp {
	public static void main(String[] args) {
		Student st = new Student();
		Student st1 = new Student();
		Student st2 = new Student();
		st.eat();
		st.sleep();
		st.study();
		System.out.println("_______________________________");
		st1.eat();
		st1.sleep();
		st1.study();
		System.out.println("_______________________________");
        st2.eat();
        st2.sleep();
        st2.study();
	}

}

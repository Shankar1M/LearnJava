//Java program to create a student array and store the data in it. print the data present in the array

package arrays;

public class StudentApp {
	public static void main(String[] args) {
		Student stu[] = new Student[3];
		Student s1= new Student();
		s1.id= 123;
		s1.name="sahana";
		Student s2= new Student();
		s2.id= 321;
		s2.name="divya";
		Student s3= new Student();
		s3.id=456;
		s3.name="meenakshi";
		stu[0]=s1;
		stu[1]=s2;
		stu[2]=s3;
		// to eliminate redundency of code I used for loop to print the contents
		for(int i=0;i<=stu.length-1;i++)
		{
			System.out.print(stu[i].id+" "+stu[i].name+" ");
		}
	}

}

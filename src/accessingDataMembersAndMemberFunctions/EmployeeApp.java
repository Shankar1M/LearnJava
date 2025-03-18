package accessingDataMembersAndMemberFunctions;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.eat();
		e1.sleep();
		e1.work();
		e1.id=123;
		e1.name="Sahana";
		e1.salary=100000;
		e1.insuranceId=9999;
		e1.age=22;
		e1.gender ="Female";
		e1.designation="developer";
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e1.insuranceId);
		System.out.println(e1.age);
		System.out.println(e1.gender);
		System.out.println(e1.designation);

	}

}

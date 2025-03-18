package creationOfObject;

public class DogApp {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog d4 = new Dog();

        d1.eat();
        d1.sleep();
        d1.bark();
        d1.bite();
        System.out.println("_______________________________");
        d2.eat();
        d2.sleep();
        d2.bark();
        d2.bite();
        System.out.println("_______________________________");
        d3.eat();
        d3.sleep();
        d3.bark();
        d3.bite();
        System.out.println("_______________________________");
        d4.eat();
        d4.sleep();
        d4.bark();
        d4.bite();
        // here we can crete anonymous object because we want to invoke one behaviour of the object
        new Dog().sleep();
		
	}

}

package nagesh_corejava.abstarctClass;

public class AnimalMAin {
	public static void main(String args[])
	{
		Animal aOne= new Cat(); // we can't create objects of type Animal but we create its child class objects
		Animal aTwo = new Dog();
		aOne.PrintLegs();
		aOne.makeSound();
		
		aTwo.PrintLegs();
		aTwo.makeSound();
		
	}
}

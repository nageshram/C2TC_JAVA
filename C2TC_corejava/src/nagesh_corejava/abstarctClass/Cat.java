package nagesh_corejava.abstarctClass;

public class Cat extends Animal {

	public Cat()
	{
		super.AnimalLegs=4;
	}
	public void makeSound()
	{
		System.out.println("Meow Meow..\n");
	}
	//This concept bound to loose coupling because the cat class depends on Animal class, there is a dependency on one over other
}

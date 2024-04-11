package nagesh_corejava.abstarctClass;

public abstract class Animal {

	/* Abstract classes
	 * We can't create objects of type Abstract class
	 * Abstract class can contain abstract methods and non abstract methods
	 * Abstract methods don't have any method definitions there terminated by semi colon
	 * Abstract class can contain non static and non final variables*/
	
	public int AnimalLegs=0;
		
	public abstract void makeSound();// each animal can make sound but in its own way
    public void PrintLegs()  //Abstract methods can contain non abstract methods
    {
    	System.out.println("This animal Legs = "+AnimalLegs);
    }
}

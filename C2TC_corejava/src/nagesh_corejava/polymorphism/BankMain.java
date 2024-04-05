package nagesh_corejava.polymorphism;

public class BankMain {
	public static void main(String args[])
	{
		Rbi r = new Sbi();
        //	Rbi r1 = new Rbi();
		//r.setIntrest(9.8f);
	    System.out.println(r.getIntrest());
	    r.sayHello();// first child class sayHello will be executed and parent class sayHello() is overrided
        
	    //Compile time polymorphism
	    Sbi s = new Sbi();
	    s.getDetails();
	    System.out.println(s);
	    Sbi s1 = new Sbi();
	    s1.getDetails("HMT", "Banglore");//same methods but overrides when it comes to parameters
	    System.out.println(s1);
	}
}

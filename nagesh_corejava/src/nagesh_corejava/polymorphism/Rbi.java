package nagesh_corejava.polymorphism;

/** 
 * Polymorphism : a thing that exhibits more than one form is called as polymorphism
 * 
 * Two types of Polymorphism : Runtime and compile time polymorphism
 * Runtime Ploymorphism : through inheritance
 * compile time : through method overloading
 */ 

public class Rbi {  
	protected float intrest;
      Rbi(){
    	  this.intrest=8.5f;// append f with float value to consider it as float value
          // System.out.println("Super class Intrest : "+this.intrest);
      }
      
    public float getIntrest() {
    	  return this.intrest;
      }
	public void setIntrest(float intrest) {
		this.intrest = intrest;
	}
	public void sayHello()
	{
		System.out.println("Hi user :: From RBI.!");
	}
      
}

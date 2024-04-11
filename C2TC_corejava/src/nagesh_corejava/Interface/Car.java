
package nagesh_corejava.Interface;

public class Car implements Vehicle {
      private int Tyres=4;
      public String Cname="Jeep Compass";
	   /* while we implementing the interface the inherited 
      * or child class must implements the interface methods compulsorily.*/
      public void DisplayNumTyres()
      {
    	  System.out.println("Car Name : "+Cname+"\nTyres : "+Tyres);
      }
	
}

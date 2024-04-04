package nagesh_corejava.tnsif;

public class ClassAndObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ClassAndObject one = new ClassAndObject("Nagesh",21,7483158421l);// for long , double, and float values add suffix as d, l, or f
          System.out.println(one);
          one.setAge(45);
          System.out.println(one);
    
          /** one.name we can't print because it is private member it will be accessible at only within the class 
           default or no access specifier is accessible in  within class, outside class, inside package but not outside the package       
           protected access specifier same as default but it is accessible outside the package if it is inherited 
           public is available everywhere 
           */
          
          one.setGroup("Root");
          System.out.println(one.group);// group is a public so it can accessible everywhere
          System.out.println(one.getName());
          
	}
}
